package com.francisco.android.gamezone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import android.widget.Toast;

public class SignIn extends AppCompatActivity {

    ImageView  imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        imageView = (ImageView) findViewById(R.id.character_move);
        imageView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SignIn.this, "Wolf is clicked", Toast.LENGTH_SHORT).show();
            }
        });

        imageView = (ImageView) findViewById(R.id.left_key);
        imageView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SignIn.this, "Left key is clicked", Toast.LENGTH_SHORT).show();
                imageView = (ImageView) findViewById(R.id.character_move);
                imageView.getX();
                imageView.getY();
                imageView.setY(imageView.getY() -100);
            }
        });

        imageView = (ImageView) findViewById(R.id.right_key);
        imageView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SignIn.this, "Right key is clicked", Toast.LENGTH_SHORT).show();
                imageView = (ImageView) findViewById(R.id.character_move);
                imageView.getX();
                imageView.getY();
                imageView.setY(imageView.getY() +100);
            }
        });
    }

    public void left(View view) {
        imageView.setOnTouchListener(new OnTouchListener() {
            public boolean onTouch (View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    imageView.setY(imageView.getY() - 100);
                    } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    return true;
                }
                return false;
            }
        });

// If the LEFT ARROW is PRESSED, then MOVE CHARACTER to the LEFT.
    }

    public void right(View view) {
        imageView.setOnTouchListener(new OnTouchListener() {
            public boolean onTouch (View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    imageView.setY(imageView.getY() + 100);
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    return true;
                }

                return false;
            }
        });

// If the RIGHT ARROW is PRESSED, then MOVE CHARACTER to the RIGHT.
    }
}
