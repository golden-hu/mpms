package com.maopao.mapper.mark;

import com.maopao.entity.mark.MarkPraise;
import com.maopao.entity.mark.MarkPraiseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarkPraiseDAO {
    long countByExample(MarkPraiseExample example);

    int deleteByExample(MarkPraiseExample example);

    int deleteByPrimaryKey(Long rowId);

    int insert(MarkPraise record);

    int insertSelective(MarkPraise record);

    List<MarkPraise> selectByExample(MarkPraiseExample example);

    MarkPraise selectByPrimaryKey(Long rowId);

    int updateByExampleSelective(@Param("record") MarkPraise record, @Param("example") MarkPraiseExample example);

    int updateByExample(@Param("record") MarkPraise record, @Param("example") MarkPraiseExample example);

    int updateByPrimaryKeySelective(MarkPraise record);

    int updateByPrimaryKey(MarkPraise record);
}