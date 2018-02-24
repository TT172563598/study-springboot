package com.study.studyspringboot.jpa;


import com.study.studyspringboot.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/**
 * ===================
 * User ：TT
 * Date ：2018/2/7
 * Time ：17:12
 * ===================
 */
    public interface UserJPA extends
        JpaRepository<UserEntity,Long>,
        JpaSpecificationExecutor<UserEntity>,
        Serializable
{
}
