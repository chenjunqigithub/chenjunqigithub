package com.course.model;

import lombok.Data;

/**
 * 获取用户列表
 */
@Data
public class GetUserListCase {
    private String userName;
    private int age;
    private String sex;
    private String expected;
}

