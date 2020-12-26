package com.example.helloworldcodepath;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView =  ((TextView)findViewById(R.id.labelText));

        // Button to change text color functionality
        // reference views in xml through IDs
        findViewById(R.id.buttonChangeTextColor).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // change the text color of label
                ((TextView) findViewById(R.id.labelText)).setTextColor(getResources().getColor(R.color.colorPrimary));
            }
        });

        // change the background colour
        findViewById(R.id.changeBGColorBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.lightBlue));
            }
        });

        // change the text
        findViewById(R.id.changeTxtBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = "Android Is Awesome!";
                textView.setText(text);
                textView.setTextSize(30);
                textView.setGravity(Gravity.CENTER);
            }
        });

        //change the background view to reset all views
        findViewById(R.id.parent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Hello from Sid!"); // reset text
                textView.setTextColor(getResources().getColor(R.color.black)); // reset the label text color
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.reddish)); // reset background colour

            }
        });

        // change the label
        findViewById(R.id.chngTxtLabelBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userInput = ((EditText) findViewById(R.id.editText)).getText().toString();
                if (userInput.isEmpty())
                {
                    textView.setText("Enter some text!");
                }else {
                    textView.setText(userInput);
                }
            }
        });


    }
}