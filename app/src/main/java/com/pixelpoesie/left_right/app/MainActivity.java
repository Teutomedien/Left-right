package com.pixelpoesie.left_right.app;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.*;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Switch toggle = (Switch) findViewById(R.id.switchLR);

        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    TextView tv = (TextView)findViewById(R.id.finalText);
                    tv.setVisibility(View.VISIBLE);
                } else {
                    TextView tv = (TextView)findViewById(R.id.finalText);
                    tv.setVisibility(View.INVISIBLE);
                }
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        return id == R.id.action_settings || super.onOptionsItemSelected(item);
    }

    public void setTextLeft(View v){

        TextView tv = (TextView)findViewById(R.id.finalText);
        tv.setText("Left");
    }
    public void setTextRight(View v){

        TextView tv = (TextView)findViewById(R.id.finalText);
        tv.setText("Right");
    }




}
