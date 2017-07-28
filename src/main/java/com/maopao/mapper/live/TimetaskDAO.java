package com.maopao.mapper.live;

import com.maopao.entity.live.Timetask;
import com.maopao.entity.live.TimetaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TimetaskDAO {
    long countByExample(TimetaskExample example);

    int deleteByExample(TimetaskExample example);

    int deleteByPrimaryKey(Integer rowId);

    int insert(Timetask record);

    int insertSelective(Timetask record);

    List<Timetask> selectByExample(TimetaskExample example);

    Timetask selectByPrimaryKey(Integer rowId);

    int updateByExampleSelective(@Param("record") Timetask record, @Param("example") TimetaskExample example);

    int updateByExample(@Param("record") Timetask record, @Param("example") TimetaskExample example);

    int updateByPrimaryKeySelective(Timetask record);

    int updateByPrimaryKey(Timetask record);
}