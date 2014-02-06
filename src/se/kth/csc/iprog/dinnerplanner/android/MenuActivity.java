package se.kth.csc.iprog.dinnerplanner.android;

import se.kth.csc.iprog.dinnerplanner.android.view.CreateButtonView;
import se.kth.csc.iprog.dinnerplanner.android.view.MenuHeaderView;
import se.kth.csc.iprog.dinnerplanner.model.DinnerModel;
import android.app.Activity;
import android.os.Bundle;

public class MenuActivity extends Activity {
	MenuHeaderView menuHeaderView;
	CreateButtonView createButtonView;
	DinnerModel model;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu);
		
		model = ((DinnerPlannerApplication) this.getApplication()).getModel();
		
		// Create the view instances
		createButtonView = new CreateButtonView(findViewById(R.layout.create_button_view), model, this);
	}



}
