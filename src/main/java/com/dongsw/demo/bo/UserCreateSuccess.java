package com.dongsw.demo.bo;

import com.dongsw.nettyrest.response.Info;

/**
 * Created by zhou on 6/1/16.
 */
public class UserCreateSuccess extends Info {
    private int id;
    private String url;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
