package com.maopao.mapper.bcf;

import com.maopao.entity.bcf.StatBaseTotal;
import com.maopao.entity.bcf.StatBaseTotalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StatBaseTotalDAO {
    long countByExample(StatBaseTotalExample example);

    int deleteByExample(StatBaseTotalExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StatBaseTotal record);

    int insertSelective(StatBaseTotal record);

    List<StatBaseTotal> selectByExample(StatBaseTotalExample example);

    StatBaseTotal selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StatBaseTotal record, @Param("example") StatBaseTotalExample example);

    int updateByExample(@Param("record") StatBaseTotal record, @Param("example") StatBaseTotalExample example);

    int updateByPrimaryKeySelective(StatBaseTotal record);

    int updateByPrimaryKey(StatBaseTotal record);
}