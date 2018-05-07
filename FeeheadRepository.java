package com.education.erp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.education.erp.entity.FeeTblFeehead;

@Repository
public interface FeeheadRepository extends CrudRepository<FeeTblFeehead, Integer> {

}
