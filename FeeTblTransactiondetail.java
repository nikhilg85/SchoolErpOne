package com.education.erp.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;


/**
 * The persistent class for the fee_tbl_transactiondetails database table.
 * 
 */
@Entity
@Table(name="fee_tbl_transactiondetails")
@NamedQuery(name="FeeTblTransactiondetail.findAll", query="SELECT f FROM FeeTblTransactiondetail f")
public class FeeTblTransactiondetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="transaction_details_id")
	private Integer transactionDetailsId;

	@Column(name="account_detail")
	private String accountDetail;

	@Column(name="pay_by_name")
	private String payByName;

	@Column(name="pay_to_name")
	private String payToName;

	@Column(name="payment_mode")
	private String paymentMode;
	
	@Column(name="create_date")
	private Date createDate;
	
	@Column(name="update_date")
	private Date updateDate;


	public FeeTblTransactiondetail() {
	}

	public Integer getTransactionDetailsId() {
		return this.transactionDetailsId;
	}

	public void setTransactionDetailsId(Integer transactionDetailsId) {
		this.transactionDetailsId = transactionDetailsId;
	}

	public String getAccountDetail() {
		return this.accountDetail;
	}

	public void setAccountDetail(String accountDetail) {
		this.accountDetail = accountDetail;
	}

	public String getPayByName() {
		return this.payByName;
	}

	public void setPayByName(String payByName) {
		this.payByName = payByName;
	}

	public String getPayToName() {
		return this.payToName;
	}

	public void setPayToName(String payToName) {
		this.payToName = payToName;
	}

	public String getPaymentMode() {
		return this.paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	
	
	
}