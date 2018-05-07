package com.education.erp.entity;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Timestamp;
import java.util.Date;


/**
 * The persistent class for the share_tbl_qualificationemp database table.
 * 
 */
@Entity
@Table(name="share_tbl_qualificationemp")
@NamedQuery(name="ShareTblQualificationemp.findAll", query="SELECT s FROM ShareTblQualificationemp s")
public class ShareTblQualificationemp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="qualification_id")
	private Integer qualificationId;

	@Column(name="active_flag")
	private Integer activeFlag;

	@Column(name="create_date")
	private Date createDate;

	private String description;

	@Column(name="qualification_name")
	private String qualificationName;

	@Column(name="qualification_type")
	private String qualificationType;

	@Column(name="update_date")
	private Date updateDate;

	//bi-directional many-to-one association to ShareTblEmpstaffdetail
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="created_by")
	private ShareTblEmpstaffdetail shareTblEmpstaffdetail;

	public ShareTblQualificationemp() {
	}

	public Integer getQualificationId() {
		return this.qualificationId;
	}

	public void setQualificationId(Integer qualificationId) {
		this.qualificationId = qualificationId;
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

	public String getQualificationName() {
		return this.qualificationName;
	}

	public void setQualificationName(String qualificationName) {
		this.qualificationName = qualificationName;
	}

	public String getQualificationType() {
		return this.qualificationType;
	}

	public void setQualificationType(String qualificationType) {
		this.qualificationType = qualificationType;
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