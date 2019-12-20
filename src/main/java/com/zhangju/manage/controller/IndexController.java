package com.zhangju.manage.controller;

import com.alibaba.fastjson.JSONObject;
import com.zhangju.manage.common.JSONObjectResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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
    @RequestMapping({"/","/index"})
    public ModelAndView index(HttpServletRequest request) {
        StringBuffer requestURL = request.getRequestURL();
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }

    @RequestMapping("/login")
    public ModelAndView login(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView("login");
        return modelAndView;
    }

    @RequestMapping("/login_admin")
    @ResponseBody
    public JSONObjectResult loginAdmin(HttpServletRequest request, String userName, String password) {

        log.info("userName:{}",userName);
        log.info("password:{}",password);

        JSONObjectResult result = new JSONObjectResult();
        result.setCode(0);


        return result;
    }
}
