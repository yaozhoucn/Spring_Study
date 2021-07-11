package com.yaozhou.dao;

import com.yaozhou.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;


import java.util.List;

/**
 * Created by WXHang on HANG at 2021/7/11 18:03
 */
public class UserMapperImpl implements UserMapper {
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<User> getUserList() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();

        return userList;
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