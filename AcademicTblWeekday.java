package com.education.erp.entity;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the academic_tbl_weekdays database table.
 * 
 */
@Entity
@Table(name="academic_tbl_weekdays")
@NamedQuery(name="AcademicTblWeekday.findAll", query="SELECT a FROM AcademicTblWeekday a")
public class AcademicTblWeekday implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="week_days_id")
	private Integer weekDaysId;

	@Column(name="academic_id")
	private Integer academicId;

	@Column(name="active_flag")
	private Integer activeFlag;

	@Column(name="create_date")
	private Date createDate;

	private String description;

	@Column(name="name_id")
	private String nameId;

	@Column(name="update_date")
	private Date updateDate;

	//bi-directional many-to-one association to AcademicTblTimetable
	@OneToMany(mappedBy="academicTblWeekday")
	private Set<AcademicTblTimetable> academicTblTimetables;

	//bi-directional many-to-one association to ShareTblEmpstaffdetail
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="created_by")
	private ShareTblEmpstaffdetail shareTblEmpstaffdetail;

	public AcademicTblWeekday() {
	}

	public Integer getWeekDaysId() {
		return this.weekDaysId;
	}

	public void setWeekDaysId(Integer weekDaysId) {
		this.weekDaysId = weekDaysId;
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNameId() {
		return this.nameId;
	}

	public void setNameId(String nameId) {
		this.nameId = nameId;
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Set<AcademicTblTimetable> getAcademicTblTimetables() {
		return this.academicTblTimetables;
	}

	public void setAcademicTblTimetables(Set<AcademicTblTimetable> academicTblTimetables) {
		this.academicTblTimetables = academicTblTimetables;
	}

	public AcademicTblTimetable addAcademicTblTimetable(AcademicTblTimetable academicTblTimetable) {
		getAcademicTblTimetables().add(academicTblTimetable);
		academicTblTimetable.setAcademicTblWeekday(this);

		return academicTblTimetable;
	}

	public AcademicTblTimetable removeAcademicTblTimetable(AcademicTblTimetable academicTblTimetable) {
		getAcademicTblTimetables().remove(academicTblTimetable);
		academicTblTimetable.setAcademicTblWeekday(null);

		return academicTblTimetable;
	}

	public ShareTblEmpstaffdetail getShareTblEmpstaffdetail() {
		return this.shareTblEmpstaffdetail;
	}

	public void setShareTblEmpstaffdetail(ShareTblEmpstaffdetail shareTblEmpstaffdetail) {
		this.shareTblEmpstaffdetail = shareTblEmpstaffdetail;
	}

}