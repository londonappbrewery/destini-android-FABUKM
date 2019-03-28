package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {




    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView T1;
    private Button B1;
    private Button B2;
    private int Index = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
////////////////////////////////////////////////////////////////////////////////////////////////////

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

         T1 = (TextView) findViewById (R.id.storyTextView);
         B1 = (Button) findViewById(R.id.buttonTop);
        B2 = (Button) findViewById(R.id.buttonBottom);

////////////////////////////////////////////////////////////////////////////////////////////////////
        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (Index == 1 || Index == 2) {
                    T1.setText(R.string.T3_Story);
                    B1.setText(R.string.T3_Ans1);
                    B2.setText(R.string.T3_Ans2);
                    Index = 3;
                } else {
                    T1.setText(R.string.T6_End);
                    B1.setVisibility(View.GONE);
                    B2.setVisibility(View.GONE);
                }

            }



    });

////////////////////////////////////////////////////////////////////////////////////////////////////

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:


        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Index == 1) {
                    T1.setText(R.string.T2_Story);
                    B1.setText(R.string.T2_Ans1);
                    B2.setText(R.string.T2_Ans2);
                    Index = 2;
                }

            else if(Index==2)

            {
                T1.setText(R.string.T4_End);
                B1.setVisibility(View.GONE);
                B2.setVisibility(View.GONE);
            } else {
                T1.setText(R.string.T5_End);
                    B1.setVisibility(View.GONE);
                    B2.setVisibility(View.GONE);

                }
        }
        });
////////////////////////////////////////////////////////////////////////////////////////////////////

    }
}
