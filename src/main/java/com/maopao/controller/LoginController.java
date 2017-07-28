package com.maopao.controller;

import com.maopao.entity.bcf.BcfUser;
import com.maopao.entity.bcf.BcfUserExample;
import com.maopao.mapper.bcf.BcfUserDAO;
import com.maopao.mapper.mapgo.UserDAO;
import com.maopao.service.HelloService;
import com.maopao.fw.web.HtResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Created by hugo on 2017/6/21.
 */
@RestController
public class LoginController {
    private Logger logger = LoggerFactory.getLogger(HelloService.class);

    @Autowired
    private UserDAO userDao;

    @Autowired
    private BcfUserDAO bcfUserDao;

    @RequestMapping("/web/login")
    public HtResponse Login(String userName,HttpSession session){
        logger.info("根据用户名登陆");

        BcfUserExample example = new BcfUserExample();
        example.createCriteria().andCnNameEqualTo(userName);
        List<BcfUser> list =bcfUserDao.selectByExample(example);
        BcfUser user = null;
        HtResponse res = this.getSuccessResponse();
        if(list !=null && list.size()>0){
            user = list.get(0);
            UUID sessionId = UUID.randomUUID();
            session.setAttribute(sessionId.toString(),user);
            res.getData().add(user);
            Map<String,String> map = new HashMap();
            map.put("sessionId",sessionId.toString());
            res.getData().add(map);
        }

        return res;

    }

    private HtResponse getSuccessResponse(){
        HtResponse htResponse = new HtResponse();
        htResponse.setRowCount("0");
        htResponse.setCode("0");
        htResponse.setMsg("Success");
        htResponse.setSuccess(true);
        return htResponse;
    }
}
