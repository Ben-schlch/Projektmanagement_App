package com.example.projektmanagementtest.ui.links;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LinksViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public LinksViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Hier finden Sie wichtige Links:\n");
    }



    public LiveData<String> getText() {
        return mText;
    }
}