package com.education.erp.entity;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the fee_tbl_discounttype database table.
 * 
 */
@Entity
@Table(name="fee_tbl_discounttype")
@NamedQuery(name="FeeTblDiscounttype.findAll", query="SELECT f FROM FeeTblDiscounttype f")
public class FeeTblDiscounttype implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="discount_type_id")
	private Integer discountTypeId;

	@Column(name="academic_id")
	@NotNull(message = "Academic Id field can not be Null")
	private Integer academicId;

	@Column(name="active_flag")
	@NotNull(message = "Active Flag field can not be Null")
	@Max(1)
	private Integer activeFlag;

	@Column(name="create_date")
	@NotNull(message = "Create Date field can not be Null")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createDate;

	@Column(name="update_date")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date updateDate;

	//bi-directional many-to-one association to ShareTblEmpstaffdetail
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="created_by")
	@JsonBackReference
	@NotNull(message = "ShareTblEmpstaffdetail field can not be Null")
	private ShareTblEmpstaffdetail shareTblEmpstaffdetail;

	//bi-directional many-to-one association to ShareTblStudentCategory
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="category_type_id")
	@JsonBackReference
	@NotNull(message = "ShareTblStudentCategory field can not be Null")
	private ShareTblStudentCategory shareTblStudentCategory;

	//bi-directional many-to-one association to FeeTblFeediscount
	@OneToMany(mappedBy="feeTblDiscounttype")
	@JsonManagedReference
	private Set<FeeTblFeediscount> feeTblFeediscounts;

	public FeeTblDiscounttype() {
	}

	public Integer getDiscountTypeId() {
		return this.discountTypeId;
	}

	public void setDiscountTypeId(Integer discountTypeId) {
		this.discountTypeId = discountTypeId;
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

	public ShareTblEmpstaffdetail getShareTblEmpstaffdetail() {
		return this.shareTblEmpstaffdetail;
	}

	public void setShareTblEmpstaffdetail(ShareTblEmpstaffdetail shareTblEmpstaffdetail) {
		this.shareTblEmpstaffdetail = shareTblEmpstaffdetail;
	}

	public ShareTblStudentCategory getShareTblStudentCategory() {
		return this.shareTblStudentCategory;
	}

	public void setShareTblStudentCategory(ShareTblStudentCategory shareTblStudentCategory) {
		this.shareTblStudentCategory = shareTblStudentCategory;
	}

	public Set<FeeTblFeediscount> getFeeTblFeediscounts() {
		return this.feeTblFeediscounts;
	}

	public void setFeeTblFeediscounts(Set<FeeTblFeediscount> feeTblFeediscounts) {
		this.feeTblFeediscounts = feeTblFeediscounts;
	}

	public FeeTblFeediscount addFeeTblFeediscount(FeeTblFeediscount feeTblFeediscount) {
		getFeeTblFeediscounts().add(feeTblFeediscount);
		feeTblFeediscount.setFeeTblDiscounttype(this);

		return feeTblFeediscount;
	}

	public FeeTblFeediscount removeFeeTblFeediscount(FeeTblFeediscount feeTblFeediscount) {
		getFeeTblFeediscounts().remove(feeTblFeediscount);
		feeTblFeediscount.setFeeTblDiscounttype(null);

		return feeTblFeediscount;
	}

}