package com.education.erp.repository;

import org.springframework.data.repository.CrudRepository;

import com.education.erp.entity.AcademicTblSubject;

public interface AcademicTblSubjectRepository extends CrudRepository<AcademicTblSubject, Integer> {
	
	public AcademicTblSubject findbySubjectId(Integer subject);
	
	public AcademicTblSubject findByClassId(Integer classId);

}
