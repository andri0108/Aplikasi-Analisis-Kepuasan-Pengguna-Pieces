package com.example.myanalyst;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtid = (TextView) findViewById(R.id.txtid);
        Bundle extras = getIntent().getExtras();
        String id;

        if(extras != null){
            id = extras.getString("id");
            txtid.setText(id);
        }
        TextView performance = (TextView) findViewById(R.id.txtperformance);
        TextView informasi = (TextView) findViewById(R.id.txtinformasi);
        TextView ekonomi = (TextView) findViewById(R.id.txtekonomi);
        TextView control = (TextView) findViewById(R.id.txtcontrol);
        TextView efisien = (TextView) findViewById(R.id.txtefisien);
        TextView service = (TextView) findViewById(R.id.txtservice);
        TextView detail = (TextView) findViewById(R.id.txtdetail);
        ImageButton result1 = (ImageButton) findViewById(R.id.btnresult_control);
        ImageButton result2 = (ImageButton) findViewById(R.id.btnresult_efisien);
        ImageButton result3 = (ImageButton) findViewById(R.id.btnresult_ekonomi);
        ImageButton result4 = (ImageButton) findViewById(R.id.btnresult_informasi);
        ImageButton result5 = (ImageButton) findViewById(R.id.btnresult_performa);
        ImageButton result6 = (ImageButton) findViewById(R.id.btnresult_servis);
        ImageButton result7 = (ImageButton) findViewById(R.id.btnhelp);

        result7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, HelpActivity.class);
                startActivity(i);
            }
        });
        result6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ResultServisActivity.class);
                startActivity(i);
            }
        });
        result5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ResultPerformaActivity.class);
                startActivity(i);
            }
        });
        result4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ResultInformasiActivity.class);
                startActivity(i);
            }
        });
        result3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ResultEkonomiActivity.class);
                startActivity(i);
            }
        });
        result1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ResultControlActivity.class);
                startActivity(i);
            }
        });
        result2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ResultEfisienActivity.class);
                startActivity(i);
            }
        });

        performance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String id2 = txtid.getText().toString();
                Intent i = new Intent(MainActivity.this, PerformaActivity.class);
                i.putExtra("id",id2);
                startActivity(i);
            }
        });
        informasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String id2 = txtid.getText().toString();
                Intent i = new Intent(MainActivity.this, InformationActivity.class);
                i.putExtra("id",id2);
                startActivity(i);
            }
        });
        ekonomi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String id2 = txtid.getText().toString();
                Intent i = new Intent(MainActivity.this, EkonomiActivity.class);
                i.putExtra("id",id2);
                startActivity(i);
            }
        });
        control.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String id2 = txtid.getText().toString();
                Intent i = new Intent(MainActivity.this, ControlActivity.class);
                i.putExtra("id",id2);
                startActivity(i);
            }
        });
        efisien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String id2 = txtid.getText().toString();
                Intent i = new Intent(MainActivity.this, Efisien.class);
                i.putExtra("id",id2);
                startActivity(i);
            }
        });
        service.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String id2 = txtid.getText().toString();
                Intent i = new Intent(MainActivity.this, ServiceActivity.class);
                i.putExtra("id",id2);
                startActivity(i);
            }
        });
        detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String id2 = txtid.getText().toString();
                Intent i = new Intent(MainActivity.this, DetailActivity.class);
                i.putExtra("id",id2);
                startActivity(i);
            }
        });



    }
}
