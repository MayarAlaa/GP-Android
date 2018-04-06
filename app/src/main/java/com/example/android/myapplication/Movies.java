/**
 * Created by Lenovo on 4/5/2018.
 */
package com.example.android.myapplication;

import android.support.v7.app.AppCompatActivity;

public class Movies extends AppCompatActivity {


        private int id;
        private String movieName;
        private String imageLink;
        private String movieGenre;

        public Movies(int id, String movieName, String imageLink, String movieGenre) {
            this.id = id;
            this.movieName = movieName;
            this.imageLink = imageLink;
            this.movieGenre = movieGenre;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getMovieName() {
            return movieName;
        }

        public void setMovieName(String movieName) {
            this.movieName = movieName;
        }

        public String getImageLink() {
            return imageLink;
        }

        public void setImageLink(String imageLink) {
            this.imageLink = imageLink;
        }

        public String getMovieGenre() {
            return movieGenre;
        }

        public void setMovieGenre(String movieGenre) {
            this.movieGenre = movieGenre;
        }

    }

