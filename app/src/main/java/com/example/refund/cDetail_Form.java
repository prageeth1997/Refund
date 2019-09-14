package com.example.refund;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class cDetail_Form extends AppCompatActivity {

    private Button button;
    Button btnsubmit, btndelete, btnupdate;
    EditText txtName, txtAddL1, txtAddL2, txtPostal, txtMobil, txtMail, txtOpt;
    DatabaseReference dbref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cactivity_detail__form);

        button = (Button) findViewById(R.id.btnsubmit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCard_Payment();
            }
        });
    }

    public void openCard_Payment(){
        Intent intent = new Intent(this, cCard_Payment.class);
        startActivity(intent);
    }
}

