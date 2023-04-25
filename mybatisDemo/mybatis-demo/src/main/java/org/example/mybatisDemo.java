package org.example;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.POJO.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class mybatisDemo {

    public static void main(String[] args) throws IOException {
        Logger logger = LoggerFactory.getLogger(mybatisDemo.class);
        logger.debug("dfasfd");
        //load core conponat
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2. get sqlsessioin object
        SqlSession sqlSession = sqlSessionFactory.openSession();

        List<User> users =  sqlSession.selectList("test.selectAll");

        System.out.println(users);

        sqlSession.close();
    }
}
