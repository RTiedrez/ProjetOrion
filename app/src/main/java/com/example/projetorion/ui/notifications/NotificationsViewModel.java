package com.example.projetorion.ui.notifications;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NotificationsViewModel extends ViewModel {

    private static final String TAG_NOTIFICATIONS_VIEW = "DebugNotificationsViewModel";

    private final MutableLiveData<String> mText;

    public NotificationsViewModel() {
        Log.d(TAG_NOTIFICATIONS_VIEW,"Construction de NotificationsViewModel");

        mText = new MutableLiveData<>();
        mText.setValue("This is notifications fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}