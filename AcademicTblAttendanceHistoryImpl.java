/**
 * 
 */
package com.education.erp.module.academic.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.education.erp.module.academic.model.AcademicTblAttendancehistoryBean;
import com.education.erp.module.academic.service.AcademicTblAttendanceHistoryService;
import com.education.erp.repository.AcademicTblAttendanceHistoryRepository;
import com.education.erp.repository.AcademicTblClassRepository;
import com.education.erp.repository.AcademicTblSectionRepository;
import com.education.erp.repository.AcademicTblTeacherAssignRepository;

/**
 * @author ejet_sys_3
 * @param <AcademicTblAttendancehistory>
 *
 */
public class AcademicTblAttendanceHistoryImpl<AcademicTblAttendancehistory> implements AcademicTblAttendanceHistoryService {
	@Autowired
	AcademicTblAttendanceHistoryRepository attendancehistoryrepository;
	@Autowired
	AcademicTblClassRepository classrepository;
	@Autowired
	AcademicTblSectionRepository sectionrepository;
	@Autowired
	AcademicTblTeacherAssignRepository teacherAssignrepository;
	
	@Transactional(readOnly = true)
	
	@Override
	public List<AcademicTblAttendancehistory> getallattendance() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.school.erp.academic.services.AcademicTblAttendanceHistoryService#getattendancebyattendanceid(int)
	 */
	@Override
	public AcademicTblAttendancehistory getattendancebyattendanceid(int attendanceid) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.school.erp.academic.services.AcademicTblAttendanceHistoryService#getattendancebyclassid(int)
	 */
	@Override
	public AcademicTblAttendancehistory getattendancebyclassid(int classid) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.school.erp.academic.services.AcademicTblAttendanceHistoryService#getattendancebyacademicid(int)
	 */
	@Override
	public AcademicTblAttendancehistory getattendancebyacademicid(int academicid) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.school.erp.academic.services.AcademicTblAttendanceHistoryService#getattendancebyclassname(java.lang.String)
	 */
	@Override
	public AcademicTblAttendancehistory getattendancebyclassname(String classname) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.school.erp.academic.services.AcademicTblAttendanceHistoryService#addnewsection(com.school.erp.academic.bean.AcademicTblAttendancehistoryBean)
	 */
	@Override
	public AcademicTblAttendancehistory addnewsection(
			AcademicTblAttendancehistoryBean academicTblAttendancehistoryBean) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.school.erp.academic.services.AcademicTblAttendanceHistoryService#updateattendancehistory(com.school.erp.academic.bean.AcademicTblAttendancehistoryBean)
	 */
	@Override
	public AcademicTblAttendancehistory updateattendancehistory(
			AcademicTblAttendancehistoryBean attendancehistoryBean) {
		
		AcademicTblAttendancehistory attendancehistory = attendancehistoryrepository.findOne(attendancehistoryBean.getAcademicid());
		
		attendancehistory.setAcademicId(attendancehistoryBean.getAcademicid());
		attendancehistory.setAttendanceId(attendancehistoryBean.getAttendanceid());
		attendancehistory.setActiveFlag(attendancehistoryBean.getActiveflag());
		
		
		return null;
	}

	/* (non-Javadoc)
	 * @see com.school.erp.academic.services.AcademicTblAttendanceHistoryService#Deleteattendancehistory(java.lang.Integer)
	 */
	@Override
	public AcademicTblAttendancehistory Deleteattendancehistory(Integer sectionid) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.school.erp.academic.services.AcademicTblAttendanceHistoryService#Deleteattendancehistorybystudentid(java.lang.Integer)
	 */
	@Override
	public AcademicTblAttendancehistory Deleteattendancehistorybystudentid(Integer studentid) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.school.erp.academic.services.AcademicTblAttendanceHistoryService#Deleteattendancehistorybyclassid(java.lang.Integer)
	 */
	@Override
	public AcademicTblAttendancehistory Deleteattendancehistorybyclassid(Integer classid) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.school.erp.academic.services.AcademicTblAttendanceHistoryService#Deleteattendancehistorybyclassname(java.lang.Integer)
	 */
	@Override
	public AcademicTblAttendancehistory Deleteattendancehistorybyclassname(Integer classname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveMultipleattendancehistory(AcademicTblAttendancehistoryBean academicTblattendancehistoryBean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String saveattendancehistory(AcademicTblAttendancehistoryBean attendancehistoryBean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public com.education.erp.entity.AcademicTblAttendancehistory getattendancebyattendanceid(int attendanceid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public com.education.erp.entity.AcademicTblAttendancehistory getattendancebyclassid(int classid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public com.education.erp.entity.AcademicTblAttendancehistory getattendancebyacademicid(int academicid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public com.education.erp.entity.AcademicTblAttendancehistory getattendancebyclassname(String classname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public com.education.erp.entity.AcademicTblAttendancehistory addnewsection(
			AcademicTblAttendancehistoryBean academicTblAttendancehistoryBean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public com.education.erp.entity.AcademicTblAttendancehistory updateattendancehistory(
			AcademicTblAttendancehistoryBean aatendancehistoryBean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public com.education.erp.entity.AcademicTblAttendancehistory Deleteattendancehistory(Integer sectionid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public com.education.erp.entity.AcademicTblAttendancehistory Deleteattendancehistorybystudentid(Integer studentid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public com.education.erp.entity.AcademicTblAttendancehistory Deleteattendancehistorybyclassid(Integer classid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public com.education.erp.entity.AcademicTblAttendancehistory Deleteattendancehistorybyclassname(Integer classname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveMultipleattendancehistory(AcademicTblAttendancehistoryBean academicTblattendancehistoryBean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String saveattendancehistory(AcademicTblAttendancehistoryBean attendancehistoryBean) {
		// TODO Auto-generated method stub
		return null;
	}

}
