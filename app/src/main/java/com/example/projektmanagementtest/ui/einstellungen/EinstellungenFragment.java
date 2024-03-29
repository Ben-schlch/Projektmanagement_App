package com.example.projektmanagementtest.ui.einstellungen;

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

public class EinstellungenFragment extends Fragment {

    private EinstellungenViewModel einstellungenViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        einstellungenViewModel =
                new ViewModelProvider(this).get(EinstellungenViewModel.class);
        View root = inflater.inflate(R.layout.fragment_settings, container, false);
        return root;
    }
}