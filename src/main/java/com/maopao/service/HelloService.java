package com.maopao.service;


import com.maopao.entity.mapgo.User;
import com.maopao.mapper.mapgo.UserDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.UUID;

/**
 * Created by hugo on 2017/6/9.
 */
@RestController
public class HelloService {
    private Logger logger = LoggerFactory.getLogger(HelloService.class);

    @Autowired
    private UserDAO userDao;

    @RequestMapping("/api/hello")
    public String index() {
        return "Hello World";
    }



    @RequestMapping("/uid")
    public String uid(HttpSession session){
        UUID uid = (UUID) session.getAttribute("uid");
        if(uid == null){
            logger.info("uid is null");
            uid = UUID.randomUUID();
        }



        session.setAttribute("uid",uid);
        logger.info("uid: "+uid);
        return session.getId();
    }

}
