package com.hjl.dao;

import com.hjl.pojo.UserInfo;

import java.util.List;

public interface UserMapper {
    List<UserInfo> select();
}
