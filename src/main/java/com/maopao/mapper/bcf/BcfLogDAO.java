package com.maopao.mapper.bcf;

import com.maopao.entity.bcf.BcfLog;
import com.maopao.entity.bcf.BcfLogExample;
import com.maopao.entity.bcf.BcfLogWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BcfLogDAO {
    long countByExample(BcfLogExample example);

    int deleteByExample(BcfLogExample example);

    int deleteByPrimaryKey(Integer lgid);

    int insert(BcfLogWithBLOBs record);

    int insertSelective(BcfLogWithBLOBs record);

    List<BcfLogWithBLOBs> selectByExampleWithBLOBs(BcfLogExample example);

    List<BcfLog> selectByExample(BcfLogExample example);

    BcfLogWithBLOBs selectByPrimaryKey(Integer lgid);

    int updateByExampleSelective(@Param("record") BcfLogWithBLOBs record, @Param("example") BcfLogExample example);

    int updateByExampleWithBLOBs(@Param("record") BcfLogWithBLOBs record, @Param("example") BcfLogExample example);

    int updateByExample(@Param("record") BcfLog record, @Param("example") BcfLogExample example);

    int updateByPrimaryKeySelective(BcfLogWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(BcfLogWithBLOBs record);

    int updateByPrimaryKey(BcfLog record);
}