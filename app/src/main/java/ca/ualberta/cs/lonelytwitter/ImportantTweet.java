/*
* ImportantTweet
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
 * Creates an ImportantTweet
 *
 * @author dwaters
 * @version 1.0
 * @see NormalTweet
 * @see Tweet
 * @since 1.0
 *
 */
public class ImportantTweet extends Tweet {
    /**
     * Constructs a ImportantTweet object
     * @param message tweet message
     */
    public ImportantTweet(String message){
        super(message);
    }

    /**
     * Constructs a ImportantTweet object
     * @param message tweet message
     * @param date tweet date
     */
    public ImportantTweet(String message, Date date){
        super(message, date);
    }

    @Override
    /**
     * Sets Tweet to important
     */
    public Boolean isImportant() {
        return Boolean.TRUE;
    }

    public String oneMessage() {
        return null;
    }
}
