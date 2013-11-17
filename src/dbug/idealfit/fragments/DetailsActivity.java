package dbug.idealfit.fragments;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.widget.Toast;

public class DetailsActivity extends ActionBarActivity{

	FragmentManager frgMan;
	FragmentTransaction frgTrans;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.details_activity);
		
		if (this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
			
			Toast.makeText(this, "Rotate your phone please", Toast.LENGTH_SHORT).show();
			finish();
		}
		
		Intent details = this.getIntent();
		Bundle element = details.getExtras();
		
		Fragment Details = new DetailsFragment();
		Details.setArguments(element);
		
		frgMan = getSupportFragmentManager();
		frgTrans = frgMan.beginTransaction();
		frgTrans.replace(R.id.detailsFrame, Details);
		frgTrans.commit();
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.base, menu);
		return true;
	}
}
