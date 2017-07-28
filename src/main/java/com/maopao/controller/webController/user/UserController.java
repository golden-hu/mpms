package com.maopao.controller.webController.user;

import com.maopao.entity.bcf.BcfUser;
import com.maopao.entity.mapgo.User;
import com.maopao.mapper.mapgo.UserDAO;
import com.maopao.service.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * Created by hugo on 2017/6/21.
 * 访问地址:localhost:8080/web/getUser
 */
@RestController
public class UserController {
    private Logger logger = LoggerFactory.getLogger(HelloService.class);

    @Autowired
    private UserDAO userDao;

    @RequestMapping("/webapi/getUser")
    @Cacheable(value="User")
    public User getUserById(Long id){
        logger.info("===>spring boot Get Request GetUser");
        User user = userDao.selectByPrimaryKey(id);
        return user;

    }

    @RequestMapping("/webapi/getSessionUser")
    public BcfUser getSessionUser(String sessionId,HttpSession session){
        logger.info("测试从缓存中获取Session");
        BcfUser user =(BcfUser) session.getAttribute(sessionId);
        return user;

    }
}
