package com.example.dietolog1;


import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView.FindListener;
import android.widget.TextView;

@SuppressLint("NewApi")
public class fragment1 extends Fragment {
			 
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, 
                                Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment1, null);
  
        
    }
}