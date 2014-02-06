package se.kth.csc.iprog.dinnerplanner.android.view;

import java.util.Set;

import se.kth.csc.iprog.dinnerplanner.android.R;
import se.kth.csc.iprog.dinnerplanner.model.DinnerModel;
import se.kth.csc.iprog.dinnerplanner.model.Dish;
import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CourseView {
	View view;
	DinnerModel model;
	int dishType;

	public CourseView(View view, DinnerModel model, int dishType,
			Activity activity) {
		// store in the class the reference to the Android View
		this.view = view;
		this.model = model;
		this.dishType = dishType;

		// Setup the rest of the view layout
		TextView header = (TextView) view.findViewById(R.id.course_type_header);
		header.setText(Dish.getTypeString(dishType));
		Set<Dish> dishes = model.getDishesOfType(dishType);
		LinearLayout container = (LinearLayout) view
				.findViewById(R.id.course_container);
		for (Dish dish : dishes) {
			LinearLayout courseElement = (LinearLayout) View.inflate(
					activity.getBaseContext(), R.layout.course_element, null);
			container.addView(courseElement, 0);
			ImageView image = (ImageView) view.findViewById(R.id.course_image);
			TextView name = (TextView) view.findViewById(R.id.course_name);
			image.setImageResource(dish.getImage());
			name.setText(dish.getName());
		}
	}
}
