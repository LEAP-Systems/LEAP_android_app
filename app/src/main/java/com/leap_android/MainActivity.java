package com.leap_android;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.core.CameraX;
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

    //For simplicity sakes, unbindAll onBackPressed unbinds the camera to the lifecycle for the camerafragment
    //Currently, this is the solution looking for a more optimal one if possible
    @SuppressLint("RestrictedApi")
    @Override
    public void onBackPressed() {
        if(mainFragmentManager.getBackStackEntryCount() == 0){
            finish();
        }else{
            CameraX.unbindAll();
            super.onBackPressed();
        }
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
