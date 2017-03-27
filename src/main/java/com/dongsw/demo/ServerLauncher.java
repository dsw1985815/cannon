package com.dongsw.demo;

import com.dongsw.nettyrest.netty.NettyRestServer;

/**
 * Created by zhou on 7/1/16.
 */
public class ServerLauncher {
    public static void main(String[] args) {
        NettyRestServer nettyRestServer = new NettyRestServer();
        nettyRestServer.start();
    }
}
