package ajaymehta.app2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Avi Hacker on 7/17/2017.
 */

public class Array {

    Movie movieName = new Movie();  // object 2  ..doesnt matter ki name same hai jo object humara MainActivity main hai use se..(koi farak nai padta name se ..they get sotred in different reference (memeory)
// details -- >  setMovieName( use hi nai kia kahi ise class main)  getMovieName( use kia ) but jab set hi nai kia is object ne kuch to get kaise karega..

    List<String> list = new ArrayList<>();

    public void add() {

        String element = movieName.getMovieName();  // set nai kia is object ne kuch to null milega get karne par..

        list.add(element);
    }


    public String display(){

        StringBuilder sb = new StringBuilder();

        for(String i : list) {

            sb.append(i);
        }

        return sb.toString();
    }
}
