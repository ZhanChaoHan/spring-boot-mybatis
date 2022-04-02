package com.jachs.mybatis.dto;

/***
 * 
 * @author zhanchaohan
 *
 */
public class SoftWareDto {
	//computer表字段
	private String cpId;
	private String cpName;
	private Long cpMonery;
	//software表字段
	private String swId;
	private String swName;
	
	
	public SoftWareDto() {
		super();
	}
	public SoftWareDto(String cpId, String cpName, Long cpMonery, String swId, String swName) {
		super();
		this.cpId = cpId;
		this.cpName = cpName;
		this.cpMonery = cpMonery;
		this.swId = swId;
		this.swName = swName;
	}

	public String getCpId() {
		return cpId;
	}
	public void setCpId(String cpId) {
		this.cpId = cpId;
	}
	public String getCpName() {
		return cpName;
	}
	public void setCpName(String cpName) {
		this.cpName = cpName;
	}
	public Long getCpMonery() {
		return cpMonery;
	}
	public void setCpMonery(Long cpMonery) {
		this.cpMonery = cpMonery;
	}
	public String getSwId() {
		return swId;
	}
	public void setSwId(String swId) {
		this.swId = swId;
	}
	public String getSwName() {
		return swName;
	}
	public void setSwName(String swName) {
		this.swName = swName;
	}
	@Override
	public String toString() {
		return "SoftWareDto [cpId=" + cpId + ", cpMonery=" + cpMonery + ", swId=" + swId + ", swName=" + swName + "]";
	}
	
}
