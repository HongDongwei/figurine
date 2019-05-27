package com.figurine.entity.request;

import java.io.Serializable;

public class CommoditySubmitRequestModel implements Serializable {
    private int id;

    private int choice;

    private int time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getChoice() {
        return choice;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
