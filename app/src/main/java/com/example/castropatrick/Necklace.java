package com.example.castropatrick;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Necklace extends AppCompatActivity implements View.OnClickListener {
    public CardView Card1, Card2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        setContentView(R.layout.necklace);

        Card1 = (CardView) findViewById(R.id.NecklaceCard1);
        Card2 = (CardView) findViewById(R.id.NecklaceCard2);

        Card1.setOnClickListener(this);
        Card2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()) {
            case R.id.NecklaceCard1:
                i = new Intent(this, Necklace2.class);
                startActivity(i);
                break;
            case R.id.NecklaceCard2:
                i = new Intent(this, Necklace3.class);
                startActivity(i);
                break;
        }
    }
}