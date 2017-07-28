package com.maopao.mapper.mapgo;

import com.maopao.entity.mapgo.BlockLog;
import com.maopao.entity.mapgo.BlockLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IBlockLogDAO {
    long countByExample(BlockLogExample example);

    int deleteByExample(BlockLogExample example);

    int deleteByPrimaryKey(Long rowId);

    int insert(BlockLog record);

    int insertSelective(BlockLog record);

    List<BlockLog> selectByExample(BlockLogExample example);

    BlockLog selectByPrimaryKey(Long rowId);

    int updateByExampleSelective(@Param("record") BlockLog record, @Param("example") BlockLogExample example);

    int updateByExample(@Param("record") BlockLog record, @Param("example") BlockLogExample example);

    int updateByPrimaryKeySelective(BlockLog record);

    int updateByPrimaryKey(BlockLog record);
}