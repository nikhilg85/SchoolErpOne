package com.education.erp.entity;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Length.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the fee_tbl_feecategory database table.
 * 
 */
@Entity
@Table(name="fee_tbl_feecategory")
@NamedQuery(name="FeeTblFeecategory.findAll", query="SELECT f FROM FeeTblFeecategory f")
public class FeeTblFeecategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="fee_category_id")
	private Integer feeCategoryId;

	@Column(name="academic_id")
	@NotNull(message="Academic Id field can not be Null")
	private Integer academicId;

	@Column(name="active_flag")
	@Max(1)
	private Integer activeFlag;

	@Column(name="create_date")
	private Date createDate;

	private String description;

	@Column(name="fee_category_name")
	@NotNull(message="Fee Category Name field can not be Null")
	@List({
	    @Length(min = 5, message = "The field must be at least 5 characters"),
	    @Length(max = 100, message = "The field must be less than 100 characters")
	})
	private String feeCategoryName;

	@Column(name="update_date")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date updateDate;

	//bi-directional many-to-one association to ShareTblEmpstaffdetail
	@ManyToOne(fetch=FetchType.LAZY)
	@JsonBackReference
	@JoinColumn(name="created_by")
	@NotNull(message="ShareTblEmpstaffdetail field can not be Null")
	private ShareTblEmpstaffdetail shareTblEmpstaffdetail;

	//bi-directional many-to-one association to FeeTblFeehead
	@OneToMany(mappedBy="feeTblFeecategory")
	@JsonManagedReference
	private Set<FeeTblFeehead> feeTblFeeheads;

	public FeeTblFeecategory() {
	}

	public Integer getFeeCategoryId() {
		return this.feeCategoryId;
	}

	public void setFeeCategoryId(Integer feeCategoryId) {
		this.feeCategoryId = feeCategoryId;
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


	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFeeCategoryName() {
		return this.feeCategoryName;
	}

	public void setFeeCategoryName(String feeCategoryName) {
		this.feeCategoryName = feeCategoryName;
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

	public Set<FeeTblFeehead> getFeeTblFeeheads() {
		return this.feeTblFeeheads;
	}

	public void setFeeTblFeeheads(Set<FeeTblFeehead> feeTblFeeheads) {
		this.feeTblFeeheads = feeTblFeeheads;
	}

	public FeeTblFeehead addFeeTblFeehead(FeeTblFeehead feeTblFeehead) {
		getFeeTblFeeheads().add(feeTblFeehead);
		feeTblFeehead.setFeeTblFeecategory(this);

		return feeTblFeehead;
	}

	public FeeTblFeehead removeFeeTblFeehead(FeeTblFeehead feeTblFeehead) {
		getFeeTblFeeheads().remove(feeTblFeehead);
		feeTblFeehead.setFeeTblFeecategory(null);

		return feeTblFeehead;
	}

}