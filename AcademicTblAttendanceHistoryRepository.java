/**
 * 
 */
package com.education.erp.repository;

import com.school.erp.academic.entity.AcademicTblAttendancehistory;

/**
 * @author ejet_sys_3
 *
 */
public interface AcademicTblAttendanceHistoryRepository {

	AcademicTblAttendancehistory findOne(Integer academicid);

}
