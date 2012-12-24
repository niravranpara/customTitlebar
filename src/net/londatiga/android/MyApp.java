package net.londatiga.android;

import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;

public class MyApp extends CustomWindow {
    
    public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
    	
    	Button b1 = (Button) findViewById(R.id.b1);
    	b1.setOnClickListener(new OnClickListener() {
    		
    		public void onClick(View v) {
    			Intent intent = new Intent();
    			intent.setClass(MyApp.this, News.class);
    			
    			startActivity(intent);
    		}
    	});
    	
    	Button b2 = (Button) findViewById(R.id.b2);
    	b2.setOnClickListener(new OnClickListener() {
    		
    		public void onClick(View v) {
    			Intent intent = new Intent();
    			intent.setClass(MyApp.this, Info.class);
    			
    			startActivity(intent);
    		}
    	});
    }
}