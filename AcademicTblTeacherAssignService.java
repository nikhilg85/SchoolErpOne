/**
 * 
 */
package com.education.erp.module.academic.service;

import java.util.List;

import com.education.erp.entity.AcademicTblTeacherAssign;
import com.education.erp.module.academic.model.AcademicTblTeacherAssignBean;

/**
 * @author ejet_sys_3
 *
 */
public interface AcademicTblTeacherAssignService {


	List<AcademicTblTeacherAssign> getallteacher();

	AcademicTblTeacherAssign getbysectionid(int sectionid);

	AcademicTblTeacherAssign getbyclassid(int classid);

	AcademicTblTeacherAssign getbyteacherassignid(int id);

	AcademicTblTeacherAssign addnewteacher(AcademicTblTeacherAssignBean academicTblTeacherAssignBean);

	AcademicTblTeacherAssign updateteacher(AcademicTblTeacherAssignBean academicTblTeacherAssignBean);

	AcademicTblTeacherAssign deleteteacher(Integer teacherassignid);

	List<AcademicTblTeacherAssign> getgetallteacher();
	

}
