package com.dongsw.nettyrest.response;

import com.dongsw.nettyrest.BaseEntity;

import java.util.List;

public class ListResult extends Result {

    protected List<? extends BaseEntity> item;

    public List<? extends BaseEntity> getItem() {
        return item;
    }

    public void setItem(List<? extends BaseEntity> item) {
        this.item = item;
    }

    public ListResult(Info info) {
        super(info);
    }
}
