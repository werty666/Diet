package com.example.dietolog1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class hleb extends Activity {
	
		String[] names = { 
				"���� ������     214", 
				"���� ����. �� ���� I �����    254", 
				"������� �������               297",
				"�������         312",
				"�����           330", 
				"������ ���������              331",
				"������ ���������              397", 
				"���� ��������� ����. �����    327", 
				"���� ��������� I �����        329",
				"���� ��������� II �����       328", 
				"���� ������     326"};

		  
		  @Override  
		  public void onCreate(Bundle savedInstanceState) {  
			  
		    super.onCreate(savedInstanceState);  
		    setContentView(R.layout.hleb); 
		    
		 
		    
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

