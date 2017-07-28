package com.maopao.mapper.bcf;

import com.maopao.entity.bcf.StatCity;
import com.maopao.entity.bcf.StatCityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StatCityDAO {
    long countByExample(StatCityExample example);

    int deleteByExample(StatCityExample example);

    int deleteByPrimaryKey(Integer rowId);

    int insert(StatCity record);

    int insertSelective(StatCity record);

    List<StatCity> selectByExample(StatCityExample example);

    StatCity selectByPrimaryKey(Integer rowId);

    int updateByExampleSelective(@Param("record") StatCity record, @Param("example") StatCityExample example);

    int updateByExample(@Param("record") StatCity record, @Param("example") StatCityExample example);

    int updateByPrimaryKeySelective(StatCity record);

    int updateByPrimaryKey(StatCity record);
}