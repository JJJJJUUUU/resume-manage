package com.zhangju.manage.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @author zhangju 卓望信息(北京)
 * @version 1.0
 * @since 1.0
 * 2019/12/19 20:11
 **/
@Controller
@Slf4j
public class IndexController {
    @RequestMapping("/")
    public ModelAndView index(HttpServletRequest request) {
        StringBuffer requestURL = request.getRequestURL();
        System.err.println(requestURL);

        ModelAndView modelAndView = new ModelAndView("index");


        return modelAndView;
    }
}
