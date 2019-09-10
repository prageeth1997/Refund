package com.example.refund;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class viewRefund extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_refund);
    }
    public void Update(View view) {
        Intent intent2 = new Intent(viewRefund.this , refundUpdate.class);
        startActivity(intent2);

    }

    public void delete(View view) {
        //Intent intent2 = new Intent(viewRefund.this , viewRefund.class);
       // startActivity(intent2);

    }
}
