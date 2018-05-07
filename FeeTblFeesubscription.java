package com.education.erp.entity;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;


/**
 * The persistent class for the fee_tbl_feesubscription database table.
 * 
 */
@Entity
@Table(name="fee_tbl_feesubscription")
@NamedQuery(name="FeeTblFeesubscription.findAll", query="SELECT f FROM FeeTblFeesubscription f")
public class FeeTblFeesubscription implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="fee_subscription_id")
	private Integer feeSubscriptionId;

	@Column(name="academic_id")
	@NotNull(message = "AcademicId field can not be Null")
	private Integer academicId;

	@Column(name="active_flag")
	@NotNull(message = "ActiveFlag field can not be Null")
	@Max(1)
	private Integer activeFlag;

	@Column(name="amount")
	@NotNull(message = "Amount field can not be Null")
	private BigDecimal amount;

	@Column(name="create_date")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@NotNull(message = "Create date field can not be Null")
	private Date createDate;

	
	@Column(name="due_date")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@NotNull(message = "Duedate field can not be Null")
	private Date dueDate;

	@Column(name="fee_after_discount")
	@NotNull(message = "feeAfterDiscount field can not be Null")
	private BigDecimal feeAfterDiscount;

	@Column(name="fee_discount_id")
	@NotNull(message = "feeDiscountId field can not be Null")
	private Integer feeDiscountId;

	@Column(name="fee_name")
	@NotNull(message = "feeName field can not be Null")
	private String feeName;

	@Column(name="is_discount")
	@NotNull(message = "isDiscount field can not be Null")
	private Boolean isDiscount;

	@Column(name="mapping_id")
	@NotNull(message = "mappingId field can not be Null")
	private Integer mappingId;

	@Column(name="payable_mode_id")
	@NotNull(message = "payableModeId field can not be Null")
	private Integer payableModeId;

	//bi-directional many-to-one association to AcademicTblSection
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="section_id")
	@NotNull(message = "AcademicTblSection field can not be Null")
	@JsonBackReference
	private AcademicTblSection academicTblSection;

	@Column(name="update_date")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date updateDate;

	//bi-directional many-to-one association to AcademicTblClass
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="class_id")
	@NotNull(message = "AcademicTblClass field can not be Null")
	@JsonBackReference
	private AcademicTblClass academicTblClass;

	//bi-directional many-to-one association to FeeTblFeehead
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="fee_head_id")
	@NotNull(message = "FeeTblFeehead field can not be Null")
	@JsonBackReference
	private FeeTblFeehead feeTblFeehead;

	//bi-directional many-to-one association to ShareTblEmpstaffdetail
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="created_by")
	@NotNull(message = "ShareTblEmpstaffdetail field can not be Null")
	@JsonBackReference
	private ShareTblEmpstaffdetail shareTblEmpstaffdetail;

	//bi-directional many-to-one association to ShareTblStudent
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="student_id")
	@NotNull(message = "ShareTblStudent field can not be Null")
	@JsonBackReference
	private ShareTblStudent shareTblStudent;

	public FeeTblFeesubscription() {
	}

	public Integer getFeeSubscriptionId() {
		return this.feeSubscriptionId;
	}

	public void setFeeSubscriptionId(Integer feeSubscriptionId) {
		this.feeSubscriptionId = feeSubscriptionId;
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

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public BigDecimal getFeeAfterDiscount() {
		return this.feeAfterDiscount;
	}

	public void setFeeAfterDiscount(BigDecimal feeAfterDiscount) {
		this.feeAfterDiscount = feeAfterDiscount;
	}

	public Integer getFeeDiscountId() {
		return this.feeDiscountId;
	}

	public void setFeeDiscountId(Integer feeDiscountId) {
		this.feeDiscountId = feeDiscountId;
	}

	public String getFeeName() {
		return this.feeName;
	}

	public void setFeeName(String feeName) {
		this.feeName = feeName;
	}

	public Boolean getIsDiscount() {
		return this.isDiscount;
	}

	public void setIsDiscount(Boolean isDiscount) {
		this.isDiscount = isDiscount;
	}

	public Integer getMappingId() {
		return this.mappingId;
	}

	public void setMappingId(Integer mappingId) {
		this.mappingId = mappingId;
	}

	public Integer getPayableModeId() {
		return this.payableModeId;
	}

	public void setPayableModeId(Integer payableModeId) {
		this.payableModeId = payableModeId;
	}

	/*public Integer getSectionId() {
		return this.sectionId;
	}

	public void setSectionId(Integer sectionId) {
		this.sectionId = sectionId;
	}*/

	public AcademicTblSection getAcademicTblSection() {
		return this.academicTblSection;
	}

	public void setAcademicTblSection(AcademicTblSection academicTblSection) {
		this.academicTblSection = academicTblSection;
	}
	
	public AcademicTblClass getAcademicTblClass() {
		return this.academicTblClass;
	}

	public void setAcademicTblClass(AcademicTblClass academicTblClass) {
		this.academicTblClass = academicTblClass;
	}

	public FeeTblFeehead getFeeTblFeehead() {
		return this.feeTblFeehead;
	}

	public void setFeeTblFeehead(FeeTblFeehead feeTblFeehead) {
		this.feeTblFeehead = feeTblFeehead;
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