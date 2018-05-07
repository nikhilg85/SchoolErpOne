package com.education.erp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.education.erp.entity.FeeTblTotalfeesubscription;
import com.education.erp.entity.ShareTblStudent;

import java.util.List;
import java.lang.Integer;

@Repository
public interface TotalFeeSubscriptionRepository extends CrudRepository<FeeTblTotalfeesubscription, Integer> {

	List<FeeTblTotalfeesubscription> findByShareTblStudent(ShareTblStudent sharetblstudent);
	List<FeeTblTotalfeesubscription> findByMappingId(Integer mappingid);
}
