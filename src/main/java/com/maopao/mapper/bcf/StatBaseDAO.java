package com.maopao.mapper.bcf;

import com.maopao.entity.bcf.StatBase;
import com.maopao.entity.bcf.StatBaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StatBaseDAO {
    long countByExample(StatBaseExample example);

    int deleteByExample(StatBaseExample example);

    int deleteByPrimaryKey(Integer statisProId);

    int insert(StatBase record);

    int insertSelective(StatBase record);

    List<StatBase> selectByExample(StatBaseExample example);

    StatBase selectByPrimaryKey(Integer statisProId);

    int updateByExampleSelective(@Param("record") StatBase record, @Param("example") StatBaseExample example);

    int updateByExample(@Param("record") StatBase record, @Param("example") StatBaseExample example);

    int updateByPrimaryKeySelective(StatBase record);

    int updateByPrimaryKey(StatBase record);
}