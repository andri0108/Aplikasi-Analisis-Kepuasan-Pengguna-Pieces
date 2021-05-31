package com.example.myanalyst;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Login extends AppCompatActivity {
    EditText txtid;
    EditText txtpassword;
    Button btnlogin;
    ProgressDialog loading;

    Context mContext;
    LoginAPI mApiService;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        mContext = this;
        mApiService = UtilsApi.getLoginAPI(); // meng-init yang ada di package apihelper
        initComponents();

    }

    private void initComponents() {
        txtid = (EditText) findViewById(R.id.txtid);
        txtpassword = (EditText) findViewById(R.id.txtpassword);
        btnlogin = (Button) findViewById(R.id.btnlogin);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loading = ProgressDialog.show(mContext, null, "Harap Tunggu...", true, false);
                requestLogin();
            }
            private void requestLogin() {
                final String id = txtid.getText().toString();
                mApiService.login(txtid.getText().toString(), txtpassword.getText().toString())
                        .enqueue(new Callback<ResponseBody>() {
                            @Override
                            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                                if (response.isSuccessful()){
                                    loading.dismiss();
                                    try {
                                        JSONObject jsonRESULTS = new JSONObject(response.body().string());
                                        if(jsonRESULTS.getString("value").equals("1")){
                                            // Jika login berhasil maka data nama yang ada di response API
                                            // akan diparsing ke activity selanjutnya.
                                            Toast.makeText(mContext, "Berhasil Login", Toast.LENGTH_SHORT).show();
                                            Intent intent = new Intent(mContext, MainActivity.class);
                                            intent.putExtra("id",id);
                                            startActivity(intent);
                                        } else {
                                            // Jika login gagal
                                            String error_message = jsonRESULTS.getString("message");
                                            Toast.makeText(mContext, error_message, Toast.LENGTH_SHORT).show();
                                        }
                                    } catch (JSONException e) {
                                        e.printStackTrace();
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                } else {
                                    loading.dismiss();
                                }
                            }

                            @Override
                            public void onFailure(Call<ResponseBody> call, Throwable t) {
                                Log.e("debug", "onFailure: ERROR > " + t.toString());
                                loading.dismiss();
                            }
                        });

            }
        });
    }
    }

