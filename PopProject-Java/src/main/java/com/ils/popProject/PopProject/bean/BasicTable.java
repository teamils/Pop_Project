package com.ils.popProject.PopProject.bean;

import java.sql.Date;

import javax.persistence.Column;

public class BasicTable {
	@Column(name="isactive")
	public Boolean isactive;
	
	@Column(name="create_date")
	public Date createDate;
	
	@Column(name="create_by")
	public Long createBy;
	
	@Column(name="update_date")
	public Date updateDate;
	
	@Column(name="update_by")
	public Long updateBy;
	
	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
	}
	public Boolean getIsactive() {
		return isactive;
	}
	
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getCreateDate() {
		return createDate;
	}
	
	public void setCreateBy(Long createBy) {
		this.createBy = createBy;
	}
	public Long getCreateBy() {
		return createBy;
	}
	
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public Date getUpdateDate() {
		return createDate;
	}
	
	public void setUpdateBy(Long updateBy) {
		this.updateBy = updateBy;
	}
	public Long getUpdateBy() {
		return updateBy;
	}
}
