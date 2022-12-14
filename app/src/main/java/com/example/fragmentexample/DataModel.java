package com.example.fragmentexample;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DataModel extends ViewModel {
     final MutableLiveData<Movie> selectedItem = new MutableLiveData<Movie>();
}
