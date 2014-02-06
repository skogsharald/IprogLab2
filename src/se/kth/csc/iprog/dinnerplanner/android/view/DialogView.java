package se.kth.csc.iprog.dinnerplanner.android.view;

import se.kth.csc.iprog.dinnerplanner.android.MenuActivity;
import se.kth.csc.iprog.dinnerplanner.android.R;
import se.kth.csc.iprog.dinnerplanner.model.DinnerModel;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;

public class DialogView {
	View view;
	Context context;
	Activity activity;
	DinnerModel model;
	
	public DialogView(View view, Context context, final Activity activity, DinnerModel model){
		// store in the class the reference to the Android View
		this.view = view;
		this.context = context;
		this.activity = activity;
		this.model = model;
		
		LayoutInflater inflater = LayoutInflater.from(context);
		
		AlertDialog.Builder alertDialog = new AlertDialog.Builder(context);

        alertDialog.setView(inflater.inflate(R.layout.dialog_view, null));
 
        // Setting Dialog Message
        //alertDialog.setMessage("Are you sure you want delete this?");
 
        // Setting Positive "Yes" Button
        alertDialog.setPositiveButton("Choose", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog,int which) {
            	Intent intent = new Intent(activity, MenuActivity.class);
				activity.startActivity(intent);
            }
        });
 
        // Setting Negative "NO" Button
        alertDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
            	dialog.cancel();
            }
        });
        // Showing Alert Message
        alertDialog.show();
	}

}
