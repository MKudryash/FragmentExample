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


public class FirstFragment extends Fragment {
    private DataModel dataModel;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        dataModel = new ViewModelProvider(requireActivity()).get(DataModel.class);
        Button sendMessageActivity = view.findViewById(R.id.sendMessageActivity);
        Button sendMessageFragment = view.findViewById(R.id.sendMessageFragment);
        Movie movie = new Movie(15,"Конец","Жизнь","Россия","",2002);
        sendMessageActivity.setOnClickListener(item-> {
            dataModel.selectedItem.setValue(movie);
        });
        sendMessageFragment.setOnClickListener(item-> {
                dataModel.selectedItem.setValue(movie);
        });


    }
}