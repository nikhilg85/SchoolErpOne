package com.education.erp.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;


/**
 * The persistent class for the academic_tbl_subject database table.
 * 
 */
@Entity
@Table(name="academic_tbl_subject")
@NamedQuery(name="AcademicTblSubject.findAll", query="SELECT a FROM AcademicTblSubject a")
public class AcademicTblSubject implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="subject_id")
	private Integer subjectId;

	@Column(name="academic_id")
	private Integer academicId;

	@Column(name="active_flag")
	private Integer activeFlag;

	@Column(name="class_id")
	private Integer classId;

	@Column(name="create_by")
	private Integer createBy;

	@Column(name="create_date")
	private Date createDate;

	private String description;

	@Column(name="subject_name")
	private String subjectName;

	@Column(name="update_date")
	private Date updateDate;

	//bi-directional one-to-one association to AcademicTblClass
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="subject_id")
	private AcademicTblClass academicTblClass;

	//bi-directional many-to-one association to AcademicTblSection
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="section_id")
	private AcademicTblSection academicTblSection;

	//bi-directional one-to-one association to ShareTblEmpstaffdetail
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="subject_id")
	private ShareTblEmpstaffdetail shareTblEmpstaffdetail;

	//bi-directional many-to-one association to AcademicTblTimetable
	@OneToMany(mappedBy="academicTblSubject")
	private Set<AcademicTblTimetable> academicTblTimetables;

	public AcademicTblSubject() {
	}

	public Integer getSubjectId() {
		return this.subjectId;
	}

	public void setSubjectId(Integer subjectId) {
		this.subjectId = subjectId;
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

	public Integer getClassId() {
		return this.classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	public Integer getCreateBy() {
		return this.createBy;
	}

	public void setCreateBy(Integer createBy) {
		this.createBy = createBy;
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

	public String getSubjectName() {
		return this.subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
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

	public Set<AcademicTblTimetable> getAcademicTblTimetables() {
		return this.academicTblTimetables;
	}

	public void setAcademicTblTimetables(Set<AcademicTblTimetable> academicTblTimetables) {
		this.academicTblTimetables = academicTblTimetables;
	}

	public AcademicTblTimetable addAcademicTblTimetable(AcademicTblTimetable academicTblTimetable) {
		getAcademicTblTimetables().add(academicTblTimetable);
		academicTblTimetable.setAcademicTblSubject(this);

		return academicTblTimetable;
	}

	public AcademicTblTimetable removeAcademicTblTimetable(AcademicTblTimetable academicTblTimetable) {
		getAcademicTblTimetables().remove(academicTblTimetable);
		academicTblTimetable.setAcademicTblSubject(null);

		return academicTblTimetable;
	}

}