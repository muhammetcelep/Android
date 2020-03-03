package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class karsayfasi extends AppCompatActivity {
    public MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mediaPlayer=MediaPlayer.create(karsayfasi.this,R.raw.karyurume);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karsayfasi);
        final Button oynat=findViewById(R.id.oynat);
        final String[] zamanlar={"3","5","10","30","60","120"};
        Button zamanlayici =findViewById(R.id.zamanlayici);
        final Button durdur=findViewById(R.id.durdur);
        oynat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
                mediaPlayer.setLooping(true);
                durdur.setVisibility(View.VISIBLE);
                oynat.setVisibility(View.INVISIBLE);
            }});
        durdur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.pause();
                oynat.setVisibility(View.VISIBLE);
                durdur.setVisibility(View.INVISIBLE);
            }});
        zamanlayici.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder builder=new AlertDialog.Builder(karsayfasi.this);
                builder.setTitle("Zaman Seçiniz(Dakika)");
                builder.setSingleChoiceItems(zamanlar, -1, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        int zamanlar2= Integer.parseInt(zamanlar[i]);
                        switch (zamanlar2){
                            case 3:
                                Toast.makeText(getApplicationContext(),"Ses "+zamanlar[i]+" Saniye Sonra Kapanacaktır.",Toast.LENGTH_SHORT).show();
                                Handler h1 = new Handler();
                                Runnable stopPlaybackRun = new Runnable() {
                                    public void run(){
                                        mediaPlayer.stop();
                                        mediaPlayer.release();
                                        finish();
                                    }};
                                h1.postDelayed(stopPlaybackRun, 3000);
                                break;
                            case 5:
                                Toast.makeText(getApplicationContext(),"Ses "+zamanlar[i]+" Dakika Sonra Kapanacaktır.",Toast.LENGTH_SHORT).show();
                                Handler h2 = new Handler();
                                Runnable r2 = new Runnable() {
                                    public void run(){
                                        mediaPlayer.stop();
                                        mediaPlayer.release();
                                        finish();
                                    }};
                                h2.postDelayed(r2, 300000);
                                break;
                            case 10:
                                Toast.makeText(getApplicationContext(),"Ses "+zamanlar[i]+" Dakika Sonra Kapanacaktır.",Toast.LENGTH_SHORT).show();
                                Handler h3 = new Handler();
                                Runnable r3 = new Runnable() {
                                    public void run(){
                                        mediaPlayer.stop();
                                        mediaPlayer.release();
                                        finish();
                                    }};
                                h3.postDelayed(r3, 600000);
                                break;
                            case 30:
                                Toast.makeText(getApplicationContext(),"Ses "+zamanlar[i]+" Dakika Sonra Kapanacaktır.",Toast.LENGTH_SHORT).show();
                                Handler h4 = new Handler();
                                Runnable r4 = new Runnable() {
                                    public void run(){
                                        mediaPlayer.stop();
                                        mediaPlayer.release();
                                        finish();
                                    }};
                                h4.postDelayed(r4, 1800000);
                                break;
                            case 60:
                                Toast.makeText(getApplicationContext(),"Ses "+zamanlar[i]+" Dakika Sonra Kapanacaktır.",Toast.LENGTH_SHORT).show();
                                Handler h5 = new Handler();
                                Runnable r5 = new Runnable() {
                                    public void run(){
                                        mediaPlayer.stop();
                                        mediaPlayer.release();
                                        finish();
                                    }};
                                h5.postDelayed(r5, 3600000);
                                break;
                            case 120:
                                Toast.makeText(getApplicationContext(),"Ses "+zamanlar[i]+" Dakika Sonra Kapanacaktır.",Toast.LENGTH_SHORT).show();
                                Handler h6 = new Handler();
                                Runnable r6 = new Runnable() {
                                    public void run(){
                                        mediaPlayer.stop();
                                        mediaPlayer.release();
                                        finish();
                                    }};
                                h6.postDelayed(r6, 7200000);
                                break;
                        }
                        dialog.dismiss();
                    }});
                builder.setNeutralButton("İptal", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                AlertDialog mdialog= builder.create();
                mdialog.show();

            }});
    }
    @Override
    public void onBackPressed() {
        mediaPlayer.stop();
        mediaPlayer.release();
        super.onBackPressed();
    }
}
