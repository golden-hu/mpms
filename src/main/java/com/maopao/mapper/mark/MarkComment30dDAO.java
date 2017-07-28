package com.maopao.mapper.mark;

import com.maopao.entity.mark.MarkComment;
import com.maopao.entity.mark.MarkCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarkComment30dDAO {
    long countByExample(MarkCommentExample example);

    int deleteByExample(MarkCommentExample example);

    int deleteByPrimaryKey(Long coId);

    int insert(MarkComment record);

    int insertSelective(MarkComment record);

    List<MarkComment> selectByExample(MarkCommentExample example);

    MarkComment selectByPrimaryKey(Long coId);

    int updateByExampleSelective(@Param("record") MarkComment record, @Param("example") MarkCommentExample example);

    int updateByExample(@Param("record") MarkComment record, @Param("example") MarkCommentExample example);

    int updateByPrimaryKeySelective(MarkComment record);

    int updateByPrimaryKey(MarkComment record);
}