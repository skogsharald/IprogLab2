package se.kth.csc.iprog.dinnerplanner.android;

import se.kth.csc.iprog.dinnerplanner.android.view.ResultsView;
import android.app.Activity;
import android.os.Bundle;

public class ResultsActivity extends Activity {
	ResultsView resultsView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_results);
	}
	
	

}
