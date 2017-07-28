package com.maopao.mapper.log;

import com.maopao.entity.log.LogApiError30d;
import com.maopao.entity.log.LogApiError30dExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogApiErrorDAO {
    long countByExample(LogApiError30dExample example);

    int deleteByExample(LogApiError30dExample example);

    int deleteByPrimaryKey(Long rowId);

    int insert(LogApiError30d record);

    int insertSelective(LogApiError30d record);

    List<LogApiError30d> selectByExample(LogApiError30dExample example);

    LogApiError30d selectByPrimaryKey(Long rowId);

    int updateByExampleSelective(@Param("record") LogApiError30d record, @Param("example") LogApiError30dExample example);

    int updateByExample(@Param("record") LogApiError30d record, @Param("example") LogApiError30dExample example);

    int updateByPrimaryKeySelective(LogApiError30d record);

    int updateByPrimaryKey(LogApiError30d record);
}