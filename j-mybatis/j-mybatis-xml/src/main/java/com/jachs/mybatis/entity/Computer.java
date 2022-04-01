package com.jachs.mybatis.entity;

import java.io.Serializable;

public class Computer implements Serializable {
    private String computerId;

    private String computerName;

    private Long computerPrice;

    private static final long serialVersionUID = 1L;

    public String getComputerId() {
        return computerId;
    }

    public void setComputerId(String computerId) {
        this.computerId = computerId == null ? null : computerId.trim();
    }

    public String getComputerName() {
        return computerName;
    }

    public void setComputerName(String computerName) {
        this.computerName = computerName == null ? null : computerName.trim();
    }

    public Long getComputerPrice() {
        return computerPrice;
    }

    public void setComputerPrice(Long computerPrice) {
        this.computerPrice = computerPrice;
    }
}