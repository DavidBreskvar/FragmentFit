package dbug.idealfit.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.Toast;

public class ExerciseFragment extends Fragment implements OnChildClickListener {

	View view;
	ExerciseClickHandler handler;
	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		view = inflater.inflate(R.layout.exercises, container, false);
		ExpandableListView expandable = (ExpandableListView) view.findViewById(R.id.expandableListView1);
		
		expandable.setAdapter(new MyAdapter(getActivity()));
		expandable.setOnChildClickListener(this);
		
		return view;
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
	}
	
	
	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		
		try {
			handler = (ExerciseClickHandler) getActivity();
		} catch (ClassCastException e) {
			Log.i("Exercise", "Activity does not implements ExerciseClickHandler");
		}
	}



	public interface ExerciseClickHandler {
		public void onExerciseClick(int groupPosition, int childPosition);
	}

	@Override
	public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
		handler.onExerciseClick(groupPosition, childPosition);
		return true;
	}

	
	
}
