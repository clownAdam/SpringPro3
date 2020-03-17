package com.itlike.service;

import com.itlike.dao.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ProjectName: SpringPro3
 * @Package: com.itlike.service
 * @ClassName: UserServiceImpl
 * @Author: Administrator
 * @Description:
 * @Date: 2020/3/17 5:09
 * @Version: 1.0
 */
@Service("userService")
public class UserServiceImpl implements UserService {
//    private UserDao userDao = new UserDaoImpl();
    @Resource(name = "userDao")
    private UserDao userDao;

//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }

    @Override
    public void delete() {
        userDao.delete();
    }
}
