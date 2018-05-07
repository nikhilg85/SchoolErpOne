package com.education.erp.repository;

import org.springframework.data.repository.CrudRepository;

import com.education.erp.entity.FeeTblLadger;
import com.education.erp.entity.ShareTblStudent;

import java.util.List;
import java.lang.Integer;
import java.util.Date;

public interface LadgerRepository extends CrudRepository<FeeTblLadger, Integer> {
	List<FeeTblLadger> findByShareTblStudent(ShareTblStudent sharetblstudent);
	List<FeeTblLadger> findByLedgerId(Integer ledgerid);
	List<FeeTblLadger> findByCreateDate(Date createdate);
	
	
	FeeTblLadger findTop1ByShareTblStudentOrderByLedgerIdDesc(ShareTblStudent sharetblstudent);
	
}
