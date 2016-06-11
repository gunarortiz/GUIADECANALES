package com.example.guiadecanales;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class CanalesActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.canales);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.canales, menu);
		return true;
	}

}
