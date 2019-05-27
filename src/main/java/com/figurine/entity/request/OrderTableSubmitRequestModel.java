package com.figurine.entity.request;

import java.io.Serializable;

public class OrderTableSubmitRequestModel implements Serializable {

    private int orderid;

    private  String state;

    private  int amount;

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
