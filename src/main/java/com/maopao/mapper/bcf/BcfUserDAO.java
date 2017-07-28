package com.maopao.mapper.bcf;

import com.maopao.entity.bcf.BcfUser;
import com.maopao.entity.bcf.BcfUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BcfUserDAO {
    long countByExample(BcfUserExample example);

    int deleteByExample(BcfUserExample example);

    int deleteByPrimaryKey(Integer puid);

    int insert(BcfUser record);

    int insertSelective(BcfUser record);

    List<BcfUser> selectByExample(BcfUserExample example);

    BcfUser selectByPrimaryKey(Integer puid);

    int updateByExampleSelective(@Param("record") BcfUser record, @Param("example") BcfUserExample example);

    int updateByExample(@Param("record") BcfUser record, @Param("example") BcfUserExample example);

    int updateByPrimaryKeySelective(BcfUser record);

    int updateByPrimaryKey(BcfUser record);
}