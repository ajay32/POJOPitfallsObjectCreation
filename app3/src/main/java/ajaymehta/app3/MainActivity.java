package ajaymehta.app3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView movieName;
    EditText enterMovie;

    Array array = new Array();


    Movie movieObject = new Movie(); // Object 1
    // details ->  setMovieName( done isi class main)   getMoveName(done array class main) vaha pass kia ye object..


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        movieName = (TextView) findViewById(R.id.tv_moviename);
        enterMovie = (EditText) findViewById(R.id.et_movie);
    }

    public void submit(View view) {

        String name = enterMovie.getText().toString();
        movieObject.setMovieName(name);  // given value

        array.getObject(movieObject);   //  sending this object to Array class so that it can take value..
        array.add();
        movieName.setText(array.display());
    }


}
