package com.education.erp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.education.erp.entity.FeeTblFeesubscription;

import java.lang.Integer;
import java.util.List;

@Repository
public interface FeeSubscriptionRepository extends CrudRepository<FeeTblFeesubscription, Integer> {

	List<FeeTblFeesubscription> findByMappingId(Integer mappingid);
}
