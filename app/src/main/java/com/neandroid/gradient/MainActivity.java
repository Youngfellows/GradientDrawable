package com.neandroid.gradient;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        //LinearGradientView linearGradientView = new LinearGradientView(this);
        //setContentView(linearGradientView);

        setContentView(new LinearGradientCircle(this));
    }
}
