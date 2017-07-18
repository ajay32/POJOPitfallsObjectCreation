package ajaymehta.app3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Avi Hacker on 7/17/2017.
 */

public class Array {

    Movie mm;  // reference so that we can hold coming object from MainActivity..


    List<String> list = new ArrayList<>();

    public void add() {

        String element = mm.getMovieName();  // taken value ( mm holds Object 1 [ created in MainActivity]

        list.add(element);
    }


    public String display(){

        StringBuilder sb = new StringBuilder();

        for(String i : list) {

            sb.append(i);
        }

        return sb.toString();
    }

    public void getObject(Movie movie) {

        mm = movie;

    }
}
