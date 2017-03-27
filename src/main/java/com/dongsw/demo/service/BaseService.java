package com.dongsw.demo.service;

import com.dongsw.nettyrest.ApiProtocol;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseService {

    protected ApiProtocol apiProtocol;
    protected Logger logger;

    public BaseService(ApiProtocol apiProtocol) {
        this.apiProtocol = apiProtocol;
        logger = LoggerFactory.getLogger(this.getClass());
    }
}
