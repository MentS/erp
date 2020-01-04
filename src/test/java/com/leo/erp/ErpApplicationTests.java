package com.leo.erp;

import com.leo.erp.entity.User;
import com.leo.erp.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.Date;


@Slf4j
@SpringBootTest
class ErpApplicationTests {

    @Test
    void contextLoads() {
    }

    //@Autowired(required = false)
    @Resource
    private UserMapper userMapper;

    @Test
    public void test() throws Exception {
        User user;
        user = userMapper.selectById(1);
        System.out.println("select: "+user);


        user.setLastPasswordResetTime(new Timestamp(new Date().getTime()));
        System.out.println("set: "+user);
        userMapper.updateById(user);

    }

}
