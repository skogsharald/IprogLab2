package se.kth.csc.iprog.dinnerplanner.android.view;

import se.kth.csc.iprog.dinnerplanner.android.MenuActivity;
import se.kth.csc.iprog.dinnerplanner.android.R;
import se.kth.csc.iprog.dinnerplanner.model.DinnerModel;
import se.kth.csc.iprog.dinnerplanner.model.Dish;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DialogView {
	View view;
	DinnerModel model;
	Activity activity;
	Context context;
	private Dish dish;

	public DialogView(View view, final Activity activity, DinnerModel model,
			Dish dish) {
		// store in the class the reference to the Android View
		this.view = view;
		this.activity = activity;
		this.model = model;
		this.context = activity;
		this.dish = dish;

		LayoutInflater inflater = LayoutInflater.from(context);

		AlertDialog.Builder alertDialog = new AlertDialog.Builder(context);
		LinearLayout dialogLayout = (LinearLayout) inflater.inflate(
				R.layout.dialog_view, null);
		alertDialog.setView(dialogLayout);
		ImageView image = (ImageView) dialogLayout
				.findViewById(R.id.dialog_picture);
		image.setImageResource(dish.getImage());
		TextView head = (TextView) dialogLayout.findViewById(R.id.dialog_head);
		head.setText(dish.getName());
		TextView cost = (TextView) dialogLayout
				.findViewById(R.id.dialog_total_cost);
		cost.setText("100"); // TODO: Calculate the actual cost based on the
								// ingredients in the dish and the number of
								// guests
		TextView perPersoncost = (TextView) dialogLayout
				.findViewById(R.id.dialog_cost_per_person);
		perPersoncost.setText("30"); // TODO Calculate this based on model as
										// well

		// Setting Dialog Message
		// alertDialog.setMessage("Are you sure you want delete this?");

		// Setting Positive "Yes" Button
		alertDialog.setPositiveButton("Choose",
				new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {
						Intent intent = new Intent(activity, MenuActivity.class);
						activity.startActivity(intent);
					}
				});

		// Setting Negative "NO" Button
		alertDialog.setNegativeButton("Cancel",
				new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {
						dialog.cancel();
					}
				});
		// Showing Alert Message
		alertDialog.show();
	}
}
