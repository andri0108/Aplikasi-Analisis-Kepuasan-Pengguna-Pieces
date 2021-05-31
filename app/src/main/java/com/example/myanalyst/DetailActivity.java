package com.example.myanalyst;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
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

public class DetailActivity extends AppCompatActivity {
    @BindView(R.id.txtdskorp) TextView txtdskorp;
    @BindView(R.id.txtpenganalisap) TextView txtpenganalisap;
    @BindView(R.id.txtdetailp) TextView txtdetailp;
    @BindView(R.id.txtdetailstatusp) TextView txtdetailstatusp;
    //informasi
    @BindView(R.id.txtdskori) TextView txtdskori;
    @BindView(R.id.txtpenganalisai) TextView txtpenganalisai;
    @BindView(R.id.txtdetaili) TextView txtdetaili;
    @BindView(R.id.txtdetailstatusi) TextView txtdetailstatusi;
    //efisien
    @BindView(R.id.txtdskore) TextView txtdskore;
    @BindView(R.id.txtpenganalisae) TextView txtpenganalisae;
    @BindView(R.id.txtdetaile) TextView txtdetaile;
    @BindView(R.id.txtdetailstatuse) TextView txtdetailstatuse;
    //control
    @BindView(R.id.txtdskorc) TextView txtdskorc;
    @BindView(R.id.txtpenganalisac) TextView txtpenganalisac;
    @BindView(R.id.txtdetailc) TextView txtdetailc;
    @BindView(R.id.txtdetailstatusc) TextView txtdetailstatusc;
    //economy
    @BindView(R.id.txtdskorec) TextView txtdskorec;
    @BindView(R.id.txtpenganalisaec) TextView txtpenganalisaec;
    @BindView(R.id.txtdetailec) TextView txtdetailec;
    @BindView(R.id.txtdetailstatusec) TextView txtdetailstatusec;
    //servise
    @BindView(R.id.txtdskors) TextView txtdskors;
    @BindView(R.id.txtpenganalisas) TextView txtpenganalisas;
    @BindView(R.id.txtdetails) TextView txtdetails;
    @BindView(R.id.txtdetailstatuss) TextView txtdetailstatuss;

    @BindView(R.id.txtnilaikes) TextView txtnilaikes;
    @BindView(R.id.txtstatuskes) TextView txtstatuskes;

    private Button btnanalisap;
    Double dskorp, penganalisap,detailp, dskori,penganalisai,detaili, dskore, penganalisae, detaile,
            dskorc,penganalisac,detailc, dskorec,penganalisaec,detailec,dskors,penganalisas,details, nilaikes ;

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

    private RequestQueue requestQueue7;
    private StringRequest stringRequest7;

    private RequestQueue requestQueue8;
    private StringRequest stringRequest8;

    private RequestQueue requestQueue9;
    private StringRequest stringRequest9;

    private RequestQueue requestQueue10;
    private StringRequest stringRequest10;

    private RequestQueue requestQueue11;
    private StringRequest stringRequest11;





