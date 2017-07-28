package com.maopao.mapper.play;

import com.maopao.entity.play.VoteLog;
import com.maopao.entity.play.VoteLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VoteLogDAO {
    long countByExample(VoteLogExample example);

    int deleteByExample(VoteLogExample example);

    int deleteByPrimaryKey(Long rowId);

    int insert(VoteLog record);

    int insertSelective(VoteLog record);

    List<VoteLog> selectByExample(VoteLogExample example);

    VoteLog selectByPrimaryKey(Long rowId);

    int updateByExampleSelective(@Param("record") VoteLog record, @Param("example") VoteLogExample example);

    int updateByExample(@Param("record") VoteLog record, @Param("example") VoteLogExample example);

    int updateByPrimaryKeySelective(VoteLog record);

    int updateByPrimaryKey(VoteLog record);
}