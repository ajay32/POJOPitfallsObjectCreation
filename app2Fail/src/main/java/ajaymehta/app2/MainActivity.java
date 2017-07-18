package ajaymehta.app2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView movieName;
    EditText enterMovie;


    Movie movieObject = new Movie(); // Object 1
    // details -->    setMovieName( dia hai )    getMovieName( use nai kia kahi bhi)  -- so kaise get hOGI VALUE  (MAIN ise object ko is class main use kar sakta hu to ..mje to value dusri classmain get karna hai vaha naya object bana na padega ..to value is object ne set ki  ..vo geT TO KAR hi nai sakta to vo get karega to null milega

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        movieName = (TextView) findViewById(R.id.tv_moviename);
        enterMovie = (EditText) findViewById(R.id.et_movie);
    }

    public void submit(View view) {

        String name = enterMovie.getText().toString();
        movieObject.setMovieName(name);

        Array array = new Array(); // Single Object (no issues with that create anywhere // object of our class
        array.add();
        movieName.setText(array.display());
    }
}
