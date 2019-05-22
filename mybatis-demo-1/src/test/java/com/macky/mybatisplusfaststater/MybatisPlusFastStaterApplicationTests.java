package com.macky.mybatisplusfaststater;

import com.macky.mybatisplusfaststater.entity.User;
import com.macky.mybatisplusfaststater.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisPlusFastStaterApplicationTests {

    @Resource
    private UserMapper userMapper;

    @Test
    public void testSelect() {

        java.util.List<User> user = userMapper.selectList(null);
        user.forEach(System.out::println);
    }


}
