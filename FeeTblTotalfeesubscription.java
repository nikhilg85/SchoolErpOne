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
import java.util.Set;


/**
 * The persistent class for the fee_tbl_totalfeesubscription database table.
 * 
 */
@Entity
@Table(name="fee_tbl_totalfeesubscription")
@NamedQuery(name="FeeTblTotalfeesubscription.findAll", query="SELECT f FROM FeeTblTotalfeesubscription f")
public class FeeTblTotalfeesubscription implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="total_feesubscription_id")
	private Integer totalFeesubscriptionId;

	@Column(name="academic_id")
	@NotNull(message = "academicId field can not be Null")
	@Max(1)
	private Integer academicId;

	@Column(name="active_flag")
	@NotNull(message = "activeFlag field can not be Null")
	private Integer activeFlag;

	@Column(name="create_date")
	@NotNull(message = "createDate field can not be Null")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createDate;

	@Column(name="fee_name")
	@NotNull(message = "feeName field can not be Null")
	private String feeName;

	@Column(name="mapping_id")
	@NotNull(message = "mappingId field can not be Null")
	private Integer mappingId;

	//bi-directional many-to-one association to AcademicTblSection
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="section_id")
	@NotNull(message = "academicTblSection field can not be Null")
	@JsonBackReference
	private AcademicTblSection academicTblSection;

	@Column(name="total_amount")
	@NotNull(message = "totalAmount field can not be Null")
	private BigDecimal totalAmount;

	@Column(name="total_amount_after_discount")
	@NotNull(message = "totalAmountAfterDiscount field can not be Null")
	private BigDecimal totalAmountAfterDiscount;

	@Column(name="total_discount_amount")
	@NotNull(message = "totalDiscountAmount field can not be Null")
	private BigDecimal totalDiscountAmount;

	@Column(name="update_date")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date updateDate;

	//bi-directional many-to-one association to FeeTblInvoice
	@OneToMany(mappedBy="feeTblTotalfeesubscription")
	private Set<FeeTblInvoice> feeTblInvoices;

	//bi-directional many-to-one association to AcademicTblClass
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="class_id")
	@NotNull(message = "academicTblClass field can not be Null")
	@JsonBackReference
	private AcademicTblClass academicTblClass;

	//bi-directional many-to-one association to ShareTblEmpstaffdetail
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="created_by")
	@NotNull(message = "shareTblEmpstaffdetail field can not be Null")
	@JsonBackReference
	private ShareTblEmpstaffdetail shareTblEmpstaffdetail;

	//bi-directional many-to-one association to ShareTblStudent
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="student_id")
	@NotNull(message = "shareTblStudent field can not be Null")
	@JsonBackReference
	private ShareTblStudent shareTblStudent;

	public FeeTblTotalfeesubscription() {
	}

	public Integer getTotalFeesubscriptionId() {
		return this.totalFeesubscriptionId;
	}

	public void setTotalFeesubscriptionId(Integer totalFeesubscriptionId) {
		this.totalFeesubscriptionId = totalFeesubscriptionId;
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

	public String getFeeName() {
		return this.feeName;
	}

	public void setFeeName(String feeName) {
		this.feeName = feeName;
	}

	public Integer getMappingId() {
		return this.mappingId;
	}

	public void setMappingId(Integer mappingId) {
		this.mappingId = mappingId;
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

	public BigDecimal getTotalAmount() {
		return this.totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	public BigDecimal getTotalAmountAfterDiscount() {
		return this.totalAmountAfterDiscount;
	}

	public void setTotalAmountAfterDiscount(BigDecimal totalAmountAfterDiscount) {
		this.totalAmountAfterDiscount = totalAmountAfterDiscount;
	}

	public BigDecimal getTotalDiscountAmount() {
		return this.totalDiscountAmount;
	}

	public void setTotalDiscountAmount(BigDecimal totalDiscountAmount) {
		this.totalDiscountAmount = totalDiscountAmount;
	}

	public Set<FeeTblInvoice> getFeeTblInvoices() {
		return this.feeTblInvoices;
	}

	public void setFeeTblInvoices(Set<FeeTblInvoice> feeTblInvoices) {
		this.feeTblInvoices = feeTblInvoices;
	}

	public FeeTblInvoice addFeeTblInvoice(FeeTblInvoice feeTblInvoice) {
		getFeeTblInvoices().add(feeTblInvoice);
		feeTblInvoice.setFeeTblTotalfeesubscription(this);

		return feeTblInvoice;
	}

	public FeeTblInvoice removeFeeTblInvoice(FeeTblInvoice feeTblInvoice) {
		getFeeTblInvoices().remove(feeTblInvoice);
		feeTblInvoice.setFeeTblTotalfeesubscription(null);

		return feeTblInvoice;
	}

	public AcademicTblClass getAcademicTblClass() {
		return this.academicTblClass;
	}

	public void setAcademicTblClass(AcademicTblClass academicTblClass) {
		this.academicTblClass = academicTblClass;
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