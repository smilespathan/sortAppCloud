package com.sort.poc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sort.poc.model.SortedArrayInfo;

@Repository
public interface SortedArrayInfoRepository extends CrudRepository<SortedArrayInfo, Long> {

}
