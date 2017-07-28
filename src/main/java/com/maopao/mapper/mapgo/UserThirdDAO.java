package com.maopao.mapper.mapgo;

import com.maopao.entity.mapgo.UserThird;
import com.maopao.entity.mapgo.UserThirdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserThirdDAO {
    long countByExample(UserThirdExample example);

    int deleteByExample(UserThirdExample example);

    int deleteByPrimaryKey(Long rowId);

    int insert(UserThird record);

    int insertSelective(UserThird record);

    List<UserThird> selectByExample(UserThirdExample example);

    UserThird selectByPrimaryKey(Long rowId);

    int updateByExampleSelective(@Param("record") UserThird record, @Param("example") UserThirdExample example);

    int updateByExample(@Param("record") UserThird record, @Param("example") UserThirdExample example);

    int updateByPrimaryKeySelective(UserThird record);

    int updateByPrimaryKey(UserThird record);
}