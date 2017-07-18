package ajaymehta.app4;

import android.app.Application;

/**
 * Created by Avi Hacker on 7/17/2017.
 */

public class MyApplication extends Application{  // TODO ...dont forget to put name of this class in Manifest file..

    Movie movie;

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}
