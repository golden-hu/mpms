package com.maopao.mapper.msg;

import com.maopao.entity.msg.MsgAnchorAn;
import com.maopao.entity.msg.MsgAnchorAnExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsgAnchorAnDAO {
    long countByExample(MsgAnchorAnExample example);

    int deleteByExample(MsgAnchorAnExample example);

    int deleteByPrimaryKey(Integer rowId);

    int insert(MsgAnchorAn record);

    int insertSelective(MsgAnchorAn record);

    List<MsgAnchorAn> selectByExample(MsgAnchorAnExample example);

    MsgAnchorAn selectByPrimaryKey(Integer rowId);

    int updateByExampleSelective(@Param("record") MsgAnchorAn record, @Param("example") MsgAnchorAnExample example);

    int updateByExample(@Param("record") MsgAnchorAn record, @Param("example") MsgAnchorAnExample example);

    int updateByPrimaryKeySelective(MsgAnchorAn record);

    int updateByPrimaryKey(MsgAnchorAn record);
}