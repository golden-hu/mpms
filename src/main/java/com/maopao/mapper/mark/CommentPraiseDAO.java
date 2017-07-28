package com.maopao.mapper.mark;

import com.maopao.entity.mark.CommentPraise;
import com.maopao.entity.mark.CommentPraiseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommentPraiseDAO {
    long countByExample(CommentPraiseExample example);

    int deleteByExample(CommentPraiseExample example);

    int deleteByPrimaryKey(Long rowId);

    int insert(CommentPraise record);

    int insertSelective(CommentPraise record);

    List<CommentPraise> selectByExample(CommentPraiseExample example);

    CommentPraise selectByPrimaryKey(Long rowId);

    int updateByExampleSelective(@Param("record") CommentPraise record, @Param("example") CommentPraiseExample example);

    int updateByExample(@Param("record") CommentPraise record, @Param("example") CommentPraiseExample example);

    int updateByPrimaryKeySelective(CommentPraise record);

    int updateByPrimaryKey(CommentPraise record);
}