package com.example.projektmanagementtest.ui.raumreservierung;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class RaumreservierungViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public RaumreservierungViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("raumreservierung");
    }

    public LiveData<String> getText() {
        return mText;
    }
}