package com.leap_android;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }


    @Override
    protected void onStart(){
        super.onStart();
        Log.d("lifecycle","onStart invoked");
    }


    @Override
    protected void onResume(){
        super.onResume();
        Log.d("lifecycle","onResume invoked");

        addListenerOnExtData();
        addListenerOnCheckData();
    }


    public void addListenerOnExtData() {

        final Button ext_data = findViewById(R.id.ext_data_button);

        ext_data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),"You have clicked Read Data", Toast.LENGTH_LONG).show();
            }
        });
    }

    public void addListenerOnCheckData() {

        final Button ext_data = findViewById(R.id.check_data_button);

        ext_data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),"You have clicked Check Data", Toast.LENGTH_LONG).show();
            }
        });
    }


    @Override
    protected void onPause(){
        super.onPause();
        Log.d("lifecycle","onPause invoked");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("lifecycle","onStop invoked");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("lifecycle","onRestart invoked");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("lifecycle","onDestroy invoked");
    }


}
