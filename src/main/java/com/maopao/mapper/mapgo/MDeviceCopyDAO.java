package com.maopao.mapper.mapgo;

import com.maopao.entity.mapgo.DeviceCopy;
import com.maopao.entity.mapgo.DeviceCopyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MDeviceCopyDAO {
    long countByExample(DeviceCopyExample example);

    int deleteByExample(DeviceCopyExample example);

    int deleteByPrimaryKey(Integer deviceId);

    int insert(DeviceCopy record);

    int insertSelective(DeviceCopy record);

    List<DeviceCopy> selectByExample(DeviceCopyExample example);

    DeviceCopy selectByPrimaryKey(Integer deviceId);

    int updateByExampleSelective(@Param("record") DeviceCopy record, @Param("example") DeviceCopyExample example);

    int updateByExample(@Param("record") DeviceCopy record, @Param("example") DeviceCopyExample example);

    int updateByPrimaryKeySelective(DeviceCopy record);

    int updateByPrimaryKey(DeviceCopy record);
}