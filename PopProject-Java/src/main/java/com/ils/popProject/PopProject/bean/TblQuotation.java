package com.ils.popProject.PopProject.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.ToString;

@Entity
@ToString
@Table(name="TBLQUOTATION")
public class TblQuotation extends BasicTable{
	@Id
	@Column(name="qn_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="qn_ref_no")
	private String qnRefNo;
	
	@Column(name="qn_remark")
	private String qnRemark;
	
	@Column(name="qn_email")
	private String qnEmail;
	
	@Column(name="qn_tel")
	private String qnTel;
	
	public void setId(Long id) {
		this.id = id;
	}
	public Long getId() {
		return id;
	}
	
	public void setQnRefNo(String qnRefNo) {
		this.qnRefNo = qnRefNo;
	}
	public String getQnRefNo() {
		return qnRefNo;
	}
	
	public void setQnRemark(String qnRemark) {
		this.qnRemark = qnRemark;
	}
	public String getQnRemark() {
		return qnRemark;
	}
	
	public void setQnEmail(String qnEmail) {
		this.qnEmail = qnEmail;
	}
	public String getQnEmail() {
		return qnEmail;
	}
	
	public void setQnTel(String qnTel) {
		this.qnTel = qnTel;
	}
	public String getQnTel() {
		return qnTel;
	}
	
	
}

