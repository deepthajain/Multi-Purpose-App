package com.example.multipurpose;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        // Find the View that shows the numbers category
        TextView numbers = (TextView) findViewById(R.id.calci);
        // Set a click listener on that View
        numbers.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, CalciActivity.class);
                startActivity(numbersIntent);
            }
        });




        // Find the View that shows the numbers category
        TextView family = (TextView) findViewById(R.id.coffee);
        // Set a click listener on that View
        family.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, CoffeeActivity.class);
                startActivity(numbersIntent);
            }
        });




        // Find the View that shows the numbers category
        TextView phrases = (TextView) findViewById(R.id.points);
        // Set a click listener on that View
        phrases.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, PointsActivity.class);
                startActivity(numbersIntent);
            }
        });




    }
}
