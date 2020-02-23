package com.ils.popProject.PopProject.bean;

import javax.persistence.*;

import lombok.ToString;

@Entity
@ToString
@Table(name="TBLCLIENT")
public class TblClient extends BasicTable{
	
	
//	@Column(name="id")
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	private Long id;
	
	@Id
	@Column(name="client_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="client_name")
	private String clientName;
	
//	public void setId(Long id) {
//		this.id = id;
//	}
//	public Long getId() {
//		return id;
//	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public Long getId() {
		return id;
	}
	
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getClientName() {
		return clientName;
	}

}
