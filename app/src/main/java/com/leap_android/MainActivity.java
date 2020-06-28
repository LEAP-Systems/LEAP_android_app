package com.leap_android;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    FragmentManager mainFragmentManager;
    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Instantiate fragment manager and transaction
        mainFragmentManager = getSupportFragmentManager();
        fragmentTransaction = mainFragmentManager.beginTransaction();
        mainFragmentManager.beginTransaction().add(R.id.menu_frag, new MenuFragment()).commit();

       // if (savedInstanceState == null) {
            //Initialize and create first fragment using the menu_frag_layout and MenuFragment class
        //    mainFragmentManager.beginTransaction().add(R.id.menu_frag, new MenuFragment()).commit();
        //}


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
