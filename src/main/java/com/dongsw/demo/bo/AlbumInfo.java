package com.dongsw.demo.bo;

import com.dongsw.demo.entity.Album;
import com.dongsw.nettyrest.response.Info;

/**
 * Created by zhou on 5/1/16.
 */
public class AlbumInfo extends Info {
    private Album album;

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public AlbumInfo(Album album) {
        this.album = album;
    }
}
