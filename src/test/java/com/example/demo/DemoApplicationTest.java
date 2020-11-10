package com.example.demo;

import com.example.demo.service.JzTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author: jz
 * @Date: 2020/11/9 15:16
 * @Description:
 */
@SpringBootTest
public class DemoApplicationTest {
    @Autowired
    JzTest jzTest;

    @Test
    void contextLoads() {
        System.out.println(jzTest.name+" ---我  wo 123");
    }
}
