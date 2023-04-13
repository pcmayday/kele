package com.pc.dao;

import com.pc.pojo.User;
import com.pc.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {

    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //方式1
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<User> userList = userDao.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void getuserbyid(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        User userById = mapper.getUserById(2);
        System.out.println(userById);
        sqlSession.close();
    }

    @Test
    public void test1(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        mapper.addUser(new User(1,"ssps","5555"));
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        mapper.updataUser(new User(6,"ww","7894"));
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test3(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        mapper.deleteUser(0);
        sqlSession.commit();
        sqlSession.close();
    }
}
