package com.example.dietolog1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class moloko extends Activity {
	String[] names = { 
			"Йогурт нат. 1.5% жирности        51", 
			"Кефир нежирный                   30", 
			"Кефир жирный                     59",
			"Молоко          58",
			"Молоко сгущеное                  135", 
			"Молоко сгущеное с сахаром        315",
			"Ряженка         85", 
			"Сливки 20%     205", 
			"Сметана 20%    206",
			"Сырки и масса творожные          340", 
			"Сыр российский                   371",
			"Сыр голландский                  361",
			"Сыр плавленный                   226", 
			"Творог жирный   226",
			"Творог нежирный  86" };

	  
	  @Override  
	  public void onCreate(Bundle savedInstanceState) {  
		  
	    super.onCreate(savedInstanceState);  
	    setContentView(R.layout.moloko); 
	    
	 
	    
		 // находим список
	    ListView list = (ListView) findViewById(R.id.listView1);

	    // создаем адаптер
	    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
	        android.R.layout.simple_list_item_1, names);
        setListAdapter(adapter);

	    // присваиваем адаптер списку
	    list.setAdapter(adapter);
  
	    
	  }


	private void setListAdapter(ArrayAdapter<String> adapter) {
		// TODO Auto-generated method stub
		
	}

}
