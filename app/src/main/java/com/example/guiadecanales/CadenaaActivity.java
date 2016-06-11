package com.example.guiadecanales;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class CadenaaActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cadenaa);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.cadenaa, menu);
		return true;
	}

}
