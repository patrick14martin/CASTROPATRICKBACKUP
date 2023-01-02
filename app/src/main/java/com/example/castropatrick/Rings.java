package com.example.castropatrick;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Rings extends AppCompatActivity implements View.OnClickListener {
    public CardView Card1, Card2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        setContentView(R.layout.activity_rings);

        Card1 = (CardView) findViewById(R.id.RingsCard1);
        Card2 = (CardView) findViewById(R.id.RingsCard2);

        Card1.setOnClickListener(this);
        Card2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()) {
            case R.id.RingsCard1:
                i = new Intent(this, Rings2.class);
                startActivity(i);
                break;
            case R.id.RingsCard2:
                i = new Intent(this, Rings3.class);
                startActivity(i);
                break;
        }
    }
}