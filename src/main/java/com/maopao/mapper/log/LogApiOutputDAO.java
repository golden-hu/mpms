package com.maopao.mapper.log;

import com.maopao.entity.log.LogApiOutput30d;
import com.maopao.entity.log.LogApiOutput30dExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogApiOutputDAO {
    long countByExample(LogApiOutput30dExample example);

    int deleteByExample(LogApiOutput30dExample example);

    int deleteByPrimaryKey(Long rowId);

    int insert(LogApiOutput30d record);

    int insertSelective(LogApiOutput30d record);

    List<LogApiOutput30d> selectByExample(LogApiOutput30dExample example);

    LogApiOutput30d selectByPrimaryKey(Long rowId);

    int updateByExampleSelective(@Param("record") LogApiOutput30d record, @Param("example") LogApiOutput30dExample example);

    int updateByExample(@Param("record") LogApiOutput30d record, @Param("example") LogApiOutput30dExample example);

    int updateByPrimaryKeySelective(LogApiOutput30d record);

    int updateByPrimaryKey(LogApiOutput30d record);
}