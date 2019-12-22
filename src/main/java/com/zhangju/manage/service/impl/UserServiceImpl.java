package com.zhangju.manage.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhangju.manage.entity.User;
import com.zhangju.manage.mapper.UserMapper;
import com.zhangju.manage.model.param.GetUserListParams;
import com.zhangju.manage.model.vo.GetUserListVO;
import com.zhangju.manage.model.vo.PageVO;
import com.zhangju.manage.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangju 卓望信息(北京)
 * @version 1.0
 * @since 1.0
 * 2019/12/21 15:19
 **/
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public User userLogin(String userName, String password) {
        return userMapper.getUserByUserNameAndPassword(userName, password);
    }

    @Override
    public GetUserListVO getUserList(GetUserListParams params) {
        GetUserListVO vo = new GetUserListVO();

        //使用PageHelper 分页
        PageHelper.startPage(Integer.valueOf(params.getPageNumber()), Integer.valueOf(params.getPageSize()));
        List<User> userList = userMapper.getUserList(params.getUserName());
        if (null != userList && userList.size() > 0) {
            PageInfo<User> pageInfo = new PageInfo<>(userList);
            PageVO page = new PageVO(pageInfo);
            vo.setList(userList);
            vo.setPage(page);
        }else{
            vo.setList(new ArrayList<>());
            vo.setPage(new PageVO(new PageInfo()));
        }
        return vo;
    }
}
