package com.example.hw2_m3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hw2_m3.databinding.FragmentMainBinding;
import com.example.hw2_m3.databinding.FragmentSecondBinding;

public class SecondFragment extends Fragment {

    FragmentSecondBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSecondBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        if (getArguments() != null) {
            Warrior warrior = SecondFragmentArgs.fromBundle(getArguments()).getId();

            binding.tvName.setText("Name: " + warrior.getName());
            binding.tvHealth.setText("Health: " + warrior.getHealth());
            binding.tvDamage.setText("Damage: " + warrior.getDamage());
        }
    }
}