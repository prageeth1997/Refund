package com.example.refund;


public class Item {
    private String itemName;
    private String desc;
    private double price;

    public Item() {}

    public Item(String name, String desc, double price){
        this.itemName = name;
        this.desc = desc;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getDescription() {
        return desc;
    }

    public void setDescription(String desc) {
        this.desc = desc;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }




    @Override
    public String toString() {
        return this.itemName;
    }

}
