package com.sort.poc.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sort.poc.dao.SortArrayInfoDao;
import com.sort.poc.model.SortedArrayInfo;
import com.sort.poc.repository.SortedArrayInfoRepository;
import com.sort.poc.util.BubbleSortAlgorithm;

/*
 * SortArrayInfoDaoImpl class responsible sorting and gettting data from crud repository
 * */
@Component
public class SortArrayInfoDaoImpl implements SortArrayInfoDao {

	@Autowired
	SortedArrayInfoRepository sortedArrayInfoRepository;

	/*
	 * This methods handles sorting numbers provided in request.
	 * 
	 * @input Param: Random numbers provided by user
	 */

	public SortedArrayInfo sortArray(List<Integer> randomNumbers) {

		SortedArrayInfo sortedArrayInfo = new SortedArrayInfo();

		sortedArrayInfo = BubbleSortAlgorithm.runAlgorithm(randomNumbers);

		sortedArrayInfoRepository.save(sortedArrayInfo);

		return sortedArrayInfo;

	}

	/*
	 * This method provide history of sorted numbers.
	 * 
	 * @input Param: none
	 */

	public List<SortedArrayInfo> sortHistory() {
		List<SortedArrayInfo> list = new ArrayList<SortedArrayInfo>();

		Iterable<SortedArrayInfo> iterator = sortedArrayInfoRepository.findAll();
		iterator.forEach(list::add);

		return list;
	}

}
