package com.example.movieproapp.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;

import com.example.movieproapp.R;
import com.example.movieproapp.databinding.MovieActivityBinding;
import com.example.movieproapp.model.Movie;

public class MovieActivity extends AppCompatActivity {
    private Movie movie;
    private MovieActivityBinding movieActivityBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movie_activity);

//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        movieActivityBinding = DataBindingUtil.setContentView(this, R.layout.movie_activity);

        Intent i = getIntent();

        if (i.hasExtra("movie")) {
            movie = getIntent().getParcelableExtra("movie");
            movieActivityBinding.setMovie(movie);
//            getSupportActionBar().setTitle(movie.getTitle());
        }
    }
}