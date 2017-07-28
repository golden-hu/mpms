package com.maopao.mapper.bcf;

import com.maopao.entity.bcf.BcfConfig;
import com.maopao.entity.bcf.BcfConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BcfConfigDAO {
    long countByExample(BcfConfigExample example);

    int deleteByExample(BcfConfigExample example);

    int deleteByPrimaryKey(String name);

    int insert(BcfConfig record);

    int insertSelective(BcfConfig record);

    List<BcfConfig> selectByExample(BcfConfigExample example);

    BcfConfig selectByPrimaryKey(String name);

    int updateByExampleSelective(@Param("record") BcfConfig record, @Param("example") BcfConfigExample example);

    int updateByExample(@Param("record") BcfConfig record, @Param("example") BcfConfigExample example);

    int updateByPrimaryKeySelective(BcfConfig record);

    int updateByPrimaryKey(BcfConfig record);
}