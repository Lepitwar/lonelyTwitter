package ca.ualberta.cs.lonelytwitter; /**
 * Created by dwaters on 9/13/17.
 */

import java.util.Date;

public abstract class ImportantTweet extends Tweet {
    public ImportantTweet(String message){
        super(message);
    }
    public ImportantTweet(String message, Date date){
        super(message, date);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.TRUE;
    }
}
