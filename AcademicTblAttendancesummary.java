package com.education.erp.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;


/**
 * The persistent class for the academic_tbl_attendancesummary database table.
 * 
 */
@Entity
@Table(name="academic_tbl_attendancesummary")
@NamedQuery(name="AcademicTblAttendancesummary.findAll", query="SELECT a FROM AcademicTblAttendancesummary a")
public class AcademicTblAttendancesummary implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="attendance_summery_id")
	private Integer attendanceSummeryId;

	@Column(name="academic_id")
	private Integer academicId;

	@Column(name="active_flag")
	private Integer activeFlag;

	@Column(name="create_date")
	private Date createDate;

	@Column(name="created_by")
	private Integer createdBy;

	private Integer month;

	@Column(name="section_id")
	private Integer sectionId;

	@Column(name="total_absent_days")
	private Integer totalAbsentDays;

	@Column(name="total_days")
	private Integer totalDays;

	@Column(name="total_leave_days")
	private Integer totalLeaveDays;

	@Column(name="total_present_days")
	private Integer totalPresentDays;

	@Column(name="update_date")
	private Date updateDate;

	private Integer year;

	//bi-directional many-to-one association to AcademicTblClass
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="class_id")
	private AcademicTblClass academicTblClass;

	//bi-directional many-to-one association to ShareTblStudent
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="student_id")
	private ShareTblStudent shareTblStudent;

	public AcademicTblAttendancesummary() {
	}

	public Integer getAttendanceSummeryId() {
		return this.attendanceSummeryId;
	}

	public void setAttendanceSummeryId(Integer attendanceSummeryId) {
		this.attendanceSummeryId = attendanceSummeryId;
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
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Integer getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	public Integer getMonth() {
		return this.month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}

	public Integer getSectionId() {
		return this.sectionId;
	}

	public void setSectionId(Integer sectionId) {
		this.sectionId = sectionId;
	}

	public Integer getTotalAbsentDays() {
		return this.totalAbsentDays;
	}

	public void setTotalAbsentDays(Integer totalAbsentDays) {
		this.totalAbsentDays = totalAbsentDays;
	}

	public Integer getTotalDays() {
		return this.totalDays;
	}

	public void setTotalDays(Integer totalDays) {
		this.totalDays = totalDays;
	}

	public Integer getTotalLeaveDays() {
		return this.totalLeaveDays;
	}

	public void setTotalLeaveDays(Integer totalLeaveDays) {
		this.totalLeaveDays = totalLeaveDays;
	}

	public Integer getTotalPresentDays() {
		return this.totalPresentDays;
	}

	public void setTotalPresentDays(Integer totalPresentDays) {
		this.totalPresentDays = totalPresentDays;
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Integer getYear() {
		return this.year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public AcademicTblClass getAcademicTblClass() {
		return this.academicTblClass;
	}

	public void setAcademicTblClass(AcademicTblClass academicTblClass) {
		this.academicTblClass = academicTblClass;
	}

	public ShareTblStudent getShareTblStudent() {
		return this.shareTblStudent;
	}

	public void setShareTblStudent(ShareTblStudent shareTblStudent) {
		this.shareTblStudent = shareTblStudent;
	}

}