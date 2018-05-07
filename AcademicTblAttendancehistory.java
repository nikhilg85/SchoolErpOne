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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;


/**
 * The persistent class for the academic_tbl_attendancehistory database table.
 * 
 */
@Entity
@Table(name="academic_tbl_attendancehistory")
@NamedQuery(name="AcademicTblAttendancehistory.findAll", query="SELECT a FROM AcademicTblAttendancehistory a")
public class AcademicTblAttendancehistory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="attendance_id")
	private Integer attendanceId;

	@Column(name="academic_id")
	private Integer academicId;

	@Column(name="active_flag")
	private Integer activeFlag;

	@Temporal(TemporalType.DATE)
	@Column(name="attandance_date")
	private Date attandanceDate;

	@Column(name="create_date")
	private Date createDate;

	@Column(name="present_absent_flag")
	private Integer presentAbsentFlag;

	@Column(name="reason_for_leave")
	private String reasonForLeave;

	@Column(name="update_date")
	private Date updateDate;

	//bi-directional many-to-one association to AcademicTblClass
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="class_id")
	private AcademicTblClass academicTblClass;

	//bi-directional many-to-one association to AcademicTblSection
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="section_id")
	private AcademicTblSection academicTblSection;

	//bi-directional many-to-one association to ShareTblEmpstaffdetail
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="created_by")
	private ShareTblEmpstaffdetail shareTblEmpstaffdetail;

	//bi-directional many-to-one association to ShareTblStudent
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="student_id")
	private ShareTblStudent shareTblStudent;

	public AcademicTblAttendancehistory() {
	}

	public Integer getAttendanceId() {
		return this.attendanceId;
	}

	public void setAttendanceId(Integer attendanceId) {
		this.attendanceId = attendanceId;
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

	public Date getAttandanceDate() {
		return this.attandanceDate;
	}

	public void setAttandanceDate(Date attandanceDate) {
		this.attandanceDate = attandanceDate;
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Integer getPresentAbsentFlag() {
		return this.presentAbsentFlag;
	}

	public void setPresentAbsentFlag(Integer presentAbsentFlag) {
		this.presentAbsentFlag = presentAbsentFlag;
	}

	public String getReasonForLeave() {
		return this.reasonForLeave;
	}

	public void setReasonForLeave(String reasonForLeave) {
		this.reasonForLeave = reasonForLeave;
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public AcademicTblClass getAcademicTblClass() {
		return this.academicTblClass;
	}

	public void setAcademicTblClass(AcademicTblClass academicTblClass) {
		this.academicTblClass = academicTblClass;
	}

	public AcademicTblSection getAcademicTblSection() {
		return this.academicTblSection;
	}

	public void setAcademicTblSection(AcademicTblSection academicTblSection) {
		this.academicTblSection = academicTblSection;
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