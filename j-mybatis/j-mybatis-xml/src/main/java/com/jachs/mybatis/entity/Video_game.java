package com.jachs.mybatis.entity;

import java.io.Serializable;

public class Video_game implements Serializable {
    private Long gameId;

    private String gameName;

    private Integer gamePrice;

    private Long playerPlayerId;

    private static final long serialVersionUID = 1L;

    public Long getGameId() {
        return gameId;
    }

    public void setGameId(Long gameId) {
        this.gameId = gameId;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName == null ? null : gameName.trim();
    }

    public Integer getGamePrice() {
        return gamePrice;
    }

    public void setGamePrice(Integer gamePrice) {
        this.gamePrice = gamePrice;
    }

    public Long getPlayerPlayerId() {
        return playerPlayerId;
    }

    public void setPlayerPlayerId(Long playerPlayerId) {
        this.playerPlayerId = playerPlayerId;
    }
}