package com.maopao.mapper.log;

import com.maopao.entity.log.StatUserState;
import com.maopao.entity.log.StatUserStateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StatUserStateDAO {
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