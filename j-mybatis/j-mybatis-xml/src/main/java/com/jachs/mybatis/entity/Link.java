package com.jachs.mybatis.entity;

import java.io.Serializable;

public class Link implements Serializable {
    private Long linkId;

    private Long childNodeId;

    private Long fatherNodeId;

    private static final long serialVersionUID = 1L;

    public Long getLinkId() {
        return linkId;
    }

    public void setLinkId(Long linkId) {
        this.linkId = linkId;
    }

    public Long getChildNodeId() {
        return childNodeId;
    }

    public void setChildNodeId(Long childNodeId) {
        this.childNodeId = childNodeId;
    }

    public Long getFatherNodeId() {
        return fatherNodeId;
    }

    public void setFatherNodeId(Long fatherNodeId) {
        this.fatherNodeId = fatherNodeId;
    }
}