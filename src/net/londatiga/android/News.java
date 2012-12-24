package net.londatiga.android;

import android.os.Bundle;

public class News extends CustomWindow {
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.news);
		
		this.title.setText("News");
		this.icon.setImageResource(R.drawable.menu_news);
	}
}
