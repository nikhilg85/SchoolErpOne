package com.education.erp.repository;

import org.springframework.data.repository.CrudRepository;

import com.education.erp.entity.FeeTblTransaction;

public interface TransactionRepository extends CrudRepository<FeeTblTransaction, Integer> {

}
