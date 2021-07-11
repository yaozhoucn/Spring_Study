package com.yaozhou.dao;

import com.yaozhou.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * Created by WXHang on HANG at 2021/7/11 18:03
 * @author HANG
 */
public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {
    //原来我们所有的执行都通过sqlsession来执行，现在我们都用spring提供的SqlSessionTemplate来执行

    public List<User> getUserList() {

               return getSqlSession().getMapper(UserMapper.class).getUserList();
    }

    public int addUser(User user) {
        getSqlSession().getMapper(UserMapper.class).delUserById(user.getId());
        return getSqlSession().getMapper(UserMapper.class).addUser(user);
    }

    public int updateUserById(User user) {
        return 0;
    }

    public int delUserById(int id) {

        return getSqlSession().getMapper(UserMapper.class).delUserById(id);
    }

    public List<User> getUserListLike(String userName) {
        return null;
    }
}