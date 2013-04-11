package com.example.dietolog1;

import android.R.string;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class index extends Activity {
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.index);
	
	Button but1 = (Button) findViewById(R.id.button1);

	but1.setOnClickListener(new OnClickListener() {	
		@Override
		public void onClick(View v) {
		
			EditText text1 = (EditText) findViewById(R.id.editText1);
			String rost1 = text1.getText().toString();
			double rost=Double.parseDouble(rost1);
			EditText text2 = (EditText) findViewById(R.id.editText2);
			String ves1 = text2.getText().toString();
			double ves=Double.parseDouble(ves1);
			EditText text3 = (EditText) findViewById(R.id.editText3);
			String vozrast1 = text3.getText().toString();
			double vozrast=Double.parseDouble(vozrast1);
			EditText text4 = (EditText) findViewById(R.id.editText4);
			EditText text5 = (EditText) findViewById(R.id.editText5);
			double index=0;
			String index_s;
			
			index = (ves/(rost*rost))*10000;
			
			if (index<=15){
				text5.setText("Острый дефицит");
			
			}
			else if(index>15 && index<=20){
				text5.setText("Дефицит");
			
			}
			else if(index>20 && index<=25){
				text5.setText("Норма");
		
			}
			else if(index>25 && index<=30){
				text5.setText("Избыточный вес");
				
			}
			else
				text5.setText("Ожирение");
				
						
			
			index_s = Double.toString(index);
			text4.setText(index_s);
			
			
			
		}
	});
}


}
