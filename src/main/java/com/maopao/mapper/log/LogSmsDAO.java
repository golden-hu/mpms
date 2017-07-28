package com.maopao.mapper.log;

import com.maopao.entity.log.LogSms;
import com.maopao.entity.log.LogSmsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogSmsDAO {
    long countByExample(LogSmsExample example);

    int deleteByExample(LogSmsExample example);

    int deleteByPrimaryKey(Long rowId);

    int insert(LogSms record);

    int insertSelective(LogSms record);

    List<LogSms> selectByExample(LogSmsExample example);

    LogSms selectByPrimaryKey(Long rowId);

    int updateByExampleSelective(@Param("record") LogSms record, @Param("example") LogSmsExample example);

    int updateByExample(@Param("record") LogSms record, @Param("example") LogSmsExample example);

    int updateByPrimaryKeySelective(LogSms record);

    int updateByPrimaryKey(LogSms record);
}