package com.example.helloworld;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.loader.content.AsyncTaskLoader;

public class FetchBook extends AsyncTaskLoader<String> {

    private String myQueryString;

    public FetchBook(@NonNull Context context, String queryString) {
        super(context);
        myQueryString = queryString;
    }

    @Override
    protected void onStartLoading() {
        super.onStartLoading();
        forceLoad();
    }

    @Nullable
    @Override
    public String loadInBackground() {
        return NetworkUtils.getBookInfo(myQueryString);
    }
}
