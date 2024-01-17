package com.transparent.activity.barcodess;

import android.animation.*;
import android.app.*;
import android.content.*;
import android.content.Intent;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.net.Uri;
import android.os.*;
import android.os.Bundle;
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
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.io.*;
import java.io.InputStream;
import java.text.*;
import java.util.*;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.*;
import org.json.*;

public class MainActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private double n = 0;
	
	private TextView textview7;
	private CardView cardview1;
	private LinearLayout linear1;
	private LinearLayout relativelayout_1;
	private LinearLayout relativelayout_2;
	private LinearLayout vid_content;
	private LinearLayout linear7;
	private LinearLayout linear9;
	private LinearLayout relativelayout_3;
	private LinearLayout linear10;
	private TextView textview2;
	private ProgressBar progressbar1;
	private TextView textview3;
	private ImageView imageview4;
	private LinearLayout linear12;
	private LinearLayout linear11;
	private TextView textview5;
	private TextView textview6;
	
	private TimerTask t1;
	private Intent i1 = new Intent();
	private TimerTask t2;
	private TimerTask t3;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		textview7 = findViewById(R.id.textview7);
		cardview1 = findViewById(R.id.cardview1);
		linear1 = findViewById(R.id.linear1);
		relativelayout_1 = findViewById(R.id.relativelayout_1);
		relativelayout_2 = findViewById(R.id.relativelayout_2);
		vid_content = findViewById(R.id.vid_content);
		linear7 = findViewById(R.id.linear7);
		linear9 = findViewById(R.id.linear9);
		relativelayout_3 = findViewById(R.id.relativelayout_3);
		linear10 = findViewById(R.id.linear10);
		textview2 = findViewById(R.id.textview2);
		progressbar1 = findViewById(R.id.progressbar1);
		textview3 = findViewById(R.id.textview3);
		imageview4 = findViewById(R.id.imageview4);
		linear12 = findViewById(R.id.linear12);
		linear11 = findViewById(R.id.linear11);
		textview5 = findViewById(R.id.textview5);
		textview6 = findViewById(R.id.textview6);
	}
	
	private void initializeLogic() {
		((ViewGroup) vid_content.getParent()).removeView(vid_content);
		((ViewGroup) relativelayout_2.getParent()).removeView(relativelayout_2);
		android.widget.RelativeLayout rl = new android.widget.RelativeLayout(MainActivity.this);
		
		rl.setLayoutParams(new LinearLayout.LayoutParams(-1,-1));
		
		rl.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);
		
		relativelayout_1.removeAllViews();
		
		relativelayout_1.addView(rl);
		
		rl.addView(vid_content);
		
		rl.addView(relativelayout_2);
		n = 0;
		t1 = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						i1.setClass(getApplicationContext(), HomeActivity.class);
						startActivity(i1);
						finish();
					}
				});
			}
		};
		_timer.schedule(t1, (int)(10000));
		t2 = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						progressbar1.setProgress((int)n);
						n++;
					}
				});
			}
		};
		_timer.scheduleAtFixedRate(t2, (int)(0), (int)(100));
		t3 = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						t3.cancel();
						textview2.setText("Starting....");
						t3 = new TimerTask() {
							@Override
							public void run() {
								runOnUiThread(new Runnable() {
									@Override
									public void run() {
										t3.cancel();
										textview2.setText("Collecting Resources.....");
										t3 = new TimerTask() {
											@Override
											public void run() {
												runOnUiThread(new Runnable() {
													@Override
													public void run() {
														t3.cancel();
														textview2.setText("Compiling......");
														t3 = new TimerTask() {
															@Override
															public void run() {
																runOnUiThread(new Runnable() {
																	@Override
																	public void run() {
																		t3.cancel();
																		textview2.setText("Building paths....");
																		t3 = new TimerTask() {
																			@Override
																			public void run() {
																				runOnUiThread(new Runnable() {
																					@Override
																					public void run() {
																						t3.cancel();
																						textview2.setText("Loading.....");
																						t3 = new TimerTask() {
																							@Override
																							public void run() {
																								runOnUiThread(new Runnable() {
																									@Override
																									public void run() {
																										t3.cancel();
																										textview2.setText("Initialising......");
																										t3 = new TimerTask() {
																											@Override
																											public void run() {
																												runOnUiThread(new Runnable() {
																													@Override
																													public void run() {
																														textview2.setText("Opening.....");
																													}
																												});
																											}
																										};
																										_timer.schedule(t3, (int)(1500));
																									}
																								});
																							}
																						};
																						_timer.schedule(t3, (int)(1000));
																					}
																				});
																			}
																		};
																		_timer.schedule(t3, (int)(1500));
																	}
																});
															}
														};
														_timer.schedule(t3, (int)(1000));
													}
												});
											}
										};
										_timer.schedule(t3, (int)(2000));
									}
								});
							}
						};
						_timer.schedule(t3, (int)(1500));
					}
				});
			}
		};
		_timer.schedule(t3, (int)(1000));
		progressbar1.getProgressDrawable().setColorFilter(Color.parseColor("#5808E3"), PorterDuff.Mode.SRC_IN);
	}
	
	@Override
	public void onBackPressed() {
		
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