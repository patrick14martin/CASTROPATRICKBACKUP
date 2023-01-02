package com.example.castropatrick;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class bracelet extends AppCompatActivity implements View.OnClickListener {
    public CardView Card1, Card2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        setContentView(R.layout.activity_bracelet);

        Card1 = (CardView) findViewById(R.id.BraceletCard1);
        Card2 = (CardView) findViewById(R.id.BraceletCard2);

        Card1.setOnClickListener(this);
        Card2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()) {
            case R.id.BraceletCard1:
                i = new Intent(this, bracelet2.class);
                startActivity(i);
                break;
            case R.id.BraceletCard2:
                i = new Intent(this, bracelet3.class);
                startActivity(i);
                break;
        }
    }
}