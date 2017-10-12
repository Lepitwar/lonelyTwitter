package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by dwaters on 10/12/17.
 */

public class TweetList {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public TweetList(){}


    public void add( Tweet tweet ){
        if( this.hasTweet(tweet)){
            throw new IllegalArgumentException("Duplicate Tweet Added");
        }else{
            tweets.add(tweet);
        }
    }

    public Tweet getTweets(int index){
        //TweetList list = new TweetList();

        return this.tweets.get(index);
    }
    // sould return a list of tweets in chronological order

    public Boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
    }
    //hasTweet() -- should return true if there is a tweet that equals() another tweet
    public Integer getCount(){
        return tweets.size();
    }
    //Delete
    public void delete(Tweet tweet){
        tweets.remove(tweet);
    }
}
