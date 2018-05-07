package com.education.erp.entity;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the academic_tbl_class database table.
 * 
 */
@Entity
@Table(name="academic_tbl_class")
@NamedQuery(name="AcademicTblClass.findAll", query="SELECT a FROM AcademicTblClass a")
public class AcademicTblClass implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="class_id")
	private Integer classId;

	@Column(name="academic_id")
	private Integer academicId;

	@Column(name="active_flag")
	private Integer activeFlag;

	@Column(name="class_name")
	private String className;

	@Column(name="create_date")
	private Date createDate;

	@Column(name="created_by")
	private Integer createdBy;

	@Column(name="update_date")
	private Date updateDate;

	//bi-directional many-to-one association to AcademicTblAttendancehistory
	@OneToMany(mappedBy="academicTblClass")
	private Set<AcademicTblAttendancehistory> academicTblAttendancehistories;

	//bi-directional many-to-one association to AcademicTblAttendancesummary
	@OneToMany(mappedBy="academicTblClass")
	private Set<AcademicTblAttendancesummary> academicTblAttendancesummaries;

	//bi-directional many-to-one association to AcademicTblSection
	@OneToMany(mappedBy="academicTblClass")
	private Set<AcademicTblSection> academicTblSections;

	//bi-directional one-to-one association to AcademicTblSubject
	@OneToOne(mappedBy="academicTblClass", fetch=FetchType.LAZY)
	private AcademicTblSubject academicTblSubject;

	//bi-directional many-to-one association to AcademicTblTimetable
	@OneToMany(mappedBy="academicTblClass")
	private Set<AcademicTblTimetable> academicTblTimetables;

	//bi-directional many-to-one association to FeeTblFeesubscription
	@OneToMany(mappedBy="academicTblClass")
	private Set<FeeTblFeesubscription> feeTblFeesubscriptions;

	//bi-directional many-to-one association to FeeTblTotalfeesubscription
	@OneToMany(mappedBy="academicTblClass")
	private Set<FeeTblTotalfeesubscription> feeTblTotalfeesubscriptions;

	public AcademicTblClass() {
	}

	public Integer getClassId() {
		return this.classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
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

	public String getClassName() {
		return this.className;
	}

	public void setClassName(String className) {
		this.className = className;
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
		academicTblAttendancehistory.setAcademicTblClass(this);

		return academicTblAttendancehistory;
	}

	public AcademicTblAttendancehistory removeAcademicTblAttendancehistory(AcademicTblAttendancehistory academicTblAttendancehistory) {
		getAcademicTblAttendancehistories().remove(academicTblAttendancehistory);
		academicTblAttendancehistory.setAcademicTblClass(null);

		return academicTblAttendancehistory;
	}

	public Set<AcademicTblAttendancesummary> getAcademicTblAttendancesummaries() {
		return this.academicTblAttendancesummaries;
	}

	public void setAcademicTblAttendancesummaries(Set<AcademicTblAttendancesummary> academicTblAttendancesummaries) {
		this.academicTblAttendancesummaries = academicTblAttendancesummaries;
	}

	public AcademicTblAttendancesummary addAcademicTblAttendancesummary(AcademicTblAttendancesummary academicTblAttendancesummary) {
		getAcademicTblAttendancesummaries().add(academicTblAttendancesummary);
		academicTblAttendancesummary.setAcademicTblClass(this);

		return academicTblAttendancesummary;
	}

	public AcademicTblAttendancesummary removeAcademicTblAttendancesummary(AcademicTblAttendancesummary academicTblAttendancesummary) {
		getAcademicTblAttendancesummaries().remove(academicTblAttendancesummary);
		academicTblAttendancesummary.setAcademicTblClass(null);

		return academicTblAttendancesummary;
	}

	public Set<AcademicTblSection> getAcademicTblSections() {
		return this.academicTblSections;
	}

	public void setAcademicTblSections(Set<AcademicTblSection> academicTblSections) {
		this.academicTblSections = academicTblSections;
	}

	public AcademicTblSection addAcademicTblSection(AcademicTblSection academicTblSection) {
		getAcademicTblSections().add(academicTblSection);
		academicTblSection.setAcademicTblClass(this);

		return academicTblSection;
	}

	public AcademicTblSection removeAcademicTblSection(AcademicTblSection academicTblSection) {
		getAcademicTblSections().remove(academicTblSection);
		academicTblSection.setAcademicTblClass(null);

		return academicTblSection;
	}

	public AcademicTblSubject getAcademicTblSubject() {
		return this.academicTblSubject;
	}

	public void setAcademicTblSubject(AcademicTblSubject academicTblSubject) {
		this.academicTblSubject = academicTblSubject;
	}

	public Set<AcademicTblTimetable> getAcademicTblTimetables() {
		return this.academicTblTimetables;
	}

	public void setAcademicTblTimetables(Set<AcademicTblTimetable> academicTblTimetables) {
		this.academicTblTimetables = academicTblTimetables;
	}

	public AcademicTblTimetable addAcademicTblTimetable(AcademicTblTimetable academicTblTimetable) {
		getAcademicTblTimetables().add(academicTblTimetable);
		academicTblTimetable.setAcademicTblClass(this);

		return academicTblTimetable;
	}

	public AcademicTblTimetable removeAcademicTblTimetable(AcademicTblTimetable academicTblTimetable) {
		getAcademicTblTimetables().remove(academicTblTimetable);
		academicTblTimetable.setAcademicTblClass(null);

		return academicTblTimetable;
	}

	public Set<FeeTblFeesubscription> getFeeTblFeesubscriptions() {
		return this.feeTblFeesubscriptions;
	}

	public void setFeeTblFeesubscriptions(Set<FeeTblFeesubscription> feeTblFeesubscriptions) {
		this.feeTblFeesubscriptions = feeTblFeesubscriptions;
	}

	public FeeTblFeesubscription addFeeTblFeesubscription(FeeTblFeesubscription feeTblFeesubscription) {
		getFeeTblFeesubscriptions().add(feeTblFeesubscription);
		feeTblFeesubscription.setAcademicTblClass(this);

		return feeTblFeesubscription;
	}

	public FeeTblFeesubscription removeFeeTblFeesubscription(FeeTblFeesubscription feeTblFeesubscription) {
		getFeeTblFeesubscriptions().remove(feeTblFeesubscription);
		feeTblFeesubscription.setAcademicTblClass(null);

		return feeTblFeesubscription;
	}

	public Set<FeeTblTotalfeesubscription> getFeeTblTotalfeesubscriptions() {
		return this.feeTblTotalfeesubscriptions;
	}

	public void setFeeTblTotalfeesubscriptions(Set<FeeTblTotalfeesubscription> feeTblTotalfeesubscriptions) {
		this.feeTblTotalfeesubscriptions = feeTblTotalfeesubscriptions;
	}

	public FeeTblTotalfeesubscription addFeeTblTotalfeesubscription(FeeTblTotalfeesubscription feeTblTotalfeesubscription) {
		getFeeTblTotalfeesubscriptions().add(feeTblTotalfeesubscription);
		feeTblTotalfeesubscription.setAcademicTblClass(this);

		return feeTblTotalfeesubscription;
	}

	public FeeTblTotalfeesubscription removeFeeTblTotalfeesubscription(FeeTblTotalfeesubscription feeTblTotalfeesubscription) {
		getFeeTblTotalfeesubscriptions().remove(feeTblTotalfeesubscription);
		feeTblTotalfeesubscription.setAcademicTblClass(null);

		return feeTblTotalfeesubscription;
	}

}