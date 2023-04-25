package org.example;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.POJO.User;
import org.example.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
// Mybatis Mapper Proxy Development
public class mybatisDemo2 {
    public static void main(String[] args) throws IOException {
        Logger logger = LoggerFactory.getLogger(mybatisDemo2.class);
        logger.debug("dfasfd");
        //load core conponat
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2. get sqlsessioin object
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 3. get UserMapper 接口的代理对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> users =  userMapper.selectAll();
        System.out.println(users);

        sqlSession.close();
    }
}
