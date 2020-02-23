package com.ils.popProject.PopProject.bean;

import lombok.ToString;

import javax.persistence.*;

@Entity
@ToString
@Table(name="TBLDEPARTMENT")
public class TblDepartment extends BasicTable{

	@Id
	@Column(name="dm_id")
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="dm_name")
	private String departmentName;
	
	public void setId(Long id) {
		this.id = id;
	}
	public Long getId() {
		return id;
	}
	
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	
}
