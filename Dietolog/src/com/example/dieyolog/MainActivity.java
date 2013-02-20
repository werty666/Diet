package com.example.dieyolog;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button but1 = (Button) findViewById(R.id.button1);
        Button but2 = (Button) findViewById(R.id.button2);
        Button but3 = (Button) findViewById(R.id.button3);
        Button but4 = (Button) findViewById(R.id.button4);
        

        but1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent1 = new Intent(MainActivity.this, Index.class);
				startActivity(intent1);
			}
		});
        
        
        but2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent2 = new Intent(MainActivity.this, Kalorii.class);
				startActivity(intent2);
			}
		});
        
        but3.setOnClickListener(new OnClickListener() {
			
    			@Override
    			public void onClick(View v) {
    				// TODO Auto-generated method stub
    				Intent intent3 = new Intent(MainActivity.this, Dieti.class);
    				startActivity(intent3);
    			}
    		});
        
        but4.setOnClickListener(new OnClickListener() {
			
    			@Override
    			public void onClick(View v) {
    				// TODO Auto-generated method stub
    				Intent intent4 = new Intent(MainActivity.this, Raschet.class);
    				startActivity(intent4);
    			}
    		});
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
}
