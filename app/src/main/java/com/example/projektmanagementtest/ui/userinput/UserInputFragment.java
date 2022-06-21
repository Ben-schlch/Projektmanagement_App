package com.example.projektmanagementtest.ui.userinput;

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
import com.example.projektmanagementtest.ui.home.HomeViewModel;

public class UserInputFragment extends Fragment {
    private UserInputViewModel UserInputViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        UserInputViewModel =
                new ViewModelProvider(this).get(UserInputViewModel.class);

        //TODO: einbinden des Layouts "fragment_userinput" mit entsprechender ID (fragment_userinput)
        //View root = inflater.inflate(R.layout.fragment_userinput, container, false);

        return null;
    }
}
