package com.example.dietolog1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class moloko extends Activity {
	String[] names = { 
			"������ ���. 1.5% ��������        51", 
			"����� ��������                   30", 
			"����� ������                     59",
			"������          58",
			"������ ��������                  135", 
			"������ �������� � �������        315",
			"�������         85", 
			"������ 20%     205", 
			"������� 20%    206",
			"����� � ����� ���������          340", 
			"��� ����������                   371",
			"��� �����������                  361",
			"��� ����������                   226", 
			"������ ������   226",
			"������ ��������  86" };

	  
	  @Override  
	  public void onCreate(Bundle savedInstanceState) {  
		  
	    super.onCreate(savedInstanceState);  
	    setContentView(R.layout.moloko); 
	    
	 
	    
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
