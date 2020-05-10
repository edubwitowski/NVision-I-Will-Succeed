package com.witowskieric.nvisioniwillsucceed;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button pressbutton;

        pressbutton = (Button) findViewById(R.id.pressbutton);

        final ImageView quote = (ImageView) findViewById(R.id.quote);


        final int[] visionArray = {
                R.drawable.nvision_0,
                R.drawable.nvision_1,
                R.drawable.nvision_2,
                R.drawable.nvision_3,
                R.drawable.nvision_4,
                R.drawable.nvision_5,
                R.drawable.nvision_6,
                R.drawable.nvision_7,
                R.drawable.nvision_8,
                R.drawable.nvision_9,
                R.drawable.nvision_10,
                R.drawable.nvision_11,
                R.drawable.nvision_12,
                R.drawable.nvision_13,
                R.drawable.nvision_14,
                R.drawable.nvision_15,
                R.drawable.nvision_16,
                R.drawable.nvision_17,
                R.drawable.nvision_18,
                R.drawable.nvision_19,
                R.drawable.nvision_20,
                R.drawable.nvision_21,
                R.drawable.nvision_22,
                R.drawable.nvision_23,
                R.drawable.nvision_24,
                R.drawable.nvision_25,
                R.drawable.nvision_26,
                R.drawable.nvision_27,
                R.drawable.nvision_28,
                R.drawable.nvision_29,
                R.drawable.nvision_30,
                R.drawable.nvision_31,
                R.drawable.nvision_32,
                R.drawable.nvision_33,
                R.drawable.nvision_34,
                R.drawable.nvision_35,
                R.drawable.nvision_36,
                R.drawable.nvision_37,
                R.drawable.nvision_38,
                R.drawable.nvision_39,
        };

        pressbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(40);
                quote.setImageResource(visionArray[number]);

                Log.v("oneNVision", "Ze Button has been pressed");



            }
        });

    }
}
