package com.maopao.mapper.mapgo;

import com.maopao.entity.mapgo.CityFull;
import com.maopao.entity.mapgo.CityFullExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ICityFullDAO {
    long countByExample(CityFullExample example);

    int deleteByExample(CityFullExample example);

    int deleteByPrimaryKey(Long cityId);

    int insert(CityFull record);

    int insertSelective(CityFull record);

    List<CityFull> selectByExample(CityFullExample example);

    CityFull selectByPrimaryKey(Long cityId);

    int updateByExampleSelective(@Param("record") CityFull record, @Param("example") CityFullExample example);

    int updateByExample(@Param("record") CityFull record, @Param("example") CityFullExample example);

    int updateByPrimaryKeySelective(CityFull record);

    int updateByPrimaryKey(CityFull record);
}