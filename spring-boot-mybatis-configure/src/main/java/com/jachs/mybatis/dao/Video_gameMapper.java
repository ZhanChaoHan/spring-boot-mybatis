package com.jachs.mybatis.dao;

import com.jachs.mybatis.entity.Video_game;

public interface Video_gameMapper {
    int deleteByPrimaryKey(Long gameId);

    int insert(Video_game record);

    int insertSelective(Video_game record);

    Video_game selectByPrimaryKey(Long gameId);

    int updateByPrimaryKeySelective(Video_game record);

    int updateByPrimaryKey(Video_game record);
}