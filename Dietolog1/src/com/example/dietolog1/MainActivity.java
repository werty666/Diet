package com.example.dietolog1;

import java.sql.Date;
import java.text.SimpleDateFormat;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.util.Log;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	
	final static String LOG_TAG = "myLogs";
	  final int DIALOG = 1;
	  SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button but1 = (Button) findViewById(R.id.button1);
		Button but2 = (Button) findViewById(R.id.button2);
		Button but3 = (Button) findViewById(R.id.button3);
		Button but4 = (Button) findViewById(R.id.button4);
		Button but6 = (Button) findViewById(R.id.button6);
		
		but1.setOnClickListener(new OnClickListener() {	
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent1 = new Intent(MainActivity.this, index.class);
				startActivity(intent1);
			}
		});
		
		but2.setOnClickListener(new OnClickListener() {	
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent2 = new Intent(MainActivity.this, kalorii1.class);
				startActivity(intent2);
			}
		});
		
		but3.setOnClickListener(new OnClickListener() {	
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent3 = new Intent(MainActivity.this, dieti.class);
				startActivity(intent3);
			}
		});
		
		but4.setOnClickListener(new OnClickListener() {	
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent4 = new Intent(MainActivity.this, raschet.class);
				startActivity(intent4);
			}
		});
		
		but6.setOnClickListener(new OnClickListener() {	
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent6 = new Intent(MainActivity.this, druzi.class);
				startActivity(intent6);
			}
		});
	}
		

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		
			  
	      //  menu.add (Menu.FIRST, 1, 1, "SubMenu");  
		   SubMenu sm = menu.addSubMenu (Menu.FIRST, 1, 1, "Мотивация").setIcon(R.drawable.ic_launcher); 
		   sm.add(Menu.FIRST, 100, 100, "Меньше ешь!");  
		   sm.add(Menu.FIRST, 101, 101, "Худей!");  
		   sm.add(Menu.FIRST, 102, 102, "Не ленись!");
	        menu.add (Menu.FIRST, 2, 2, "О программе");  
	        menu.add (Menu.FIRST, 3, 3, "Выход");  

	    return true;
		
	}
	
	
	public void onclick(View v) {
		 MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.button10); // создаём новый объект mediaPlayer
	        mediaPlayer.start(); // запускаем воспроизведение
	      showDialog(DIALOG);
	    }
	    
	    protected Dialog onCreateDialog(int id) {
	      Log.d(LOG_TAG, "onCreateDialog");
	      if (id == DIALOG) {
	        AlertDialog.Builder adb = new AlertDialog.Builder(this);
	        adb.setTitle("Текущее время");
	        adb.setMessage(sdf.format(new Date(System.currentTimeMillis())));
	        return adb.create();
	      }
	      return super.onCreateDialog(id);
	    }
	    
	    protected void onPrepareDialog(int id, Dialog dialog) {
	      super.onPrepareDialog(id, dialog);
	      Log.d(LOG_TAG, "onPrepareDialog");
	      if (id == DIALOG) {
	        ((AlertDialog)dialog).setMessage(sdf.format(new Date(System.currentTimeMillis())));
	      }
	    }
	
	
	
	
	@Override  
	public boolean onOptionsItemSelected (MenuItem item) {  
	          
	    if (item.getItemId() == 1) {   
	        
	    }  
	          
	    if (item.getItemId() == 2) {   
	    
	    	Toast toast = Toast.makeText(getApplicationContext(), 
	    			   "Программа создана для желающих похудеть", Toast.LENGTH_SHORT); 
	    			toast.show(); 

	    }
	      
	    else if (item.getItemId() == 3) {   
	        finish();
	    }  
	          
	
		return true;
	}

}