    ArrayList<HashMap<String, String>> list_data;
    ArrayList<HashMap<String, String>> list_data1;
    ArrayList<HashMap<String, String>> list_data2;
    ArrayList<HashMap<String, String>> list_data3;
    ArrayList<HashMap<String, String>> list_data4;
    ArrayList<HashMap<String, String>> list_data5;
    ArrayList<HashMap<String, String>> list_data6;
    ArrayList<HashMap<String, String>> list_data7;
    ArrayList<HashMap<String, String>> list_data8;
    ArrayList<HashMap<String, String>> list_data9;
    ArrayList<HashMap<String, String>> list_data10;
    ArrayList<HashMap<String, String>> list_data11;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_main);
        ButterKnife.bind(this);
        btnanalisap = (Button) findViewById(R.id.btnanalisap);
        txtdskorp = (TextView) findViewById(R.id.txtdskorp);
        txtpenganalisap = (TextView) findViewById(R.id.txtpenganalisap);
        txtdetailp = (TextView) findViewById(R.id.txtdetailp);
        txtdetailstatusp = (TextView) findViewById(R.id.txtdetailstatusp);
    //informasi
        txtdskori = (TextView) findViewById(R.id.txtdskori);
        txtpenganalisai = (TextView) findViewById(R.id.txtpenganalisai);
        txtdetaili = (TextView) findViewById(R.id.txtdetaili);
        txtdetailstatusi = (TextView) findViewById(R.id.txtdetailstatusi);
        //efisien
        txtdskore = (TextView) findViewById(R.id.txtdskore);
        txtpenganalisae = (TextView) findViewById(R.id.txtpenganalisae);
        txtdetaile = (TextView) findViewById(R.id.txtdetaile);
        txtdetailstatuse = (TextView) findViewById(R.id.txtdetailstatuse);
        //control
        txtdskorc = (TextView) findViewById(R.id.txtdskorc);
        txtpenganalisac = (TextView) findViewById(R.id.txtpenganalisac);
        txtdetailc = (TextView) findViewById(R.id.txtdetailc);
        txtdetailstatusc = (TextView) findViewById(R.id.txtdetailstatusc);
        //economy
        txtdskorec = (TextView) findViewById(R.id.txtdskorec);
        txtpenganalisaec = (TextView) findViewById(R.id.txtpenganalisaec);
        txtdetailec = (TextView) findViewById(R.id.txtdetailec);
        txtdetailstatusec = (TextView) findViewById(R.id.txtdetailstatusec);
        //service
        txtdskors = (TextView) findViewById(R.id.txtdskors);
        txtpenganalisas = (TextView) findViewById(R.id.txtpenganalisas);
        txtdetails = (TextView) findViewById(R.id.txtdetails);
        txtdetailstatuss = (TextView) findViewById(R.id.txtdetailstatuss);


        String url = "https://heloindo1.000webhostapp.com/getdataresultper.php";
        String url1 = "https://heloindo1.000webhostapp.com/getdataresultpenganalisaper.php";
        String url2 = "https://heloindo1.000webhostapp.com/getdataresulti.php";
        String url3 = "https://heloindo1.000webhostapp.com/getdataresultpenganalisai.php";
        String url4 = "https://heloindo1.000webhostapp.com/getdataresulte.php";
        String url5 = "https://heloindo1.000webhostapp.com/getdataresultpenganalisae.php";
        String url6 = "https://heloindo1.000webhostapp.com/getdataresultc.php";
        String url7 = "https://heloindo1.000webhostapp.com/getdataresultpenganalisac.php";
        String url8 = "https://heloindo1.000webhostapp.com/getdataresultek.php";
        String url9 = "https://heloindo1.000webhostapp.com/getdataresultpenganalisaek.php";
        String url10 = "https://heloindo1.000webhostapp.com/getdataresults.php";
        String url11 = "https://heloindo1.000webhostapp.com/getdataresultpenganalisas.php";

        requestQueue = Volley.newRequestQueue(DetailActivity.this);

