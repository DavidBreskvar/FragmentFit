package dbug.idealfit.fragments;



import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class DetailsFragment extends Fragment {

	
	View view;
	ImageView image;
	TextView title, description;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		view = inflater.inflate(R.layout.details, container, false);
		
		image = (ImageView)view.findViewById(R.id.imageView1);
		title = (TextView)view.findViewById(R.id.textView1);
		description = (TextView)view.findViewById(R.id.textView2);
		
		Bundle exercise = this.getArguments();
		int childPosition = exercise.getInt("child");
		int groupPosition = exercise.getInt("group");
		
		int AbsId8 = R.drawable.ab_roller;
		int Sid4 = R.drawable.arnold_press;
		int AbsId4 = R.drawable.ball_crunch;
		int Bid9 = R.drawable.barbell_rows;
		int Sid7 = R.drawable.barbell_upright_row;
		int Cid1 = R.drawable.bench_press;
		int AbsId2 = R.drawable.bicycle_exercise;
		int Bid3 = R.drawable.big_row;
		int LegId6 = R.drawable.box_jump;
		int Bid8 = R.drawable.back_extension;
		int Cid5 = R.drawable.cable_crossovers;
		int Cid7 = R.drawable.cable_press; 
		int LegId7 = R.drawable.calf_raises;
		int AbsId3 = R.drawable.captains_chair_leg_raises;
		int ArmId11 = R.drawable.close_grip_bench_press;
		int ArmId4 = R.drawable.close_grip_chin_ups;
		int ArmId2 = R.drawable.concentration_curls;
		int Bid1 = R.drawable.deadlift;
		int AbsId1 = R.drawable.decline_weighted_situps;
		int ArmId6 = R.drawable.dibs;
		int ArmId1 = R.drawable.dumbbell_curls;
		int Cid10 = R.drawable.dumbbell_pullover;
		int Sid9 = R.drawable.dumbbell_rear_delt_fly;
		int AbsId7 = R.drawable.dumbbell_side_bends;
		int Cid4 = R.drawable.dumbbells_fly;
		int Cid2 = R.drawable.dumbell_flat_flys;
		int Sid8 = R.drawable.front_plate_raise;
		int ArmId3 = R.drawable.hammer_curls;
		int LegId8 = R.drawable.hip_abduction_machine; 
		int AbsId9 = R.drawable.hanging_leg_raises;
		int Cid9 = R.drawable.incline_barbell_bench_press;
		int Sid1 = R.drawable.lateral_raise;
		int LegId3 = R.drawable.leg_curl;
		int LegId4 = R.drawable.leg_extensions;
		int LegId5 = R.drawable.leg_press;
		int LegId2 = R.drawable.lunges;
		int Sid5 = R.drawable.military_press;
		int Bid6 = R.drawable.one_arm_dumbbell_rows;
		int Cid8 = R.drawable.pec_deck;
		int AbsId6 = R.drawable.planking;
		int Bid2 = R.drawable.pull_ups;
		int Cid6 = R.drawable.pushup;
		int Bid4 = R.drawable.rack_pack;
		int Bid7 = R.drawable.reverse_fly;
		int Bid5 = R.drawable.seated_cable_row;
		int Sid6 = R.drawable.shoulder_press_machine;
		int Sid2 = R.drawable.shrugs;
		int ArmId7 = R.drawable.skull_crushers;
		int Sid3 = R.drawable.overhead_barbell_press; 
		int LegId9 = R.drawable.split_squat;
		int LegId1 = R.drawable.squat;
		int ArmId8 = R.drawable.triangle_pushup;
		int ArmId10 = R.drawable.triceps_extension;
		int ArmId5 = R.drawable.triceps_kickback;
		int ArmId9 = R.drawable.triceps_pulldown;
		int AbsId5 = R.drawable.vertical_leg_crunch;
		int Cid3 = R.drawable.dumbbell_press; 
		
		int[] chestExercises = {Cid1, Cid2, Cid3, Cid4, Cid5, Cid6, Cid7, Cid8, Cid9, Cid10};
		int[] shoulderExercises = {Sid1, Sid2, Sid3, Sid4, Sid5, Sid6, Sid7, Sid8, Sid9};
		int[] absExercises = {AbsId1, AbsId2, AbsId3, AbsId4, AbsId5, AbsId6, AbsId7, AbsId8, AbsId9};
		int[] backExercises = {Bid1, Bid2, Bid3, Bid4, Bid5, Bid6, Bid7, Bid8, Bid9};
		int[] armExercises = {ArmId1, ArmId2, ArmId3, ArmId4, ArmId5, ArmId6, 
				ArmId7, ArmId8, ArmId9, ArmId10, ArmId11};
		int[] legsExercises = {LegId1, LegId2, LegId3, LegId4, LegId5, LegId6, LegId7, 
				LegId8, LegId9};
		
		String Chest[] = getActivity().getResources().getStringArray(R.array.Chest);
		String Shoulder[] = getActivity().getResources().getStringArray(R.array.Shoulder);
		String Back[] = getActivity().getResources().getStringArray(R.array.Back);
		String Abs[] = getActivity().getResources().getStringArray(R.array.Abs);
		String Arms[] = getActivity().getResources().getStringArray(R.array.Arms);
		String Legs[] = getActivity().getResources().getStringArray(R.array.Legs);
		
		String ChestName[] = getActivity().getResources().getStringArray(R.array.chest_name_exercises);
		String ShoulderName[] = getActivity().getResources().getStringArray(R.array.shoulders_name_exercises);
		String BackName[] = getActivity().getResources().getStringArray(R.array.back_name_exercises);
		String AbsName[] = getActivity().getResources().getStringArray(R.array.abs_name_exercises);
		String ArmsName[] = getActivity().getResources().getStringArray(R.array.arms_name_exercises);
		String LegsName[] = getActivity().getResources().getStringArray(R.array.legs_name_exercises);
		
		
		if (groupPosition == 0) description.setText(Chest[childPosition]);
		else if (groupPosition == 1) description.setText(Shoulder[childPosition]);
		else if (groupPosition == 2) description.setText(Back[childPosition]);
		else if (groupPosition == 3) description.setText(Abs[childPosition]);
		else if (groupPosition == 4) description.setText(Arms[childPosition]);
		else if (groupPosition == 5) description.setText(Legs[childPosition]);
		
		if (groupPosition == 0) image.setImageResource(chestExercises[childPosition]);
		else if (groupPosition == 1) image.setImageResource(shoulderExercises[childPosition]);
		else if (groupPosition == 2) image.setImageResource(backExercises[childPosition]);
		else if (groupPosition == 3) image.setImageResource(absExercises[childPosition]);
		else if (groupPosition == 4) image.setImageResource(armExercises[childPosition]);
		else if (groupPosition == 5) image.setImageResource(legsExercises[childPosition]);

		if (groupPosition == 0) title.setText("Short description of exercise "+ChestName[childPosition]+": ");
		else if (groupPosition == 1) title.setText("Short description of exercise "+ShoulderName[childPosition]+": ");
		else if (groupPosition == 2) title.setText("Short description of exercise "+BackName[childPosition]+": ");
		else if (groupPosition == 3) title.setText("Short description of exercise "+AbsName[childPosition]+": ");
		else if (groupPosition == 4) title.setText("Short description of exercise "+ArmsName[childPosition]+": ");
		else if (groupPosition == 5) title.setText("Short description of exercise "+LegsName[childPosition]+": ");

		return view;
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
	}

	@Override
	public void onPause() {
		super.onPause();
	}

	
	
}
