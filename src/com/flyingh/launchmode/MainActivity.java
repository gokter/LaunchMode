package com.flyingh.launchmode;

import java.util.Date;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		TextView textView = (TextView) findViewById(R.id.textView);
		textView.setText(this.toString());
	}

	public void startStandard(View view) {
		startActivity(new Intent(this, MainActivity.class));
	}

	public void startSingleTopActivity(View view) {
		startActivity(new Intent(this, SingleTopActivity.class));
		Toast.makeText(getApplicationContext(), new Date().toString(), Toast.LENGTH_LONG).show();
	}

	public void startSingleTaskActivity(View view) {
		startActivity(new Intent(this, SingleTaskActivity.class));
		Toast.makeText(getApplicationContext(), new Date().toString(), Toast.LENGTH_LONG).show();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
