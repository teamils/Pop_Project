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
@Table(name="TBXROLEPERMISSION")
public class TbxRolePermission {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="role_id")
	private TblRole role;
	
	@Column(name="permission_name")
	private String permissionName;
	
	public void setId(Long id) {
		this.id = id;
	}
	public Long getId() {
		return id;
	}
	
	public void setRole(TblRole role) {
		this.role = role;
	}
	public TblRole getRole() {
		return role;
	}
	
	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}
	public String getPermissionName() {
		return permissionName;
	}
}
