package com.example.dietolog1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class kalorii1 extends Activity {
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.kalorii1);
	
	Button but1 = (Button) findViewById(R.id.button1);
	Button but2 = (Button) findViewById(R.id.button2);
	Button but3 = (Button) findViewById(R.id.button3);
	Button but4 = (Button) findViewById(R.id.button4);
	Button but5 = (Button) findViewById(R.id.button5);
	Button but6 = (Button) findViewById(R.id.button6);
	Button but7 = (Button) findViewById(R.id.button7);
	
	but1.setOnClickListener(new OnClickListener() {		
		@Override
		public void onClick(View arg0) {
			Intent intent1 = new Intent(kalorii1.this, fructi.class);
			startActivity(intent1);			
		}	
	});
	
	but2.setOnClickListener(new OnClickListener() {		
		@Override
		public void onClick(View arg0) {
			Intent intent2 = new Intent(kalorii1.this, sladkoe.class);
			startActivity(intent2);			
		}	
	});
	
	but3.setOnClickListener(new OnClickListener() {		
		@Override
		public void onClick(View arg0) {
			Intent intent3 = new Intent(kalorii1.this, moloko.class);
			startActivity(intent3);			
		}	
	});
	
	but4.setOnClickListener(new OnClickListener() {		
		@Override
		public void onClick(View arg0) {
			Intent intent4 = new Intent(kalorii1.this, riba.class);
			startActivity(intent4);			
		}	
	});
	
	but5.setOnClickListener(new OnClickListener() {		
		@Override
		public void onClick(View arg0) {
			Intent intent5 = new Intent(kalorii1.this, ovoshi.class);
			startActivity(intent5);			
		}	
	});
	
	but6.setOnClickListener(new OnClickListener() {		
		@Override
		public void onClick(View arg0) {
			Intent intent6 = new Intent(kalorii1.this, miaso.class);
			startActivity(intent6);			
		}	
	});
	
	but7.setOnClickListener(new OnClickListener() {		
		@Override
		public void onClick(View arg0) {
			Intent intent7 = new Intent(kalorii1.this, hleb.class);
			startActivity(intent7);			
		}	
	});
}
}
