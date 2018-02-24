package com.study.studyspringboot.controller;

import com.study.studyspringboot.entity.UserEntity;
import com.study.studyspringboot.jpa.UserJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.servlet.http.HttpServletRequest;

/**
 * ===================
 * User ：TT
 * Date ：2018/2/7
 * Time ：21:44
 * ===================
 */
@Controller
@RequestMapping(value = "/user")
public class LoginController {

    @Autowired
    private UserJPA userJPA;

    @RequestMapping(value = "/login")
    public String login(UserEntity user, HttpServletRequest request){

        boolean flag = true;
        String result = "login_view";
        UserEntity userEntity = userJPA.findOne(new Specification<UserEntity>() {
                @Override
                public Predicate toPredicate(Root<UserEntity> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                    criteriaQuery.where(criteriaBuilder.equal(root.get("username"),user.getUsername()));
                    return null;
                }
            });
        if(userEntity == null){
            flag = false;
            //result = "用户不存在，登录失败";
        }else if(!userEntity.getPassword().equals(user.getPassword())){
            flag = false;
            //result = "用户密码不相符，登录失败";
        }

        if(flag){
            request.getSession().setAttribute("session_user",userEntity);
            result = "index";
        }

        return result;
    }
}
