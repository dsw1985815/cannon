package com.dongsw.demo.service;

import com.dongsw.demo.entity.User;
import com.dongsw.demo.entity.Album;
import com.dongsw.nettyrest.ApiProtocol;
import com.dongsw.demo.bo.Star;

/**
 * Created by zhou on 4/1/16.
 */
public class AlbumService extends BaseService {

    public AlbumService(ApiProtocol apiProtocol) {
        super(apiProtocol);
    }

    public Album get(int id, int uid) {
        User user  = new User(uid, "", 25);
        String cover = "http://static..net/view/images/avatar/1.jpg";
        Star   star  = new Star(120, true);

        return new Album(id, user, cover, star);
    }
}
