package com.baomidou.mybatisplus.samples.typehandler.entity;

import java.util.List;

import lombok.Data;

/**
 * 钱包
 */
@Data
public class Wallet {
    /**
     * 名称
     */
    private String name;
    /**
     * 各种货币
     */
    private List<Currency> currencyList;
}
