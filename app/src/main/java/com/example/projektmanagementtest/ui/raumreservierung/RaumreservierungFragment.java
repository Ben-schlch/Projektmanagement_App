package com.example.projektmanagementtest.ui.raumreservierung;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.projektmanagementtest.R;

public class RaumreservierungFragment extends Fragment {

    private RaumreservierungViewModel raumreservierungViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        raumreservierungViewModel =
                new ViewModelProvider(this).get(RaumreservierungViewModel.class);
        View root = inflater.inflate(R.layout.fragment_raumreservierung, container, false);
        return root;
    }
}