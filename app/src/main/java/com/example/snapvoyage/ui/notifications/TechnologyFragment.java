package com.example.snapvoyage.ui.notifications;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


import com.example.snapvoyage.R;


public class TechnologyFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_technology, container, false);


        ImageView natureImageView = view.findViewById(R.id.imageView);
        natureImageView.setImageResource(R.drawable.ic_launcher_foreground);

        return view;
    }
}