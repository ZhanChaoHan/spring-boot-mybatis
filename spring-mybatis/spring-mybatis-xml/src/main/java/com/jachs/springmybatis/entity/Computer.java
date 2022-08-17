package com.jachs.springmybatis.entity;

import java.io.Serializable;
import java.util.Date;

public class Computer implements Serializable {
    private String computerid;

    private String computername;

    private Long computerprice;

    private Date madetime;

    private static final long serialVersionUID = 1L;

    public String getComputerid() {
        return computerid;
    }

    public void setComputerid(String computerid) {
        this.computerid = computerid == null ? null : computerid.trim();
    }

    public String getComputername() {
        return computername;
    }

    public void setComputername(String computername) {
        this.computername = computername == null ? null : computername.trim();
    }

    public Long getComputerprice() {
        return computerprice;
    }

    public void setComputerprice(Long computerprice) {
        this.computerprice = computerprice;
    }

    public Date getMadetime() {
        return madetime;
    }

    public void setMadetime(Date madetime) {
        this.madetime = madetime;
    }
}