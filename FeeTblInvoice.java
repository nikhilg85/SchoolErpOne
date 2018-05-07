package com.education.erp.entity;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the fee_tbl_invoice database table.
 * 
 */
@Entity
@Table(name="fee_tbl_invoice")
@NamedQuery(name="FeeTblInvoice.findAll", query="SELECT f FROM FeeTblInvoice f")
public class FeeTblInvoice implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="invoice_id")
	private Integer invoiceId;

	@Column(name="academic_id")
	@NotNull(message = "This field can not be Null")
	private Integer academicId;

	@Column(name="active_flag")
	@NotNull(message = "This field can not be Null")
	@Max(1)
	private Integer activeFlag;

	@Column(name="create_date")
	@NotNull(message = "This field can not be Null")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createDate;

	@Column(name="due_date")
	@NotNull(message = "This field can not be Null")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date dueDate;

	@Column(name="fee_name")
	@NotNull(message = "This field can not be Null")
	private String feeName;

	@Column(name="is_visible")
	@NotNull(message = "This field can not be Null")
	private Boolean isVisible;

	private Boolean status;

	@Column(name="total_amount")
	@NotNull(message = "This field can not be Null")
	private BigDecimal totalAmount;

	@Column(name="update_date")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date updateDate;

	//bi-directional many-to-one association to FeeTblTotalfeesubscription
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="total_fee_subscription_id")
	@NotNull(message = "This field can not be Null")
	@JsonBackReference
	private FeeTblTotalfeesubscription feeTblTotalfeesubscription;

	//bi-directional many-to-one association to ShareTblEmpstaffdetail
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="created_by")
	@NotNull(message = "This field can not be Null")
	@JsonBackReference
	private ShareTblEmpstaffdetail shareTblEmpstaffdetail;

	//bi-directional many-to-one association to ShareTblStudent
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="student_id")
	@NotNull(message = "This field can not be Null")
	@JsonBackReference
	private ShareTblStudent shareTblStudent;

	//bi-directional many-to-one association to FeeTblLadger
	@OneToMany(mappedBy="feeTblInvoice")
	@JsonManagedReference
	private Set<FeeTblLadger> feeTblLadgers;

	public FeeTblInvoice() {
	}

	public Integer getInvoiceId() {
		return this.invoiceId;
	}

	public void setInvoiceId(Integer invoiceId) {
		this.invoiceId = invoiceId;
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

	public void setDueDate(Timestamp dueDate) {
		this.dueDate = dueDate;
	}

	public String getFeeName() {
		return this.feeName;
	}

	public void setFeeName(String feeName) {
		this.feeName = feeName;
	}

	public Boolean getIsVisible() {
		return this.isVisible;
	}

	public void setIsVisible(Boolean isVisible) {
		this.isVisible = isVisible;
	}

	public Boolean getStatus() {
		return this.status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public BigDecimal getTotalAmount() {
		return this.totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	public FeeTblTotalfeesubscription getFeeTblTotalfeesubscription() {
		return this.feeTblTotalfeesubscription;
	}

	public void setFeeTblTotalfeesubscription(FeeTblTotalfeesubscription feeTblTotalfeesubscription) {
		this.feeTblTotalfeesubscription = feeTblTotalfeesubscription;
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

	public Set<FeeTblLadger> getFeeTblLadgers() {
		return this.feeTblLadgers;
	}

	public void setFeeTblLadgers(Set<FeeTblLadger> feeTblLadgers) {
		this.feeTblLadgers = feeTblLadgers;
	}

	public FeeTblLadger addFeeTblLadger(FeeTblLadger feeTblLadger) {
		getFeeTblLadgers().add(feeTblLadger);
		feeTblLadger.setFeeTblInvoice(this);

		return feeTblLadger;
	}

	public FeeTblLadger removeFeeTblLadger(FeeTblLadger feeTblLadger) {
		getFeeTblLadgers().remove(feeTblLadger);
		feeTblLadger.setFeeTblInvoice(null);

		return feeTblLadger;
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
	

}