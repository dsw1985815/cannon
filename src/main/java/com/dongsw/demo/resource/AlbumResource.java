package com.dongsw.demo.resource;

import com.dongsw.demo.bo.AlbumInfo;
import com.dongsw.nettyrest.ApiProtocol;
import com.dongsw.demo.service.AlbumService;
import com.dongsw.nettyrest.response.Info;
import com.dongsw.nettyrest.response.Result;
import com.dongsw.nettyrest.BaseResource;

public class AlbumResource extends BaseResource {

    public AlbumResource(ApiProtocol apiProtocol) {
        super(apiProtocol);
    }

    public Result get() {

        int uid, aid;

        Object uidCheck = parameterIntCheck(apiProtocol, "uid");
        if (uidCheck instanceof Result) {
            return (Result) uidCheck;
        } else {
            uid = (int) uidCheck;
        }

        Object aidCheck = parameterIntCheck(apiProtocol,"aid");
        if (aidCheck instanceof Result){
            return (Result) aidCheck;
        }else {
            aid = (int) aidCheck;
        }

        AlbumService albumService = new AlbumService(apiProtocol);

        return new Result<Info>(new AlbumInfo(albumService.get(aid,uid)));
    }
}
