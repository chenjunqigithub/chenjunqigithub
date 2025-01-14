package com.course.model;

import lombok.Data;

/**
 * 用户 Java Bean
 */
@Data
public class User {
    private int id;
    private String userName;
    private String password;
    private int age;
    private String sex;
    private int permission;
    private int isDelete;

    ///复写toString方法，用来处理json
    @Override
    public String toString(){
        return (
                "id:"+id+","+
                "userName:"+userName+","+
                "password:"+password+","+
                "age:"+age+","+
                "sex:"+sex+","+
                "permission:"+permission+","+
                "isDelete:"+isDelete+"}"
        );
    }
}

