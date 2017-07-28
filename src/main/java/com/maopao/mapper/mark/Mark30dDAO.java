package com.maopao.mapper.mark;

import com.maopao.entity.mark.Mark30d;
import com.maopao.entity.mark.Mark30dExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Mark30dDAO {
    long countByExample(Mark30dExample example);

    int deleteByExample(Mark30dExample example);

    int deleteByPrimaryKey(Long markId);

    int insert(Mark30d record);

    int insertSelective(Mark30d record);

    List<Mark30d> selectByExample(Mark30dExample example);

    Mark30d selectByPrimaryKey(Long markId);

    int updateByExampleSelective(@Param("record") Mark30d record, @Param("example") Mark30dExample example);

    int updateByExample(@Param("record") Mark30d record, @Param("example") Mark30dExample example);

    int updateByPrimaryKeySelective(Mark30d record);

    int updateByPrimaryKey(Mark30d record);
}