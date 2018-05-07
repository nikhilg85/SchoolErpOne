package com.education.erp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.education.erp.entity.FeeTblFeecategory;

@Repository
public interface FeeCategoryRepository extends CrudRepository<FeeTblFeecategory, Integer> {

}
