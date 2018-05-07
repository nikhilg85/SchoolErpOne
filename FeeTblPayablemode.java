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

import java.sql.Timestamp;
import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the fee_tbl_payablemode database table.
 * 
 */
@Entity
@Table(name="fee_tbl_payablemode")
@NamedQuery(name="FeeTblPayablemode.findAll", query="SELECT f FROM FeeTblPayablemode f")
public class FeeTblPayablemode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="payablemode_id")
	private Integer payablemodeId;

	@Column(name="academic_id")
	@NotNull(message = "This field can not be Null")
	private Integer academicId;

	@Column(name="active_flag")
	@Max(1)
	private Integer activeFlag;

	@Column(name="create_date")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createDate;

	@Column(name="payable_type")
	@NotNull(message = "This field can not be Null")
	@List({
	    @Length(min = 5, message = "The field must be at least 5 characters"),
	    @Length(max = 50, message = "The field must be less than 50 characters")
	})
	private String payableType;

	@Column(name="update_date")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date updateDate;

	//bi-directional many-to-one association to FeeTblFeehead
	@OneToMany(mappedBy="feeTblPayablemode")
	@JsonManagedReference
	private Set<FeeTblFeehead> feeTblFeeheads;

	//bi-directional many-to-one association to ShareTblEmpstaffdetail
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="created_by")
	@JsonBackReference
	@NotNull
	private ShareTblEmpstaffdetail shareTblEmpstaffdetail;

	public FeeTblPayablemode() {
	}

	public Integer getPayablemodeId() {
		return this.payablemodeId;
	}

	public void setPayablemodeId(Integer payablemodeId) {
		this.payablemodeId = payablemodeId;
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

	public String getPayableType() {
		return this.payableType;
	}

	public void setPayableType(String payableType) {
		this.payableType = payableType;
	}

	public Set<FeeTblFeehead> getFeeTblFeeheads() {
		return this.feeTblFeeheads;
	}

	public void setFeeTblFeeheads(Set<FeeTblFeehead> feeTblFeeheads) {
		this.feeTblFeeheads = feeTblFeeheads;
	}

	public FeeTblFeehead addFeeTblFeehead(FeeTblFeehead feeTblFeehead) {
		getFeeTblFeeheads().add(feeTblFeehead);
		feeTblFeehead.setFeeTblPayablemode(this);

		return feeTblFeehead;
	}

	public FeeTblFeehead removeFeeTblFeehead(FeeTblFeehead feeTblFeehead) {
		getFeeTblFeeheads().remove(feeTblFeehead);
		feeTblFeehead.setFeeTblPayablemode(null);

		return feeTblFeehead;
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