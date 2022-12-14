package com.example.fragmentexample;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.logging.Filter;

public class MainActivity extends AppCompatActivity {
    private DataModel dataModel;

    Movie movie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.textView2);
        getSupportFragmentManager().beginTransaction()
                .add(R.id.FOne, FirstFragment.class, null)
                .commit(); getSupportFragmentManager().beginTransaction()
                .add(R.id.FTwo, SecondFragment.class, null)
                .commit();

            dataModel = new ViewModelProvider(this).get(DataModel.class);
             dataModel.selectedItem.observe(this,
                     item -> {
                 textView.setText(item.Title);
                     });
        }
    }
