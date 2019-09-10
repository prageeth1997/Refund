package com.example.refund;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class gMainActivity extends AppCompatActivity {
    Button add_btn,view_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gactivity_main);
        add_btn = findViewById(R.id.add_item);
        view_btn = findViewById(R.id.add_view);


        add_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(gMainActivity.this, "Insert Success..", Toast.LENGTH_SHORT).show();
                openActivity2();

            }

        });
    }

    public void openActivity2(){
        Intent i = new Intent(this, gAddItemComplete.class);
        startActivity(i);
    }


    @Override
    protected void onResume() {
        super.onResume();

        view_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(gMainActivity.this, gItems.class);
                startActivity(intent);
            }
        });
    }
}
