package com.maopao.mapper.play;

import com.maopao.entity.play.Token;
import com.maopao.entity.play.TokenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TokenDAO {
    long countByExample(TokenExample example);

    int deleteByExample(TokenExample example);

    int deleteByPrimaryKey(Integer rowId);

    int insert(Token record);

    int insertSelective(Token record);

    List<Token> selectByExample(TokenExample example);

    Token selectByPrimaryKey(Integer rowId);

    int updateByExampleSelective(@Param("record") Token record, @Param("example") TokenExample example);

    int updateByExample(@Param("record") Token record, @Param("example") TokenExample example);

    int updateByPrimaryKeySelective(Token record);

    int updateByPrimaryKey(Token record);
}