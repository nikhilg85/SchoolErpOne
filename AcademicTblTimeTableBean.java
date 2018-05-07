/**
 * 
 */
package com.education.erp.module.academic.model;

import java.util.Date;

/**
 * @author ejet_sys_3
 *
 */
public class AcademicTblTimeTableBean {
	
	private Integer timetableId;
	
	private Integer academicId;
	
	private Integer activeFlag;
	
	private Integer commSubjectId;
	
	private Date createDate;
	
	private Integer staffId;
	
	private Date updateDate;

	/**
	 * @return the timetableId
	 */
	public Integer getTimetableId() {
		return timetableId;
	}

	/**
	 * @param timetableId the timetableId to set
	 */
	public void setTimetableId(Integer timetableId) {
		this.timetableId = timetableId;
	}

	/**
	 * @return the academicId
	 */
	public Integer getAcademicId() {
		return academicId;
	}

	/**
	 * @param academicId the academicId to set
	 */
	public void setAcademicId(Integer academicId) {
		this.academicId = academicId;
	}

	/**
	 * @return the activeFlag
	 */
	public Integer getActiveFlag() {
		return activeFlag;
	}

	/**
	 * @param activeFlag the activeFlag to set
	 */
	public void setActiveFlag(Integer activeFlag) {
		this.activeFlag = activeFlag;
	}

	/**
	 * @return the commSubjectId
	 */
	public Integer getCommSubjectId() {
		return commSubjectId;
	}

	/**
	 * @param commSubjectId the commSubjectId to set
	 */
	public void setCommSubjectId(Integer commSubjectId) {
		this.commSubjectId = commSubjectId;
	}

	/**
	 * @return the createDate
	 */
	public Date getCreateDate() {
		return createDate;
	}

	/**
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	/**
	 * @return the staffId
	 */
	public Integer getStaffId() {
		return staffId;
	}

	/**
	 * @param staffId the staffId to set
	 */
	public void setStaffId(Integer staffId) {
		this.staffId = staffId;
	}

	/**
	 * @return the updateDate
	 */
	public Date getUpdateDate() {
		return updateDate;
	}

	/**
	 * @param updateDate the updateDate to set
	 */
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
	

}
