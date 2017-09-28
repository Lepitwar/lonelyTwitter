/*
* Sad
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
 * @see CurrentMood
 * @since 1.0
 *
 */
public class Sad extends CurrentMood {
    /**
     * Constructs a sad object
     */
    public Sad() { }

    /**
     * Creates a Sad object with date
     * @param date sad date
     */
    public Sad( Date date){ super(date);}

    /**
     * Returns a Sad String
     * @return sad string
     */
    public String isSad(){ return "I'm Sad";}

    @Override
    /**
     * Sets Current Mood to Sad
     */
    public String Moods() {
        return "Sad";
    }

}
