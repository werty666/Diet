package com.example.dietolog1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class miaso extends Activity {
	String[] names = { 
			"��������        203", 
			"��������        187", 
			"������          199",
			"������� ��������          316",
			"������� ������            489", 
			"��������         90",
			"����            364", 
			"�������         197", 
			"����            165",
			"�������         156", 
			"����            346",
			"������� ������             98",
			"������ �������            108", 
			 };

	  
	  @Override  
	  public void onCreate(Bundle savedInstanceState) {  
		  
	    super.onCreate(savedInstanceState);  
	    setContentView(R.layout.miaso); 
	    
	 
	    
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
