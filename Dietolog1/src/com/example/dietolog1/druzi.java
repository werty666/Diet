package com.example.dietolog1;

import android.app.Activity;
import android.os.Bundle;
import android.content.ContentUris;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

public class druzi extends Activity {
	
	  
	  final String LOG_TAG = "myLogs";

	  final Uri CONTACT_URI = Uri
	      .parse("content://ru.startandroid.providers.AdressBook/contacts");
	  
	  final String CONTACT_NAME = "name";
	  final String CONTACT_EMAIL = "email";

	  /** Called when the activity is first created. */
	  @Override
	  public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.druzi);

	    Cursor cursor = getContentResolver().query(CONTACT_URI, null, null,
	        null, null);
	    startManagingCursor(cursor);

	    String from[] = { "name", "email" };
	    int to[] = { android.R.id.text1, android.R.id.text2 };
	    SimpleCursorAdapter adapter = new SimpleCursorAdapter(this,
	        android.R.layout.simple_list_item_2, cursor, from, to);

	    ListView lvContact = (ListView) findViewById(R.id.lvcontact);
	    lvContact.setAdapter(adapter);
	  }
	  
	  public void onClickInsert(View v) {
	        ContentValues cv = new ContentValues();
	        cv.put(CONTACT_NAME, "Диетолог 4");
	        cv.put(CONTACT_EMAIL, "email 4");
	        Uri newUri = getContentResolver().insert(CONTACT_URI, cv);
	        Log.d(LOG_TAG, "insert, result Uri : " + newUri.toString());
	  }

	  public void onClickUpdate(View v) {
	        ContentValues cv = new ContentValues();
	        cv.put(CONTACT_NAME, "Диетолог 5");
	        cv.put(CONTACT_EMAIL, "email 5");
	        Uri uri = ContentUris.withAppendedId(CONTACT_URI, 2);
	        int cnt = getContentResolver().update(uri, cv, null, null);
	        Log.d(LOG_TAG, "update, count = " + cnt);
	  }

	  public void onClickDelete(View v) {
	    Uri uri = ContentUris.withAppendedId(CONTACT_URI, 4);
	        int cnt = getContentResolver().delete(uri, null, null);
	  }


	}