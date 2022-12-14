package com.example.fragmentexample;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.logging.Filter;

public class SecondFragment extends Fragment {
    private DataModel dataModel;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView sendMessageActivity = view.findViewById(R.id.txtMessagetwo);
        dataModel = new ViewModelProvider(requireActivity()).get(DataModel.class);
        dataModel.selectedItem.observe(getViewLifecycleOwner(),item->
        {
            sendMessageActivity.setText(item.Country);
        });
    }
}