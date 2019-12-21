package com.zhangju.manage.controller;

import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @author zhangju
 * @version 1.0
 * @since 1.0
 * 2019/12/21 23:46
 **/
@Controller
@Data
public class UserController {

    @RequestMapping( "/user_list")
    public ModelAndView getUserList(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView("user_list");
        return modelAndView;
    }

    @RequestMapping( "/user_add")
    public ModelAndView getUserAdd(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView("user_add");
        return modelAndView;
    }
}
