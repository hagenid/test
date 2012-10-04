package com.demian.layoutfile;



import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        TextView myTextView = (TextView) findViewById(R.id.myText);
        myTextView.setText("New text in TextView");
        
        Button myBtn = (Button) findViewById(R.id.Button01);
        myBtn.setText("My button");
        myBtn.setEnabled(false);
        
        CheckBox myChb = (CheckBox) findViewById(R.id.Button01);
        myChb.setChecked(true);
    }
}