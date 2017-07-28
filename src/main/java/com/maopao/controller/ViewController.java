package com.maopao.controller;

import org.apache.logging.log4j.LogManager;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by hugo on 2017/6/9.
 */
@Controller
public class ViewController {
    private org.apache.logging.log4j.Logger logger = LogManager.getLogger("mylog");


    @RequestMapping(value = "/view",method = RequestMethod.GET)
    public String View(Model model){
        model.addAttribute("name", "Dear");
        logger.info("view:Dear");
        return "view";
    }
}
