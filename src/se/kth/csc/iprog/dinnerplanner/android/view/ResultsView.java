package se.kth.csc.iprog.dinnerplanner.android.view;

import java.util.Set;

import se.kth.csc.iprog.dinnerplanner.android.R;
import se.kth.csc.iprog.dinnerplanner.model.DinnerModel;
import se.kth.csc.iprog.dinnerplanner.model.Ingredient;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ResultsView {
	View view;
	DinnerModel model;
	final Activity activity;
	Button backButton;
	TextView instructionView;
	TextView instructionHeader;
	
	public ResultsView(View view, final Activity activity, DinnerModel model){
		// store in the class the reference to the Android View
		this.view = view;
		this.activity = activity;
		this.model = model;
		// The dynamic text view that will change when images are pressed
		instructionHeader = (TextView) activity.findViewById(R.id.results_instruction_header);
		instructionView = (TextView) activity.findViewById(R.id.results_instructions_text);
		
		// Setup the rest of the view layout
		backButton = (Button) activity.findViewById(R.id.back_button);
		backButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				activity.finish();
				
			}
		});
		
		//This is hard-coded for now
		instructionHeader.setText("@string/dessert");
		StringBuilder sb = new StringBuilder();
		sb.append(model.getNumberOfGuests() + " attendees\n");
		sb.append("\n");
		Set<Ingredient> ingredientSet = model.getAllIngredients();
		for(Ingredient ing: ingredientSet){
			sb.append(ing.getName() + " " + ing.getQuantity() + " " + ing.getUnit() + "\n");
		}
		instructionView.setText(sb.toString());
		
	}
}
