package com.example.projetorion.ui.vibrations;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.projetorion.databinding.FragmentVibrationsBinding;

public class VibrationsFragment extends Fragment {

    private static final String TAG_VIBRATIONS = "DebugVibrationsFragment";

    private FragmentVibrationsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        Log.d(TAG_VIBRATIONS,"Appel de onCreate dans VibrationsFragment");

        VibrationsViewModel vibrationsViewModel =
                new ViewModelProvider(this).get(VibrationsViewModel.class);

        binding = FragmentVibrationsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textHome;
        vibrationsViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        Log.d(TAG_VIBRATIONS,"Appel de onDestroyView dans VibrationsFragment");

        super.onDestroyView();
        binding = null;
    }
}