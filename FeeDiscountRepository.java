package com.education.erp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.education.erp.entity.FeeTblFeediscount;

@Repository
public interface FeeDiscountRepository extends CrudRepository< FeeTblFeediscount, Integer> {

}
