package se.kth.csc.iprog.dinnerplanner.android.view;

import se.kth.csc.iprog.dinnerplanner.android.R;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MenuHeaderView {
	View view;
	EditText numOfGuestsField;
	TextView costField;

	public MenuHeaderView(View view, Activity activity) {

		// store in the class the reference to the Android View
		this.view = view;

		// Setup the rest of the view layout
		numOfGuestsField = (EditText) activity.findViewById(R.id.number_of_guests);
		costField = (TextView) activity.findViewById(R.id.menu_total_cost_label);
	}
	
	public int getNumberOfGuests(){
		return Integer.parseInt(numOfGuestsField.getText().toString());
	}
	
	public void populateTotalCost(String text){
		costField.setText(text);
	}

}
