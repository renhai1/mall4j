

package com.yami.shop.common.response;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ServerResponseEntity {

    public static <T> ServerResponse<T> success(T data) {
        ServerResponse<T> serverResponse = new ServerResponse<>();
        serverResponse.setObj(data);
        serverResponse.setCode(ResponseCode.SUCCESS);
        return serverResponse;
    }

    public static <T> ServerResponse<T> success() {
        ServerResponse<T> serverResponse = new ServerResponse<>();
        serverResponse.setCode(ResponseCode.SUCCESS);
        return serverResponse;
    }

    public static <T> ServerResponse<T> fail(String msg) {
        log.error(msg);
        ServerResponse<T> serverResponse = new ServerResponse<>();
        serverResponse.setMsg(msg);
        serverResponse.setCode(ResponseCode.FAIL);
        return serverResponse;
    }

    public static <T> ServerResponse<T> fail(String msg, T data) {
        log.error(msg);
        ServerResponse<T> serverResponse = new ServerResponse<>();
        serverResponse.setMsg(msg);
        serverResponse.setCode(ResponseCode.FAIL);
        serverResponse.setObj(data);
        return serverResponse;
    }

    public static <T> ServerResponse<T> fail(int code ,String msg, T data) {
        log.error(msg);
        ServerResponse<T> serverResponse = new ServerResponse<>();
        serverResponse.setMsg(msg);
        serverResponse.setCode(code);
        serverResponse.setObj(data);
        return serverResponse;
    }
}
