package com.dongsw.demo.resource;

import com.dongsw.demo.bo.UserCreateSuccess;
import com.dongsw.demo.bo.UserInfo;
import com.dongsw.demo.service.UserService;
import com.dongsw.nettyrest.StatusCode;
import com.dongsw.nettyrest.response.Info;
import com.dongsw.nettyrest.response.Result;
import com.dongsw.nettyrest.ApiProtocol;
import com.dongsw.nettyrest.BaseResource;

public class UserResource extends BaseResource {

    public UserResource(ApiProtocol apiProtocol) {
        super(apiProtocol);
    }

    public Result get() {

        int uid;

        Object uidCheck = parameterIntCheck(apiProtocol, "uid");
        if (uidCheck instanceof Result) {
            return (Result) uidCheck;
        } else {
            uid = (int) uidCheck;
        }

        UserService userService = new UserService(apiProtocol);
        UserInfo userInfo    = new UserInfo(userService.get(uid));

        return new Result<Info>(userInfo);
    }

    public Result post() {
        UserCreateSuccess userCreateSuccess = new UserCreateSuccess();
        userCreateSuccess.setId(2);
        userCreateSuccess.setUrl("http://netty.restful.api..net/user/2");
        userCreateSuccess.setCode(StatusCode.CREATED_SUCCESS);
        return new Result<>(userCreateSuccess);
    }

    public Result patch() {
        return success(202);
    }

    public Result delete() {
        return success(203);
    }

}
