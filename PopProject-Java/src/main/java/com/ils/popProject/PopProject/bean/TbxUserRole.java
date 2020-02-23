package com.ils.popProject.PopProject.bean;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.ToString;

@Entity
@ToString
@Table(name="TBXUSERROLE")
public class TbxUserRole {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="usr_id")
	private TblUser user;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="role_id")
	private TblRole role;
	
//	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//		@JoinTable(
//				name = "tblRole", 
//				joinColumns = @JoinColumn(
//						name = "role_id", referencedColumnName = "role_id")
//				)
//	private Collection <TblRole> role;
	
	public void setId(Long id) {
		this.id = id;
	}
	public Long getId() {
		return id;
	}
	
	public void setUser(TblUser user) {
		this.user = user;
	}
	public TblUser getUser() {
		return user;
	}
	
	public void setRole(TblRole role) {
		this.role = role;
	}
	public TblRole getRole() {
		return role;
	}
	
//	public void setRole(Collection<TblRole> role) {
//		this.role = role;
//	}
//	public Collection<TblRole> getRole(){
//		return role;
//		
//	}
}
