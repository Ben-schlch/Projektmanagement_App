package com.example.projektmanagementtest.ui.raumreservierung;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.projektmanagementtest.R;

public class RaumreservierungFragment extends Fragment {

    private RaumreservierungViewModel raumreservierungViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        raumreservierungViewModel =
                new ViewModelProvider(this).get(RaumreservierungViewModel.class);
        View root = inflater.inflate(R.layout.fragment_raumreservierung, container, false);
        final TextView textView = root.findViewById(R.id.text_raumreservierung);
        raumreservierungViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}