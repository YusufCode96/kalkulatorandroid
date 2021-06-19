package com.example.belajar;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RelativeLayoutActivity extends AppCompatActivity  implements View.OnClickListener,View.OnDragListener {

    private Button btnShow;
    private TextView jenisPengajuan;
    public static final String PEMBAYARAN= "pembayaran";
    public static final String OBJEK="objek";
    private Pengajuan mPengajuan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout);
        btnShow= (Button) findViewById(R.id.relative_button);
        jenisPengajuan= (TextView) findViewById(R.id.relative_jenis_pengajuan_text);
        btnShow.setOnClickListener(this);
//        btnShow.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(),"aku di klick",Toast.LENGTH_LONG).show();
//
//            }
//        });
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(getApplicationContext(),"aku di klick "+jenisPengajuan.getText().toString(),Toast.LENGTH_LONG).show();
        //dari mana ke mana
        Intent i =new Intent(this,Login2Activity.class);
        //i.putExtra(PEMBAYARAN,jenisPengajuan.getText().toString());
        mPengajuan=new Pengajuan("911",jenisPengajuan.getText().toString());
        i.putExtra(OBJEK,mPengajuan);
        startActivity(i);
    }

    @Override
    //alt + insert memanggil overide
    protected void onPause() {
        super.onPause();
        Log.d("on pause"," sedang on pause activity");
        Toast.makeText(getApplicationContext(),"sedang on pause",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(),"sedang on resume",Toast.LENGTH_LONG).show();
        Log.d("on resume"," sedang on resume activity");
    }

    @Override
    public boolean onDrag(View v, DragEvent event) {
        return false;
    }
}