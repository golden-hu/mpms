package com.maopao.mapper.bcf;

import com.maopao.entity.bcf.BcfResourceLinked;
import com.maopao.entity.bcf.BcfResourceLinkedExample;
import com.maopao.entity.bcf.BcfResourceLinkedKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BcfResourceLinkedDAO {
    long countByExample(BcfResourceLinkedExample example);

    int deleteByExample(BcfResourceLinkedExample example);

    int deleteByPrimaryKey(BcfResourceLinkedKey key);

    int insert(BcfResourceLinked record);

    int insertSelective(BcfResourceLinked record);

    List<BcfResourceLinked> selectByExample(BcfResourceLinkedExample example);

    BcfResourceLinked selectByPrimaryKey(BcfResourceLinkedKey key);

    int updateByExampleSelective(@Param("record") BcfResourceLinked record, @Param("example") BcfResourceLinkedExample example);

    int updateByExample(@Param("record") BcfResourceLinked record, @Param("example") BcfResourceLinkedExample example);

    int updateByPrimaryKeySelective(BcfResourceLinked record);

    int updateByPrimaryKey(BcfResourceLinked record);
}