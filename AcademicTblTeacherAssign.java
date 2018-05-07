package com.education.erp.entity;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;


/**
 * The persistent class for the academic_tbl_teacher_assign database table.
 * 
 */
@Entity
@Table(name="academic_tbl_teacher_assign")
@NamedQuery(name="AcademicTblTeacherAssign.findAll", query="SELECT a FROM AcademicTblTeacherAssign a")
public class AcademicTblTeacherAssign implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="academic_id")
	private Integer academicId;

	@Column(name="academic_year_id")
	private Integer academicYearId;

	@Column(name="active_flag")
	private Integer activeFlag;

	@Column(name="attendance_id")
	private Integer attendanceId;

	@Column(name="class_id")
	private Integer classId;

	@Column(name="create_date")
	private Date createDate;

	@Column(name="teacher_assign_id")
	private Integer teacherAssignId;

	@Column(name="update_date")
	private Date updateDate;

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

	public AcademicTblTeacherAssign() {
	}

	public Integer getAcademicId() {
		return this.academicId;
	}

	public void setAcademicId(Integer academicId) {
		this.academicId = academicId;
	}

	public Integer getAcademicYearId() {
		return this.academicYearId;
	}

	public void setAcademicYearId(Integer academicYearId) {
		this.academicYearId = academicYearId;
	}

	public Integer getActiveFlag() {
		return this.activeFlag;
	}

	public void setActiveFlag(Integer activeFlag) {
		this.activeFlag = activeFlag;
	}

	public Integer getAttendanceId() {
		return this.attendanceId;
	}

	public void setAttendanceId(Integer attendanceId) {
		this.attendanceId = attendanceId;
	}

	public Integer getClassId() {
		return this.classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Integer getTeacherAssignId() {
		return this.teacherAssignId;
	}

	public void setTeacherAssignId(Integer teacherAssignId) {
		this.teacherAssignId = teacherAssignId;
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
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