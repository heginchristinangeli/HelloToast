package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count)

        public void countUp(View view) {
            mCount++;
            if (mShowCount != null)
                mShowCount.setText(Integer.toString(mCount));
        }
    }

    public void countUp(View view) {
        //what happens when user clicks on the button_count Button goes here
    }

    public void showToast(View view) {
        //what happens when user clicks on the button_toast Button goes here
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_LONG:);
        toast.show();
    }
}