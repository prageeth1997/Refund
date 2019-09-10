package com.example.refund;

public class dCartItem {
    private Item item;
    private int quntity;


    public dCartItem() {
    }

    public dCartItem(Item item, int quntity) {
        this.item = item;
        this.quntity = quntity;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getQuntity() {
        return quntity;
    }

    public void setQuntity(int quntity) {
        this.quntity = quntity;
    }


    public int total (){

        int total ;
        double price = item.getPrice();

        total = (int) (quntity  * (price));
        return total;
    }
}
