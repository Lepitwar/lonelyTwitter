/*
* Happy
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

/**
 * Creates a happy mood
 *
 * @author dwaters
 * @version 1.0
 * @see CurrentMood
 * @see Tweet
 * @since 1.0
 */
public class Happy extends CurrentMood {

    public Happy() { }

    /**
     * constructs a happy object
     * @param date
     */
    public Happy( Date date){ super(date);}

    /**
     * Returns a Happy Mood string
     * @return string - Happy
     */
    public String isHappy(){return "I'm Happy!"; }

    @Override
    /**
     * Sets  abstract to happy
     */
    public String Moods() {
        return "Happy";
    }

}