//all skor control
        list_data = new ArrayList<HashMap<String, String>>();

        stringRequest = new StringRequest(Request.Method.GET, url, new com.android.volley.Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jsonObject = new JSONObject(response);
                    JSONArray jsonArray = jsonObject.getJSONArray("s_performance");
                    for (int a = 0; a < jsonArray.length(); a++) {
                        JSONObject json = jsonArray.getJSONObject(a);
                        HashMap<String, String> map = new HashMap<String, String>();
                        map.put("SUM(p)", json.getString("SUM(p)"));
                        // map.put("kuisioner", json.getString("kuisioner"));
                        //map.put("id_kuisioner2", json.getString("id_kuisioner2"));
                        ///map.put("kuisioner2", json.getString("kuisioner2"));

                        list_data.add(map);
                    }

                    txtdskorp.setText(list_data.get(0).get("SUM(p)"));


                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new com.android.volley.Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(DetailActivity.this, error.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
        requestQueue.add(stringRequest);
        //penganalisa
        list_data1 = new ArrayList<HashMap<String, String>>();

        requestQueue1 = Volley.newRequestQueue(DetailActivity.this);
        list_data1 = new ArrayList<HashMap<String, String>>();


        stringRequest1 = new StringRequest(Request.Method.GET, url1, new com.android.volley.Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jsonObject = new JSONObject(response);
                    JSONArray jsonArray = jsonObject.getJSONArray("s_performance");
                    for (int a = 0; a < jsonArray.length(); a++) {
                        JSONObject json = jsonArray.getJSONObject(a);
                        HashMap<String, String> map = new HashMap<String, String>();
                        map.put("COUNT(id)", json.getString("COUNT(id)"));
                        // map.put("kuisioner", json.getString("kuisioner"));
                        //map.put("id_kuisioner2", json.getString("id_kuisioner2"));
                        ///map.put("kuisioner2", json.getString("kuisioner2"));

                        list_data1.add(map);
                    }

                    txtpenganalisap.setText(list_data1.get(0).get("COUNT(id)"));



                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new com.android.volley.Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(DetailActivity.this, error.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
        requestQueue1.add(stringRequest1);
        //informasi
        list_data2 = new ArrayList<HashMap<String, String>>();
        requestQueue2 = Volley.newRequestQueue(DetailActivity.this);
        list_data2 = new ArrayList<HashMap<String, String>>();

        stringRequest2 = new StringRequest(Request.Method.GET, url2, new com.android.volley.Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jsonObject = new JSONObject(response);
                    JSONArray jsonArray = jsonObject.getJSONArray("s_informasi");
                    for (int a = 0; a < jsonArray.length(); a++) {
                        JSONObject json = jsonArray.getJSONObject(a);
                        HashMap<String, String> map = new HashMap<String, String>();
                        map.put("SUM(i)", json.getString("SUM(i)"));
                        // map.put("kuisioner", json.getString("kuisioner"));
                        //map.put("id_kuisioner2", json.getString("id_kuisioner2"));
                        ///map.put("kuisioner2", json.getString("kuisioner2"));

                        list_data2.add(map);
                    }

                    txtdskori.setText(list_data2.get(0).get("SUM(i)"));


                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new com.android.volley.Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(DetailActivity.this, error.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
        requestQueue2.add(stringRequest2);

        list_data3 = new ArrayList<HashMap<String, String>>();

        requestQueue3 = Volley.newRequestQueue(DetailActivity.this);
        list_data3 = new ArrayList<HashMap<String, String>>();
        stringRequest3 = new StringRequest(Request.Method.GET, url3, new com.android.volley.Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jsonObject = new JSONObject(response);
                    JSONArray jsonArray = jsonObject.getJSONArray("s_informasi");
                    for (int a = 0; a < jsonArray.length(); a++) {
                        JSONObject json = jsonArray.getJSONObject(a);
                        HashMap<String, String> map = new HashMap<String, String>();
                        map.put("COUNT(id)", json.getString("COUNT(id)"));
                        // map.put("kuisioner", json.getString("kuisioner"));
                        //map.put("id_kuisioner2", json.getString("id_kuisioner2"));
                        ///map.put("kuisioner2", json.getString("kuisioner2"));

                        list_data3.add(map);
                    }

                    txtpenganalisai.setText(list_data3.get(0).get("COUNT(id)"));



                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new com.android.volley.Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(DetailActivity.this, error.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
        requestQueue3.add(stringRequest3);
//efisen
        requestQueue4 = Volley.newRequestQueue(DetailActivity.this);

        list_data4 = new ArrayList<HashMap<String, String>>();

        stringRequest4 = new StringRequest(Request.Method.GET, url4, new com.android.volley.Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jsonObject = new JSONObject(response);
                    JSONArray jsonArray = jsonObject.getJSONArray("s_efisien");
                    for (int a = 0; a < jsonArray.length(); a++) {
                        JSONObject json = jsonArray.getJSONObject(a);
                        HashMap<String, String> map = new HashMap<String, String>();
                        map.put("SUM(e)", json.getString("SUM(e)"));
                        // map.put("kuisioner", json.getString("kuisioner"));
                        //map.put("id_kuisioner2", json.getString("id_kuisioner2"));
                        ///map.put("kuisioner2", json.getString("kuisioner2"));

                        list_data4.add(map);
                    }

                    txtdskore.setText(list_data4.get(0).get("SUM(e)"));


                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new com.android.volley.Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(DetailActivity.this, error.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
        requestQueue4.add(stringRequest4);
        //penganalisa
        list_data5 = new ArrayList<HashMap<String, String>>();

        requestQueue5 = Volley.newRequestQueue(DetailActivity.this);
        list_data5 = new ArrayList<HashMap<String, String>>();


        stringRequest5 = new StringRequest(Request.Method.GET, url5, new com.android.volley.Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jsonObject = new JSONObject(response);
                    JSONArray jsonArray = jsonObject.getJSONArray("s_efisien");
                    for (int a = 0; a < jsonArray.length(); a++) {
                        JSONObject json = jsonArray.getJSONObject(a);
                        HashMap<String, String> map = new HashMap<String, String>();
                        map.put("COUNT(id)", json.getString("COUNT(id)"));
                        // map.put("kuisioner", json.getString("kuisioner"));
                        //map.put("id_kuisioner2", json.getString("id_kuisioner2"));
                        ///map.put("kuisioner2", json.getString("kuisioner2"));

                        list_data5.add(map);
                    }

                    txtpenganalisae.setText(list_data5.get(0).get("COUNT(id)"));



                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new com.android.volley.Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(DetailActivity.this, error.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
        requestQueue5.add(stringRequest5);
        //conntrol
        requestQueue6 = Volley.newRequestQueue(DetailActivity.this);

//all skor control
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
                        map.put("SUM(c)", json.getString("SUM(c)"));
                        // map.put("kuisioner", json.getString("kuisioner"));
                        //map.put("id_kuisioner2", json.getString("id_kuisioner2"));
                        ///map.put("kuisioner2", json.getString("kuisioner2"));

                        list_data6.add(map);
                    }

                    txtdskorc.setText(list_data6.get(0).get("SUM(c)"));


                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new com.android.volley.Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(DetailActivity.this, error.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
        requestQueue6.add(stringRequest6);
        //penganalisa
        list_data7 = new ArrayList<HashMap<String, String>>();

        requestQueue7 = Volley.newRequestQueue(DetailActivity.this);
        list_data7 = new ArrayList<HashMap<String, String>>();


        stringRequest7 = new StringRequest(Request.Method.GET, url7, new com.android.volley.Response.Listener<String>() {
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

                        list_data7.add(map);
                    }

                    txtpenganalisac.setText(list_data7.get(0).get("COUNT(id)"));



                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new com.android.volley.Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(DetailActivity.this, error.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
        requestQueue7.add(stringRequest7);

        requestQueue8 = Volley.newRequestQueue(DetailActivity.this);

//all skor control
        list_data8 = new ArrayList<HashMap<String, String>>();

        stringRequest8 = new StringRequest(Request.Method.GET, url8, new com.android.volley.Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jsonObject = new JSONObject(response);
                    JSONArray jsonArray = jsonObject.getJSONArray("s_ekonomi");
                    for (int a = 0; a < jsonArray.length(); a++) {
                        JSONObject json = jsonArray.getJSONObject(a);
                        HashMap<String, String> map = new HashMap<String, String>();
                        map.put("SUM(ek)", json.getString("SUM(ek)"));
                        // map.put("kuisioner", json.getString("kuisioner"));
                        //map.put("id_kuisioner2", json.getString("id_kuisioner2"));
                        ///map.put("kuisioner2", json.getString("kuisioner2"));

                        list_data8.add(map);
                    }

                    txtdskorec.setText(list_data8.get(0).get("SUM(ek)"));


                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new com.android.volley.Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(DetailActivity.this, error.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
        requestQueue8.add(stringRequest8);
        //penganalisa
        list_data9 = new ArrayList<HashMap<String, String>>();

        requestQueue9 = Volley.newRequestQueue(DetailActivity.this);
        list_data9 = new ArrayList<HashMap<String, String>>();


        stringRequest9 = new StringRequest(Request.Method.GET, url9, new com.android.volley.Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jsonObject = new JSONObject(response);
                    JSONArray jsonArray = jsonObject.getJSONArray("s_ekonomi");
                    for (int a = 0; a < jsonArray.length(); a++) {
                        JSONObject json = jsonArray.getJSONObject(a);
                        HashMap<String, String> map = new HashMap<String, String>();
                        map.put("COUNT(id)", json.getString("COUNT(id)"));
                        // map.put("kuisioner", json.getString("kuisioner"));
                        //map.put("id_kuisioner2", json.getString("id_kuisioner2"));
                        ///map.put("kuisioner2", json.getString("kuisioner2"));

                        list_data9.add(map);
                    }

                    txtpenganalisaec.setText(list_data9.get(0).get("COUNT(id)"));



                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new com.android.volley.Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(DetailActivity.this, error.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
        requestQueue9.add(stringRequest9);

        requestQueue10 = Volley.newRequestQueue(DetailActivity.this);

//all skor control
        list_data10 = new ArrayList<HashMap<String, String>>();

        stringRequest10 = new StringRequest(Request.Method.GET, url10, new com.android.volley.Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jsonObject = new JSONObject(response);
                    JSONArray jsonArray = jsonObject.getJSONArray("s_servis");
                    for (int a = 0; a < jsonArray.length(); a++) {
                        JSONObject json = jsonArray.getJSONObject(a);
                        HashMap<String, String> map = new HashMap<String, String>();
                        map.put("SUM(s)", json.getString("SUM(s)"));
                        // map.put("kuisioner", json.getString("kuisioner"));
                        //map.put("id_kuisioner2", json.getString("id_kuisioner2"));
                        ///map.put("kuisioner2", json.getString("kuisioner2"));

                        list_data10.add(map);
                    }

                    txtdskors.setText(list_data10.get(0).get("SUM(s)"));


                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new com.android.volley.Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(DetailActivity.this, error.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
        requestQueue10.add(stringRequest10);
        //penganalisa
        list_data11 = new ArrayList<HashMap<String, String>>();

        requestQueue11 = Volley.newRequestQueue(DetailActivity.this);
        list_data11 = new ArrayList<HashMap<String, String>>();


        stringRequest11 = new StringRequest(Request.Method.GET, url11, new com.android.volley.Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jsonObject = new JSONObject(response);
                    JSONArray jsonArray = jsonObject.getJSONArray("s_servis");
                    for (int a = 0; a < jsonArray.length(); a++) {
                        JSONObject json = jsonArray.getJSONObject(a);
                        HashMap<String, String> map = new HashMap<String, String>();
                        map.put("COUNT(id)", json.getString("COUNT(id)"));
                        // map.put("kuisioner", json.getString("kuisioner"));
                        //map.put("id_kuisioner2", json.getString("id_kuisioner2"));
                        ///map.put("kuisioner2", json.getString("kuisioner2"));

                        list_data11.add(map);
                    }

                    txtpenganalisas.setText(list_data11.get(0).get("COUNT(id)"));



                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new com.android.volley.Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(DetailActivity.this, error.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
        requestQueue11.add(stringRequest11);
        addListenerOnbtnanalisap();
    }
    public void addListenerOnbtnanalisap () {
        btnanalisap.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                dskorp = Double.parseDouble(txtdskorp.getText().toString());
                penganalisap = Double.parseDouble(txtpenganalisap.getText().toString());
               detailp = Double.parseDouble(txtpenganalisap.getText().toString());
               //informasi
                dskori = Double.parseDouble(txtdskori.getText().toString());
                penganalisai = Double.parseDouble(txtpenganalisai.getText().toString());
                detaili = Double.parseDouble(txtpenganalisai.getText().toString());
               //efisien
                dskore = Double.parseDouble(txtdskore.getText().toString());
                penganalisae = Double.parseDouble(txtpenganalisae.getText().toString());
                detaile = Double.parseDouble(txtpenganalisae.getText().toString());
                //control
                dskorc = Double.parseDouble(txtdskorc.getText().toString());
                penganalisac = Double.parseDouble(txtpenganalisac.getText().toString());
                detailc = Double.parseDouble(txtpenganalisac.getText().toString());
                //economy
                dskorec = Double.parseDouble(txtdskorec.getText().toString());
                penganalisaec = Double.parseDouble(txtpenganalisaec.getText().toString());
                detailec = Double.parseDouble(txtpenganalisaec.getText().toString());
                //service
                dskors = Double.parseDouble(txtdskors.getText().toString());
                penganalisas = Double.parseDouble(txtpenganalisas.getText().toString());
                details = Double.parseDouble(txtpenganalisas.getText().toString());

                nilaikes=Double.parseDouble(txtpenganalisas.getText().toString());


                double analisa5=(dskors/penganalisas);
                double analisa4=(dskorec/penganalisaec);
                double analisa3=(dskore/penganalisae);
                double analisa2=(dskorc/penganalisac);
                double analisa1=(dskori/penganalisai);
                double analisa=(dskorp/penganalisap);

                double kesimpulan=(analisa+analisa1+analisa2+analisa3+analisa4+analisa5)/6;
                txtdetailp.setText(""+analisa);
                if (analisa >= 1.0 && analisa <= 1.8) {
                    txtdetailstatusp.setText(""+"SANGAT TIDAK PUAS");
                } else if (analisa >= 1.9 && analisa <= 2.6) {
                    txtdetailstatusp.setText(""+"TIDAK PUAS");
                } else if (analisa >= 2.7 && analisa <= 3.4) {
                    txtdetailstatusp.setText(""+"RAGU-RAGU");
                } else if (analisa >= 3.5 && analisa <= 4.2) {
                    txtdetailstatusp.setText(""+"PUAS");
                } else if (analisa >= 4.3 && analisa <= 5) {
                    txtdetailstatusp.setText(""+"SANGAT PUAS");
                }
                txtnilaikes.setText(""+kesimpulan);
                if (kesimpulan >= 1.0 && kesimpulan <= 1.8) {
                    txtstatuskes.setText(""+"SANGAT TIDAK PUAS");
                } else if (kesimpulan >= 1.9 && kesimpulan <= 2.6) {
                    txtstatuskes.setText(""+"TIDAK PUAS");
                } else if (kesimpulan >= 2.7 && kesimpulan <= 3.4) {
                    txtstatuskes.setText(""+"RAGU-RAGU");
                } else if (kesimpulan >= 3.5 && kesimpulan <= 4.2) {
                    txtstatuskes.setText(""+"PUAS");
                } else if (kesimpulan >= 4.3 && kesimpulan <= 5) {
                    txtstatuskes.setText(""+"SANGAT PUAS");
                }
                txtdetaili.setText(""+analisa1);
                if (analisa1 >= 1.0 && analisa1 <= 1.8) {
                    txtdetailstatusi.setText(""+"SANGAT TIDAK PUAS");
                } else if (analisa1 >= 1.9 && analisa1 <= 2.6) {
                    txtdetailstatusi.setText(""+"TIDAK PUAS");
                } else if (analisa1 >= 2.7 && analisa1 <= 3.4) {
                    txtdetailstatusi.setText(""+"RAGU-RAGU");
                } else if (analisa1 >= 3.5 && analisa1 <= 4.2) {
                    txtdetailstatusi.setText(""+"PUAS");
                } else if (analisa1 >= 4.3 && analisa1 <= 5) {
                    txtdetailstatusi.setText(""+"SANGAT PUAS");
                }
                txtdetaile.setText(""+analisa2);
                if (analisa2 >= 1.0 && analisa2 <= 1.8) {
                    txtdetailstatuse.setText(""+"SANGAT TIDAK PUAS");
                } else if (analisa2 >= 1.9 && analisa2 <= 2.6) {
                    txtdetailstatuse.setText(""+"TIDAK PUAS");
                } else if (analisa2 >= 2.7 && analisa2 <= 3.4) {
                    txtdetailstatuse.setText(""+"RAGU-RAGU");
                } else if (analisa2 >= 3.5 && analisa2 <= 4.2) {
                    txtdetailstatuse.setText(""+"PUAS");
                } else if (analisa2 >= 4.3 && analisa2 <= 5) {
                    txtdetailstatuse.setText(""+"SANGAT PUAS");
                }
                txtdetailc.setText(""+analisa3);
                if (analisa3 >= 1.0 && analisa3 <= 1.8) {
                    txtdetailstatusc.setText(""+"SANGAT TIDAK PUAS");
                } else if (analisa3 >= 1.9 && analisa3 <= 2.6) {
                    txtdetailstatusc.setText(""+"TIDAK PUAS");
                } else if (analisa3 >= 2.7 && analisa3 <= 3.4) {
                    txtdetailstatusc.setText(""+"RAGU-RAGU");
                } else if (analisa3 >= 3.5 && analisa3 <= 4.2) {
                    txtdetailstatusc.setText(""+"PUAS");
                } else if (analisa3 >= 4.3 && analisa3 <= 5) {
                    txtdetailstatusc.setText(""+"SANGAT PUAS");
                }
                txtdetailec.setText(""+analisa4);
                if (analisa4 >= 1.0 && analisa4 <= 1.8) {
                    txtdetailstatusec.setText(""+"SANGAT TIDAK PUAS");
                } else if (analisa4 >= 1.9 && analisa4 <= 2.6) {
                    txtdetailstatusec.setText(""+"TIDAK PUAS");
                } else if (analisa4 >= 2.7 && analisa4 <= 3.4) {
                    txtdetailstatusec.setText(""+"RAGU-RAGU");
                } else if (analisa4 >= 3.5 && analisa4 <= 4.2) {
                    txtdetailstatusec.setText(""+"PUAS");
                } else if (analisa4 >= 4.3 && analisa4 <= 5) {
                    txtdetailstatusec.setText(""+"SANGAT PUAS");
                }
                txtdetails.setText(""+analisa5);
                if (analisa5 >= 1.0 && analisa5 <= 1.8) {
                    txtdetailstatuss.setText(""+"SANGAT TIDAK PUAS");
                } else if (analisa5 >= 1.9 && analisa5 <= 2.6) {
                    txtdetailstatuss.setText(""+"TIDAK PUAS");
                } else if (analisa5 >= 2.7 && analisa5 <= 3.4) {
                    txtdetailstatuss.setText(""+"RAGU-RAGU");
                } else if (analisa5 >= 3.5 && analisa5 <= 4.2) {
                    txtdetailstatuss.setText(""+"PUAS");
                } else if (analisa5 >= 4.3 && analisa5 <= 5) {
                    txtdetailstatuss.setText(""+"SANGAT PUAS");
                }

            }
        });
            }


    }



