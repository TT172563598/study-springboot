package com.study.studyspringboot.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * ===================
 * User ：TT
 * Date ：2018/2/7
 * Time ：22:04
 * ===================
 */
@Entity
@Table(name = "user")
public class UserEntity implements Serializable{

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @GeneratedValue
    @Column(name = "stu_id")
    private Long username;

    @GeneratedValue
    @Column(name = "stu_password")
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUsername() {
        return username;
    }

    public void setUsername(Long username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
