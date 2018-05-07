package com.education.erp.entity;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the share_tbl_student_category database table.
 * 
 */
@Entity
@Table(name="share_tbl_student_category")
@NamedQuery(name="ShareTblStudentCategory.findAll", query="SELECT s FROM ShareTblStudentCategory s")
public class ShareTblStudentCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="student_category_id")
	private Integer studentCategoryId;

	@Column(name="active_flag")
	private Integer activeFlag;

	@Column(name="category_type")
	private String categoryType;

	@Column(name="create_date")
	private Date createDate;

	@Column(name="update_date")
	private Date updateDate;

	//bi-directional many-to-one association to FeeTblDiscounttype
	@OneToMany(mappedBy="shareTblStudentCategory")
	private Set<FeeTblDiscounttype> feeTblDiscounttypes;

	//bi-directional many-to-one association to ShareTblEmpstaffdetail
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="created_by")
	private ShareTblEmpstaffdetail shareTblEmpstaffdetail;

	public ShareTblStudentCategory() {
	}

	public Integer getStudentCategoryId() {
		return this.studentCategoryId;
	}

	public void setStudentCategoryId(Integer studentCategoryId) {
		this.studentCategoryId = studentCategoryId;
	}

	public Integer getActiveFlag() {
		return this.activeFlag;
	}

	public void setActiveFlag(Integer activeFlag) {
		this.activeFlag = activeFlag;
	}

	public String getCategoryType() {
		return this.categoryType;
	}

	public void setCategoryType(String categoryType) {
		this.categoryType = categoryType;
	}

	public Set<FeeTblDiscounttype> getFeeTblDiscounttypes() {
		return this.feeTblDiscounttypes;
	}

	public void setFeeTblDiscounttypes(Set<FeeTblDiscounttype> feeTblDiscounttypes) {
		this.feeTblDiscounttypes = feeTblDiscounttypes;
	}

	public FeeTblDiscounttype addFeeTblDiscounttype(FeeTblDiscounttype feeTblDiscounttype) {
		getFeeTblDiscounttypes().add(feeTblDiscounttype);
		feeTblDiscounttype.setShareTblStudentCategory(this);

		return feeTblDiscounttype;
	}

	public FeeTblDiscounttype removeFeeTblDiscounttype(FeeTblDiscounttype feeTblDiscounttype) {
		getFeeTblDiscounttypes().remove(feeTblDiscounttype);
		feeTblDiscounttype.setShareTblStudentCategory(null);

		return feeTblDiscounttype;
	}

	public ShareTblEmpstaffdetail getShareTblEmpstaffdetail() {
		return this.shareTblEmpstaffdetail;
	}

	public void setShareTblEmpstaffdetail(ShareTblEmpstaffdetail shareTblEmpstaffdetail) {
		this.shareTblEmpstaffdetail = shareTblEmpstaffdetail;
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