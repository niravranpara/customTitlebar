package net.londatiga.android;

import android.os.Bundle;

public class Info extends CustomWindow {
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.info);
		
		this.title.setText("Info");
		this.icon.setImageResource(R.drawable.menu_info);
	}
}
