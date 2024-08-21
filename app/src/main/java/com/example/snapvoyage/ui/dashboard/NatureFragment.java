package com.example.snapvoyage.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;


import com.example.snapvoyage.R;

import androidx.annotation.Nullable;

import android.widget.ImageView;

public class NatureFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_nature, container, false);

        ImageView natureImageView = view.findViewById(R.id.imageView);
        natureImageView.setImageResource(R.drawable.ic_launcher_foreground);


        return view;
    }
}