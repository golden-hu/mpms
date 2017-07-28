package com.maopao.mapper.msg;

import com.maopao.entity.msg.MsgAnchor;
import com.maopao.entity.msg.MsgAnchorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsgAnchorDAO {
    long countByExample(MsgAnchorExample example);

    int deleteByExample(MsgAnchorExample example);

    int deleteByPrimaryKey(Integer rowId);

    int insert(MsgAnchor record);

    int insertSelective(MsgAnchor record);

    List<MsgAnchor> selectByExample(MsgAnchorExample example);

    MsgAnchor selectByPrimaryKey(Integer rowId);

    int updateByExampleSelective(@Param("record") MsgAnchor record, @Param("example") MsgAnchorExample example);

    int updateByExample(@Param("record") MsgAnchor record, @Param("example") MsgAnchorExample example);

    int updateByPrimaryKeySelective(MsgAnchor record);

    int updateByPrimaryKey(MsgAnchor record);
}