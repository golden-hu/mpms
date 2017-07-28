package com.maopao.mapper.mapgo;

import com.maopao.entity.mapgo.StatUserState;
import com.maopao.entity.mapgo.StatUserStateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SUserStateDAO {
    long countByExample(StatUserStateExample example);

    int deleteByExample(StatUserStateExample example);

    int deleteByPrimaryKey(Long userId);

    int insert(StatUserState record);

    int insertSelective(StatUserState record);

    List<StatUserState> selectByExample(StatUserStateExample example);

    StatUserState selectByPrimaryKey(Long userId);

    int updateByExampleSelective(@Param("record") StatUserState record, @Param("example") StatUserStateExample example);

    int updateByExample(@Param("record") StatUserState record, @Param("example") StatUserStateExample example);

    int updateByPrimaryKeySelective(StatUserState record);

    int updateByPrimaryKey(StatUserState record);
}