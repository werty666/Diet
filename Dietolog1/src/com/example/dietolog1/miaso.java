package com.example.dietolog1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class miaso extends Activity {
	String[] names = { 
			"Баранина        203", 
			"Говядина        187", 
			"Кролик          199",
			"Свинина нежирная          316",
			"Свинина жирная            489", 
			"Телятина         90",
			"Гуси            364", 
			"Индейка         197", 
			"Куры            165",
			"Цыплята         156", 
			"Утки            346",
			"Говяжья Печень             98",
			"Печень свинная            108", 
			 };

	  
	  @Override  
	  public void onCreate(Bundle savedInstanceState) {  
		  
	    super.onCreate(savedInstanceState);  
	    setContentView(R.layout.miaso); 
	    
	 
	    
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
