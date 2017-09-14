package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by dwaters on 9/13/17.
 */

public class Happy extends CurrentMood {
    public Happy(String mood) { super(mood); }
    public Happy(String mood, Date date){ super(mood, date);}
    public String isHappy(){return "Happy"; }



}

