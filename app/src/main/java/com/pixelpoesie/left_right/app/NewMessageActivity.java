package com.pixelpoesie.left_right.app;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.text.format.Time;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class NewMessageActivity extends Activity {

    ArrayList<String> list = new ArrayList<String>();
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_message);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);
        ListView lv = (ListView) findViewById(R.id.messageList);
        lv.setAdapter(adapter);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.new_message, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    public void sendMyMessage(View v){

        TextView tv = (TextView)findViewById(R.id.edit_message);

        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        String time = sdf.format(now);

        Message myMessage = new Message(tv.getText().toString(), time ,"Christoph", "Christoph");

        list.add(myMessage.toString());

        tv.setText("");

        adapter.notifyDataSetChanged();

        Toast.makeText(this, myMessage.getMsg_text(), Toast.LENGTH_SHORT).show();
    }
}
