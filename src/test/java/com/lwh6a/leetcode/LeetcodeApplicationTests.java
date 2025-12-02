package com.lwh6a.leetcode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

@SpringBootTest
class LeetcodeApplicationTests {

    @Test
    void contextLoads() {
        String s = "Hello World";
        System.out.println(s.getBytes(StandardCharsets.UTF_8));
        System.out.println(Arrays.toString(s.getBytes(StandardCharsets.UTF_8)));
    }

}
