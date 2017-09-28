/*
* LonelyTwitterActtvity
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

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Date;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/**
 * Creates a main LonelyTwitterActivity
 *
 * @author dwaters
 * @version 1.0
 * @see Tweet
 * @see NormalTweet
 * @see CurrentMood
 * @since 1.0
 *
 */
public class LonelyTwitterActivity extends Activity {

	private static final String FILENAME = "file.sav";
	private EditText bodyText;
	private ListView oldTweetsList;

	private ArrayList<Tweet> tweets = new ArrayList<Tweet>();
	private ArrayAdapter<Tweet> adapter;

	
	/* Called when the activity is first created. */
	@Override
	/**
	 * Creates app homepage for LonelyTwitterActivity
	 */
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		//Delares text edits
		bodyText = (EditText) findViewById(R.id.body);
		oldTweetsList = (ListView) findViewById(R.id.oldTweetsList);
		//Declares Buttons
		Button saveButton = (Button) findViewById(R.id.save);
		Button clearButton = (Button) findViewById(R.id.clear);
		//Clears history
		clearButton.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v){
				tweets.clear();
				adapter.notifyDataSetChanged();
				saveInFile();
			}

		});

		//Saves Tweets
		saveButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
					setResult(RESULT_OK);
					String text = bodyText.getText().toString();
					tweets.add(new NormalTweet(text));
					adapter.notifyDataSetChanged();
					saveInFile();

			}
		});
	}

	@Override
	/**
	 * Loads file and sets OldTweetList
	 */
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		loadFromFile();
		 adapter = new ArrayAdapter<Tweet>(this,
				R.layout.list_item, tweets);
		oldTweetsList.setAdapter(adapter);
	}

	/**
	 * Loads tweets from a saved file
	 * else creates a new tweet array
	 */
	private void loadFromFile() {
		try {
			FileInputStream fis = openFileInput(FILENAME);
			BufferedReader in = new BufferedReader(new InputStreamReader(fis));
			Gson gson = new Gson();
			Type listType = new TypeToken<ArrayList<NormalTweet>>(){}.getType();
			tweets = gson.fromJson(in, listType);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			tweets = new ArrayList<Tweet>();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
	}

	/**
	 * Saves all tweets that are created
	 */
	private void saveInFile() {
		try {
			FileOutputStream fos = openFileOutput(FILENAME,
					Context.MODE_PRIVATE);
			OutputStreamWriter writer = new OutputStreamWriter(fos);
			Gson gson = new Gson();
			gson.toJson(tweets,writer);
			writer.flush();

			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException();
		}
	}
}