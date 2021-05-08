package com.jachs.mybatis.entity;

import java.io.Serializable;

public class Student_card implements Serializable {
    private String cardId;

    private Long cardMonery;

    private String cardType;

    private static final long serialVersionUID = 1L;

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId == null ? null : cardId.trim();
    }

    public Long getCardMonery() {
        return cardMonery;
    }

    public void setCardMonery(Long cardMonery) {
        this.cardMonery = cardMonery;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType == null ? null : cardType.trim();
    }
}