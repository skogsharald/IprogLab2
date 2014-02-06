package se.kth.csc.iprog.dinnerplanner.android.view;

import se.kth.csc.iprog.dinnerplanner.model.DinnerModel;
import android.view.View;

public class CourseView {
	View view;
	DinnerModel model;
	
	public CourseView(View view, DinnerModel model){
		// store in the class the reference to the Android View
		this.view = view;
		this.model = model;

		// Setup the rest of the view layout
	}
}
