package com.example.myanalyst;

import android.app.ProgressDialog;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
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


public class PerformaActivity extends AppCompatActivity {
    private TextView txtid_kuisioner, txtkuisioner,txtid_kuisioner2,txtkuisioner2,txtid_kuisioner3,
            txtkuisioner3,txtid_kuisioner4,txtkuisioner4,txtid_kuisioner5,txtkuisioner5;

    private RequestQueue requestQueue;
    private StringRequest stringRequest;

    ArrayList<HashMap<String, String>> list_data;

    public static final String URL = "https://heloindo1.000webhostapp.com/";
    private ProgressDialog progress;

    @BindView(R.id.txttotal)
    TextView getTxttotalPerformance;
    @BindView(R.id.txtid)
    TextView txtid;
    @BindView(R.id.txtstatusPerforma)
    TextView getTxtstatusPerforma;

    @OnClick(R.id.btnsimpan) void simpanp() {
        progress = new ProgressDialog(this);
        progress.setCancelable(false);
        progress.setMessage("Loading ...");
        progress.show();

        String id = txtid.getText().toString();
        String p = txttotalPerformance.getText().toString();
        String status = txtstatusPerforma.getText().toString();


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        RegisterAPI api = retrofit.create(RegisterAPI.class);
        Call<Value> call = api.simpanp(id,p,status);
        call.enqueue(new Callback<Value>() {
            @Override
            public void onResponse(Call<Value> call, Response<Value> response) {
                String value = response.body().getValue();
                String message = response.body().getMessage();
                progress.dismiss();
                if (value.equals("1")) {
                    Toast.makeText(PerformaActivity.this, message, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(PerformaActivity.this, message, Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Value> call, Throwable t) {
                progress.dismiss();
                Toast.makeText(PerformaActivity.this, "Gagal Koneksi!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private RadioGroup rg1;
    private RadioGroup rg2;
    private RadioGroup rg3;
    private RadioGroup rg4;
    private RadioGroup rg5;
    @BindView(R.id.rbss)
    RadioButton rbss;
    @BindView(R.id.rbss2)
    RadioButton rbss2;
    @BindView(R.id.rbss3)
    RadioButton rbss3;
    @BindView(R.id.rbss4)
    RadioButton rbss4;
    @BindView(R.id.rbss5)
    RadioButton rbss5;
    @BindView(R.id.rbs)
    RadioButton rbs;
    @BindView(R.id.rbs2)
    RadioButton rbs2;
    @BindView(R.id.rbs3)
    RadioButton rbs3;
    @BindView(R.id.rbs4)
    RadioButton rbs4;
    @BindView(R.id.rbs5)
    RadioButton rbs5;
    @BindView(R.id.rbcs)
    RadioButton rbcs;
    @BindView(R.id.rbcs2)
    RadioButton rbcs2;
    @BindView(R.id.rbcs3)
    RadioButton rbcs3;
    @BindView(R.id.rbcs4)
    RadioButton rbcs4;
    @BindView(R.id.rbcs5)
    RadioButton rbcs5;
    @BindView(R.id.rbts)
    RadioButton rbts;
    @BindView(R.id.rbts2)
    RadioButton rbts2;
    @BindView(R.id.rbts3)
    RadioButton rbts3;
    @BindView(R.id.rbts4)
    RadioButton rbts4;
    @BindView(R.id.rbts5)
    RadioButton rbts5;
    @BindView(R.id.rbsts)
    RadioButton rbsts;
    @BindView(R.id.rbsts2)
    RadioButton rbsts2;
    @BindView(R.id.rbsts3)
    RadioButton rbsts3;
    @BindView(R.id.rbsts4)
    RadioButton rbsts4;
    @BindView(R.id.rbsts5)
    RadioButton rbsts5;

    private Button btncek;
    TextView txtscore;
    TextView txtscore2;
    TextView txtscore3;
    TextView txtscore4;
    TextView txtscore5;
    TextView txttotalPerformance;
    TextView txtstatusPerforma;
    Double Score1,Score2,Score3,Score4,Score5,Total;



    int score=5;
    int score2 = 4;
    int score3 = 3;
    int score4 = 2;
    int score5 = 1;
    Double total;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.performa_main);
        txtid = (TextView) findViewById(R.id.txtid);
        Bundle extras = getIntent().getExtras();
        String id2;

        if(extras != null){
            id2 = extras.getString("id");
            txtid.setText(id2);
        }
        String url = "https://heloindo1.000webhostapp.com/getdataperforma.php"; //sesuaikan dengan ip pc anda
        txtid_kuisioner = (TextView) findViewById(R.id.txtid_kuisioner);
        txtkuisioner = (TextView) findViewById(R.id.txtkuisioner);
        txtid_kuisioner2 = (TextView)findViewById(R.id.txtid_kuisioner2);
        txtkuisioner2 = (TextView)findViewById(R.id.txtkuisioner2);
        txtid_kuisioner3 = (TextView)findViewById(R.id.txtid_kuisioner3);
        txtkuisioner3 = (TextView)findViewById(R.id.txtkuisioner3);
        txtid_kuisioner4 = (TextView)findViewById(R.id.txtid_kuisioner4);
        txtkuisioner4 = (TextView)findViewById(R.id.txtkuisioner4);
        txtid_kuisioner5 = (TextView)findViewById(R.id.txtid_kuisioner5);
        txtkuisioner5 = (TextView)findViewById(R.id.txtkuisioner5);



        requestQueue = Volley.newRequestQueue(PerformaActivity.this);


        list_data = new ArrayList<HashMap<String, String>>();


        stringRequest = new StringRequest(Request.Method.GET, url, new com.android.volley.Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jsonObject = new JSONObject(response);
                    JSONArray jsonArray = jsonObject.getJSONArray("k_performa");
                    for (int a = 0; a < jsonArray.length(); a++) {
                        JSONObject json = jsonArray.getJSONObject(a);
                        HashMap<String, String> map = new HashMap<String, String>();
                        map.put("id_kuisioner", json.getString("id_kuisioner"));
                        map.put("kuisioner", json.getString("kuisioner"));
                        //map.put("id_kuisioner2", json.getString("id_kuisioner2"));
                        ///map.put("kuisioner2", json.getString("kuisioner2"));

                        list_data.add(map);
                    }

                    txtid_kuisioner.setText(list_data.get(0).get("id_kuisioner"));
                    txtkuisioner.setText(list_data.get(0).get("kuisioner"));
                    txtid_kuisioner2.setText(list_data.get(1).get("id_kuisioner"));
                    txtkuisioner2.setText(list_data.get(1).get("kuisioner"));
                    txtid_kuisioner3.setText(list_data.get(2).get("id_kuisioner"));
                    txtkuisioner3.setText(list_data.get(2).get("kuisioner"));
                    txtid_kuisioner4.setText(list_data.get(3).get("id_kuisioner"));
                    txtkuisioner4.setText(list_data.get(3).get("kuisioner"));
                    txtid_kuisioner5.setText(list_data.get(4).get("id_kuisioner"));
                    txtkuisioner5.setText(list_data.get(4).get("kuisioner"));


                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new com.android.volley.Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(PerformaActivity.this, error.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
        requestQueue.add(stringRequest);

        ButterKnife.bind(this);
        rg1 = (RadioGroup) findViewById(R.id.rg1);
        rg2 = (RadioGroup) findViewById(R.id.rg2);
        rg3 = (RadioGroup) findViewById(R.id.rg3);
        rg4 = (RadioGroup) findViewById(R.id.rg4);
        rg5 = (RadioGroup) findViewById(R.id.rg5);
        rbss=(RadioButton)findViewById(R.id.rbss);
        rbss2=(RadioButton)findViewById(R.id.rbss2);
        rbss3=(RadioButton)findViewById(R.id.rbss3);
        rbss4=(RadioButton)findViewById(R.id.rbss4);
        rbss5=(RadioButton)findViewById(R.id.rbss5);
        rbs=(RadioButton)findViewById(R.id.rbs);
        rbs2=(RadioButton)findViewById(R.id.rbs2);
        rbs3=(RadioButton)findViewById(R.id.rbs3);
        rbs4=(RadioButton)findViewById(R.id.rbs4);
        rbs5=(RadioButton)findViewById(R.id.rbs5);
        rbcs=(RadioButton)findViewById(R.id.rbcs);
        rbcs2=(RadioButton)findViewById(R.id.rbcs2);
        rbcs3=(RadioButton)findViewById(R.id.rbcs3);
        rbcs4=(RadioButton)findViewById(R.id.rbcs4);
        rbcs5=(RadioButton)findViewById(R.id.rbcs5);
        rbts=(RadioButton)findViewById(R.id.rbts);
        rbts2=(RadioButton)findViewById(R.id.rbts2);
        rbts3=(RadioButton)findViewById(R.id.rbts3);
        rbts4=(RadioButton)findViewById(R.id.rbts4);
        rbts5=(RadioButton)findViewById(R.id.rbts5);
        rbsts=(RadioButton)findViewById(R.id.rbsts);
        rbsts2=(RadioButton)findViewById(R.id.rbsts2);
        rbsts3=(RadioButton)findViewById(R.id.rbsts3);
        rbsts4=(RadioButton)findViewById(R.id.rbsts4);
        rbsts5=(RadioButton)findViewById(R.id.rbsts5);

        btncek = (Button) findViewById(R.id.btncek);
        txtscore = (TextView) findViewById(R.id.txtscore);
        txtscore2 = (TextView) findViewById(R.id.txtscore2);
        txtscore3 = (TextView) findViewById(R.id.txtscore3);
        txtscore4 = (TextView) findViewById(R.id.txtscore4);
        txtscore5 = (TextView) findViewById(R.id.txtscore5);
        txttotalPerformance = (TextView) findViewById(R.id.txttotal);
        txtstatusPerforma = (TextView) findViewById(R.id.txtstatusPerforma);
        addListenerOnbtncek();
    }

    public void addListenerOnbtncek() {

        btncek.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                //pilih radio button yang ada di radio button group
                int selectedId = rg1.getCheckedRadioButtonId();

                if (selectedId == rbss.getId()) {
                    txtscore.setText("" + score);
                } else if (selectedId == rbs.getId()) {

                    txtscore.setText("" + score2);
                } else if (selectedId == rbcs.getId()) {

                    txtscore.setText("" + score3);
                } else if (selectedId == rbts.getId()) {

                    txtscore.setText("" + score4);
                } else if (selectedId == rbsts.getId()) {

                    txtscore.setText("" + score5);
                }
                int selectedId2 = rg2.getCheckedRadioButtonId();
                if (selectedId2 == rbss2.getId()) {
                    txtscore2.setText("" + score);
                } else if (selectedId2 == rbs2.getId()) {
                    txtscore2.setText("" + score2);
                } else if (selectedId2 == rbcs2.getId()) {
                    txtscore2.setText("" + score3);
                } else if (selectedId2 == rbts2.getId()) {
                    txtscore2.setText("" + score4);
                } else if (selectedId2 == rbsts2.getId()) {

                    txtscore2.setText("" + score5);
                }
                int selectedId3 = rg3.getCheckedRadioButtonId();
                if (selectedId3 == rbss3.getId()) {
                    txtscore3.setText("" + score);
                } else if (selectedId3 == rbs3.getId()) {
                    txtscore3.setText("" + score2);
                } else if (selectedId3 == rbcs3.getId()) {
                    txtscore3.setText("" + score3);
                } else if (selectedId3 == rbts3.getId()) {
                    txtscore3.setText("" + score4);
                } else if (selectedId3 == rbsts3.getId()) {

                    txtscore3.setText("" + score5);
                }
                int selectedId4 = rg4.getCheckedRadioButtonId();
                if (selectedId4 == rbss4.getId()) {
                    txtscore4.setText("" + score);
                } else if (selectedId4 == rbs4.getId()) {
                    txtscore4.setText("" + score2);
                } else if (selectedId4 == rbcs4.getId()) {
                    txtscore4.setText("" + score3);
                } else if (selectedId4 == rbts4.getId()) {
                    txtscore4.setText("" + score4);
                } else if (selectedId4 == rbsts4.getId()) {

                    txtscore4.setText("" + score5);
                }
                int selectedId5 = rg5.getCheckedRadioButtonId();
                if (selectedId5 == rbss5.getId()) {
                    txtscore5.setText("" + score);
                } else if (selectedId5 == rbs5.getId()) {
                    txtscore5.setText("" + score2);
                } else if (selectedId5 == rbcs5.getId()) {
                    txtscore5.setText("" + score3);
                } else if (selectedId5 == rbts5.getId()) {
                    txtscore5.setText("" + score4);
                } else if (selectedId5 == rbsts5.getId()) {

                    txtscore5.setText("" + score5);
                }
                Score1 = Double.parseDouble(txtscore.getText().toString());
                Score2 = Double.parseDouble(txtscore2.getText().toString());
                Score3 = Double.parseDouble(txtscore3.getText().toString());
                Score4 = Double.parseDouble(txtscore4.getText().toString());
                Score5 = Double.parseDouble(txtscore5.getText().toString());
                Total = Double.parseDouble(txtscore5.getText().toString());
                Double Total = ((Score1 + Score2 + Score3 + Score4 + Score5) / 10) * 2;
                txttotalPerformance.setText("" + Total);
                if (Total >= 1.0 && Total <= 1.8) {
                    txtstatusPerforma.setText(""+"SANGAT TIDAK PUAS");
                }
                else  if (Total >= 1.9 && Total <= 2.6) {
                    txtstatusPerforma.setText(""+"TIDAK PUAS");
                }
                else  if (Total >= 2.7 && Total <= 3.4) {
                    txtstatusPerforma.setText(""+"RAGU-RAGU");
                }
                else  if (Total >= 3.5 && Total <= 4.2) {
                    txtstatusPerforma.setText(""+"PUAS");
                }
                else  if (Total >= 4.3 && Total <= 5) {
                    txtstatusPerforma.setText(""+"SANGAT PUAS");
                }
            }
        });

    }
}
