package com.leap_android;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class MenuFragment extends Fragment {

    Context MenuContext;
    View MenuView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View menu_view = inflater.inflate(R.layout.menu_frag_layout, container, false);
        MenuContext = getContext();
        MenuView = getView();
        return menu_view;
    }

    @Override
    public void onStart(){
        super.onStart();
        Log.d("lifecycle","onStart invoked");
    }


    @Override
    public void onResume(){
        super.onResume();
        Log.d("lifecycle","onResume invoked");

        addListenerOnExtData();
        addListenerOnCheckData();
    }

    public void addListenerOnExtData() {

        Button ext_data = MenuView.findViewById(R.id.ext_data_button);
        //Make android studio happy by letting it know that button view is not null
        assert ext_data != null;

        ext_data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MenuContext.getApplicationContext(),"You have clicked Read Data", Toast.LENGTH_LONG).show();
            }
        });
    }

    public void addListenerOnCheckData() {

        final Button check_data = MenuView.findViewById(R.id.check_data_button);

        //Make android studio happy by letting it know that button view is not null
        assert check_data != null;

        check_data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MenuContext.getApplicationContext(),"You have clicked Check Data", Toast.LENGTH_LONG).show();
            }
        });
    }

}
