package com.education.erp.entity;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Time;
import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the academic_tbl_classtime database table.
 * 
 */
@Entity
@Table(name="academic_tbl_classtime")
@NamedQuery(name="AcademicTblClasstime.findAll", query="SELECT a FROM AcademicTblClasstime a")
public class AcademicTblClasstime implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="class_time_id")
	private Integer classTimeId;

	@Column(name="academic_id")
	private Integer academicId;

	@Column(name="active_flag")
	private Integer activeFlag;

	@Column(name="create_date")
	private Date createDate;

	private String description;

	@Column(name="time_end")
	private Time timeEnd;

	@Column(name="time_start")
	private Time timeStart;

	@Column(name="update_date")
	private Date updateDate;

	//bi-directional many-to-one association to ShareTblEmpstaffdetail
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="created_by")
	private ShareTblEmpstaffdetail shareTblEmpstaffdetail;

	//bi-directional many-to-one association to AcademicTblTimetable
	@OneToMany(mappedBy="academicTblClasstime")
	private Set<AcademicTblTimetable> academicTblTimetables;

	public AcademicTblClasstime() {
	}

	public Integer getClassTimeId() {
		return this.classTimeId;
	}

	public void setClassTimeId(Integer classTimeId) {
		this.classTimeId = classTimeId;
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

	public Time getTimeEnd() {
		return this.timeEnd;
	}

	public void setTimeEnd(Time timeEnd) {
		this.timeEnd = timeEnd;
	}

	public Time getTimeStart() {
		return this.timeStart;
	}

	public void setTimeStart(Time timeStart) {
		this.timeStart = timeStart;
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
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
		academicTblTimetable.setAcademicTblClasstime(this);

		return academicTblTimetable;
	}

	public AcademicTblTimetable removeAcademicTblTimetable(AcademicTblTimetable academicTblTimetable) {
		getAcademicTblTimetables().remove(academicTblTimetable);
		academicTblTimetable.setAcademicTblClasstime(null);

		return academicTblTimetable;
	}

}