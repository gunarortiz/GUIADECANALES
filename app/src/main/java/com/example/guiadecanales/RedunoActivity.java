package com.example.guiadecanales;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class RedunoActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.reduno);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.reduno, menu);
		return true;
	}

}
