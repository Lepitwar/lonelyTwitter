/*
*Tweet
*
* Version 1.0
*
* September 27, 2017
*
 * Copyright (c) 2017. Team X CMPUT301, Univeristy of Alberta - All Rights Reserved
 * You may use, distribute or modify this code under terms and conditions of the Code of Student
 * Behaviour at Univeristy of Alberta.
 * You can find a copy of the license in this project. Otherwise please contact dwaters@ualberta.ca
 */

package ca.ualberta.cs.lonelytwitter;

import android.text.BoringLayout;

import java.lang.reflect.Array;
import java.util.Date;
import java.util.List;

/**
 * Creates a Tweet
 *
 * @author dwaters
 * @version 1.0
 * @see NormalTweet
 * @see ImportantTweet
 * @since 1.0
 *
 */
public abstract class Tweet implements Tweetable {
    private String message;
    private Date date;
    private List Moods;

    /**
     * Constructs a Tweet Object
     * @param Message tweet message
     */
    public Tweet(String Message){
        date = new Date();
        this.message = Message;
    }

    /**
     * Consturcts a Tweet Object
     *
     * @param Message tweet message
     * @param date tweet date
     */
    public Tweet(String Message, Date date){
        this.date = date;
        this.message = Message;
    }

    /**
     * adds a Mood to a tweet
     * @param Mood tweet Mood
     */
    public void addMood(String Mood){
        Moods.add(Mood);
    }

    /**
     * Returns Tweeted Mood
     * @return Tweets Mood
     */
    public List getMoods(){ return Moods;}

    /**
     *  Returns the message tweet
     * @return tweet message
     */
    public String getMessage(){
        return message;
    }

    /**
     * Returns Tweets Date
     * @return Tweets Date
     */
    public Date getDate(){
        return date;
    }

    /**
     * Sets the message for a tweet
     *
     * @param message tweet message
     * @throws TweetTooLongException tweet too long error
     */
    public void setMessage(String message) throws TweetTooLongException {
       if(message.length() <=140){
           this.message = message;
       }else{
            throw new TweetTooLongException();
       }

    }

    /**
     * Is Tweet Important
     * @return if tweet isImportant
     */
    public abstract Boolean isImportant();

    @Override
    /**
     * Returns the date and message of the tweet.
     * @return message and date of tweet
     */
    public String toString(){
        return date.toString()+" | "+message;

    }
}
//notes to sklf for replicate documentation
//File - Setting - general -  enable quick doucmentation
// then a /** */ to have info appear for them.
// to build java Doc - Tools - Generate JavaDoc