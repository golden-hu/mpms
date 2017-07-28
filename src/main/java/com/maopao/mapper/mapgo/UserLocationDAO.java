package com.maopao.mapper.mapgo;

import com.maopao.entity.mapgo.UserLocation;
import com.maopao.entity.mapgo.UserLocationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserLocationDAO {
    long countByExample(UserLocationExample example);

    int deleteByExample(UserLocationExample example);

    int deleteByPrimaryKey(Long userId);

    int insert(UserLocation record);

    int insertSelective(UserLocation record);

    List<UserLocation> selectByExample(UserLocationExample example);

    UserLocation selectByPrimaryKey(Long userId);

    int updateByExampleSelective(@Param("record") UserLocation record, @Param("example") UserLocationExample example);

    int updateByExample(@Param("record") UserLocation record, @Param("example") UserLocationExample example);

    int updateByPrimaryKeySelective(UserLocation record);

    int updateByPrimaryKey(UserLocation record);
}