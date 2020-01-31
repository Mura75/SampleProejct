package com.mobile.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView ivFirst;
    ImageView ivSecond;
    ImageView ivThird;
    TextView tvDescription;
    ImageView ivMain;
    EditText etName;
    ImageView ivFourth;
    Button buttonHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ivFirst = findViewById(R.id.iv_first);
        ivFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(
                        MainActivity.this,
                        "Hello world",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });

        ivSecond = findViewById(R.id.iv_second);
        ivSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDescription.setText("Hi");
                tvDescription.setTextSize(30f);
            }
        });

        tvDescription = findViewById(R.id.tv_description);

        ivThird = findViewById(R.id.iv_third);
        ivThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ivMain.setImageResource(android.R.drawable.ic_menu_camera);
            }
        });

        ivMain = findViewById(R.id.iv_main);

        etName = findViewById(R.id.et_name);

        ivFourth = findViewById(R.id.iv_fourth);
        ivFourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = etName.getText().toString();
                Toast.makeText(
                        MainActivity.this,
                        text,
                        Toast.LENGTH_SHORT
                ).show();
            }
        });

        buttonHello = findViewById(R.id.buttonHello);
        buttonHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etName.setText("hello");
            }
        });
    }
}
