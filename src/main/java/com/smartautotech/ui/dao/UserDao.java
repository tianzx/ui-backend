package com.smartautotech.ui.dao;

import com.smartautotech.ui.model.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by tianzx on 2017/6/9.
 */
@Mapper
public interface UserDao {
    User selectUserById(int userId);
}
