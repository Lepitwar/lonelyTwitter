package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by dwaters on 9/13/17.
 */

public class Sad extends CurrentMood {
   /** public Sad(String mood) {
        super(mood);
    }
    public Sad(String mood, Date date){ super(mood, date);}
    */
    public Sad() { }
    public Sad( Date date){ super(date);}
    public String isSad(){ return "I'm Sad";}

    @Override
    public String Moods() {
        return "Sad";
    }

}
