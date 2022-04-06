package com.jachs.mybatis.entity;

import java.io.Serializable;
import java.util.Date;

/***
 * 
 * @author zhanchaohan
 *
 */
public class Computer implements Serializable {
    private String computerId;
    private String computerName;
    private Long computerPrice;
    private Date madeTime;
    
    private static final long serialVersionUID = 1L;

	public Computer() {
		super();
	}
	public Computer(String computerId, String computerName, Long computerPrice, Date madeTime) {
		super();
		this.computerId = computerId;
		this.computerName = computerName;
		this.computerPrice = computerPrice;
		this.madeTime = madeTime;
	}
	public String getComputerId() {
		return computerId;
	}
	public void setComputerId(String computerId) {
		this.computerId = computerId;
	}
	public String getComputerName() {
		return computerName;
	}
	public void setComputerName(String computerName) {
		this.computerName = computerName;
	}
	public Long getComputerPrice() {
		return computerPrice;
	}
	public void setComputerPrice(Long computerPrice) {
		this.computerPrice = computerPrice;
	}
	public Date getMadeTime() {
		return madeTime;
	}
	public void setMadeTime(Date madeTime) {
		this.madeTime = madeTime;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Computer [computerId=" + computerId + ", computerName=" + computerName + ", computerPrice="
				+ computerPrice + ", madeTime=" + madeTime + "]";
	}

}