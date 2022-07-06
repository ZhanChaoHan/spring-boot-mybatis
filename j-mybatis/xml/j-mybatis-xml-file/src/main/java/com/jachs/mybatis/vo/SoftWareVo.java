package com.jachs.mybatis.vo;

/***
 * 
 * @author zhanchaohan
 *
 */
public class SoftWareVo {
	private String cpId;//Computer表字段
	private String swName;//Software表字段
	
	
	public SoftWareVo() {
		super();
	}
	public SoftWareVo(String cpId, String swName) {
		super();
		this.cpId = cpId;
		this.swName = swName;
	}
	public String getCpId() {
		return cpId;
	}
	public void setCpId(String cpId) {
		this.cpId = cpId;
	}
	public String getSwName() {
		return swName;
	}
	public void setSwName(String swName) {
		this.swName = swName;
	}
	
}
