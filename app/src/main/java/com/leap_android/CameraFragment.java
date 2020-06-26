package com.leap_android;

import android.graphics.Camera;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class CameraFragment extends Fragment {


    Camera mCamera;
    int mNumberOfCameras;
    int cameraId;
    int rotation;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.cam_frag_layout, container, false);



    }




}
