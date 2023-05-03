package org.example.mybatisLog4j.mapper;

import org.example.mybatisLog4j.POJO.User;

import java.util.List;

public interface UserMapper {
    public List<User> selectAll();
    User selectById(int id);
}
