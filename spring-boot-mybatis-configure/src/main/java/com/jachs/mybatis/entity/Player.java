package com.jachs.mybatis.entity;

import java.io.Serializable;

public class Player implements Serializable {
    private Long playerId;

    private Integer level;

    private String playerUserName;

    private static final long serialVersionUID = 1L;

    public Long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getPlayerUserName() {
        return playerUserName;
    }

    public void setPlayerUserName(String playerUserName) {
        this.playerUserName = playerUserName == null ? null : playerUserName.trim();
    }
}