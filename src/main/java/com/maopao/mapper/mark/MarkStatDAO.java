package com.maopao.mapper.mark;

import com.maopao.entity.mark.MarkStat;
import com.maopao.entity.mark.MarkStatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarkStatDAO {
    long countByExample(MarkStatExample example);

    int deleteByExample(MarkStatExample example);

    int deleteByPrimaryKey(Long markId);

    int insert(MarkStat record);

    int insertSelective(MarkStat record);

    List<MarkStat> selectByExample(MarkStatExample example);

    MarkStat selectByPrimaryKey(Long markId);

    int updateByExampleSelective(@Param("record") MarkStat record, @Param("example") MarkStatExample example);

    int updateByExample(@Param("record") MarkStat record, @Param("example") MarkStatExample example);

    int updateByPrimaryKeySelective(MarkStat record);

    int updateByPrimaryKey(MarkStat record);
}