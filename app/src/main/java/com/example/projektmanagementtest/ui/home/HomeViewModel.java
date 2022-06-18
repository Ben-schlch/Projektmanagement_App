package com.example.projektmanagementtest.ui.home;

import android.media.Image;
import android.provider.MediaStore;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Das ist die Startseite." +
                "Hier können dann Infos der Wahl eingeblendet werden." +
                "..." );
    }

    public LiveData<String> getText() {
        return mText;
    }
}