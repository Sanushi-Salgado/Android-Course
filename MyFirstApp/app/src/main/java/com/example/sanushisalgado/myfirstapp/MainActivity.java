package com.example.sanushisalgado.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Invoke when the button is clicked
    public void buttonClicked(View view) {
        // Get a reference to the element that we want to access
        TextView textView = (TextView) findViewById(R.id.message);
        textView.setText("Hey you clicked me!");
    }

    public void handleUserMessage(View view){
        // Get a reference to the text field that we want to access
        EditText editText = (EditText) findViewById(R.id.userName);
        String userName = editText.getText().toString();

        TextView textView = (TextView) findViewById(R.id.confirmationMessage);
        textView.setText("Your name is: " + userName);
    }
}
