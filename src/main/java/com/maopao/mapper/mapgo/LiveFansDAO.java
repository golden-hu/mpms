package com.maopao.mapper.mapgo;

import com.maopao.entity.mapgo.LiveFans;
import com.maopao.entity.mapgo.LiveFansExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LiveFansDAO {
    long countByExample(LiveFansExample example);

    int deleteByExample(LiveFansExample example);

    int deleteByPrimaryKey(Long rowId);

    int insert(LiveFans record);

    int insertSelective(LiveFans record);

    List<LiveFans> selectByExample(LiveFansExample example);

    LiveFans selectByPrimaryKey(Long rowId);

    int updateByExampleSelective(@Param("record") LiveFans record, @Param("example") LiveFansExample example);

    int updateByExample(@Param("record") LiveFans record, @Param("example") LiveFansExample example);

    int updateByPrimaryKeySelective(LiveFans record);

    int updateByPrimaryKey(LiveFans record);
}