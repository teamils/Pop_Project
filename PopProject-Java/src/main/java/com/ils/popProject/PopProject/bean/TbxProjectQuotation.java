package com.ils.popProject.PopProject.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.ToString;

@Entity
@ToString
@Table(name="TBXPROJECTQUOTATION")
public class TbxProjectQuotation {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="prj_id")
	private TblProject project;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="qn_id")
	private TblQuotation quotation;
	
	public void setId(Long id) {
		this.id =id;
	}
	public Long getId() {
		return id;
	}
	
	public void setProject(TblProject project) {
		this.project = project;
	}
	public TblProject getProject() {
		return project;
	}
	
	public void setQuotation(TblQuotation quotation) {
		this.quotation = quotation;
	}
	public TblQuotation getQuotation() {
		return quotation;
	}
	
	
}
