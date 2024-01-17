package com.transparent.activity.barcodess;

import android.animation.*;
import android.app.*;
import android.content.*;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.os.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import org.json.*;

public class HomeActivity extends AppCompatActivity {
	
	private LinearLayout linear1;
	private LinearLayout linear2;
	private ScrollView vscroll1;
	private ImageView imageview1;
	private TextView textview1;
	private LinearLayout linear3;
	private CardView cardview5;
	private TextView textview12;
	private TextView textview3;
	private TextView textview4;
	private CardView cardview1;
	private TextView textview6;
	private TextView textview8;
	private TextView textview10;
	private CardView cardview3;
	private TextView textview9;
	private CardView cardview2;
	private TextView textview13;
	private TextView textview14;
	private TextView textview17;
	private TextView textview18;
	private TextView textview16;
	private CardView cardview4;
	private LinearLayout linear4;
	private LinearLayout linear5;
	private TextView textview19;
	private TextView textview21;
	private LinearLayout linear6;
	private TextView textview22;
	private TextView textview5;
	private TextView textview11;
	private TextView textview7;
	private TextView textview15;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.home);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = findViewById(R.id.linear1);
		linear2 = findViewById(R.id.linear2);
		vscroll1 = findViewById(R.id.vscroll1);
		imageview1 = findViewById(R.id.imageview1);
		textview1 = findViewById(R.id.textview1);
		linear3 = findViewById(R.id.linear3);
		cardview5 = findViewById(R.id.cardview5);
		textview12 = findViewById(R.id.textview12);
		textview3 = findViewById(R.id.textview3);
		textview4 = findViewById(R.id.textview4);
		cardview1 = findViewById(R.id.cardview1);
		textview6 = findViewById(R.id.textview6);
		textview8 = findViewById(R.id.textview8);
		textview10 = findViewById(R.id.textview10);
		cardview3 = findViewById(R.id.cardview3);
		textview9 = findViewById(R.id.textview9);
		cardview2 = findViewById(R.id.cardview2);
		textview13 = findViewById(R.id.textview13);
		textview14 = findViewById(R.id.textview14);
		textview17 = findViewById(R.id.textview17);
		textview18 = findViewById(R.id.textview18);
		textview16 = findViewById(R.id.textview16);
		cardview4 = findViewById(R.id.cardview4);
		linear4 = findViewById(R.id.linear4);
		linear5 = findViewById(R.id.linear5);
		textview19 = findViewById(R.id.textview19);
		textview21 = findViewById(R.id.textview21);
		linear6 = findViewById(R.id.linear6);
		textview22 = findViewById(R.id.textview22);
		textview5 = findViewById(R.id.textview5);
		textview11 = findViewById(R.id.textview11);
		textview7 = findViewById(R.id.textview7);
		textview15 = findViewById(R.id.textview15);
	}
	
	private void initializeLogic() {
		textview5.setTextIsSelectable(true);
		textview7.setTextIsSelectable(true);
		textview11.setTextIsSelectable(true);
		textview15.setTextIsSelectable(true);
	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input) {
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels() {
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels() {
		return getResources().getDisplayMetrics().heightPixels;
	}
}