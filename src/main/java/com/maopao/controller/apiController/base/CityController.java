package com.maopao.controller.apiController.base;

import com.maopao.entity.mapgo.City;
import com.maopao.entity.mapgo.CityExample;
import com.maopao.mapper.mapgo.ICityDAO;
import com.maopao.fw.web.HtResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by hugo on 2017/6/16.
 * 访问路径:localhost:8080/API/?
 */
@RestController
public class CityController {

    private Logger logger = LogManager.getLogger("mylog");

    @Autowired
    private ICityDAO cityDao;

    @RequestMapping("/CMD/getCity")
    @Cacheable(value="City")
    public HtResponse getCity(){
        HtResponse res = this.getSuccessResponse();
        CityExample example = new CityExample();
        example.setOffset(20);
        List<City> list = cityDao.selectByExample(example);
        res.getData().addAll(list);

        return res;

    }

    @RequestMapping("/CMD/getCityByCode")
    @Cacheable(value="City")
    public HtResponse getCityByCode(Integer Code){
        HtResponse res = this.getSuccessResponse();
        CityExample example = new CityExample();
        example.createCriteria().andCodeEqualTo(Code);
        example.setOffset(20);
        List<City> list = cityDao.selectByExample(example);
        res.getData().addAll(list);

        return res;

    }

    @RequestMapping("/api/testLog")
    public String testLog(String name){
        logger.info("name:" + name);
        logger.info("testLog");
        logger.error("testLog");
        logger.debug("testLog");
        logger.warn("testLog");

        return "sssss";
    }

    private HtResponse getSuccessResponse(){
        HtResponse htResponse = new HtResponse();
        htResponse.setRowCount("0");
        htResponse.setCode("0");
        htResponse.setMsg("Success");
        return htResponse;
    }
}
