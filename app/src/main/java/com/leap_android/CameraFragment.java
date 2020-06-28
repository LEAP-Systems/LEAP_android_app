package com.leap_android;

import android.graphics.Camera;
import android.hardware.camera2.CameraDevice;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.hardware.camera2.CameraDevice;
import androidx.fragment.app.Fragment;

public class CameraFragment extends Fragment{


    TextView testView;

    CameraDevice camera;
    SurfaceView surfaceView;
    SurfaceHolder surfaceHolder;

    private final String tag = "VideoServer";

    Button capture;
    Boolean onOffCam = false;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View cam_view = inflater.inflate(R.layout.cam_frag_layout, container, false);

        capture = cam_view.findViewById(R.id.btn_capture);
        capture.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View arg0) {
                if (onOffCam == false){

                    onOffCam = true;
                }
                else{

                    onOffCam = false;
                }
            }
        });




        return cam_view;
    }







}
