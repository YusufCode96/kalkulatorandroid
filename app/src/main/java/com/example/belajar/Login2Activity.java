package com.example.belajar;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class Login2Activity extends AppCompatActivity {
    private String pembayaran;
    private Pengajuan mPengajuan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
//        pembayaran=getIntent().getStringExtra(RelativeLayoutActivity.PEMBAYARAN);
        mPengajuan=(Pengajuan) getIntent().getSerializableExtra(RelativeLayoutActivity.OBJEK);
       Toast.makeText(getApplicationContext(),"DATA:"+mPengajuan.getPembayaran()+"-"+mPengajuan.getQrcode(),Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("on destroy"," sedang on destroy activity");
        Toast.makeText(getApplicationContext(),"sedang on destroy",Toast.LENGTH_LONG).show();
    }
}