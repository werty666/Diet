package com.example.dietolog1;

import android.app.Activity;
import android.os.Bundle;

import android.widget.ArrayAdapter;
import android.widget.ListView;


public class fructi extends Activity {  
	String[] names = { 
			"Абрикосы        46", 
			"Ананас          48", 
			"Бананы          91",
			"Гранат          52",
			"Груша           42", 
			"Персики         44",
			"Финики         281", 
			"Хурма           62", 
			"Яблоки          46",
			"Апельсин        38", 
			"Грейфрут        35",
			"Лимон           31",
			"Мандарин        38", 
			"Виноград        69",
			"Малина          41", 
			"Смородина       38" };

	  
	  @Override  
	  public void onCreate(Bundle savedInstanceState) {  
		  
	    super.onCreate(savedInstanceState);  
	    setContentView(R.layout.fructi); 
	    
	 
	    
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

