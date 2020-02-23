package com.ils.popProject.PopProject.bean;

import java.sql.Date;
import java.sql.Time;

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
@Table(name="TBLPROJECT")
public class TblProject extends BasicTable{
	@Id
	@Column(name="prj_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	public void setId(Long id) {
		this.id = id;
	}
	public Long getId() {
		return id;
	}
	
	@Column(name="prj_code")
	private String prjCode;
	public void setPrjCode(String prjCode) {
		this.prjCode = prjCode;
	}
	public String getPrjCode() {
		return prjCode;
	}
	
	@Column(name="prj_name")
	private String prjName;
	public void setPrjName(String prjName) {
		this.prjName = prjName;
	}
	public String getPrjName() {
		return prjName;
	}
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="client_id")
	private TblClient client;
	public void setClient(TblClient client) {
		this.client = client;
	}
	public TblClient getClient() {
		return client;
	}
	
	@Column(name="prj_repacking_serveice")
	private String repackingService;
	public void setRepackingService(String repackingService) {
		this.repackingService = repackingService;
	}
	public String getRepackingService() {
		return repackingService;
	}
	
	@Column(name="prj_cust_contact_name")
	private String custContactName;
	public void setCustContactName(String custContactName) {
		this.custContactName = custContactName;
	}
	public String getCustContactName() {
		return custContactName;
	}
	
	@Column(name="prj_cust_email")
	private String custEmail;
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	public String getCustEmail() {
		return custEmail;
	}
	
	@Column(name="prj_cust_tel")
	private String custTel;
	public void setCustTel(String custTel) {
		this.custTel = custTel;
	}
	public String getCustTel() {
		return custTel;
	}
	
	@Column(name="prj_delivery_round")
	private String deliveryRound;
	public void setDeliveryRound(String deliveryRound) {
		this.deliveryRound = deliveryRound;
	}
	public String getDeliveryRound() {
		return deliveryRound;
	}
	
	@Column(name="prj_compaign_period_start")
	private Date compaignPeriodStart;
	public void setCompaignPeriodStart(Date compaignPeriodStart) {
		this.compaignPeriodStart = compaignPeriodStart;
	}
	public Date getCompaignPeriodStart() {
		return compaignPeriodStart;
	}
	
	@Column(name="prj_compaign_period_end")
	private Date compaignPeriodEnd;
	public void setCompaignPeriodEnd(Date compaignPeriodEnd) {
		this.compaignPeriodEnd = compaignPeriodEnd;
	}
	public Date getCompaignPeriodEnd() {
		return compaignPeriodEnd;
	}
	
	@Column(name="prj_delivery_lead_time_start")
	private Date deliveryLeadTimeStart;
	public void setDeliveryLeadTimeStart(Date deliveryLeadTimeStart) {
		this.deliveryLeadTimeStart = deliveryLeadTimeStart;
	}
	public Date getDeliveryLeadTimeStart() {
		return deliveryLeadTimeStart;
	}
	
	@Column(name="prj_delivery_lead_time_end")
	private Date deliveryLeadTimeEnd;
	public void setDeliveryLeadTimeEnd(Date deliveryLeadTimeEnd) {
		this.deliveryLeadTimeEnd = deliveryLeadTimeEnd;
	}
	public Date getDeliveryLeadTimeEnd() {
		return deliveryLeadTimeEnd;
	}
	
	@Column(name="prj_receive_date")
	private Date receiveDate;
	public void setReceiveDate(Date receiveDate) {
		this.receiveDate = receiveDate;
	}
	public Date getReceiveDate() {
		return receiveDate;
	}
	
	@Column(name="prj_receive_time")
	private Time receiveTime;
	public void setReceiveTime(Time receiveTime) {
		this.receiveTime = receiveTime;
	}
	public Time getReceiveTime() {
		return receiveTime;
	}
	
	@Column(name="prj_receive_remark")
	private String receiveRemark;
	public void setReceiveRemark(String receiveRemark) {
		this.receiveRemark = receiveRemark;
	}
	public String getReceiveRemark() {
		return receiveRemark;
	}
	
	@Column(name="prj_item")
	private Long item;
	public void setItem(Long item) {
		this.item = item;
	}
	public Long getItem() {
		return item;
	}
	
	@Column(name="prj_item_desc")
	private String itemDesc;
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}
	public String getItemDesc() {
		return itemDesc;
	}
	
	@Column(name="prj_crossdock_area")
	private String crossdockArea;
	public void setCrossdockArea(String crossdockArea) {
		this.crossdockArea = crossdockArea;
	}
	public String getCrossdockArea() {
		return crossdockArea;
	}
	
	@Column(name="prj_destination")
	private String destination;
	public void setDetination(String destination) {
		this.destination = destination;
	}
	public String getDestination() {
		return destination;
	}
	
	@Column(name="prj_amount_shipto")
	private Long amountShipto;
	public void setAmountShipto(Long amountShipto) {
		this.amountShipto = amountShipto;
	}
	public Long getAmountShipto() {
		return amountShipto;
	}
	
	@Column(name="prj_delivery_service")
	private String deliveryService;
	public void setDeliveryService(String deliveryService) {
		this.deliveryService = deliveryService;
	}
	public String getDeliveryService() {
		return deliveryService;
	}
	
	@Column(name="prj_remark_tsp")
	private String remarkTransport;
	public void setRemarkTransport(String remarkTransport) {
		this.remarkTransport = remarkTransport;
	}
	public String getRemarkTransport() {
		return remarkTransport;
	}
	
	@Column(name="prj_status")
	private String status;
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus() {
		return status;
	}
	
	@Column(name="prj_start_date")
	private Date startDate;
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getStartDate() {
		return startDate;
	}
	
	@Column(name="prj_end_date")
	private Date endDate;
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Date getEndDate() {
		return endDate;
	}

	@Column(name="prj_complete_date")
	private Date completeDate;
	public void setCompleteDate(Date completeDate) {
		this.completeDate = completeDate;
	}
	public Date getCompleteDate() {
		return completeDate;
	}
	
	@Column(name="prj_delivery_complete_date")
	private Date deliveryCompleteDate;
	public void setDeliveryCompleteDate(Date deliveryCompleteDate) {
		this.deliveryCompleteDate = deliveryCompleteDate;
	}
	public Date getDeliveryCompleteDate() {
		return deliveryCompleteDate;
	}
	
	@Column(name="prj_close_date")
	private Date closeDate;
	public void setCloseDate(Date closeDate) {
		this.closeDate = closeDate;
	}
	public Date getCloseDate() {
		return closeDate;
	}
	
	@Column(name="prj_send_summary_date")
	private Date sendSummaryDate;
	public void setSendSummaryDate(Date sendSummaryDate) {
		this.sendSummaryDate = sendSummaryDate;
	}
	public Date getSendSummaryDate() {
		return sendSummaryDate;
	}
	
	@Column(name="prj_pause_date")
	private Date pauseDate;
	public void setPauseDate(Date pauseDate) {
		this.pauseDate = pauseDate;
	}
	public Date getPauseDate() {
		return pauseDate;
	}
	
	@Column(name="prj_pause_remark")
	private String pauseRemark;
	public void setPauseRemark(String pauseRemark) {
		this.pauseRemark = pauseRemark;
	}
	public String getPauseRemark() {
		return pauseRemark;
	}
	
	
	@Column(name="prj_resume_date")
	private Date resumeDate;
	public void setResumeDate(Date resumeDate) {
		this.resumeDate = resumeDate;
	}
	public Date getResumeDate() {
		return resumeDate;
	}
	
	@Column(name="prj_resume_remark")
	private String resumeRemark;
	public void setResumeRemark(String resumeRemark) {
		this.resumeRemark = resumeRemark;
	}
	public String getResumeRemark() {
		return resumeRemark;
	}
	
	@Column(name="prj_cancel_date")
	private Date cancelDate;
	public void setCancelDate(Date cancelDate) {
		this.cancelDate = cancelDate;
	}
	public Date getCancelDate() {
		return cancelDate;
	}
	
	@Column(name="prj_cancel_remark")
	private String cancelRemark;
	public void setCancelRemark(String cancelRemark) {
		this.cancelRemark = cancelRemark;
	}
	public String getCancelRemark() {
		return cancelRemark;
	}
}
