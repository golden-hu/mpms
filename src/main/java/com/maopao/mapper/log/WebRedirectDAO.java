package com.maopao.mapper.log;

import com.maopao.entity.log.WebRedirect;
import com.maopao.entity.log.WebRedirectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WebRedirectDAO {
    long countByExample(WebRedirectExample example);

    int deleteByExample(WebRedirectExample example);

    int deleteByPrimaryKey(Integer webId);

    int insert(WebRedirect record);

    int insertSelective(WebRedirect record);

    List<WebRedirect> selectByExample(WebRedirectExample example);

    WebRedirect selectByPrimaryKey(Integer webId);

    int updateByExampleSelective(@Param("record") WebRedirect record, @Param("example") WebRedirectExample example);

    int updateByExample(@Param("record") WebRedirect record, @Param("example") WebRedirectExample example);

    int updateByPrimaryKeySelective(WebRedirect record);

    int updateByPrimaryKey(WebRedirect record);
}