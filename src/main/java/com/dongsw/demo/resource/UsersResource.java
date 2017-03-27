package com.dongsw.demo.resource;


import com.dongsw.demo.entity.User;
import com.dongsw.nettyrest.ApiProtocol;
import com.dongsw.demo.service.UserService;
import com.dongsw.nettyrest.response.ListInfo;
import com.dongsw.nettyrest.response.ListResult;
import com.dongsw.nettyrest.BaseResource;
import com.dongsw.nettyrest.response.Result;

import java.util.List;

public class UsersResource extends BaseResource {

    public UsersResource(ApiProtocol apiProtocol) {
        super(apiProtocol);
    }

    public Result get() {

        ListInfo   info       = new ListInfo();
        ListResult listResult = new ListResult(info);

        UserService userService = new UserService(apiProtocol);

        List<User> list = userService.list();

        info.setNum(list.size());
        listResult.setItem(list);

        return listResult;
    }
}
