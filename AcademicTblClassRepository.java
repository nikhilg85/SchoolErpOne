package com.education.erp.repository;

import org.springframework.data.repository.CrudRepository;

import com.education.erp.entity.AcademicTblClass;

public interface AcademicTblClassRepository extends CrudRepository<AcademicTblClass, Integer> {

	public AcademicTblClass findByAcademicId(Integer academic);
	
	public AcademicTblClass findByClassId(Integer classId);

}
