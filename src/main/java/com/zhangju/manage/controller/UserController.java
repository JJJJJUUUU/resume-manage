package com.zhangju.manage.controller;

import com.zhangju.manage.common.JSONObjectResult;
import com.zhangju.manage.common.util.ResponseUtil;
import com.zhangju.manage.model.param.GetUserListParams;
import com.zhangju.manage.model.vo.GetUserListVO;
import com.zhangju.manage.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


/**
 * @author zhangju
 * @version 1.0
 * @since 1.0
 * 2019/12/21 23:46
 **/
@Controller
@Slf4j
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping( "/user_list")
    public ModelAndView getUserListView() {
        ModelAndView modelAndView = new ModelAndView("user_list");
        return modelAndView;
    }

    @RequestMapping( "/user_add")
    public ModelAndView getUserAdd() {
        ModelAndView modelAndView = new ModelAndView("user_add");
        return modelAndView;
    }

    @RequestMapping( "/list")
    @ResponseBody
    public JSONObjectResult getUserLust(@RequestBody GetUserListParams params) {
        log.info("请求参数：{}",params);
        GetUserListVO userListVO = userService.getUserList(params);
        JSONObjectResult result = ResponseUtil.success(userListVO);
        log.info("请求用户列表列表返回接口：{}" ,userListVO);
        return result;
    }



}
