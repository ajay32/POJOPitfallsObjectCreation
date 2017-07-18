package ajaymehta.app4;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Avi Hacker on 7/17/2017.
 */

public class Array {

    Movie mm;  // reference so that we can hold coming object from MainActivity..


    List<String> list = new ArrayList<>();

    public void add() {


        String element = mm.getMovieName();

        list.add(element);
    }


    public String display(){

        StringBuilder sb = new StringBuilder();

        for(String i : list) {

            sb.append(i+"\n");
        }

        return sb.toString();
    }

    public void appObject(MyApplication appObject) {


        mm = appObject.getMovie();
    }

}
