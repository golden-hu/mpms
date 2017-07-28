package com.maopao.mapper.bcf;

import com.maopao.entity.bcf.BcfUserLinked;
import com.maopao.entity.bcf.BcfUserLinkedExample;
import com.maopao.entity.bcf.BcfUserLinkedKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BcfUserLinkedDAO {
    long countByExample(BcfUserLinkedExample example);

    int deleteByExample(BcfUserLinkedExample example);

    int deleteByPrimaryKey(BcfUserLinkedKey key);

    int insert(BcfUserLinked record);

    int insertSelective(BcfUserLinked record);

    List<BcfUserLinked> selectByExample(BcfUserLinkedExample example);

    BcfUserLinked selectByPrimaryKey(BcfUserLinkedKey key);

    int updateByExampleSelective(@Param("record") BcfUserLinked record, @Param("example") BcfUserLinkedExample example);

    int updateByExample(@Param("record") BcfUserLinked record, @Param("example") BcfUserLinkedExample example);

    int updateByPrimaryKeySelective(BcfUserLinked record);

    int updateByPrimaryKey(BcfUserLinked record);
}