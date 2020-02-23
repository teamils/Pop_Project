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
@Table(name="TBLUSER")
public class TblUser extends BasicTable{
	
	@Id
	@Column(name="usr_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="usr_username")
	private String userName;
	
	@Column(name="usr_password_encrypt")
	private String passwordEncrypt;
	
	@Column(name="usr_password_decrypt")
	private String passwordDecrypt;
	
	@Column(name="usr_firstname")
	private String firstname;
	
	@Column(name="usr_lastname")
	private String lastname;
	
	@Column(name="usr_email")
	private String email;
	
	@Column(name="usr_tel")
	private String tel;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="dm_id")
	private TblDepartment department;
	
	 @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	    @JoinTable(
	        name = "tbxUserRole",
	        joinColumns = @JoinColumn(
	            name = "usr_id", referencedColumnName = "usr_id"),
	        inverseJoinColumns = @JoinColumn(
	            name = "role_id", referencedColumnName = "role_id"))
	    private Collection < TblRole > roles;
	
	@Column(name="isactive")
	public Boolean isactive;
	 
	public void setId(Long id) {
		this.id = id;
	}
	public Long getId() {
		return id;
	}
	
	public void setUsername(String userName) {
		this.userName = userName;
	}
	public String getUsername() {
		return userName;
	}
	
	public void setPasswordEncrypt(String passwordEncrypt) {
		this.passwordEncrypt = passwordEncrypt;
	}
	public String getPasswordEncrypt() {
		return passwordEncrypt;
	}
	
	public void setPasswordDecrypt(String passwordDecrypt) {
		this.passwordDecrypt = passwordDecrypt;
	}
	public String getPasswordDecrypt() {
		return passwordDecrypt;
	}
	
	public void setFirstname(String firstname) {
		this.firstname= firstname;
	}
	public String getFirstname() {
		return firstname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getLastname() {
		return lastname;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getTel() {
		return tel;
	}
	
	public void setDepartment(TblDepartment department) {
		this.department = department;
	}
	public TblDepartment getDepartment() {
		return department;
	}
	
	public Collection<TblRole> getRoles() {
		return roles;
	}

	public void setRoles(Collection<TblRole> roles) {
		this.roles = roles;
	}
	
	public Boolean getIsactive() {
		return isactive;
	}

	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
	}

}
