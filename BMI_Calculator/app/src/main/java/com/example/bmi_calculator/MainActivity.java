package com.example.bmi_calculator;

import androidx.appcompat.app.AppCompatActivity;

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

    public void calculateBmi(View view) {
        // Get references to the required fields
        EditText heightTextField = (EditText) findViewById(R.id.txtHeight);
        EditText weightTextField = (EditText) findViewById(R.id.txtWeight);
        TextView bmiLabel = (TextView) findViewById(R.id.lblBmi);

        // Get the height & weight entered by the user
        double userHeight = Double.parseDouble(heightTextField.getText().toString());
        double userWeight = Double.parseDouble(weightTextField.getText().toString());

        // Calculate the BMI value
        double bmi = userWeight/Math.pow(userHeight, 2);

        // Display the BMI value in the proper label
        bmiLabel.setText(Double.toString(bmi));
    }

}