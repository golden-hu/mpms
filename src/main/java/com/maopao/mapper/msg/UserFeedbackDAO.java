package com.maopao.mapper.msg;

import com.maopao.entity.msg.UserFeedback;
import com.maopao.entity.msg.UserFeedbackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserFeedbackDAO {
    long countByExample(UserFeedbackExample example);

    int deleteByExample(UserFeedbackExample example);

    int deleteByPrimaryKey(Long rowId);

    int insert(UserFeedback record);

    int insertSelective(UserFeedback record);

    List<UserFeedback> selectByExample(UserFeedbackExample example);

    UserFeedback selectByPrimaryKey(Long rowId);

    int updateByExampleSelective(@Param("record") UserFeedback record, @Param("example") UserFeedbackExample example);

    int updateByExample(@Param("record") UserFeedback record, @Param("example") UserFeedbackExample example);

    int updateByPrimaryKeySelective(UserFeedback record);

    int updateByPrimaryKey(UserFeedback record);
}