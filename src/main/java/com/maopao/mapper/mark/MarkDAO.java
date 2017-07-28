package com.maopao.mapper.mark;

import com.maopao.entity.mark.Mark;
import com.maopao.entity.mark.MarkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarkDAO {
    long countByExample(MarkExample example);

    int deleteByExample(MarkExample example);

    int deleteByPrimaryKey(Long markId);

    int insert(Mark record);

    int insertSelective(Mark record);

    List<Mark> selectByExample(MarkExample example);

    Mark selectByPrimaryKey(Long markId);

    int updateByExampleSelective(@Param("record") Mark record, @Param("example") MarkExample example);

    int updateByExample(@Param("record") Mark record, @Param("example") MarkExample example);

    int updateByPrimaryKeySelective(Mark record);

    int updateByPrimaryKey(Mark record);
}