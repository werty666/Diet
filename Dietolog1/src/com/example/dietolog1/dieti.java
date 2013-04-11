package com.example.dietolog1;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class dieti extends Activity {
	private Fragment fragment2;
    private Fragment fragment1;
    private FragmentTransaction ft;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dieti);
		
		fragment1 = new fragment1();
	    fragment2 = new fragment2();
	    ft = getFragmentManager().beginTransaction();
	    ft.setCustomAnimations(R.animator.slide_in_left, R.animator.slide_in_right);
	//  ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
	     
	    ft.replace(R.id.fragCont, fragment1);
	    ft.addToBackStack(null);
	     
	    ft.commit();
	     
	    Button btn = (Button) findViewById(R.id.btn);
	    btn.setOnClickListener(new OnClickListener() {
	         
	        @Override
	        public void onClick(View v) {
	        ft = getFragmentManager().beginTransaction();
	        ft.setCustomAnimations(R.animator.slide_in_left, R.animator.slide_in_right);
//	      ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
	        if(fragment1.isVisible()){
	            ft.replace(R.id.fragCont, fragment2);
	        }else{
	            ft.replace(R.id.fragCont, fragment1);
	        }
	        ft.commit();
	        }
	    });
	    
		
	}

	
	
	
}
