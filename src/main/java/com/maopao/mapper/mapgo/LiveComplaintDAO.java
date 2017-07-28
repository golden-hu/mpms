package com.maopao.mapper.mapgo;

import com.maopao.entity.mapgo.LiveComplaint;
import com.maopao.entity.mapgo.LiveComplaintExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LiveComplaintDAO {
    long countByExample(LiveComplaintExample example);

    int deleteByExample(LiveComplaintExample example);

    int deleteByPrimaryKey(Long rowId);

    int insert(LiveComplaint record);

    int insertSelective(LiveComplaint record);

    List<LiveComplaint> selectByExample(LiveComplaintExample example);

    LiveComplaint selectByPrimaryKey(Long rowId);

    int updateByExampleSelective(@Param("record") LiveComplaint record, @Param("example") LiveComplaintExample example);

    int updateByExample(@Param("record") LiveComplaint record, @Param("example") LiveComplaintExample example);

    int updateByPrimaryKeySelective(LiveComplaint record);

    int updateByPrimaryKey(LiveComplaint record);
}