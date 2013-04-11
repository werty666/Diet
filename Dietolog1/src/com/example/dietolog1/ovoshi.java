package com.example.dietolog1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ovoshi extends Activity {
	String[] names = { 
			"Баклажаны       24", 
			"Горошек         72", 
			"Кабачки         27",
			"Капуста         28",
			"Картофель       83", 
			"Лук             43",
			"Морковь         33", 
			"Огурцы          15", 
			"Перец           23",
			"Петрушка        45", 
			"Редис           20",
			"Свекла          48",
			"Томаты          19", 
			"Хрен            71",
			"Чеснок          106", 
			"Щавель          28", };

	  
	  @Override  
	  public void onCreate(Bundle savedInstanceState) {  
		  
	    super.onCreate(savedInstanceState);  
	    setContentView(R.layout.ovoshi); 
	    
	 
	    
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
