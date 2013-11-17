package dbug.idealfit.fragments;

import dbug.idealfit.fragments.ExerciseFragment.ExerciseClickHandler;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.View;
import android.widget.FrameLayout;

public class BaseActivity extends ActionBarActivity implements ExerciseClickHandler {

	FragmentManager frgMan;
	FragmentTransaction frgTrans;
	boolean dualPane;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_base);
		FrameLayout detailFrame = (FrameLayout)findViewById(R.id.frame_layout);
		dualPane = (detailFrame != null && detailFrame.getVisibility() == View.VISIBLE);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.base, menu);
		return true;
	}

	@Override
	public void onExerciseClick(int groupPosition, int childPosition) {

		Bundle elements = new Bundle();
		elements.putInt("group", groupPosition);
		elements.putInt("child", childPosition);
		
		String ChestName[] = this.getResources().getStringArray(R.array.chest_name_exercises);
		String ShoulderName[] = this.getResources().getStringArray(R.array.shoulders_name_exercises);
		String BackName[] = this.getResources().getStringArray(R.array.back_name_exercises);
		String AbsName[] = this.getResources().getStringArray(R.array.abs_name_exercises);
		String ArmsName[] = this.getResources().getStringArray(R.array.arms_name_exercises);
		String LegsName[] = this.getResources().getStringArray(R.array.legs_name_exercises);
		
		if (groupPosition == 0) getSupportActionBar().setTitle(ChestName[childPosition]);
		else if (groupPosition == 1) getSupportActionBar().setTitle(ShoulderName[childPosition]);
		else if (groupPosition == 2) getSupportActionBar().setTitle(BackName[childPosition]);
		else if (groupPosition == 3) getSupportActionBar().setTitle(AbsName[childPosition]);
		else if (groupPosition == 4) getSupportActionBar().setTitle(ArmsName[childPosition]);
		else if (groupPosition == 5) getSupportActionBar().setTitle(LegsName[childPosition]);
		
		if (dualPane) {
			Fragment Details = new DetailsFragment();
			Details.setArguments(elements);
			
			frgMan = getSupportFragmentManager();
			frgTrans = frgMan.beginTransaction();
			frgTrans.replace(R.id.frame_layout, Details);
			frgTrans.commit();
		}
		else {
			Intent details = new Intent(this, DetailsActivity.class);
			details.putExtras(elements);
			startActivity(details);
		}
		
	}

}
