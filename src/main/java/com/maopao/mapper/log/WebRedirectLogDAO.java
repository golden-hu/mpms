package com.maopao.mapper.log;

import com.maopao.entity.log.WebRedirectLog30d;
import com.maopao.entity.log.WebRedirectLog30dExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WebRedirectLogDAO {
    long countByExample(WebRedirectLog30dExample example);

    int deleteByExample(WebRedirectLog30dExample example);

    int deleteByPrimaryKey(Long rowId);

    int insert(WebRedirectLog30d record);

    int insertSelective(WebRedirectLog30d record);

    List<WebRedirectLog30d> selectByExample(WebRedirectLog30dExample example);

    WebRedirectLog30d selectByPrimaryKey(Long rowId);

    int updateByExampleSelective(@Param("record") WebRedirectLog30d record, @Param("example") WebRedirectLog30dExample example);

    int updateByExample(@Param("record") WebRedirectLog30d record, @Param("example") WebRedirectLog30dExample example);

    int updateByPrimaryKeySelective(WebRedirectLog30d record);

    int updateByPrimaryKey(WebRedirectLog30d record);
}