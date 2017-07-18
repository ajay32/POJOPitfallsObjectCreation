package ajaymehta.pojopitfallsobjectcreation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView movieName;
    EditText enterMovie;

    // if i describe you about this object..
    Movie movieObject = new Movie();
    // it has got  setMovieName(value di hai)    getMovieName( value li hai)   ..maine jab hum value denge tabhi le sakte hai varna milega null  ..yeah  yeah..!!

    // so when we dealing with 2 classes ( 1 object is sufficent ) no problem in getter setter..

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        movieName = (TextView) findViewById(R.id.tv_moviename);
        enterMovie = (EditText) findViewById(R.id.et_movie);
    }

    public void submit(View view) {

        String name = enterMovie.getText().toString();
        movieObject.setMovieName(name);   // value given


        movieName.setText(movieObject.getMovieName());  // value taken
    }
}
