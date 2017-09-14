package ca.ualberta.cs.lonelytwitter;

/**
 * Created by dwaters on 9/13/17.
 */

import android.text.BoringLayout;

import java.util.Date;

public abstract class Tweet implements Tweetable {
    private String message;
    private Date date;

    public Tweet(String Message){
        date = new Date();
        this.message = message;
    }
    public Tweet(String Message, Date date){
        this.date = date;
        this.message = message;
    }
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