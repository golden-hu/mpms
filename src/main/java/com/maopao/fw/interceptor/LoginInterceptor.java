package com.maopao.fw.interceptor;


import com.maopao.entity.bcf.BcfUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by hugo on 2017/6/21.
 */
@Component
public class LoginInterceptor extends HandlerInterceptorAdapter {
    Logger logger = LoggerFactory.getLogger(LoginInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.debug("this is from LoginInterceptor");
        logger.info("this is from LoginInterceptor");
        boolean isLogin = handlerSession(request);
        if(!isLogin){
            //response.sendRedirect("/login.html");
            response.setContentType("application/json");
            response.getWriter().write("{code:-1;msg:'未登录',success:false}");
            return false;
        }
        return true;
    }

    public boolean handlerSession(HttpServletRequest request){
        //String sessionId = request.getHeader("sessionId");
        String sessionId= request.getParameter("sessionId");
        HttpSession session = request.getSession();
        BcfUser user = (BcfUser) session.getAttribute(sessionId);
        if(user !=null){
            logger.info("在Session中找到用户信息");
            return true;
        }
        logger.info("没有在Session中找到用户信息");
        return false;

    }
}
