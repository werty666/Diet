package com.example.dietolog1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ovoshi extends Activity {
	String[] names = { 
			"���������       24", 
			"�������         72", 
			"�������         27",
			"�������         28",
			"���������       83", 
			"���             43",
			"�������         33", 
			"������          15", 
			"�����           23",
			"��������        45", 
			"�����           20",
			"������          48",
			"������          19", 
			"����            71",
			"������          106", 
			"������          28", };

	  
	  @Override  
	  public void onCreate(Bundle savedInstanceState) {  
		  
	    super.onCreate(savedInstanceState);  
	    setContentView(R.layout.ovoshi); 
	    
	 
	    
		 // ������� ������
	    ListView list = (ListView) findViewById(R.id.listView1);

	    // ������� �������
	    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
	        android.R.layout.simple_list_item_1, names);
        setListAdapter(adapter);

	    // ����������� ������� ������
	    list.setAdapter(adapter);
  
	    
	  }


	private void setListAdapter(ArrayAdapter<String> adapter) {
		// TODO Auto-generated method stub
		
	}

}
