package com.maopao.mapper.msg;

import com.maopao.entity.msg.CommentPraiseLog;
import com.maopao.entity.msg.CommentPraiseLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommentPraiseLogDAO {
    long countByExample(CommentPraiseLogExample example);

    int deleteByExample(CommentPraiseLogExample example);

    int deleteByPrimaryKey(Long rowId);

    int insert(CommentPraiseLog record);

    int insertSelective(CommentPraiseLog record);

    List<CommentPraiseLog> selectByExample(CommentPraiseLogExample example);

    CommentPraiseLog selectByPrimaryKey(Long rowId);

    int updateByExampleSelective(@Param("record") CommentPraiseLog record, @Param("example") CommentPraiseLogExample example);

    int updateByExample(@Param("record") CommentPraiseLog record, @Param("example") CommentPraiseLogExample example);

    int updateByPrimaryKeySelective(CommentPraiseLog record);

    int updateByPrimaryKey(CommentPraiseLog record);
}