package com.education.erp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.education.erp.entity.FeeTblPayablemode;

@Repository
public interface PayablemodeRepository extends CrudRepository<FeeTblPayablemode, Integer> {

}
