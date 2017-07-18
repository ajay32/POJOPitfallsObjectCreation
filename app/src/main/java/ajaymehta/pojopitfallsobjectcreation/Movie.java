package ajaymehta.pojopitfallsobjectcreation;

/**
 * Created by Avi Hacker on 7/17/2017.
 */

// 1 good reason for also using POJO is because it also provides Encapsulation...
    // like nobody can directly access String movieName (its private ) n change its value..
    // what use set value ...only that value user can acess..he can't change its value..


    // Why we need POJO ...when we need to use a particular value in several classes (starting from 2 classes ) ...
    // we go for pojo ..so that ..we can set value from any class and also  getting value in whichever class we need...
    // just means ki data pass karna pure project main kisi bhi class se kisi bhi class main ..cool ....

    // here we have 2 classes  MainActivity n this class Movie..

public class Movie {

    private String movieName;

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
}
