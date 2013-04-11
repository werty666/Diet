package com.example.dietolog1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class sladkoe extends Activity {
	String[] names = { 
			"Мед             308", 
			"Зефир           299", 
			"Ирис            387",
			"Мармелад        296",
			"Карамель        296", 
			"Сахар           374",
			"Халва           516", 
			"Шоколад темный      540", 
			"Шоколад молочный    547",
			"Вафли           530", 
			"Пирожное слоеное с кремом  544",
			"Пирожное бисквитное        344",
			"Пряники         336", 
			"Торт бисквитный            386"
			 };

	  
	  @Override  
	  public void onCreate(Bundle savedInstanceState) {  
		  
	    super.onCreate(savedInstanceState);  
	    setContentView(R.layout.sladkoe); 
	    
	 
	    
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
