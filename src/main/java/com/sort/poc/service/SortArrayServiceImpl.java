package com.sort.poc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sort.poc.dao.SortArrayInfoDao;
import com.sort.poc.model.SortedArrayInfo;

/*
 * SortArrayServiceImpl class takes requests forwarded by Rest Controller and forward to 
 * respective DAO class
 * */

@Service
public class SortArrayServiceImpl implements SortArrayService {

	@Autowired
	SortArrayInfoDao sortedArrayInfoDao;

	/*
	 * This method forward sorting request to dao layer and rerun sorting
	 * statistical information.
	 * 
	 */
	public SortedArrayInfo sortArray(List<Integer> randomNumbers) {

		return sortedArrayInfoDao.sortArray(randomNumbers);

	}

	/*
	 * This method forward request to dao layer and rerun history of sorted
	 * numbers.
	 * 
	 */
	public List<SortedArrayInfo> sortHistory() {

		return sortedArrayInfoDao.sortHistory();
	}

}
