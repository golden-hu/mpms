package com.maopao.controller;


import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Created by hugo on 2017/6/8.
 */
@Controller
public class HelloController {

    //private Logger logger = LoggerFactory.getLogger(HelloController.class);
    private Logger logger = LogManager.getLogger("mylog");

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String Hello(Model model){
        model.addAttribute("name", "Dear");
        logger.info("hello world");
        return "hello";
    }


}
