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
 * The persistent class for the fee_tbl_feehead database table.
 * 
 */
@Entity
@Table(name="fee_tbl_feehead")
@NamedQuery(name="FeeTblFeehead.findAll", query="SELECT f FROM FeeTblFeehead f")
public class FeeTblFeehead implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="fee_head_id")
	private Integer feeHeadId;

	@Column(name="academic_id")
	@NotNull(message = "Academic id field can not be Null")
	private Integer academicId;

	@Column(name="active_flag")
	@Max(1)
	private Integer activeFlag;

	@Column(name="create_date")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createDate;

	@Column(name="description")
	@List({
	    @Length(min = 5, message = "The description field must be at least 5 characters"),
	    @Length(max = 500, message = "The description field must be less than 500 characters")
	})
	private String description;

	@Column(name="feehead_name")
	@NotNull(message = "Feehead Name field can not be Null")
	@List({
	    @Length(min = 5, message = "The feeheadName field must be at least 5 characters"),
	    @Length(max = 50, message = "The feeheadName field must be less than 50 characters")
	})
	private String feeheadName;

	@Column(name="print_status")
	@NotNull(message = "Print Status field can not be Null")
	private Boolean printStatus;

	@Column(name="update_date")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date updateDate;

	//bi-directional many-to-one association to FeeTblFeediscount
	@OneToMany(mappedBy="feeTblFeehead")
	@JsonManagedReference
	private Set<FeeTblFeediscount> feeTblFeediscounts;

	//bi-directional many-to-one association to FeeTblFeecategory
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="fee_category_id")
	@NotNull(message = "Category_id field can not be Null")
	@JsonBackReference
	private FeeTblFeecategory feeTblFeecategory;

	//bi-directional many-to-one association to FeeTblPayablemode
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="payable_mode_id")
	@NotNull(message = "Payable Mode id field can not be Null")
	@JsonBackReference
	private FeeTblPayablemode feeTblPayablemode;

	//bi-directional many-to-one association to ShareTblEmpstaffdetail
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="created_by")
	@NotNull(message = "Created By field can not be Null")
	@JsonBackReference
	private ShareTblEmpstaffdetail shareTblEmpstaffdetail;

	//bi-directional many-to-one association to FeeTblFeesubscription
	@OneToMany(mappedBy="feeTblFeehead")
	@JsonManagedReference
	private Set<FeeTblFeesubscription> feeTblFeesubscriptions;

	public FeeTblFeehead() {
	}

	public Integer getFeeHeadId() {
		return this.feeHeadId;
	}

	public void setFeeHeadId(Integer feeHeadId) {
		this.feeHeadId = feeHeadId;
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

	public String getFeeheadName() {
		return this.feeheadName;
	}

	public void setFeeheadName(String feeheadName) {
		this.feeheadName = feeheadName;
	}

	public Boolean getPrintStatus() {
		return this.printStatus;
	}

	public void setPrintStatus(Boolean printStatus) {
		this.printStatus = printStatus;
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

	public Set<FeeTblFeediscount> getFeeTblFeediscounts() {
		return this.feeTblFeediscounts;
	}

	public void setFeeTblFeediscounts(Set<FeeTblFeediscount> feeTblFeediscounts) {
		this.feeTblFeediscounts = feeTblFeediscounts;
	}

	public FeeTblFeediscount addFeeTblFeediscount(FeeTblFeediscount feeTblFeediscount) {
		getFeeTblFeediscounts().add(feeTblFeediscount);
		feeTblFeediscount.setFeeTblFeehead(this);

		return feeTblFeediscount;
	}

	public FeeTblFeediscount removeFeeTblFeediscount(FeeTblFeediscount feeTblFeediscount) {
		getFeeTblFeediscounts().remove(feeTblFeediscount);
		feeTblFeediscount.setFeeTblFeehead(null);

		return feeTblFeediscount;
	}

	public FeeTblFeecategory getFeeTblFeecategory() {
		return this.feeTblFeecategory;
	}

	public void setFeeTblFeecategory(FeeTblFeecategory feeTblFeecategory) {
		this.feeTblFeecategory = feeTblFeecategory;
	}

	public FeeTblPayablemode getFeeTblPayablemode() {
		return this.feeTblPayablemode;
	}

	public void setFeeTblPayablemode(FeeTblPayablemode feeTblPayablemode) {
		this.feeTblPayablemode = feeTblPayablemode;
	}

	public ShareTblEmpstaffdetail getShareTblEmpstaffdetail() {
		return this.shareTblEmpstaffdetail;
	}

	public void setShareTblEmpstaffdetail(ShareTblEmpstaffdetail shareTblEmpstaffdetail) {
		this.shareTblEmpstaffdetail = shareTblEmpstaffdetail;
	}

	public Set<FeeTblFeesubscription> getFeeTblFeesubscriptions() {
		return this.feeTblFeesubscriptions;
	}

	public void setFeeTblFeesubscriptions(Set<FeeTblFeesubscription> feeTblFeesubscriptions) {
		this.feeTblFeesubscriptions = feeTblFeesubscriptions;
	}

	public FeeTblFeesubscription addFeeTblFeesubscription(FeeTblFeesubscription feeTblFeesubscription) {
		getFeeTblFeesubscriptions().add(feeTblFeesubscription);
		feeTblFeesubscription.setFeeTblFeehead(this);

		return feeTblFeesubscription;
	}

	public FeeTblFeesubscription removeFeeTblFeesubscription(FeeTblFeesubscription feeTblFeesubscription) {
		getFeeTblFeesubscriptions().remove(feeTblFeesubscription);
		feeTblFeesubscription.setFeeTblFeehead(null);

		return feeTblFeesubscription;
	}

}