package com.example.projektmanagementtest.ui.einstellungen;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class EinstellungenViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public EinstellungenViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("einstellungen");
    }

    public LiveData<String> getText() {
        return mText;
    }
}