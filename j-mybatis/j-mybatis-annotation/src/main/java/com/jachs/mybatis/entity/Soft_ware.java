package com.jachs.mybatis.entity;

import java.io.Serializable;

public class Soft_ware implements Serializable {
    private String soft_ware_id;

    private String cid;

    private String soft_ware_name;

    private static final long serialVersionUID = 1L;

	public Soft_ware() {
		super();
	}

	public Soft_ware(String soft_ware_id, String cid, String soft_ware_name) {
		super();
		this.soft_ware_id = soft_ware_id;
		this.cid = cid;
		this.soft_ware_name = soft_ware_name;
	}

	public String getSoft_ware_id() {
		return soft_ware_id;
	}

	public void setSoft_ware_id(String soft_ware_id) {
		this.soft_ware_id = soft_ware_id;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getSoft_ware_name() {
		return soft_ware_name;
	}

	public void setSoft_ware_name(String soft_ware_name) {
		this.soft_ware_name = soft_ware_name;
	}

}