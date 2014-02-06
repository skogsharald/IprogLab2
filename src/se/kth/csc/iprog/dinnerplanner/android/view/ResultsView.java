package se.kth.csc.iprog.dinnerplanner.android.view;

import se.kth.csc.iprog.dinnerplanner.android.R;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ResultsView {
	View view;
	final Activity activity;
	Button backButton;
	
	public ResultsView(View view, final Activity activity){
		// store in the class the reference to the Android View
		this.view = view;
		this.activity = activity;

		// Setup the rest of the view layout
		backButton = (Button) activity.findViewById(R.id.back_button);
		backButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				activity.finish();
				
			}
		});
	}
}
