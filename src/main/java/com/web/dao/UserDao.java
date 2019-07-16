package com.web.dao;

import com.web.domain.User;

import java.util.List;

public interface UserDao {

    List<User> findAll();
}
