package com.example.projetorion.ui.menu;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MenuViewModel extends ViewModel {

    private static final String TAG_MENU_VIEW = "DebugMenuViewModel";

    private final MutableLiveData<String> mText;

    public MenuViewModel() {
        Log.d("TAG_NOTIFICATIONS_VIEW","Construction de MenuViewModel dans MenuViewModel");

        mText = new MutableLiveData<>();
        mText.setValue("This is menu fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}