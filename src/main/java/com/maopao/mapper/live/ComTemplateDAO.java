package com.maopao.mapper.live;

import com.maopao.entity.live.ComTemplate;
import com.maopao.entity.live.ComTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComTemplateDAO {
    long countByExample(ComTemplateExample example);

    int deleteByExample(ComTemplateExample example);

    int deleteByPrimaryKey(Integer rowId);

    int insert(ComTemplate record);

    int insertSelective(ComTemplate record);

    List<ComTemplate> selectByExample(ComTemplateExample example);

    ComTemplate selectByPrimaryKey(Integer rowId);

    int updateByExampleSelective(@Param("record") ComTemplate record, @Param("example") ComTemplateExample example);

    int updateByExample(@Param("record") ComTemplate record, @Param("example") ComTemplateExample example);

    int updateByPrimaryKeySelective(ComTemplate record);

    int updateByPrimaryKey(ComTemplate record);
}