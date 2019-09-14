package com.mad.mad_app;

import java.util.ArrayList;

public class dShoppingCart {

    public static ArrayList<com.mad.mad_app.dCartItem> cart = new ArrayList<>();

    public dShoppingCart() {
    }

    public static void addToCart(com.mad.mad_app.dCartItem item){
        cart.add(item);

    }
    public static ArrayList<com.mad.mad_app.dCartItem> getCart(){
        return cart;
    }

    public static void removeFromCart(com.mad.mad_app.dCartItem item) {
        cart.remove(item);
    }
}
