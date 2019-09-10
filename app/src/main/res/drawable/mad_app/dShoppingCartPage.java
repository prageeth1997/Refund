package com.mad.mad_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.concurrent.Callable;

public class dShoppingCartPage extends AppCompatActivity {

    ArrayList<com.mad.mad_app.dCartItem> dCartItemList = new ArrayList<com.mad.mad_app.dCartItem>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dactivity_shopping_cart_page);

        dCartItemList = com.mad.mad_app.dShoppingCart.getCart();

        com.mad.mad_app.dCartItemListAdapter adap = new com.mad.mad_app.dCartItemListAdapter(this,
                R.layout.dcart_item, com.mad.mad_app.dShoppingCart.getCart(), new Callable() {
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
