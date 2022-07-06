package com.jachs.mybatis.multiple.d2.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhanchaohan
 * @since 2022-07-06
 */
public class Studentcard extends Model<Studentcard> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "${field.annotationColumnName}", type = IdType.AUTO)
    private String cardId;

    @TableField("${field.annotationColumnName}")
    private Long cardMonery;

    @TableField("${field.annotationColumnName}")
    private String cardName;

    @TableField("${field.annotationColumnName}")
    private String cardType;


    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public Long getCardMonery() {
        return cardMonery;
    }

    public void setCardMonery(Long cardMonery) {
        this.cardMonery = cardMonery;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    @Override
	public Serializable pkVal() {
        return this.cardId;
    }

    @Override
    public String toString() {
        return "Studentcard{" +
        "cardId=" + cardId +
        ", cardMonery=" + cardMonery +
        ", cardName=" + cardName +
        ", cardType=" + cardType +
        "}";
    }
}
