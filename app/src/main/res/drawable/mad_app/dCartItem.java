package com.mad.mad_app;

public class dCartItem {
    private com.mad.mad_app.Item item;
    private int quntity;


    public dCartItem() {
    }

    public dCartItem(com.mad.mad_app.Item item, int quntity) {
        this.item = item;
        this.quntity = quntity;
    }

    public com.mad.mad_app.Item getItem() {
        return item;
    }

    public void setItem(com.mad.mad_app.Item item) {
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
