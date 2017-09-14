package ca.ualberta.cs.lonelytwitter;

/**
 * Created by dwaters on 9/13/17.
 */

import android.text.BoringLayout;

import java.lang.reflect.Array;
import java.util.Date;
import java.util.List;

public abstract class Tweet implements Tweetable {
    private String message;
    private Date date;
    private List Moods;

    public Tweet(String Message){
        date = new Date();
        this.message = Message;
    }
    public Tweet(String Message, Date date){
        this.date = date;
        this.message = Message;
    }
    public void addMood(String Mood){
        Moods.add(Mood);
    }

    public List getMoods(){ return Moods;}
    public String getMessage(){
        return message;
    }
    public Date getDate(){
        return date;
    }
    public void setMessage(String message) throws TweetTooLongException {
       if(message.length() <=140){
           this.message = message;
       }else{
            throw new TweetTooLongException();
       }

    }
    public abstract Boolean isImportant();
}