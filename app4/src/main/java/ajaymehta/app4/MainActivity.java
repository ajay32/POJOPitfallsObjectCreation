package ajaymehta.app4;

import android.app.Application;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView movieName;
    EditText enterMovie;

    Array array = new Array();

    Movie movie = new Movie();

    MyApplication getMyAppObject;



    Movie mm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        movieName = (TextView) findViewById(R.id.tv_moviename);
        enterMovie = (EditText) findViewById(R.id.et_movie);

         getMyAppObject = (MyApplication) getApplication();  // get the object of MyApplication u created..
        getMyAppObject.setMovie(movie);


    }

    public void submit(View view) {

        String name = enterMovie.getText().toString();
        getMyAppObject.getMovie().setMovieName(name);  // given value

        array.appObject(getMyAppObject);
        array.add();
        movieName.setText(array.display());
    }


}
