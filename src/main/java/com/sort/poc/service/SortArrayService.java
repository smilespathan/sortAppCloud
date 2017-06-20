package com.sort.poc.service;

import java.util.List;

import com.sort.poc.model.SortedArrayInfo;

/*
 * SortArrayService service interface 
 * */
public interface SortArrayService {
	/*
	 * Required for sorting array
	 */
	public SortedArrayInfo sortArray(List<Integer> randomNumbers);

	/*
	 * Required for providing sorting history.
	 */
	public List<SortedArrayInfo> sortHistory();
}
