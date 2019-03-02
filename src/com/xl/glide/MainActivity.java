package com.xl.glide;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import com.bumptech.glide.Glide;

public class MainActivity extends Activity
{
	ImageView imageView ;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		
		String url = "http://www.yzjlb.net/app/opmrcc/ic_launcher.png";
		ImageView imageView = (ImageView) findViewById(R.id.ImageView1);
		Glide.with(this)
			.load(url)
			.into(imageView);
		
    }
}
