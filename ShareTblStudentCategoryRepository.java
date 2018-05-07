package com.education.erp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.education.erp.entity.ShareTblStudentCategory;

@Repository
public interface ShareTblStudentCategoryRepository extends CrudRepository<ShareTblStudentCategory, Integer> {

}
