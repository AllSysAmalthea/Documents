package com.example.allsys;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class RegisterActivity extends Activity {

	
	
    @SuppressLint("NewApi")
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);  
        setContentView(R.layout.activity_register); 
             
        ImageView iv1=(ImageView)findViewById(R.id.myImageView1);
        iv1.setImageResource(R.drawable.news2);
        
        ImageButton ib1 = (ImageButton)findViewById(R.id.header_left_btn);  
        Button register = (Button)findViewById(R.id.Register);
            
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.log_in, menu);
        return true;
    }
    
}
