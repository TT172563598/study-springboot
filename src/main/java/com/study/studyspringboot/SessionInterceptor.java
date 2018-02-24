package com.study.studyspringboot;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ===================
 * User ：TT
 * Date ：2018/2/7
 * Time ：22:21
 * ===================
 */
public class SessionInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {

        String url = request.getRequestURI();

        if (url.equals("/user/login") || url.equals("/user/login_view")) {
            return true;
        }

        //验证session是否存在
        Object obj = request.getSession().getAttribute("session_user");
        if (obj == null) {
            System.out.println(url);
            response.sendRedirect("/user/login_view");
        } else{
            return true;
        }
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
