package com.flyingh.launchmode;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class SingleTaskActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_single_task);
		TextView textView = (TextView) findViewById(R.id.textView);
		textView.setText(this.toString());
	}

	public void startMainActivity(View view) {
		startActivity(new Intent(this, MainActivity.class));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_single_task, menu);
		return true;
	}

}
