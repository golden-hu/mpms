package com.maopao.mapper.mapgo;

import com.maopao.entity.mapgo.City;
import com.maopao.entity.mapgo.CityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ICityDAO {
    long countByExample(CityExample example);

    int deleteByExample(CityExample example);

    int deleteByPrimaryKey(Long cityId);

    int insert(City record);

    int insertSelective(City record);

    List<City> selectByExample(CityExample example);

    List<City> findAll();

    City selectByPrimaryKey(Long cityId);

    int updateByExampleSelective(@Param("record") City record, @Param("example") CityExample example);

    int updateByExample(@Param("record") City record, @Param("example") CityExample example);

    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey(City record);
}