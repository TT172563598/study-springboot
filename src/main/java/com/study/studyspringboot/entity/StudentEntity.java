package com.study.studyspringboot.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * ===================
 * User ：TT
 * Date ：2018/2/7
 * Time ：16:59
 * ===================
 */
@Entity
@Table(name = "student")
public class StudentEntity implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @GeneratedValue
    @Column(name = "clazz_id")
    private Long clazz_id;

    @GeneratedValue
    @Column(name = "stu_id")
    private Long stu_id;

    @GeneratedValue
    @Column(name = "stu_name")
    private String name;

    @GeneratedValue
    @Column(name = "stu_sex")
    private int sex;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getClazz_id() {
        return clazz_id;
    }

    public void setClazz_id(Long clazz_id) {
        this.clazz_id = clazz_id;
    }

    public Long getStu_id() {
        return stu_id;
    }

    public void setStu_id(Long stu_id) {
        this.stu_id = stu_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}
