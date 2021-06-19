package com.example.belajar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;


import java.util.ArrayList;

public class KalkulatorActivity extends AppCompatActivity  implements View.OnClickListener {
    EditText hasil;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7,
            btn8, btn9, btn0, btnKoma, btnTambah, btnKurang, btnKali,
            btnBagi, btnSamaDengan, btnCancel;

    double total=0;
    String status="";
    ModelActivity c_model;
    ControllerActivity c_controller;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        RelativeLayout layout = (RelativeLayout) findViewById(R.id.relativeLayout);

        kalkulator();

    }

    private void kalkulator() {
        hasil = (EditText)findViewById(R.id.textdata);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        btn6 = (Button)findViewById(R.id.btn6);
        btn7 = (Button)findViewById(R.id.btn7);
        btn8 = (Button)findViewById(R.id.btn8);
        btn9 = (Button)findViewById(R.id.btn9);
        btn0 = (Button)findViewById(R.id.btn0);
        btnKoma = (Button)findViewById(R.id.btnkoma);
        btnTambah = (Button)findViewById(R.id.btntambah);
        btnKurang = (Button)findViewById(R.id.btnkurang);
        btnKali = (Button)findViewById(R.id.btnkali);
        btnBagi = (Button)findViewById(R.id.btnbagi);
        btnSamaDengan = (Button)findViewById(R.id.btnsamadengan);
        btnCancel = (Button)findViewById(R.id.btncancel);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn0.setOnClickListener(this);
        btnKoma.setOnClickListener(this);
        btnTambah.setOnClickListener(this);
        btnKali.setOnClickListener(this);
        btnBagi.setOnClickListener(this);
        btnKurang.setOnClickListener(this);
        btnSamaDengan.setOnClickListener(this);
        btnCancel.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        try{
            switch(v.getId()){
                case R.id.btn1:
                    hasil.setText(hasil.getText().toString()+btn1.getText().toString());
                    break;

                case R.id.btn2:
                    hasil.setText(hasil.getText().toString()+btn2.getText().toString());
                    break;

                case R.id.btn3:
                    hasil.setText(hasil.getText().toString()+btn3.getText().toString());
                    break;

                case R.id.btn4:
                    hasil.setText(hasil.getText().toString()+btn4.getText().toString());
                    break;

                case R.id.btn5:
                    hasil.setText(hasil.getText().toString()+btn5.getText().toString());
                    break;

                case R.id.btn6:
                    hasil.setText(hasil.getText().toString()+btn6.getText().toString());
                    break;

                case R.id.btn7:
                    hasil.setText(hasil.getText().toString()+btn7.getText().toString());
                    break;

                case R.id.btn8:
                    hasil.setText(hasil.getText().toString()+btn8.getText().toString());
                    break;

                case R.id.btn9:
                    hasil.setText(hasil.getText().toString()+btn9.getText().toString());
                    break;

                case R.id.btn0:
                    hasil.setText(hasil.getText().toString()+btn0.getText().toString());
                    break;

                case R.id.btnkoma:
                    hasil.setText(hasil.getText().toString()+btnKoma.getText().toString());
                    break;

                case R.id.btntambah:
                    total = Double.parseDouble(hasil.getText().toString());
                    hasil.setText("");
                    status = "tambah";
                    break;

                case R.id.btnkurang:
                    total = Double.parseDouble(hasil.getText().toString());
                    hasil.setText("");
                    status = "kurang";
                    break;

                case R.id.btnkali:
                    total = Double.parseDouble(hasil.getText().toString());
                    hasil.setText("");
                    status = "kali";
                    break;

                case R.id.btnbagi:
                    total = Double.parseDouble(hasil.getText().toString());
                    hasil.setText("");
                    status = "bagi";
                    break;

                case R.id.btncancel:
                    hasil.setText("");
                    break;

                case R.id.btnsamadengan:

                    c_model = new ModelActivity(total, Double.parseDouble(hasil.getText().toString()));
                    c_controller = new ControllerActivity();

                    switch(status){
                        case "tambah":
                            hasil.setText(Double.toString(c_controller.addition(c_model)));
                            break;
                        case "kurang":
                            hasil.setText(Double.toString(c_controller.subtraction(c_model)));
                            break;
                        case "kali":
                            hasil.setText(Double.toString(c_controller.multiplication(c_model)));
                            break;
                        case "bagi":
                            hasil.setText(Double.toString(c_controller.divistion(c_model)));
                            break;
                    }

                    break;
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}