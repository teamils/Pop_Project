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
@Table(name="TBLROLE")
public class TblRole {

	@Id
	@Column(name="role_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="role_name")
	private String roleName;
	
	public void setId(Long id) {
		this.id = id;
	}
	public Long getId() {
		return id;
	}
	
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getRoleName() {
		return roleName;
	}
}
