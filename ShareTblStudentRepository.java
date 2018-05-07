package com.education.erp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.education.erp.entity.ShareTblStudent;

@Repository
public interface ShareTblStudentRepository extends CrudRepository<ShareTblStudent, Integer> {

}
