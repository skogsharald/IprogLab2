package se.kth.csc.iprog.dinnerplanner.android.view;

import se.kth.csc.iprog.dinnerplanner.android.R;
import se.kth.csc.iprog.dinnerplanner.android.ResultsActivity;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class CreateButtonView {
	View view;
	final Activity activity;

	public CreateButtonView(View view, final Activity activity){
		this.view = view;
		this.activity = activity;

		// Setup the rest of the view layout, with an onClickListener for the create button
		Button button = (Button) activity.findViewById(R.id.create_button);
		button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(activity, ResultsActivity.class);
				activity.startActivity(intent);

			}
		});
	}
}
