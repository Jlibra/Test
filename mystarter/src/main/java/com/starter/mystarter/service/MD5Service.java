package com.starter.mystarter.service;

import com.starter.mystarter.utils.MD5Util;

import javax.annotation.Resource;

/**
 * <p>
 * MD5Service:
 * </p>
 *
 * @author jiangxf
 * @version 2.8.0
 * @since 2019-10-28
 */
public class MD5Service {

    @Resource
    private MD5Util md5Util;

//    public MD5Service(MD5Util md5Util) {
//        this.md5Util = md5Util ;
//    }


    public String getMD5(String input) {
        return md5Util.getMD5(input.getBytes());
    }

}
