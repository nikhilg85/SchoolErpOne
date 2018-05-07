package com.education.erp.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.education.erp.entity.AcademicTblSection;
import com.education.erp.module.academic.model.AcademicTblSectionBean;

@Repository
public interface AcademicTblSectionRepository extends CrudRepository<AcademicTblSection, Integer> {

	List<AcademicTblSection> findByAcademicId(Integer academicid);
	
	List<AcademicTblSection> findBySectionName(String sectionname);

	void save(AcademicTblSectionBean academicTblSectionBean);

	AcademicTblSection findBySectionId(Integer sectionId);
	
}
