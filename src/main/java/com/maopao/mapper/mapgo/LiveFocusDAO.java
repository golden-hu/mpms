package com.maopao.mapper.mapgo;

import com.maopao.entity.mapgo.LiveFocus;
import com.maopao.entity.mapgo.LiveFocusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LiveFocusDAO {
    long countByExample(LiveFocusExample example);

    int deleteByExample(LiveFocusExample example);

    int deleteByPrimaryKey(Long rowId);

    int insert(LiveFocus record);

    int insertSelective(LiveFocus record);

    List<LiveFocus> selectByExample(LiveFocusExample example);

    LiveFocus selectByPrimaryKey(Long rowId);

    int updateByExampleSelective(@Param("record") LiveFocus record, @Param("example") LiveFocusExample example);

    int updateByExample(@Param("record") LiveFocus record, @Param("example") LiveFocusExample example);

    int updateByPrimaryKeySelective(LiveFocus record);

    int updateByPrimaryKey(LiveFocus record);
}