package com.example.projetorion.ui.menu;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.projetorion.databinding.FragmentMenuBinding;

public class MenuFragment extends Fragment {

    private static final String TAG_DASHBOARD = "DebugDashboardFragment";

    private FragmentMenuBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        Log.d(TAG_DASHBOARD,"Appel de onCreate dans MenuFragment");

        MenuViewModel menuViewModel =
                new ViewModelProvider(this).get(MenuViewModel.class);

        binding = FragmentMenuBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textDashboard;
        menuViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        Log.d(TAG_DASHBOARD,"Appel de onDestroyView dans MenuFragment");

        super.onDestroyView();
        binding = null;
    }
}