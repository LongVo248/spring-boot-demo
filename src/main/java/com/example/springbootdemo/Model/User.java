package com.example.springbootdemo.Model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@ToString(exclude = "userName")
@Data
@Table(name = "users")
public class User {
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
}
