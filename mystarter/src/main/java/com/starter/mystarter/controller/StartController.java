//package com.starter.mystarter.controller;
//
//import com.starter.mystarter.service.MD5Service;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import javax.annotation.Resource;
//
///**
// * <p>
// * StartController:
// * </p>
// *
// * @author jiangxf
// * @version 2.8.0
// * @since 2019-10-28
// */
//@Slf4j
//@RequestMapping("ss")
//public class StartController {
//
//    @Resource
//    private MD5Service md5Service;
//
//    @RequestMapping("toPage/{md5}")
//    public String toPage(@PathVariable("md5") String md5){
//        log.info(md5Service.getMD5(md5));
//        return "test1";
//    }
//
//}
//
//
//
//
