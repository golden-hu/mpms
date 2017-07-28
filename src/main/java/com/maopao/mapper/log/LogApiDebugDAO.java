package com.maopao.mapper.log;

import com.maopao.entity.log.LogApiDebug30d;
import com.maopao.entity.log.LogApiDebug30dExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogApiDebugDAO {
    long countByExample(LogApiDebug30dExample example);

    int deleteByExample(LogApiDebug30dExample example);

    int deleteByPrimaryKey(Long rowId);

    int insert(LogApiDebug30d record);

    int insertSelective(LogApiDebug30d record);

    List<LogApiDebug30d> selectByExample(LogApiDebug30dExample example);

    LogApiDebug30d selectByPrimaryKey(Long rowId);

    int updateByExampleSelective(@Param("record") LogApiDebug30d record, @Param("example") LogApiDebug30dExample example);

    int updateByExample(@Param("record") LogApiDebug30d record, @Param("example") LogApiDebug30dExample example);

    int updateByPrimaryKeySelective(LogApiDebug30d record);

    int updateByPrimaryKey(LogApiDebug30d record);
}