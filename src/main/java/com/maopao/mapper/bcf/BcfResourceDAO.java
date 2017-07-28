package com.maopao.mapper.bcf;

import com.maopao.entity.bcf.BcfResource;
import com.maopao.entity.bcf.BcfResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BcfResourceDAO {
    long countByExample(BcfResourceExample example);

    int deleteByExample(BcfResourceExample example);

    int deleteByPrimaryKey(Integer rsid);

    int insert(BcfResource record);

    int insertSelective(BcfResource record);

    List<BcfResource> selectByExample(BcfResourceExample example);

    BcfResource selectByPrimaryKey(Integer rsid);

    int updateByExampleSelective(@Param("record") BcfResource record, @Param("example") BcfResourceExample example);

    int updateByExample(@Param("record") BcfResource record, @Param("example") BcfResourceExample example);

    int updateByPrimaryKeySelective(BcfResource record);

    int updateByPrimaryKey(BcfResource record);
}