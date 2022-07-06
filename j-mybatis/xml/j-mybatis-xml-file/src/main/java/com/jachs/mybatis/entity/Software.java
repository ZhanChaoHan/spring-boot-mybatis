package com.jachs.mybatis.entity;

import java.io.Serializable;

/***
 * 
 * @author zhanchaohan
 *
 */
public class Software implements Serializable {
    private String softwareid;

    private String softwarename;

    private String cfkid;

    private static final long serialVersionUID = 1L;

    public String getSoftwareid() {
        return softwareid;
    }

    public void setSoftwareid(String softwareid) {
        this.softwareid = softwareid == null ? null : softwareid.trim();
    }

    public String getSoftwarename() {
        return softwarename;
    }

    public void setSoftwarename(String softwarename) {
        this.softwarename = softwarename == null ? null : softwarename.trim();
    }

    public String getCfkid() {
        return cfkid;
    }

    public void setCfkid(String cfkid) {
        this.cfkid = cfkid == null ? null : cfkid.trim();
    }

	@Override
	public String toString() {
		return "Software [softwareid=" + softwareid + ", softwarename=" + softwarename + ", cfkid=" + cfkid + "]";
	}
    
    
}