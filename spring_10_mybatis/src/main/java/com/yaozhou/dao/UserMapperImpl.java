package com.yaozhou.dao;

import com.yaozhou.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;


import java.util.List;

/**
 * Created by WXHang on HANG at 2021/7/11 18:03
 * @author HANG
 */
public class UserMapperImpl implements UserMapper {
    //原来我们所有的执行都通过sqlsession来执行，现在我们都用spring提供的SqlSessionTemplate来执行
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