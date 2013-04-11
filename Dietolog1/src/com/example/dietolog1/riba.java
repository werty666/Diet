package com.example.dietolog1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class riba extends Activity {
	String[] names = { 
			"Бычки           145", 
			"Горбуша         148", 
			"Камбала          88",
			"Карась           87",
			"Карп             96", 
			"Лещ             105",
			"Семга           219", 
			"Минтай           70", 
			"Мойва           157",
			"Окунь           117", 
			"Осетр           164",
			"Палтус          103",
			"Сайра           262", 
			"Сельдь          242",
			"Скумбрия        153", 
			"Тунец            96", };

	  
	  @Override  
	  public void onCreate(Bundle savedInstanceState) {  
		  
	    super.onCreate(savedInstanceState);  
	    setContentView(R.layout.riba); 
	    
	 
	    
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
