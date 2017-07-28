package com.maopao.mapper.bcf;

import com.maopao.entity.bcf.BcfGroup;
import com.maopao.entity.bcf.BcfGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BcfGroupDAO {
    long countByExample(BcfGroupExample example);

    int deleteByExample(BcfGroupExample example);

    int deleteByPrimaryKey(Integer pgid);

    int insert(BcfGroup record);

    int insertSelective(BcfGroup record);

    List<BcfGroup> selectByExample(BcfGroupExample example);

    BcfGroup selectByPrimaryKey(Integer pgid);

    int updateByExampleSelective(@Param("record") BcfGroup record, @Param("example") BcfGroupExample example);

    int updateByExample(@Param("record") BcfGroup record, @Param("example") BcfGroupExample example);

    int updateByPrimaryKeySelective(BcfGroup record);

    int updateByPrimaryKey(BcfGroup record);
}