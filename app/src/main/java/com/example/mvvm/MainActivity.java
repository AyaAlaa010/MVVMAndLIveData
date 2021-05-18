package com.example.mvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {
MainViewModel viewModel;
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewModel= new ViewModelProvider(this).get(MainViewModel.class);
        viewModel.getArticle();
viewModel.articlesLiveData.observe(this, new Observer<List<Article>>() {
    @Override
    public void onChanged(List<Article> articles) {
        Log.i(TAG, "onChanged: "+articles.size());
    }
});


    }
}