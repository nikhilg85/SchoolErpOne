package com.education.erp.entity;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;


/**
 * The persistent class for the fee_tbl_ladger database table.
 * 
 */
@Entity
@Table(name="fee_tbl_ladger")
@NamedQuery(name="FeeTblLadger.findAll", query="SELECT f FROM FeeTblLadger f")
public class FeeTblLadger implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ledger_id")
	private Integer ledgerId;

	@Column(name="academic_id")
	private Integer academicId;

	@Column(name="active_flag")
	private Integer activeFlag;

	private BigDecimal balance;

	@Column(name="create_date")
	private Date createDate;

	@Column(name="credit_amount")
	private BigDecimal creditAmount;

	@Column(name="debit_amount")
	private BigDecimal debitAmount;

	@Column(name="update_date")
	private Date updateDate;

	//bi-directional many-to-one association to FeeTblInvoice
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="invoice_id")
	@JsonBackReference
	private FeeTblInvoice feeTblInvoice;

	//bi-directional many-to-one association to FeeTblTransaction
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="transaction_id")
	@JsonBackReference
	private FeeTblTransaction feeTblTransaction;

	//bi-directional many-to-one association to ShareTblEmpstaffdetail
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="created_by")
	@JsonBackReference
	private ShareTblEmpstaffdetail shareTblEmpstaffdetail;

	//bi-directional many-to-one association to ShareTblStudent
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="student_id")
	@JsonBackReference
	private ShareTblStudent shareTblStudent;

	public FeeTblLadger() {
	}

	public Integer getLedgerId() {
		return this.ledgerId;
	}

	public void setLedgerId(Integer ledgerId) {
		this.ledgerId = ledgerId;
	}

	public Integer getAcademicId() {
		return this.academicId;
	}

	public void setAcademicId(Integer academicId) {
		this.academicId = academicId;
	}

	public Integer getActiveFlag() {
		return this.activeFlag;
	}

	public void setActiveFlag(Integer activeFlag) {
		this.activeFlag = activeFlag;
	}

	public BigDecimal getBalance() {
		return this.balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public BigDecimal getCreditAmount() {
		return this.creditAmount;
	}

	public void setCreditAmount(BigDecimal creditAmount) {
		this.creditAmount = creditAmount;
	}

	public BigDecimal getDebitAmount() {
		return this.debitAmount;
	}

	public void setDebitAmount(BigDecimal debitAmount) {
		this.debitAmount = debitAmount;
	}

	public FeeTblInvoice getFeeTblInvoice() {
		return this.feeTblInvoice;
	}

	public void setFeeTblInvoice(FeeTblInvoice feeTblInvoice) {
		this.feeTblInvoice = feeTblInvoice;
	}

	public FeeTblTransaction getFeeTblTransaction() {
		return this.feeTblTransaction;
	}

	public void setFeeTblTransaction(FeeTblTransaction feeTblTransaction) {
		this.feeTblTransaction = feeTblTransaction;
	}

	public ShareTblEmpstaffdetail getShareTblEmpstaffdetail() {
		return this.shareTblEmpstaffdetail;
	}

	public void setShareTblEmpstaffdetail(ShareTblEmpstaffdetail shareTblEmpstaffdetail) {
		this.shareTblEmpstaffdetail = shareTblEmpstaffdetail;
	}

	public ShareTblStudent getShareTblStudent() {
		return this.shareTblStudent;
	}

	public void setShareTblStudent(ShareTblStudent shareTblStudent) {
		this.shareTblStudent = shareTblStudent;
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