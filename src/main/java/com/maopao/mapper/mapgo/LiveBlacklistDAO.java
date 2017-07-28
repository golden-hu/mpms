package com.maopao.mapper.mapgo;

import com.maopao.entity.mapgo.LiveBlacklist;
import com.maopao.entity.mapgo.LiveBlacklistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LiveBlacklistDAO {
    long countByExample(LiveBlacklistExample example);

    int deleteByExample(LiveBlacklistExample example);

    int deleteByPrimaryKey(Long rowId);

    int insert(LiveBlacklist record);

    int insertSelective(LiveBlacklist record);

    List<LiveBlacklist> selectByExample(LiveBlacklistExample example);

    LiveBlacklist selectByPrimaryKey(Long rowId);

    int updateByExampleSelective(@Param("record") LiveBlacklist record, @Param("example") LiveBlacklistExample example);

    int updateByExample(@Param("record") LiveBlacklist record, @Param("example") LiveBlacklistExample example);

    int updateByPrimaryKeySelective(LiveBlacklist record);

    int updateByPrimaryKey(LiveBlacklist record);
}