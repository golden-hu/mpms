package com.maopao.mapper.log;

import com.maopao.entity.log.LogApi;
import com.maopao.entity.log.LogApiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogDAO {
    long countByExample(LogApiExample example);

    int deleteByExample(LogApiExample example);

    int deleteByPrimaryKey(Long rowId);

    int insert(LogApi record);

    int insertSelective(LogApi record);

    List<LogApi> selectByExample(LogApiExample example);

    LogApi selectByPrimaryKey(Long rowId);

    int updateByExampleSelective(@Param("record") LogApi record, @Param("example") LogApiExample example);

    int updateByExample(@Param("record") LogApi record, @Param("example") LogApiExample example);

    int updateByPrimaryKeySelective(LogApi record);

    int updateByPrimaryKey(LogApi record);
}