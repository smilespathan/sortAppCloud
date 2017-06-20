package com.sort.poc.dao;

import java.util.List;

import com.sort.poc.model.SortedArrayInfo;


/*
 * SortArrayInfoDao dao interface 
 * */
public interface SortArrayInfoDao  {
	

	/*
	 * Required for sorting array 
	 * */
	public SortedArrayInfo sortArray(List<Integer> randomNumbers);

	/*
	 * Required sorting history 
	 * */
	public List<SortedArrayInfo> sortHistory();

}
