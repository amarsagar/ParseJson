package com.example.amar.parsejson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String temp=LoadAsset("value.json");
        Gson gson=new GsonBuilder().create();
        BankInfo bankInfo=gson.fromJson(temp,BankInfo.class);
        TextView tv=(TextView)findViewById(R.id.tv_main);
        tv.setText(temp);


    }

    public String LoadAsset(String filename){
        String data=null;
        try {
            InputStream is = getAssets().open(filename);
            int size=is.available();
            byte[] buffer=new byte[size];
            is.read(buffer);
            is.close();
            data=new String(buffer,"UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return data;
    }
}
