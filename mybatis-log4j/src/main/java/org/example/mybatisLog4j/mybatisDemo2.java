package org.example.mybatisLog4j;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.mybatisLog4j.POJO.User;
import org.example.mybatisLog4j.mapper.UserMapper;
import org.example.mybatisLog4j.util.initLogRecord;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
// Mybatis Mapper Proxy Development
public class mybatisDemo2 {
    public static void main(String[] args) throws IOException {
        initLogRecord.initLog();
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
