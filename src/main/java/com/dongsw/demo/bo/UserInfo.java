package com.dongsw.demo.bo;

import com.dongsw.demo.entity.User;
import com.dongsw.nettyrest.response.Info;

/**
 * Created by zhou on 5/1/16.
 */
public class UserInfo extends Info {
    private User user;

    public User getUser() {
        return user;
    }

    public UserInfo(User user) {
        this.user = user;
    }
}