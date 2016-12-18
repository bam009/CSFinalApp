package com.example.bam00.csfinalapp;


import java.util.ArrayList;

public class GroupInfo {
    private String amount;
    private ArrayList<ChildInfo> list = new ArrayList<>();

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAmount() {
        return amount;
    }

    ////////////POSSIBLE ERROR//////////////
    public void setProductList(ArrayList<ChildInfo> productList) {
        this.list = list;
    }

    public ArrayList<ChildInfo> getProductList() {
        return list;
    }
}
