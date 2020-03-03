package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sayfa2 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sayfa2);
        Button mavi=findViewById(R.id.mavi);
        Button somine=findViewById(R.id.somine);
        Button saganak=findViewById(R.id.saganakyagmur);
        Button kar=findViewById(R.id.kar);
        Button gol=findViewById(R.id.goldalga);
        Button semsiye=findViewById(R.id.semsiye);
        Button bilgi=findViewById(R.id.bilgi);
        mavi.setOnClickListener(this);
        somine.setOnClickListener(this);
        saganak.setOnClickListener(this);
        kar.setOnClickListener(this);
        gol.setOnClickListener(this);
        semsiye.setOnClickListener(this);
        bilgi.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.mavi:
                Intent yagmursayfasi=new Intent(sayfa2.this, com.example.myapplication.yagmursayfasi.class);
                startActivity(yagmursayfasi);
                break;
            case R.id.somine:
                Intent sominesayfasi=new Intent(sayfa2.this, com.example.myapplication.sominesayfasi.class);
                startActivity(sominesayfasi);
                break;
            case R.id.saganakyagmur:
                Intent saganakyagmursayfasi=new Intent(sayfa2.this, com.example.myapplication.saganakyagmursayfasi.class);
                startActivity(saganakyagmursayfasi);
                break;
            case R.id.kar:
                Intent karsayfasi=new Intent(sayfa2.this,com.example.myapplication.karsayfasi.class);
                startActivity(karsayfasi);
                break;
            case R.id.goldalga:
                Intent golsayfasi=new Intent(sayfa2.this, com.example.myapplication.golsayfasi.class);
                startActivity(golsayfasi);
                break;
            case R.id.semsiye:
                Intent semsiyesayfasi=new Intent(sayfa2.this, com.example.myapplication.semsiyesayfasi.class);
                startActivity(semsiyesayfasi);
                break;
            case R.id.bilgi:
                AlertDialog.Builder mdialog=new AlertDialog.Builder(sayfa2.this);
                mdialog.setTitle("Dikkat!");
                mdialog.setMessage("Uygulamadaki Sesler Siz Durdurana veya Uygulamayı Kapatana Kadar Durmayacaktır.");
                mdialog.setPositiveButton("tamam", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                mdialog.show();

        }
    }
}
