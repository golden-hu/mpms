package com.maopao.mapper.mark;

import com.maopao.entity.mark.MarkTopic;
import com.maopao.entity.mark.MarkTopicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarkTopicDAO {
    long countByExample(MarkTopicExample example);

    int deleteByExample(MarkTopicExample example);

    int deleteByPrimaryKey(Long rowId);

    int insert(MarkTopic record);

    int insertSelective(MarkTopic record);

    List<MarkTopic> selectByExample(MarkTopicExample example);

    MarkTopic selectByPrimaryKey(Long rowId);

    int updateByExampleSelective(@Param("record") MarkTopic record, @Param("example") MarkTopicExample example);

    int updateByExample(@Param("record") MarkTopic record, @Param("example") MarkTopicExample example);

    int updateByPrimaryKeySelective(MarkTopic record);

    int updateByPrimaryKey(MarkTopic record);
}