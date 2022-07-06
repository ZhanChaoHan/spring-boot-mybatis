package com.jachs.mybatis.entity;

import java.io.Serializable;

/***
 * 
 * @author zhanchaohan
 *
 */
public class Soft_ware implements Serializable {
    private String softWareId;
    private String softWareName;
    private String cFKId;

    private static final long serialVersionUID = 1L;

	public Soft_ware() {
		super();
	}

	public Soft_ware(String softWareId, String softWareName, String cFKId) {
		super();
		this.softWareId = softWareId;
		this.softWareName = softWareName;
		this.cFKId = cFKId;
	}
	public String getSoftWareId() {
		return softWareId;
	}
	public void setSoftWareId(String softWareId) {
		this.softWareId = softWareId;
	}
	public String getSoftWareName() {
		return softWareName;
	}
	public void setSoftWareName(String softWareName) {
		this.softWareName = softWareName;
	}
	public String getcFKId() {
		return cFKId;
	}
	public void setcFKId(String cFKId) {
		this.cFKId = cFKId;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Soft_ware [softWareId=" + softWareId + ", softWareName=" + softWareName + ", cFKId=" + cFKId + "]";
	}
	
}