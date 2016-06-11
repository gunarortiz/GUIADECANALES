package com.example.guiadecanales;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class AtbActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.atb);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.atb, menu);
		return true;
	}

}
