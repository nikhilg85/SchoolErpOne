package com.education.erp.entity;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the share_tbl_annualholiday database table.
 * 
 */
@Entity
@Table(name="share_tbl_annualholiday")
@NamedQuery(name="ShareTblAnnualholiday.findAll", query="SELECT s FROM ShareTblAnnualholiday s")
public class ShareTblAnnualholiday implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="annual_holiday_id")
	private Integer annualHolidayId;

	@Column(name="academic_id")
	private Integer academicId;

	@Column(name="active_flag")
	private Integer activeFlag;

	@Column(name="create_date")
	private Date createDate;

	private String description;

	@Temporal(TemporalType.DATE)
	private Date endon;

	@Column(name="full_day")
	private Boolean fullDay;

	@Temporal(TemporalType.DATE)
	private Date starton;

	private String title;

	@Column(name="update_date")
	private Date updateDate;

	//bi-directional many-to-one association to ShareTblEmpstaffdetail
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="created_by")
	private ShareTblEmpstaffdetail shareTblEmpstaffdetail;

	public ShareTblAnnualholiday() {
	}

	public Integer getAnnualHolidayId() {
		return this.annualHolidayId;
	}

	public void setAnnualHolidayId(Integer annualHolidayId) {
		this.annualHolidayId = annualHolidayId;
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

	public Date getEndon() {
		return this.endon;
	}

	public void setEndon(Date endon) {
		this.endon = endon;
	}

	public Boolean getFullDay() {
		return this.fullDay;
	}

	public void setFullDay(Boolean fullDay) {
		this.fullDay = fullDay;
	}

	public Date getStarton() {
		return this.starton;
	}

	public void setStarton(Date starton) {
		this.starton = starton;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
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