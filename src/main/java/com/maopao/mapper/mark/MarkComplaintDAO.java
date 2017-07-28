package com.maopao.mapper.mark;

import com.maopao.entity.mark.MarkComplaint;
import com.maopao.entity.mark.MarkComplaintExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarkComplaintDAO {
    long countByExample(MarkComplaintExample example);

    int deleteByExample(MarkComplaintExample example);

    int deleteByPrimaryKey(Long rowId);

    int insert(MarkComplaint record);

    int insertSelective(MarkComplaint record);

    List<MarkComplaint> selectByExample(MarkComplaintExample example);

    MarkComplaint selectByPrimaryKey(Long rowId);

    int updateByExampleSelective(@Param("record") MarkComplaint record, @Param("example") MarkComplaintExample example);

    int updateByExample(@Param("record") MarkComplaint record, @Param("example") MarkComplaintExample example);

    int updateByPrimaryKeySelective(MarkComplaint record);

    int updateByPrimaryKey(MarkComplaint record);
}