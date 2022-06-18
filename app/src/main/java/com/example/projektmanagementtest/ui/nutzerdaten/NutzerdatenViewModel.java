package com.example.projektmanagementtest.ui.nutzerdaten;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NutzerdatenViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public NutzerdatenViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("nutzerdaten");
    }

    public LiveData<String> getText() {
        return mText;
    }
}