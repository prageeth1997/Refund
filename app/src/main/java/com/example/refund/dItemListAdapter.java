package com.example.refund;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class dItemListAdapter extends ArrayAdapter<Item> {
    private Context context;
    private int resource;


    public dItemListAdapter(Context context, int resource, List<Item> objects) {
        super(context, resource, objects);
        this.resource =resource;
        this.context = context;
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        String name = getItem(position).getItemName();
        String dec = getItem(position).getDescription();
        double price = getItem(position).getPrice();
//        int p = getItem(position).getImagePath();


        Item item = new Item(dec,name,price);

        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = inflater.inflate(resource,parent,false);

        TextView tname = (TextView) convertView.findViewById(R.id.textView);
        TextView tdec = (TextView) convertView.findViewById(R.id.textView2);
        TextView tprice = (TextView) convertView.findViewById(R.id.textView3);
        ImageView image = (ImageView) convertView.findViewById(R.id.imageView);
//
        tname.setText(name);
        tdec.setText(dec);
        tprice.setText(Double.toString(price));

        image.setImageResource(R.drawable.downlb);

        return convertView;
    }
}
