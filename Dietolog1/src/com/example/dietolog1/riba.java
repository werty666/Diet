package com.example.dietolog1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class riba extends Activity {
	String[] names = { 
			"�����           145", 
			"�������         148", 
			"�������          88",
			"������           87",
			"����             96", 
			"���             105",
			"�����           219", 
			"������           70", 
			"�����           157",
			"�����           117", 
			"�����           164",
			"������          103",
			"�����           262", 
			"������          242",
			"��������        153", 
			"�����            96", };

	  
	  @Override  
	  public void onCreate(Bundle savedInstanceState) {  
		  
	    super.onCreate(savedInstanceState);  
	    setContentView(R.layout.riba); 
	    
	 
	    
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
