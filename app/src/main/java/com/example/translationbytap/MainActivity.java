package com.example.translationbytap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView arshadImage;
    Button buttonFullScreen;
    int[] stateVales;
    int index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arshadImage = (ImageView) findViewById(R.id.imageViewArshad);
        buttonFullScreen = (Button) findViewById(R.id.buttonFullScreen);
        stateVales = new int[]{1, -1, -1, 1, 2, -2, -2, 2};
        index = 0;
    }

    public void buttonPressed(View v) {
        if(1 == stateVales[index]) {
            translateLeft();
            index++;
        } else if(-1 == stateVales[index]) {
            translateRight();
            index++;
        } else if(2 == stateVales[index]) {
            translateUp();
            index++;
        } else if(-2 == stateVales[index]) {
            translateDown();
            index++;
        }

        if(index == stateVales.length) {
            index = 0;
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
