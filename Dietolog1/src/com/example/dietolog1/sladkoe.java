package com.example.dietolog1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class sladkoe extends Activity {
	String[] names = { 
			"���             308", 
			"�����           299", 
			"����            387",
			"��������        296",
			"��������        296", 
			"�����           374",
			"�����           516", 
			"������� ������      540", 
			"������� ��������    547",
			"�����           530", 
			"�������� ������� � ������  544",
			"�������� ����������        344",
			"�������         336", 
			"���� ����������            386"
			 };

	  
	  @Override  
	  public void onCreate(Bundle savedInstanceState) {  
		  
	    super.onCreate(savedInstanceState);  
	    setContentView(R.layout.sladkoe); 
	    
	 
	    
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
