package com.figurine.entity.request;

import java.io.Serializable;

public class OrderTableDeleteRequestModel implements Serializable {
    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
