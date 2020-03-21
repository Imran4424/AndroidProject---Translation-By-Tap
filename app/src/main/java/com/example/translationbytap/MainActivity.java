package com.example.translationbytap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView arshadImage;
    int currentStateValue;
    int secondStateValue;
    int thirdStateValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arshadImage = (ImageView) findViewById(R.id.imageViewArshad);
        currentStateValue = 0;
        secondStateValue = 1;
        thirdStateValue = 0;
    }

    public void imagePressed(View v) {
        if(0 == currentStateValue) {
            currentStateValue = secondStateValue;
            secondStateValue = thirdStateValue;
            thirdStateValue = -currentStateValue;
        }
    }

    public void translateLeft() {
        arshadImage.animate().translationXBy(1800).setDuration(2000);
    }

    public void translateRight() {
        arshadImage.animate().translationXBy(-1800).setDuration(2000);
    }

    public  void translateUp() {
        arshadImage.animate().translationYBy(1800).setDuration(2000);
    }

    public void translateDown() {
        arshadImage.animate().translationYBy(-1800).setDuration(2000);
    }
}
