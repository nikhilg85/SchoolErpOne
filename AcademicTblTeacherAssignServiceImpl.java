/**
 * 
 */
package com.education.erp.module.academic.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.education.erp.entity.AcademicTblTeacherAssign;
import com.education.erp.module.academic.model.AcademicTblTeacherAssignBean;
import com.education.erp.module.academic.service.AcademicTblTeacherAssignService;
import com.education.erp.repository.AcademicTblClassRepository;
import com.education.erp.repository.AcademicTblTeacherAssignRepository;

/**
 * @author ejet_sys_3
 *
 */
public class AcademicTblTeacherAssignServiceImpl implements AcademicTblTeacherAssignService  {
	
	@Autowired
	AcademicTblTeacherAssignRepository teacherAssignrepository;
	
	@Autowired
	AcademicTblClassRepository classrepository;

	@Override
	public List<AcademicTblTeacherAssign> getallteacher() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AcademicTblTeacherAssign getbysectionid(int sectionid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AcademicTblTeacherAssign getbyclassid(int classid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AcademicTblTeacherAssign getbyteacherassignid(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AcademicTblTeacherAssign addnewteacher(AcademicTblTeacherAssignBean academicTblTeacherAssignBean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AcademicTblTeacherAssign updateteacher(AcademicTblTeacherAssignBean academicTblTeacherAssignBean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AcademicTblTeacherAssign deleteteacher(Integer teacherassignid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AcademicTblTeacherAssign> getgetallteacher() {
		// TODO Auto-generated method stub
		return null;
	}
	
	


	

}
