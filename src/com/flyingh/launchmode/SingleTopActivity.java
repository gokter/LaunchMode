package com.flyingh.launchmode;

import java.util.Date;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class SingleTopActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_single_top);
		TextView textView = (TextView) findViewById(R.id.textView);
		textView.setText(System.currentTimeMillis() + this.toString());
	}

	public void startSingleTopActivity(View view) {
		startActivity(new Intent(getApplicationContext(), SingleTopActivity.class));
		Toast.makeText(getApplicationContext(), new Date().toString(), Toast.LENGTH_LONG).show();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_single_top, menu);
		return true;
	}

}
