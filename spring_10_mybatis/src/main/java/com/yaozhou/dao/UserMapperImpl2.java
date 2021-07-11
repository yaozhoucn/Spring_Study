package com.yaozhou.dao;

import com.yaozhou.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * Created by WXHang on HANG at 2021/7/11 18:42
 */
public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper{

    public List<User> getUserList() {
//        SqlSession sqlSession = getSqlSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        List<User> userList = mapper.getUserList();
//        return userList;
        return getSqlSession().getMapper(UserMapper.class).getUserList();
    }

    public int addUser(User user) {
        return 0;
    }

    public int updateUserById(User user) {
        return 0;
    }

    public int delUserById(int id) {
        return 0;
    }

    public List<User> getUserListLike(String userName) {
        return null;
    }
}