package com.education.erp.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.annotation.Resource;
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
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import com.fasterxml.jackson.annotation.JsonFormat;


/**
 * The persistent class for the academic_tbl_section database table.
 * 
 */
@Resource
//Validator validator;
@Entity
@Table(name="academic_tbl_section")
@NamedQuery(name="AcademicTblSection.findAll", query="SELECT a FROM AcademicTblSection a")
public class AcademicTblSection implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="section_id")
	//@Column(unique = true)	
	private Integer sectionId;

	@Column(name="academic_id")
	@NotNull
	@NotBlank(message = "{academic.Id.empty}")
	private Integer academicId;

	
	@Column(name="active_flag")
	@NotNull
	@Max(1)
	private Integer activeFlag;

	@Column(name="create_date")
	@NotNull
	@NotBlank(message = "{create.date.empty}")
	@JsonFormat(pattern = "yyyy-Mm-dd HH:mm:ss")
	private Date createDate;

	@Column(name="section_name")
	@NotNull(message = " can not be null")
	@Size(max = 25)
	@NotBlank(message = "{section.name.empty}")
	@Digits(integer=10, fraction=0, message = "{section.name.invalid}")
	private String sectionName;

	@Column(name="update_date")
	@NotNull
	@NotBlank(message = "{update.date.empty}")
	@JsonFormat(pattern = "yyyy-Mm-dd HH:mm:ss")
	private Date updateDate;
	
	
	//bi-directional many-to-one association to AcademicTblAttendancehistory
	@OneToMany(mappedBy="academicTblSection")
	private Set<AcademicTblAttendancehistory> academicTblAttendancehistories;

	//bi-directional many-to-one association to AcademicTblClass
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="class_id")
	private AcademicTblClass academicTblClass;

	//bi-directional many-to-one association to AcademicTblSubject
	@OneToMany(mappedBy="academicTblSection")
	private Set<AcademicTblSubject> academicTblSubjects;

	//bi-directional many-to-one association to AcademicTblTeacherAssign
	@OneToMany(mappedBy="academicTblSection")
	private Set<AcademicTblTeacherAssign> academicTblTeacherAssigns;

	//bi-directional many-to-one association to AcademicTblTimetable
	@OneToMany(mappedBy="academicTblSection")
	private Set<AcademicTblTimetable> academicTblTimetables;

	
	
	
	public AcademicTblSection() {
	}

	public Integer getSectionId() {
		return this.sectionId;
	}

	public void setSectionId(Integer sectionId) {
		this.sectionId = sectionId;
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

	
	public String getSectionName() {
		return this.sectionName;
	}

	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Set<AcademicTblAttendancehistory> getAcademicTblAttendancehistories() {
		return this.academicTblAttendancehistories;
	}

	public void setAcademicTblAttendancehistories(Set<AcademicTblAttendancehistory> academicTblAttendancehistories) {
		this.academicTblAttendancehistories = academicTblAttendancehistories;
	}

	public AcademicTblAttendancehistory addAcademicTblAttendancehistory(AcademicTblAttendancehistory academicTblAttendancehistory) {
		getAcademicTblAttendancehistories().add(academicTblAttendancehistory);
		academicTblAttendancehistory.setAcademicTblSection(this);

		return academicTblAttendancehistory;
	}

	public AcademicTblAttendancehistory removeAcademicTblAttendancehistory(AcademicTblAttendancehistory academicTblAttendancehistory) {
		getAcademicTblAttendancehistories().remove(academicTblAttendancehistory);
		academicTblAttendancehistory.setAcademicTblSection(null);

		return academicTblAttendancehistory;
	}

	public AcademicTblClass getAcademicTblClass() {
		return this.academicTblClass;
	}

	public void setAcademicTblClass(AcademicTblClass academicTblClass) {
		this.academicTblClass = academicTblClass;
	}

	public Set<AcademicTblSubject> getAcademicTblSubjects() {
		return this.academicTblSubjects;
	}

	public void setAcademicTblSubjects(Set<AcademicTblSubject> academicTblSubjects) {
		this.academicTblSubjects = academicTblSubjects;
	}

	public AcademicTblSubject addAcademicTblSubject(AcademicTblSubject academicTblSubject) {
		getAcademicTblSubjects().add(academicTblSubject);
		academicTblSubject.setAcademicTblSection(this);

		return academicTblSubject;
	}

	public AcademicTblSubject removeAcademicTblSubject(AcademicTblSubject academicTblSubject) {
		getAcademicTblSubjects().remove(academicTblSubject);
		academicTblSubject.setAcademicTblSection(null);

		return academicTblSubject;
	}

	public Set<AcademicTblTeacherAssign> getAcademicTblTeacherAssigns() {
		return this.academicTblTeacherAssigns;
	}

	public void setAcademicTblTeacherAssigns(Set<AcademicTblTeacherAssign> academicTblTeacherAssigns) {
		this.academicTblTeacherAssigns = academicTblTeacherAssigns;
	}

	public AcademicTblTeacherAssign addAcademicTblTeacherAssign(AcademicTblTeacherAssign academicTblTeacherAssign) {
		getAcademicTblTeacherAssigns().add(academicTblTeacherAssign);
		academicTblTeacherAssign.setAcademicTblSection(this);

		return academicTblTeacherAssign;
	}

	public AcademicTblTeacherAssign removeAcademicTblTeacherAssign(AcademicTblTeacherAssign academicTblTeacherAssign) {
		getAcademicTblTeacherAssigns().remove(academicTblTeacherAssign);
		academicTblTeacherAssign.setAcademicTblSection(null);

		return academicTblTeacherAssign;
	}

	public Set<AcademicTblTimetable> getAcademicTblTimetables() {
		return this.academicTblTimetables;
	}

	public void setAcademicTblTimetables(Set<AcademicTblTimetable> academicTblTimetables) {
		this.academicTblTimetables = academicTblTimetables;
	}

	public AcademicTblTimetable addAcademicTblTimetable(AcademicTblTimetable academicTblTimetable) {
		getAcademicTblTimetables().add(academicTblTimetable);
		academicTblTimetable.setAcademicTblSection(this);

		return academicTblTimetable;
	}

	public AcademicTblTimetable removeAcademicTblTimetable(AcademicTblTimetable academicTblTimetable) {
		getAcademicTblTimetables().remove(academicTblTimetable);
		academicTblTimetable.setAcademicTblSection(null);

		return academicTblTimetable;
	}

}