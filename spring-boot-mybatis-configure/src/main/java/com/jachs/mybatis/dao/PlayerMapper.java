package com.jachs.mybatis.dao;

import com.jachs.mybatis.entity.Player;

public interface PlayerMapper {
    int deleteByPrimaryKey(Long playerId);

    int insert(Player record);

    int insertSelective(Player record);

    Player selectByPrimaryKey(Long playerId);

    int updateByPrimaryKeySelective(Player record);

    int updateByPrimaryKey(Player record);
}