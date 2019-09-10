package com.example.refund;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.concurrent.Callable;

public class dShoppingCartPage extends AppCompatActivity {

    ArrayList<dCartItem> dCartItemList = new ArrayList<dCartItem>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dactivity_shopping_cart_page);

        dCartItemList = dShoppingCart.getCart();

        dCartItemListAdapter adap = new dCartItemListAdapter(this,
                R.layout.dcart_item, dShoppingCart.getCart(), new Callable() {
            @Override
            public Object call() throws Exception {
                refreshPageAfterItemRemove();
                return null;
            }
        });
//
        ListView listView = (ListView) findViewById(R.id.myList);

//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Log.d("item", Integer.toString(position));
//                Item selectedItem = (Item)parent.getItemAtPosition(position);
//                goToItemView(selectedItem);
//            }
//        });
        listView.setAdapter(adap);

    }

    public void refreshPageAfterItemRemove () {
        this.recreate();
    }
}
