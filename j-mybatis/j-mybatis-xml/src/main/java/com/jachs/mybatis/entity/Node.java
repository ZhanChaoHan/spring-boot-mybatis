package com.jachs.mybatis.entity;

import java.io.Serializable;

public class Node implements Serializable {
    private Long nodeId;

    private String nodeBackGroudImage;

    private Double nodeHeight;

    private String nodeName;

    private Double nodeWidth;

    private static final long serialVersionUID = 1L;

    public Long getNodeId() {
        return nodeId;
    }

    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }

    public String getNodeBackGroudImage() {
        return nodeBackGroudImage;
    }

    public void setNodeBackGroudImage(String nodeBackGroudImage) {
        this.nodeBackGroudImage = nodeBackGroudImage == null ? null : nodeBackGroudImage.trim();
    }

    public Double getNodeHeight() {
        return nodeHeight;
    }

    public void setNodeHeight(Double nodeHeight) {
        this.nodeHeight = nodeHeight;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName == null ? null : nodeName.trim();
    }

    public Double getNodeWidth() {
        return nodeWidth;
    }

    public void setNodeWidth(Double nodeWidth) {
        this.nodeWidth = nodeWidth;
    }
}