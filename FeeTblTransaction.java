package com.education.erp.entity;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the fee_tbl_transaction database table.
 * 
 */
@Entity
@Table(name="fee_tbl_transaction")
@NamedQuery(name="FeeTblTransaction.findAll", query="SELECT f FROM FeeTblTransaction f")
public class FeeTblTransaction implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="transaction_id")
	private Integer transactionId;

	@Column(name="academic_id")
	private Integer academicId;

	@Column(name="academic_year")
	private Integer academicYear;

	@Column(name="active_flag")
	private Integer activeFlag;

	private String description;

	@Column(name="entered_amount")
	private BigDecimal enteredAmount;

	@Column(name="invoice_id")
	private Integer invoiceId;

	@Column(name="student_id")
	private Integer studentId;

	@Column(name="transacation_details_id")
	private Integer transacationDetailsId;

	@Column(name="transaction_date")
	private Date transactionDate;
	
	@Column(name="create_date")
	private Date createDate;
	
	@Column(name="update_date")
	private Date updateDate;

	//bi-directional many-to-one association to FeeTblLadger
	@OneToMany(mappedBy="feeTblTransaction")
	@JsonBackReference
	private Set<FeeTblLadger> feeTblLadgers;

	//bi-directional many-to-one association to FeeTblTransactiontype
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="transaction_type_id")
	@JsonManagedReference
	private FeeTblTransactiontype feeTblTransactiontype;

	//bi-directional many-to-one association to ShareTblEmpstaffdetail
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="created_by")
	@JsonManagedReference
	private ShareTblEmpstaffdetail shareTblEmpstaffdetail;

	public FeeTblTransaction() {
	}

	public Integer getTransactionId() {
		return this.transactionId;
	}

	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}

	public Integer getAcademicId() {
		return this.academicId;
	}

	public void setAcademicId(Integer academicId) {
		this.academicId = academicId;
	}

	public Integer getAcademicYear() {
		return this.academicYear;
	}

	public void setAcademicYear(Integer academicYear) {
		this.academicYear = academicYear;
	}

	public Integer getActiveFlag() {
		return this.activeFlag;
	}

	public void setActiveFlag(Integer activeFlag) {
		this.activeFlag = activeFlag;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getEnteredAmount() {
		return this.enteredAmount;
	}

	public void setEnteredAmount(BigDecimal enteredAmount) {
		this.enteredAmount = enteredAmount;
	}

	public Integer getInvoiceId() {
		return this.invoiceId;
	}

	public void setInvoiceId(Integer invoiceId) {
		this.invoiceId = invoiceId;
	}

	public Integer getStudentId() {
		return this.studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public Integer getTransacationDetailsId() {
		return this.transacationDetailsId;
	}

	public void setTransacationDetailsId(Integer transacationDetailsId) {
		this.transacationDetailsId = transacationDetailsId;
	}

	public Set<FeeTblLadger> getFeeTblLadgers() {
		return this.feeTblLadgers;
	}

	public void setFeeTblLadgers(Set<FeeTblLadger> feeTblLadgers) {
		this.feeTblLadgers = feeTblLadgers;
	}

	public FeeTblLadger addFeeTblLadger(FeeTblLadger feeTblLadger) {
		getFeeTblLadgers().add(feeTblLadger);
		feeTblLadger.setFeeTblTransaction(this);

		return feeTblLadger;
	}

	public FeeTblLadger removeFeeTblLadger(FeeTblLadger feeTblLadger) {
		getFeeTblLadgers().remove(feeTblLadger);
		feeTblLadger.setFeeTblTransaction(null);

		return feeTblLadger;
	}

	public FeeTblTransactiontype getFeeTblTransactiontype() {
		return this.feeTblTransactiontype;
	}

	public void setFeeTblTransactiontype(FeeTblTransactiontype feeTblTransactiontype) {
		this.feeTblTransactiontype = feeTblTransactiontype;
	}

	public ShareTblEmpstaffdetail getShareTblEmpstaffdetail() {
		return this.shareTblEmpstaffdetail;
	}

	public void setShareTblEmpstaffdetail(ShareTblEmpstaffdetail shareTblEmpstaffdetail) {
		this.shareTblEmpstaffdetail = shareTblEmpstaffdetail;
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
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