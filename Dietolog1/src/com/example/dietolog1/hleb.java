package com.example.dietolog1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class hleb extends Activity {
	
		String[] names = { 
				"Хлеб ржаной     214", 
				"Хлеб пшен. из муки I сорта    254", 
				"Сдобная выпечка               297",
				"Баранки         312",
				"Сушки           330", 
				"Сухари пшеничные              331",
				"Сухари сливочные              397", 
				"Мука пшеничная высш. сорта    327", 
				"Мука пшеничная I сорта        329",
				"Мука пшеничная II сорта       328", 
				"Мука ржаная     326"};

		  
		  @Override  
		  public void onCreate(Bundle savedInstanceState) {  
			  
		    super.onCreate(savedInstanceState);  
		    setContentView(R.layout.hleb); 
		    
		 
		    
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

