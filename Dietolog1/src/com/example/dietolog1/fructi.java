package com.example.dietolog1;

import android.app.Activity;
import android.os.Bundle;

import android.widget.ArrayAdapter;
import android.widget.ListView;


public class fructi extends Activity {  
	String[] names = { 
			"��������        46", 
			"������          48", 
			"������          91",
			"������          52",
			"�����           42", 
			"�������         44",
			"������         281", 
			"�����           62", 
			"������          46",
			"��������        38", 
			"��������        35",
			"�����           31",
			"��������        38", 
			"��������        69",
			"������          41", 
			"���������       38" };

	  
	  @Override  
	  public void onCreate(Bundle savedInstanceState) {  
		  
	    super.onCreate(savedInstanceState);  
	    setContentView(R.layout.fructi); 
	    
	 
	    
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

