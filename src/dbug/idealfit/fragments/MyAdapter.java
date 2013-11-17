package dbug.idealfit.fragments;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;


public class MyAdapter extends BaseExpandableListAdapter {

	private Context context;
	static String [] parentList = {"CHEST", "SHOULDER", "BACK", "ABS", "ARMS", "LEGS"};
	static String [][] childList = {{"Bench press", "Flat flyes", "Dumbbell press",
		"Dumbbell flyes", "Cable crossovers", "Pushups", "Cable press", "Pec deck",
		"Incline/decline barbell press", "Dumbbell pullover"},
		
		{"Lateral raise", "Shrugs", "Overhead", "Arnold press", 
			"Military press", "Shoulder press machine", "Barbell upright row", 
			"Front plate raises", "Dumbell rear delt fly"}, 
			
			{"Deadlift", "Pull ups", "Big row", "Rack pack", 
				"Seated cable row", "One arm dumbbell rows", "Reverse fly", 
				"Back extensions", "Barbell rows"}, 
			
			{"Decline weighted situps", "Bicycle excercise", 
					"Captains chair leg raises", "Excercise ball crunch", 
					"Vertical leg crunch", "Plank on elbows and toes", 
					"Dumbell side bends", "Ab roller", "Hanging leg raises"}, 
		
			{"Dumbell/barbell curls", "Concentration curls", 
						"Hammer curls", "Close-grip chinup", 
						"Triceps kickback", "Dibs", "Skull crushers",
						"Triangle pushup", "Bar pushdowns", 
						"Triceps extension", "Close grip bench press"}, 
		
		{"Squats", "Five way lunges", "Leg curl", "Leg extension", 
							"Leg press machine", "Box jumps", 
							"Dumbbell/machine calf raises", "Hip abduction machine", 
							"Split squat"} };
	Typeface typeface;
	
	public MyAdapter(Context context) {
		// TODO Auto-generated constructor stub
		this.context = context;
	}

	@Override
	public Object getChild(int groupPosition, int childPosition) {
		// TODO Auto-generated method stub
		return childPosition;
	}

	@Override
	public long getChildId(int groupPosition, int childPosition) {
		// TODO Auto-generated method stub
		return childPosition;
	}

	@Override
	public View getChildView(int groupPosition, int childPosition, boolean isLastChild, 
			View convertView,ViewGroup parent) {
		// TODO Auto-generated method stub
		
		//za doloèanje fontov texta:
		//typeface = Typeface.createFromAsset(context.getAssets(), "font/tvoj_font_tuki.ttf");
		TextView tv = new TextView(context);
		tv.setText(childList[groupPosition][childPosition]);
		tv.setPadding(40, 10, 10, 10);
		tv.setTextSize(25);
		//inicializacija fontov:
		//tv.setTypeface(typeface);
		
		return tv;
	}

	@Override
	public int getChildrenCount(int groupPosition) {
		// TODO Auto-generated method stub
		return childList[groupPosition].length;
	}

	@Override
	public Object getGroup(int groupPosition) {
		// TODO Auto-generated method stub
		return groupPosition;
	}

	@Override
	public int getGroupCount() {
		// TODO Auto-generated method stub
		return parentList.length;
	}

	@Override
	public long getGroupId(int groupPosition) {
		// TODO Auto-generated method stub
		return groupPosition;
	}

	@Override
	public View getGroupView(int groupPosition, boolean isExpanded, View arg2, ViewGroup arg3) {
		// TODO Auto-generated method stub
		TextView tv = new TextView(context);
		tv.setText(parentList[groupPosition]);
		tv.setPadding(70, 10, 10, 10);
		tv.setTextSize(30);

		
		return tv;
	}

	@Override
	public boolean hasStableIds() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isChildSelectable(int groupPosition, int childPosition) {
		// TODO Auto-generated method stub
		return true;
	}

}
