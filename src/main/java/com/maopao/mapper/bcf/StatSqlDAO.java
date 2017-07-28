package com.maopao.mapper.bcf;

import com.maopao.entity.bcf.StatSql;
import com.maopao.entity.bcf.StatSqlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StatSqlDAO {
    long countByExample(StatSqlExample example);

    int deleteByExample(StatSqlExample example);

    int deleteByPrimaryKey(Integer rowId);

    int insert(StatSql record);

    int insertSelective(StatSql record);

    List<StatSql> selectByExample(StatSqlExample example);

    StatSql selectByPrimaryKey(Integer rowId);

    int updateByExampleSelective(@Param("record") StatSql record, @Param("example") StatSqlExample example);

    int updateByExample(@Param("record") StatSql record, @Param("example") StatSqlExample example);

    int updateByPrimaryKeySelective(StatSql record);

    int updateByPrimaryKey(StatSql record);
}