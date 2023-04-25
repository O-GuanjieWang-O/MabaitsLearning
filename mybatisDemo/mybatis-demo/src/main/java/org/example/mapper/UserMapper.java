package org.example.mapper;

import org.example.POJO.User;

import java.util.List;

public interface UserMapper {
    public List<User> selectAll();
    User selectById(int id);
}
