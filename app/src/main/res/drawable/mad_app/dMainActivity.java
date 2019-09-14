package com.mad.mad_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class dMainActivity extends AppCompatActivity {


    ArrayList<com.mad.mad_app.Item> itemList = new ArrayList<>();
//ffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff
    public void getItemList(String type) {
        switch (type){
            case "covers":
                itemList.add(new com.mad.mad_app.Item("Cover1", "desc1", 500.00));
                itemList.add(new com.mad.mad_app.Item("Cover2", "desc2", 500.00));
                itemList.add(new com.mad.mad_app.Item("For -Samsung S8+", "Available in Metal", 2300.00));
                itemList.add(new com.mad.mad_app.Item("For -Samsung S8", "Available in Silicone", 1300.00));
                itemList.add(new com.mad.mad_app.Item("For -Samsung S6+", "Available in Leather", 1050.00));
                itemList.add(new com.mad.mad_app.Item("For  -Apple IPhones 8+", "Available in Waterproof", 3500.00));
                itemList.add(new com.mad.mad_app.Item("For Apple IPhones 7", "Available in Anti-knock", 2800.00));
                itemList.add(new com.mad.mad_app.Item("For Apple IPhones 6S", "Available in Dirt-resistant", 990.00));
                break;

            case "speaker":
                itemList.add(new com.mad.mad_app.Item("wireless wooden", "Mini wireless portable", 5600.00));
                itemList.add(new com.mad.mad_app.Item("SoundCore Portable", "Dual driver Built in", 4500.00));
                itemList.add(new com.mad.mad_app.Item("Huawei Swan Portable", "Hand free Louder", 4500.00));
                itemList.add(new com.mad.mad_app.Item("SoundCore Portable", "Dual driver Built in", 4500.00));

                break;
            case "charger":
                itemList.add(new com.mad.mad_app.Item("Charger Samsung S8+", "Available in Metal", 2300.00));
                itemList.add(new com.mad.mad_app.Item("Charger Samsung S8", "Available in Silicone", 1300.00));
                itemList.add(new com.mad.mad_app.Item("Charger Samsung S6+", "Available in Leather", 1050.00));
                break;

            case "memory" :
                itemList.add(new com.mad.mad_app.Item("Smasung memory 16GB", "Evo +", 1500.00));
                itemList.add(new com.mad.mad_app.Item("Smasung memory 32GB", "Evo +1", 3500.00));
                itemList.add(new com.mad.mad_app.Item("Smasung memory 128GB", "Evo +3", 2500.00));
                break;

            default:

        }

    }





    //hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dactivity_main);

        Intent i = this.getIntent();
        String category = i.getExtras().getString("category");
        // get items according to category
        getItemList(category);
        Log.d("category", category);

        com.mad.mad_app.dItemListAdapter adap = new com.mad.mad_app.dItemListAdapter(this,R.layout.dlist_item, itemList);

        ListView listView = (ListView) findViewById(R.id.myList);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.d("item", Integer.toString(position));
                com.mad.mad_app.Item selectedItem = (com.mad.mad_app.Item)parent.getItemAtPosition(position);
                goToItemView(selectedItem);
            }
        });
        listView.setAdapter(adap);
    }

    public void goToItemView (@Nullable com.mad.mad_app.Item item) {
        Intent i = new Intent(this , com.mad.mad_app.dItemView.class);
        i.putExtra("itemName", item.getItemName());
        i.putExtra("itemDesc", item.getDescription());
        i.putExtra("itemPrice", item.getPrice());
        startActivity(i);
    }
}
