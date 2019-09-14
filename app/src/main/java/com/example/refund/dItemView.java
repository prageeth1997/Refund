package com.example.refund;

import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;

public class dItemView extends AppCompatActivity {

    Button cart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dactivity_item_view);
        androidx.appcompat.widget.Toolbar toolbar = (androidx.appcompat.widget.Toolbar ) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        Intent i = this.getIntent();
        final String itemName = i.getExtras().getString("itemName");
        final String itemDesc = i.getExtras().getString("itemDesc");
        final double itemPrice = i.getExtras().getDouble("itemPrice");
       // final int ipath = (int) i.getExtras().get("imagepath");

        TextView name = (TextView) findViewById(R.id.textView7);
        final TextView price = (TextView) findViewById(R.id.textView9);
        TextView desc = (TextView) findViewById(R.id.textdescription);


        name.setText(itemName);
        desc.setText(itemDesc);
        price.setText(Double.toString(itemPrice));

        cart = (Button) findViewById(R.id.button);
        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Item item = new Item(itemName,itemDesc, itemPrice);
                addToCart(item);
            }
        });
    }

    public void addToCart(Item item){
        dCartItem dCartItem = new dCartItem(item,1);
        dShoppingCart.addToCart(dCartItem);
        Toast t = Toast.makeText(this, "Item added successfully!", Toast.LENGTH_LONG);
        t.show();
        goToCategoryPage();
    }

    public void goToCategoryPage() {
        Intent i = new Intent(this, dCategoryPage.class);
        startActivity(i);
    }
}
