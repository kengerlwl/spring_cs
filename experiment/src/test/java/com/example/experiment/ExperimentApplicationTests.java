package com.example.experiment;

import com.example.experiment.entity.User;
import com.example.experiment.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.util.List;

@SpringBootTest
class ExperimentApplicationTests {
    @Autowired
    DataSource dataSource;

    @Test
    void contextLoads0() throws Exception {
        System.out.println("获取的数据库连接为:" + dataSource.getConnection());

    }

    @Autowired
    private UserMapper userMapper;
    @Test
    void contextLoads() {
        List<User> users = userMapper.selectList(null);
        //遍历用户列表集合
        users.forEach(System.out::println);
    }


}
