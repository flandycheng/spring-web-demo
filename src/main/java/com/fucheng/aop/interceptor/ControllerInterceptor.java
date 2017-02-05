package com.fucheng.aop.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by dell on 2017/2/5.
 */
public class ControllerInterceptor implements HandlerInterceptor {
    long inTime;

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        inTime = System.currentTimeMillis();
        System.out.println("in controller: " + request.getServletPath());
        return true;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {

        long timeGap = Math.abs(System.currentTimeMillis() - inTime);
        System.out.println("out controller: " + "{\"controllerPath\":\"" + 
                request.getServletPath() + "\",\"timeGap\":" + timeGap + "}");
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {

    }
}
