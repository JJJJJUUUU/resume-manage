package com.zhangju.manage.controller;

import com.zhangju.manage.common.JSONObjectResult;
import com.zhangju.manage.common.util.ResponseUtil;
import com.zhangju.manage.constant.ErrorEnum;
import com.zhangju.manage.entity.User;
import com.zhangju.manage.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author zhangju 卓望信息(北京)
 * @version 1.0
 * @since 1.0
 * 2019/12/19 20:11
 **/
@Controller
@Slf4j
public class IndexController {

    @Autowired
    private UserService userService;

    @PostMapping("/login/admin")
    @ResponseBody
    public JSONObjectResult loginAdmin(HttpServletRequest request, String userName, String password) {

        log.info("userName:{}", userName);
        log.info("password:{}", password);

        //通过用户名/手机号查询 密码是否正确
        User user = userService.userLogin(userName, password);
        JSONObjectResult result;
        //用户名密码错误
        if (null == user) {
            result = ResponseUtil.error(ErrorEnum.USER_PASSWORD_ERROR.getCode(),ErrorEnum.USER_PASSWORD_ERROR.getMessage(),"");
        } else {
            log.info("登录成功：{}", user);
            //用户名密码正确允许登录
            //将用户信息存到session中
            HttpSession session = request.getSession(true);
            session.setAttribute("user", user);
            result = ResponseUtil.success(user);

        }
        return result;
    }

    /**
     * 退出登录
     *
     * @param request
     * @return
     */
    @GetMapping("/logout")
    public ModelAndView logout(HttpServletRequest request) {
        ModelAndView model = new ModelAndView("login");
        request.getSession().invalidate();
        return model;
    }
}
