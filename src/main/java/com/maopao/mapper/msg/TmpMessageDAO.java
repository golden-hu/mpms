package com.maopao.mapper.msg;

import com.maopao.entity.msg.TmpMessage;
import com.maopao.entity.msg.TmpMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TmpMessageDAO {
    long countByExample(TmpMessageExample example);

    int deleteByExample(TmpMessageExample example);

    int deleteByPrimaryKey(Integer rowId);

    int insert(TmpMessage record);

    int insertSelective(TmpMessage record);

    List<TmpMessage> selectByExample(TmpMessageExample example);

    TmpMessage selectByPrimaryKey(Integer rowId);

    int updateByExampleSelective(@Param("record") TmpMessage record, @Param("example") TmpMessageExample example);

    int updateByExample(@Param("record") TmpMessage record, @Param("example") TmpMessageExample example);

    int updateByPrimaryKeySelective(TmpMessage record);

    int updateByPrimaryKey(TmpMessage record);
}