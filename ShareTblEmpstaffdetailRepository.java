package com.education.erp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.education.erp.entity.ShareTblEmpstaffdetail;

@Repository
public interface ShareTblEmpstaffdetailRepository extends CrudRepository<ShareTblEmpstaffdetail, Integer> {

}
