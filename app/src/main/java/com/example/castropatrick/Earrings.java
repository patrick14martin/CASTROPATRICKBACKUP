package com.example.castropatrick;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Earrings extends AppCompatActivity implements View.OnClickListener {
    public CardView Card1, Card2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        setContentView(R.layout.activity_earrings);

        Card1 = (CardView) findViewById(R.id.EarringsCard1);
        Card2 = (CardView) findViewById(R.id.EarringsCard2);

        Card1.setOnClickListener(this);
        Card2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()) {
            case R.id.EarringsCard1:
                i = new Intent(this, Earrings2.class);
                startActivity(i);
                break;
            case R.id.EarringsCard2:
                i = new Intent(this, Earrings3.class);
                startActivity(i);
                break;
        }
    }
}