package com.maopao.mapper.bcf;

import com.maopao.entity.bcf.BcfOpsx;
import com.maopao.entity.bcf.BcfOpsxExample;
import com.maopao.entity.bcf.BcfOpsxKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BcfOpsxDAO {
    long countByExample(BcfOpsxExample example);

    int deleteByExample(BcfOpsxExample example);

    int deleteByPrimaryKey(BcfOpsxKey key);

    int insert(BcfOpsx record);

    int insertSelective(BcfOpsx record);

    List<BcfOpsx> selectByExampleWithBLOBs(BcfOpsxExample example);

    List<BcfOpsx> selectByExample(BcfOpsxExample example);

    BcfOpsx selectByPrimaryKey(BcfOpsxKey key);

    int updateByExampleSelective(@Param("record") BcfOpsx record, @Param("example") BcfOpsxExample example);

    int updateByExampleWithBLOBs(@Param("record") BcfOpsx record, @Param("example") BcfOpsxExample example);

    int updateByExample(@Param("record") BcfOpsx record, @Param("example") BcfOpsxExample example);

    int updateByPrimaryKeySelective(BcfOpsx record);

    int updateByPrimaryKeyWithBLOBs(BcfOpsx record);

    int updateByPrimaryKey(BcfOpsx record);
}