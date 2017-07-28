package com.maopao.mapper.mark;

import com.maopao.entity.mark.Theme;
import com.maopao.entity.mark.ThemeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ThemeDAO {
    long countByExample(ThemeExample example);

    int deleteByExample(ThemeExample example);

    int deleteByPrimaryKey(Long rowId);

    int insert(Theme record);

    int insertSelective(Theme record);

    List<Theme> selectByExample(ThemeExample example);

    Theme selectByPrimaryKey(Long rowId);

    int updateByExampleSelective(@Param("record") Theme record, @Param("example") ThemeExample example);

    int updateByExample(@Param("record") Theme record, @Param("example") ThemeExample example);

    int updateByPrimaryKeySelective(Theme record);

    int updateByPrimaryKey(Theme record);
}