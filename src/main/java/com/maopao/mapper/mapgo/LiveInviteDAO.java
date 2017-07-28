package com.maopao.mapper.mapgo;

import com.maopao.entity.mapgo.LiveInvite;
import com.maopao.entity.mapgo.LiveInviteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LiveInviteDAO {
    long countByExample(LiveInviteExample example);

    int deleteByExample(LiveInviteExample example);

    int deleteByPrimaryKey(Long rowId);

    int insert(LiveInvite record);

    int insertSelective(LiveInvite record);

    List<LiveInvite> selectByExample(LiveInviteExample example);

    LiveInvite selectByPrimaryKey(Long rowId);

    int updateByExampleSelective(@Param("record") LiveInvite record, @Param("example") LiveInviteExample example);

    int updateByExample(@Param("record") LiveInvite record, @Param("example") LiveInviteExample example);

    int updateByPrimaryKeySelective(LiveInvite record);

    int updateByPrimaryKey(LiveInvite record);
}