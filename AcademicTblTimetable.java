package com.education.erp.entity;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Timestamp;
import java.util.Date;


/**
 * The persistent class for the academic_tbl_timetable database table.
 * 
 */
@Entity
@Table(name="academic_tbl_timetable")
@NamedQuery(name="AcademicTblTimetable.findAll", query="SELECT a FROM AcademicTblTimetable a")
public class AcademicTblTimetable implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="timetable_id")
	private Integer timetableId;

	@Column(name="academic_id")
	private Integer academicId;

	@Column(name="active_flag")
	private Integer activeFlag;

	@Column(name="comm_subject_id")
	private Integer commSubjectId;

	@Column(name="create_date")
	private Date createDate;

	private String description;

	@Column(name="staff_id")
	private Integer staffId;

	@Column(name="update_date")
	private Date updateDate;

	//bi-directional many-to-one association to AcademicTblClass
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="class_id")
	private AcademicTblClass academicTblClass;

	//bi-directional many-to-one association to AcademicTblClasstime
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="class_time_id")
	private AcademicTblClasstime academicTblClasstime;

	//bi-directional many-to-one association to AcademicTblSection
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="section_id")
	private AcademicTblSection academicTblSection;

	//bi-directional many-to-one association to AcademicTblSubject
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="subject_id")
	private AcademicTblSubject academicTblSubject;

	//bi-directional many-to-one association to AcademicTblWeekday
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="week_day_id")
	private AcademicTblWeekday academicTblWeekday;

	//bi-directional many-to-one association to ShareTblEmpstaffdetail
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="created_by")
	private ShareTblEmpstaffdetail shareTblEmpstaffdetail;

	public AcademicTblTimetable() {
	}

	public Integer getTimetableId() {
		return this.timetableId;
	}

	public void setTimetableId(Integer timetableId) {
		this.timetableId = timetableId;
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

	public Integer getCommSubjectId() {
		return this.commSubjectId;
	}

	public void setCommSubjectId(Integer commSubjectId) {
		this.commSubjectId = commSubjectId;
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getStaffId() {
		return this.staffId;
	}

	public void setStaffId(Integer staffId) {
		this.staffId = staffId;
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

	public AcademicTblClasstime getAcademicTblClasstime() {
		return this.academicTblClasstime;
	}

	public void setAcademicTblClasstime(AcademicTblClasstime academicTblClasstime) {
		this.academicTblClasstime = academicTblClasstime;
	}

	public AcademicTblSection getAcademicTblSection() {
		return this.academicTblSection;
	}

	public void setAcademicTblSection(AcademicTblSection academicTblSection) {
		this.academicTblSection = academicTblSection;
	}

	public AcademicTblSubject getAcademicTblSubject() {
		return this.academicTblSubject;
	}

	public void setAcademicTblSubject(AcademicTblSubject academicTblSubject) {
		this.academicTblSubject = academicTblSubject;
	}

	public AcademicTblWeekday getAcademicTblWeekday() {
		return this.academicTblWeekday;
	}

	public void setAcademicTblWeekday(AcademicTblWeekday academicTblWeekday) {
		this.academicTblWeekday = academicTblWeekday;
	}

	public ShareTblEmpstaffdetail getShareTblEmpstaffdetail() {
		return this.shareTblEmpstaffdetail;
	}

	public void setShareTblEmpstaffdetail(ShareTblEmpstaffdetail shareTblEmpstaffdetail) {
		this.shareTblEmpstaffdetail = shareTblEmpstaffdetail;
	}

}