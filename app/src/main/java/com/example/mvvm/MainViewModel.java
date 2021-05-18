package com.example.mvvm;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class MainViewModel extends ViewModel {
   private final MutableLiveData<List<Article>> articlesLiveData= new MutableLiveData<>();

public LiveData<List<Article>> getArticle(){
    //call database

    List<Article> articles= new ArrayList<>();
    articles.add(new Article("title 1"," content 1"));
    articles.add(new Article("title 2"," content 2"));
    articles.add(new Article("title 3"," content 3"));
    articlesLiveData.postValue(articles);
    return articlesLiveData;
}



}
