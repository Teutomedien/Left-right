package com.pixelpoesie.left_right.app;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.view.*;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.SeekBar;


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
        final LFmodule left_right = new LFmodule();

        SeekBar seekBar = (SeekBar)findViewById(R.id.seekBar);

        //Seekbar Value and Progress Textfields
        final TextView seekBarValue = (TextView)findViewById(R.id.finalText);
        final TextView seekBarProgress = (TextView)findViewById(R.id.seekProgress);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                // TODO Auto-generated method stub

                seekBarValue.setText(String.valueOf(left_right.getResult(progress)));

                seekBarProgress.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle presses on the action bar items
        switch (item.getItemId()) {
            case R.id.action_new_message:
                Intent newMessageIntent = new Intent(this, NewMessageActivity.class);

                newMessageIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(newMessageIntent);

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void setTextLeft(View v){

        TextView tv = (TextView)findViewById(R.id.finalText);
        tv.setText("Left");
    }

    public void setTextRight(View v){

        TextView tv = (TextView)findViewById(R.id.finalText);
        tv.setText("Right");
    }

    public void increaseText(View v){

        TextView tv = (TextView)findViewById(R.id.finalText);

        float currentTextSize = tv.getTextSize();
        tv.setTextSize(TypedValue.COMPLEX_UNIT_PX, currentTextSize + 1);
       // tv.setText(String.valueOf(currentTextSize));
    }
    public void decreaseText(View v){

        TextView tv = (TextView)findViewById(R.id.finalText);

        float currentTextSize = tv.getTextSize();
        tv.setTextSize(TypedValue.COMPLEX_UNIT_PX, currentTextSize - 1);
        // tv.setText(String.valueOf(currentTextSize));
    }



}
