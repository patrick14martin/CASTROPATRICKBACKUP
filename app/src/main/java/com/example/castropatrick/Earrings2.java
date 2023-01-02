package com.example.castropatrick;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;


public class Earrings2 extends AppCompatActivity {
    CheckBox checkBox, checkBox2, checkBox3;

    Button button,button2,button3;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earrings2);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        checkBox = findViewById(R.id.checkBox);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);

        button = findViewById(R.id.checkoutbutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int BaseAmount = 14300;
                int TotalAmount = 0;
                int TotalAmount2 = 0;
                int TotalAmount3 = 0;
                int LaborCost = 3000;
                int OverheadCost = 2500;



                StringBuffer Result = new StringBuffer();
                Result.append("Selected Gems: \nOverhead Cost = ₱2500 \nLabor Cost = ₱3000");

                if (checkBox.isChecked()) {
                    Result.append("\n Diamond = ₱16,424");
                    TotalAmount = 0 + 16424;

                }

                if (checkBox2.isChecked()) {
                    Result.append("\n Emerald = ₱18,604");
                    TotalAmount2 = 0 + 18604;

                }

                if (checkBox3.isChecked()) {
                    Result.append("\n Ruby = ₱9,302");
                    TotalAmount3 = 0 + 9302;
                }
                int Final = BaseAmount + TotalAmount + TotalAmount2 + TotalAmount3 + LaborCost +OverheadCost;
                int Wholesale = (BaseAmount + TotalAmount + TotalAmount2 + TotalAmount3 + LaborCost +OverheadCost) / 2;
                double Wholesale2 = Math.round((BaseAmount + TotalAmount + TotalAmount2 + TotalAmount3 + LaborCost +OverheadCost) / 2.20);
                Result.append("\nTotal Amount: ₱" + Final + " ");
                Toast.makeText(Earrings2.this, Result.toString(), Toast.LENGTH_SHORT).show();
                button2 = findViewById(R.id.button3);
                button2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String resultMessage = String.valueOf("₱"+Final+"");
                        Bundle args = new Bundle();
                        args.putString("result", resultMessage);
                        DialogFragmentCustom dialogFragmentImp = new DialogFragmentCustom();
                        dialogFragmentImp.setArguments(args);
                        dialogFragmentImp.show(getSupportFragmentManager(),"Total Payment");
                    }
                });
                button3 = findViewById(R.id.wholesale);
                button3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String resultMessage = String.valueOf("₱"+Wholesale+" each for minimum of 20 orders. \n ₱"+Wholesale2+" each for 30 orders and more.");
                        Bundle args = new Bundle();
                        args.putString("result", resultMessage);
                        DialogFragmentCustom dialogFragmentImp = new DialogFragmentCustom();
                        dialogFragmentImp.setArguments(args);
                        dialogFragmentImp.show(getSupportFragmentManager(),"Total Payment");

                    }
                });

            }


        });
    }
}

