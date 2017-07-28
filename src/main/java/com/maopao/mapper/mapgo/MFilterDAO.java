package com.maopao.mapper.mapgo;

import com.maopao.entity.mapgo.Filter;
import com.maopao.entity.mapgo.FilterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MFilterDAO {
    long countByExample(FilterExample example);

    int deleteByExample(FilterExample example);

    int deleteByPrimaryKey(Long rowId);

    int insert(Filter record);

    int insertSelective(Filter record);

    List<Filter> selectByExampleWithBLOBs(FilterExample example);

    List<Filter> selectByExample(FilterExample example);

    Filter selectByPrimaryKey(Long rowId);

    int updateByExampleSelective(@Param("record") Filter record, @Param("example") FilterExample example);

    int updateByExampleWithBLOBs(@Param("record") Filter record, @Param("example") FilterExample example);

    int updateByExample(@Param("record") Filter record, @Param("example") FilterExample example);

    int updateByPrimaryKeySelective(Filter record);

    int updateByPrimaryKeyWithBLOBs(Filter record);

    int updateByPrimaryKey(Filter record);
}