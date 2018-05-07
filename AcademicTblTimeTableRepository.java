/**
 * 
 */
package com.education.erp.repository;

import org.springframework.data.repository.CrudRepository;

import com.education.erp.entity.AcademicTblTimetable;

/**
 * @author ejet_sys_3
 *
 */
public interface AcademicTblTimeTableRepository extends CrudRepository<AcademicTblTimetable, Integer> {

	void updatetimetable(AcademicTblTimetable timetableTbl);

}
