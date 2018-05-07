package com.education.erp.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.education.erp.entity.AcademicTblTeacherAssign;


public interface AcademicTblTeacherAssignRepository extends CrudRepository<AcademicTblTeacherAssign, Integer> {

//List<AcademicTblTeacherAssign> findByAcademicId(Integer academicid);
	

}