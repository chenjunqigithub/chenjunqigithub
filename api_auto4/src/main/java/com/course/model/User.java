package com.course.model;
 
import lombok.Data;
 
@Data
public class User {
 
    private int id;
    private String userName;
    private String password;
    private int age;
    private String sex;
    private int permission;
    private int isDelete;
}