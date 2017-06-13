package com.smartautotech.ui.service.serviceImpl;

import com.smartautotech.ui.dao.UserDao;
import com.smartautotech.ui.model.User;
import com.smartautotech.ui.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by tianzx on 2017/6/9.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserDao userDao;

    @Override
    public User getUserByUserId(int userId) {
        User user = userDao.selectUserById(userId);
        return user;
    }
}
