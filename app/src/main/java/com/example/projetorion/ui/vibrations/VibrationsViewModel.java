package com.example.projetorion.ui.vibrations;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class VibrationsViewModel extends ViewModel {

    private static final String TAG_VIBRATIONS_VIEW = "DebugVibrationsViewModel";

    private final MutableLiveData<String> mText;

    public VibrationsViewModel() {
        Log.d(TAG_VIBRATIONS_VIEW,"Construction de VibrationsViewModel");

        mText = new MutableLiveData<>();
        mText.setValue("This is vibrations fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}