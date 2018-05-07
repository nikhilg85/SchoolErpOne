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
 * The persistent class for the fee_tbl_feediscount database table.
 * 
 */
@Entity
@Table(name="fee_tbl_feediscount")
@NamedQuery(name="FeeTblFeediscount.findAll", query="SELECT f FROM FeeTblFeediscount f")
public class FeeTblFeediscount implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="fee_discount_id")
	private Integer feeDiscountId;

	@Column(name="academic_id")
	@NotNull(message = "AcademicId field can not be Null")
	private Integer academicId;

	@Column(name="active_flag")
	@NotNull(message = "ActiveFlag field can not be Null")
	@Max(1)
	private Integer activeFlag;

	@Column(name="create_date")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createDate;

	@Column(name="discount_mode")
	@NotNull(message = "Discount Mode field can not be Null")
	private Boolean discountMode;

	@Column(name="discount_value")
	@NotNull(message = "Discount Value field can not be Null")
	private BigDecimal discountValue;

	@Column(name="update_date")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date updateDate;

	//bi-directional many-to-one association to FeeTblDiscounttype
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="discount_type_id")
	@NotNull(message = "FeeTblDiscounttype field can not be Null")
	@JsonBackReference
	private FeeTblDiscounttype feeTblDiscounttype;

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

	public FeeTblFeediscount() {
	}

	public Integer getFeeDiscountId() {
		return this.feeDiscountId;
	}

	public void setFeeDiscountId(Integer feeDiscountId) {
		this.feeDiscountId = feeDiscountId;
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



	public Boolean getDiscountMode() {
		return this.discountMode;
	}

	public void setDiscountMode(Boolean discountMode) {
		this.discountMode = discountMode;
	}

	public BigDecimal getDiscountValue() {
		return this.discountValue;
	}

	public void setDiscountValue(BigDecimal discountValue) {
		this.discountValue = discountValue;
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

	public FeeTblDiscounttype getFeeTblDiscounttype() {
		return this.feeTblDiscounttype;
	}

	public void setFeeTblDiscounttype(FeeTblDiscounttype feeTblDiscounttype) {
		this.feeTblDiscounttype = feeTblDiscounttype;
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

}