package com.itlike.dao;

import org.springframework.stereotype.Repository;

/**
 * @ProjectName: SpringPro3
 * @Package: com.itlike.dao
 * @ClassName: UserDaoImpl
 * @Author: Administrator
 * @Description:
 * @Date: 2020/3/17 5:10
 * @Version: 1.0
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void delete() {
        System.out.println("从数据库当中删除记录");
    }
}
