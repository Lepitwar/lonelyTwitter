/*
* NormalTweet
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
 * Creates a Tweet
 *
 * @author dwaters
 * @version 1.0
 * @see Tweet
 * @see ImportantTweet
 * @since 1.0
 *
 */

public class NormalTweet extends Tweet {
    /**
     * Constructs a NormalTweet object
     * @param message tweet message
     */
    public NormalTweet(String message){
        super(message);
    }

    /**
     * Constructs a NormalTweet object
     * @param message tweet message
     * @param date tweet date
     */
    public NormalTweet(String message, Date date){
        super(message, date);
    }

    @Override
    /**
     * Sets is important to false
     */
    public Boolean isImportant() {
        return Boolean.FALSE;
    }

    public String oneMessage() {
        return null;
    }
}
