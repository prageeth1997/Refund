package com.example.refund;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class myorders extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myorders);
    }

    public void refund(View view) {

        Intent intent2 = new Intent(myorders.this , gMainActivity.class);
        startActivity(intent2);
    }
    public void refundUpdate(View view) {
        Intent intent2 = new Intent(myorders.this , viewRefund.class);
        startActivity(intent2);

    }
}
