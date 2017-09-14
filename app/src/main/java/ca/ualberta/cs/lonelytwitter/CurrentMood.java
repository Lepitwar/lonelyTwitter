package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by dwaters on 9/13/17.
 */

public abstract class CurrentMood {
    private String Mood;
    private Date date;

    public CurrentMood(String Mood){
        date = new Date();
        this.Mood = Mood;
    }
    public CurrentMood(String Mood, Date date){
        this.date = date;
        this.Mood = Mood;
    }
    public String getMood(){
        return Mood;
    }
    public Date getDate(){
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setMood(String mood) {
        Mood = mood;
    }
}
