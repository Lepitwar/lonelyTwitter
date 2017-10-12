package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by dwaters on 10/12/17.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity> {
    public TweetListTest(){
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
    }

    public void testAdd(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Test");
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }

    public void testAddMulti(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Test");
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }


    public void testGetTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Test");
        tweets.add(tweet);
        //String msg = tweets.getTweets(0).getMessage();
        assertEquals(tweet.getMessage(), tweets.getTweets(0).getMessage() );
    }

    public void testHasTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Test");
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }

    public void testGetCount(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Test");
        tweets.add(tweet);
        assertTrue(tweets.getCount()==1);

    }

    public void testDelete(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Test");
        tweets.add(tweet);
        tweets.delete(tweet);
        assertFalse(tweets.hasTweet(tweet));
    }

}
