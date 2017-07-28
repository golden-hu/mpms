package com.maopao.mapper.mapgo;

import com.maopao.entity.mapgo.UserState;
import com.maopao.entity.mapgo.UserStateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserStateDAO {
    long countByExample(UserStateExample example);

    int deleteByExample(UserStateExample example);

    int deleteByPrimaryKey(Long userId);

    int insert(UserState record);

    int insertSelective(UserState record);

    List<UserState> selectByExample(UserStateExample example);

    UserState selectByPrimaryKey(Long userId);

    int updateByExampleSelective(@Param("record") UserState record, @Param("example") UserStateExample example);

    int updateByExample(@Param("record") UserState record, @Param("example") UserStateExample example);

    int updateByPrimaryKeySelective(UserState record);

    int updateByPrimaryKey(UserState record);
}