package com.example.wiekszaliczba;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private int count = 0;
    private int r1, r2;

    @Override
    protected void  onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void giveNewRandom(){
        if(count==5){
            count=0;
            Toast.makeText(this, "Wygrałeś!", Toast.LENGTH_SHORT).show();
        }else{
        Random rand = new Random();
        r1= rand.nextInt(10);
        while (true) {


            r2 = rand.nextInt(10);
            if(r1!=r2)break;
        }

        Button b = (Button) findViewById(R.id.buttonl);
        b.setText(Integer.toString(r1));
        Button b2 = (Button) findViewById(R.id.buttonr);
        b.setText(Integer.toString(r2));
    }
    }

    public void onClickLeft (View view){
        if (r1>r2)
            count++;
        else
            count--;
       TextView txt = (TextView) findViewById(R.id.textViewWynik);
       txt.setText("Punkty: "+count);
       giveNewRandom();
    }
    public void onClickRight (View view){
        if (r1>r2)
            count++;
        else
            count--;
        TextView txt = (TextView) findViewById(R.id.textViewWynik)