package com.pc.dao;

import com.pc.pojo.User;

import java.util.List;

public interface UserDao {
    List<User> getUserList();
    User getUserById(int id);
    int addUser(User user);
    int updataUser(User user);
    int deleteUser(int id);
}
