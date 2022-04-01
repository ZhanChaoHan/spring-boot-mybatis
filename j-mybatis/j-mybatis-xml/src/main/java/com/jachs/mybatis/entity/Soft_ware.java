package com.jachs.mybatis.entity;

import java.io.Serializable;

public class Soft_ware implements Serializable {
    private String softWareId;

    private String cid;

    private String softWareName;

    private static final long serialVersionUID = 1L;

    public String getSoftWareId() {
        return softWareId;
    }

    public void setSoftWareId(String softWareId) {
        this.softWareId = softWareId == null ? null : softWareId.trim();
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
    }

    public String getSoftWareName() {
        return softWareName;
    }

    public void setSoftWareName(String softWareName) {
        this.softWareName = softWareName == null ? null : softWareName.trim();
    }
}