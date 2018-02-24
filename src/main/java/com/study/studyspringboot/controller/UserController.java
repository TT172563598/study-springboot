package com.study.studyspringboot.controller;

import com.study.studyspringboot.entity.StudentEntity;
import com.study.studyspringboot.jpa.StudentJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ===================
 * User ：TT
 * Date ：2018/2/7
 * Time ：16:58
 * ===================
 */
@RestController
@RequestMapping(value = "/student")
public class UserController {

    @Autowired
    private StudentJPA studentJPA;

    @RequestMapping(value = "/list" ,method = RequestMethod.GET)
    public List<StudentEntity> list(){
        return studentJPA.findAll();
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public StudentEntity save(StudentEntity entity){
        return studentJPA.save(entity);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public List<StudentEntity> delete(Long id){
        studentJPA.delete(id);
        return studentJPA.findAll();
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public StudentEntity update(StudentEntity entity){
        return studentJPA.save(entity);
    }


}
