package com.example.refund;

import java.util.ArrayList;

public class dShoppingCart {

    public static ArrayList<dCartItem> cart = new ArrayList<>();

    public dShoppingCart() {
    }

    public static void addToCart(dCartItem item){
        cart.add(item);

    }
    public static ArrayList<dCartItem> getCart(){
        return cart;
    }

    public static void removeFromCart(dCartItem item) {
        cart.remove(item);
    }
}
