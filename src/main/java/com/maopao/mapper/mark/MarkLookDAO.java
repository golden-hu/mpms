package com.maopao.mapper.mark;

import com.maopao.entity.mark.MarkLook;
import com.maopao.entity.mark.MarkLookExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarkLookDAO {
    long countByExample(MarkLookExample example);

    int deleteByExample(MarkLookExample example);

    int deleteByPrimaryKey(Long rowId);

    int insert(MarkLook record);

    int insertSelective(MarkLook record);

    List<MarkLook> selectByExample(MarkLookExample example);

    MarkLook selectByPrimaryKey(Long rowId);

    int updateByExampleSelective(@Param("record") MarkLook record, @Param("example") MarkLookExample example);

    int updateByExample(@Param("record") MarkLook record, @Param("example") MarkLookExample example);

    int updateByPrimaryKeySelective(MarkLook record);

    int updateByPrimaryKey(MarkLook record);
}