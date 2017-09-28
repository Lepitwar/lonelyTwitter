/*
* CurrentMood
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

import java.util.Date;
import java.util.List;

/**
 * Creates current Mood
 *
 * @author dwaters
 * @version 1.0
 * @see Tweet
 * @since 1.0
 */
public abstract class CurrentMood {
    private String Mood;
    private Date date;

    /**
     * Constructs a mood object
     *
     */
    public CurrentMood() {
        date = new Date();
    }

    /**
     * Constructs a Mood Object
     * @param date
     */
    public CurrentMood(Date date){
        this.date = date;
        //this.Mood = Mood;
    }

    /**
     * returns the mood string
     * @return mood
     */
    public String getMood(){
        return Mood;
    }

    /**
     * returns the moods date
     * @return mood date
     */
    public Date getDate(){
        return date;
    }

    /**
     * sets the moods date
     * @param date moods date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * sets the string value fo the mood
     * @param mood
     */
    public void setMood(String mood) {
        Mood = mood;
    }

    /**
     * Abstract Mood
     * @return returns an abstract mood
     */
    public abstract String Moods();
}
