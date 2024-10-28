package com.yun.weblog.web;

import com.yun.weblog.common.domain.dos.UserDO;
import com.yun.weblog.common.domain.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

/**
 * @author 云言月
 * 2024/10/25 11:36
 */
@SpringBootTest
@Slf4j
public class WeblogWebApplicationTests {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void test() {
        // 编写单元测试
    }

    @Test
    void testLog() {
        log.info("这是一行 Info 级别日志");
        log.warn("这是一行 Warn 级别日志");
        log.error("这是一行 Error 级别日志");

        // 占位符
        String author = "犬小哈";
        log.info("这是一行带有占位符日志，作者：{}", author);
    }

    //@Test
    //void insertTest() {
    //    // 构建数据库实体类
    //    UserDO userDO = UserDO.builder()
    //            .username("犬小哈")
    //            .password("123456")
    //            .createTime(new Date())
    //            .updateTime(new Date())
    //            .isDeleted(false)
    //            .build();
    //
    //    userMapper.insert(userDO);
    //}
}
