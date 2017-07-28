package com.maopao.mapper.mapgo;

import com.maopao.entity.mapgo.App;
import com.maopao.entity.mapgo.AppExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IAppDAO {
    long countByExample(AppExample example);

    int deleteByExample(AppExample example);

    int deleteByPrimaryKey(Integer appId);

    int insert(App record);

    int insertSelective(App record);

    List<App> selectByExample(AppExample example);

    App selectByPrimaryKey(Integer appId);

    int updateByExampleSelective(@Param("record") App record, @Param("example") AppExample example);

    int updateByExample(@Param("record") App record, @Param("example") AppExample example);

    int updateByPrimaryKeySelective(App record);

    int updateByPrimaryKey(App record);
}