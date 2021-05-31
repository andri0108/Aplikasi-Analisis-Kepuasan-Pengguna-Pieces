package com.example.myanalyst;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ResultControlActivity extends AppCompatActivity {
    public static final String URL = "https://heloindo1.000webhostapp.com/";
    private ProgressDialog progress;

    @BindView(R.id.txtallskor)
    TextView txtallskor;
    @BindView(R.id.txtpenganalisa) TextView txtpenganalisa;

    @BindView(R.id.txtstp) TextView txtstp;
    @BindView(R.id.txttp) TextView txttp;
    @BindView(R.id.txtrg) TextView txtrg;
    @BindView(R.id.txtp) TextView txtp;
    @BindView(R.id.txtsp) TextView txtsp;
    @BindView(R.id.txtanalisa) TextView txtanalisa;
    @BindView(R.id.txtresult) TextView txtresult;

    private Button btnanalisa;
    Double allskor, penganalisa,analisa;

    @OnClick(R.id.btnsimpan) void simpanrc() {
        progress = new ProgressDialog(this);
        progress.setCancelable(false);
        progress.setMessage("Loading ...");
        progress.show();

        String allskor = txtallskor.getText().toString();
        String penganalisa = txtpenganalisa.getText().toString();
        String jstp = txtstp.getText().toString();
        String jtp = txttp.getText().toString();
        String jrg = txtrg.getText().toString();
        String jp = txtp.getText().toString();
        String jsp = txtsp.getText().toString();
        String hasil = txtanalisa.getText().toString();
        String status = txtresult.getText().toString();




        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        RegisterAPI api = retrofit.create(RegisterAPI.class);
        Call<Value> call = api.simpanrc(allskor,penganalisa,jstp,jtp,jrg,jp,jsp,hasil,status);
        call.enqueue(new Callback<Value>() {
            @Override
            public void onResponse(Call<Value> call, Response<Value> response) {
                String value = response.body().getValue();
                String message = response.body().getMessage();
                progress.dismiss();
                if (value.equals("1")) {
                    Toast.makeText(ResultControlActivity.this, message, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(ResultControlActivity.this, message, Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Value> call, Throwable t) {
                progress.dismiss();
                Toast.makeText(ResultControlActivity.this, "Ops Coba Lagi!", Toast.LENGTH_SHORT).show();

            }
        });

    }

    private RequestQueue requestQueue;
    private StringRequest stringRequest;

    private RequestQueue requestQueue1;
    private StringRequest stringRequest1;

    private RequestQueue requestQueue2;
    private StringRequest stringRequest2;

    private RequestQueue requestQueue3;
    private StringRequest stringRequest3;

    private RequestQueue requestQueue4;
    private StringRequest stringRequest4;

    private RequestQueue requestQueue5;
    private StringRequest stringRequest5;

    private RequestQueue requestQueue6;
    private StringRequest stringRequest6;




    ArrayList<HashMap<String, String>> list_data;
    ArrayList<HashMap<String, String>> list_data1;
    ArrayList<HashMap<String, String>> list_data2;
    ArrayList<HashMap<String, String>> list_data3;
    ArrayList<HashMap<String, String>> list_data4;
    ArrayList<HashMap<String, String>> list_data5;
    ArrayList<HashMap<String, String>> list_data6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_control);
        ButterKnife.bind(this);
        btnanalisa = (Button) findViewById(R.id.btnanalisa);
        txtallskor = (TextView) findViewById(R.id.txtallskor);
        txtpenganalisa = (TextView) findViewById(R.id.txtpenganalisa);
        txtanalisa = (TextView) findViewById(R.id.txtanalisa);
        txtresult = (TextView) findViewById(R.id.txtresult);

        String url = "https://heloindo1.000webhostapp.com/getdataresultc.php";
        String url1 = "https://heloindo1.000webhostapp.com/getdataresultpenganalisac.php";
        String url2 = "https://heloindo1.000webhostapp.com/getdataresultstp.php";
        String url3 = "https://heloindo1.000webhostapp.com/getdataresulttp.php";
        String url4 = "https://heloindo1.000webhostapp.com/getdataresultrg.php";
        String url5 = "https://heloindo1.000webhostapp.com/getdataresultp.php";
        String url6 = "https://heloindo1.000webhostapp.com/getdataresultsp.php";//sesuaikan dengan ip pc anda
        txtallskor = (TextView) findViewById(R.id.txtallskor);
        txtpenganalisa = (TextView) findViewById(R.id.txtpenganalisa);
        txtstp = (TextView) findViewById(R.id.txtstp);
        txttp = (TextView) findViewById(R.id.txttp);
        txtrg = (TextView) findViewById(R.id.txtrg);
        txtp = (TextView) findViewById(R.id.txtp);
        txtsp = (TextView) findViewById(R.id.txtsp);


        requestQueue = Volley.newRequestQueue(ResultControlActivity.this);

//all skor control
        list_data = new ArrayList<HashMap<String, String>>();

        stringRequest = new StringRequest(Request.Method.GET, url, new com.android.volley.Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jsonObject = new JSONObject(response);
                    JSONArray jsonArray = jsonObject.getJSONArray("s_control");
                    for (int a = 0; a < jsonArray.length(); a++) {
                        JSONObject json = jsonArray.getJSONObject(a);
                        HashMap<String, String> map = new HashMap<String, String>();
                        map.put("SUM(c)", json.getString("SUM(c)"));
                        // map.put("kuisioner", json.getString("kuisioner"));
                        //map.put("id_kuisioner2", json.getString("id_kuisioner2"));
                        ///map.put("kuisioner2", json.getString("kuisioner2"));

                        list_data.add(map);
                    }

                    txtallskor.setText(list_data.get(0).get("SUM(c)"));


                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new com.android.volley.Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(ResultControlActivity.this, error.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
        requestQueue.add(stringRequest);
        //penganalisa
        list_data1 = new ArrayList<HashMap<String, String>>();

        requestQueue1 = Volley.newRequestQueue(ResultControlActivity.this);
        list_data1 = new ArrayList<HashMap<String, String>>();


        stringRequest1 = new StringRequest(Request.Method.GET, url1, new com.android.volley.Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jsonObject = new JSONObject(response);
                    JSONArray jsonArray = jsonObject.getJSONArray("s_control");
                    for (int a = 0; a < jsonArray.length(); a++) {
                        JSONObject json = jsonArray.getJSONObject(a);
                        HashMap<String, String> map = new HashMap<String, String>();
                        map.put("COUNT(id)", json.getString("COUNT(id)"));
                        // map.put("kuisioner", json.getString("kuisioner"));
                        //map.put("id_kuisioner2", json.getString("id_kuisioner2"));
                        ///map.put("kuisioner2", json.getString("kuisioner2"));

                        list_data1.add(map);
                    }

                    txtpenganalisa.setText(list_data1.get(0).get("COUNT(id)"));



                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new com.android.volley.Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(ResultControlActivity.this, error.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
        requestQueue1.add(stringRequest1);
        //sangat tidak puas
        list_data2 = new ArrayList<HashMap<String, String>>();

        requestQueue2 = Volley.newRequestQueue(ResultControlActivity.this);
        list_data2 = new ArrayList<HashMap<String, String>>();


        stringRequest2 = new StringRequest(Request.Method.GET, url2, new com.android.volley.Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jsonObject = new JSONObject(response);
                    JSONArray jsonArray = jsonObject.getJSONArray("s_control");
                    for (int a = 0; a < jsonArray.length(); a++) {
                        JSONObject json = jsonArray.getJSONObject(a);
                        HashMap<String, String> map = new HashMap<String, String>();
                        map.put("COUNT(id)", json.getString("COUNT(id)"));
                        // map.put("kuisioner", json.getString("kuisioner"));
                        //map.put("id_kuisioner2", json.getString("id_kuisioner2"));
                        ///map.put("kuisioner2", json.getString("kuisioner2"));

                        list_data2.add(map);
                    }

                    txtstp.setText(list_data2.get(0).get("COUNT(id)"));



                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new com.android.volley.Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(ResultControlActivity.this, error.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
        requestQueue2.add(stringRequest2);
        //tidak puas
        list_data3 = new ArrayList<HashMap<String, String>>();

        requestQueue3 = Volley.newRequestQueue(ResultControlActivity.this);
        list_data3 = new ArrayList<HashMap<String, String>>();


        stringRequest3 = new StringRequest(Request.Method.GET, url3, new com.android.volley.Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jsonObject = new JSONObject(response);
                    JSONArray jsonArray = jsonObject.getJSONArray("s_control");
                    for (int a = 0; a < jsonArray.length(); a++) {
                        JSONObject json = jsonArray.getJSONObject(a);
                        HashMap<String, String> map = new HashMap<String, String>();
                        map.put("COUNT(id)", json.getString("COUNT(id)"));
                        // map.put("kuisioner", json.getString("kuisioner"));
                        //map.put("id_kuisioner2", json.getString("id_kuisioner2"));
                        ///map.put("kuisioner2", json.getString("kuisioner2"));

                        list_data3.add(map);
                    }

                    txttp.setText(list_data3.get(0).get("COUNT(id)"));



                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new com.android.volley.Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(ResultControlActivity.this, error.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
        requestQueue3.add(stringRequest3);
        //ragu-ragu
        list_data4 = new ArrayList<HashMap<String, String>>();

        requestQueue4 = Volley.newRequestQueue(ResultControlActivity.this);
        list_data4 = new ArrayList<HashMap<String, String>>();


        stringRequest4 = new StringRequest(Request.Method.GET, url4, new com.android.volley.Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jsonObject = new JSONObject(response);
                    JSONArray jsonArray = jsonObject.getJSONArray("s_control");
                    for (int a = 0; a < jsonArray.length(); a++) {
                        JSONObject json = jsonArray.getJSONObject(a);
                        HashMap<String, String> map = new HashMap<String, String>();
                        map.put("COUNT(id)", json.getString("COUNT(id)"));
                        // map.put("kuisioner", json.getString("kuisioner"));
                        //map.put("id_kuisioner2", json.getString("id_kuisioner2"));
                        ///map.put("kuisioner2", json.getString("kuisioner2"));

                        list_data4.add(map);
                    }

                    txtrg.setText(list_data4.get(0).get("COUNT(id)"));



                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new com.android.volley.Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(ResultControlActivity.this, error.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
        requestQueue4.add(stringRequest4);
        //puas
        list_data5 = new ArrayList<HashMap<String, String>>();

        requestQueue5 = Volley.newRequestQueue(ResultControlActivity.this);
        list_data5 = new ArrayList<HashMap<String, String>>();


        stringRequest5 = new StringRequest(Request.Method.GET, url5, new com.android.volley.Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jsonObject = new JSONObject(response);
                    JSONArray jsonArray = jsonObject.getJSONArray("s_control");
                    for (int a = 0; a < jsonArray.length(); a++) {
                        JSONObject json = jsonArray.getJSONObject(a);
                        HashMap<String, String> map = new HashMap<String, String>();
                        map.put("COUNT(id)", json.getString("COUNT(id)"));
                        // map.put("kuisioner", json.getString("kuisioner"));
                        //map.put("id_kuisioner2", json.getString("id_kuisioner2"));
                        ///map.put("kuisioner2", json.getString("kuisioner2"));

                        list_data5.add(map);
                    }

                    txtp.setText(list_data5.get(0).get("COUNT(id)"));



                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new com.android.volley.Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(ResultControlActivity.this, error.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
        requestQueue5.add(stringRequest5);
        //sangat puas
        list_data6 = new ArrayList<HashMap<String, String>>();

        requestQueue6 = Volley.newRequestQueue(ResultControlActivity.this);
        list_data6 = new ArrayList<HashMap<String, String>>();


        stringRequest6 = new StringRequest(Request.Method.GET, url6, new com.android.volley.Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jsonObject = new JSONObject(response);
                    JSONArray jsonArray = jsonObject.getJSONArray("s_control");
                    for (int a = 0; a < jsonArray.length(); a++) {
                        JSONObject json = jsonArray.getJSONObject(a);
                        HashMap<String, String> map = new HashMap<String, String>();
                        map.put("COUNT(id)", json.getString("COUNT(id)"));
                        // map.put("kuisioner", json.getString("kuisioner"));
                        //map.put("id_kuisioner2", json.getString("id_kuisioner2"));
                        ///map.put("kuisioner2", json.getString("kuisioner2"));

                        list_data6.add(map);
                    }

                    txtsp.setText(list_data6.get(0).get("COUNT(id)"));



                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new com.android.volley.Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(ResultControlActivity.this, error.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
        requestQueue6.add(stringRequest6);
        addListenerOnbtnanalisa();
    }


    public void addListenerOnbtnanalisa () {

        btnanalisa.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                allskor = Double.parseDouble(txtallskor.getText().toString());
                penganalisa = Double.parseDouble(txtpenganalisa.getText().toString());
                analisa= Double.parseDouble(txtpenganalisa.getText().toString());
                double analisa=(allskor/penganalisa);
                txtanalisa.setText(""+analisa);
                if (analisa >= 1.0 && analisa <= 1.8) {
                    txtresult.setText(""+"SANGAT TIDAK PUAS");
                } else if (analisa >= 1.9 && analisa <= 2.6) {
                    txtresult.setText(""+"TIDAK PUAS");
                } else if (analisa >= 2.7 && analisa <= 3.4) {
                    txtresult.setText(""+"RAGU-RAGU");
                } else if (analisa >= 3.5 && analisa <= 4.2) {
                    txtresult.setText(""+"PUAS");
                } else if (analisa >= 4.3 && analisa <= 5) {
                    txtresult.setText(""+"SANGAT PUAS");
                }
            }
        });

    }

    }
