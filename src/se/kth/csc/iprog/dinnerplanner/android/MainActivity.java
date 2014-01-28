package se.kth.csc.iprog.dinnerplanner.android;

import se.kth.csc.iprog.dinnerplanner.android.view.MainView;
import se.kth.csc.iprog.dinnerplanner.model.DinnerModel;
import android.os.Bundle;
import android.app.Activity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Default call to load previous state
    	super.onCreate(savedInstanceState);
    	
    	// Set the view for the main activity screen
    	// it must come before any call to findViewById method
        setContentView(R.layout.activity_main);
        
        // Get the model
        DinnerModel model = ((DinnerPlannerApplication) this.getApplication()).getModel();
        
    	// Creating the view class
    	MainView mainView = new MainView(findViewById(R.id.main_view), model);

    }

}
