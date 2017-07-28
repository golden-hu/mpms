package com.maopao.mapper.mapgo;

import com.maopao.entity.mapgo.UserStat;
import com.maopao.entity.mapgo.UserStatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserStatDAO {
    long countByExample(UserStatExample example);

    int deleteByExample(UserStatExample example);

    int deleteByPrimaryKey(Long userId);

    int insert(UserStat record);

    int insertSelective(UserStat record);

    List<UserStat> selectByExample(UserStatExample example);

    UserStat selectByPrimaryKey(Long userId);

    int updateByExampleSelective(@Param("record") UserStat record, @Param("example") UserStatExample example);

    int updateByExample(@Param("record") UserStat record, @Param("example") UserStatExample example);

    int updateByPrimaryKeySelective(UserStat record);

    int updateByPrimaryKey(UserStat record);
}