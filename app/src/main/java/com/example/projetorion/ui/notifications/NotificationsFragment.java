package com.example.projetorion.ui.notifications;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.projetorion.databinding.FragmentNotificationsBinding;

public class NotificationsFragment extends Fragment {

    private static final String TAG_NOTIFICATIONS = "DebugNotificationsFragment";

    private FragmentNotificationsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        Log.d(TAG_NOTIFICATIONS,"Appel de onCreate dans NotificationsFragment");

        NotificationsViewModel notificationsViewModel =
                new ViewModelProvider(this).get(NotificationsViewModel.class);

        binding = FragmentNotificationsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textNotifications;
        notificationsViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        Log.d(TAG_NOTIFICATIONS,"Appel de onDestroyView dans NotificationsFragment");

        super.onDestroyView();
        binding = null;
    }
}