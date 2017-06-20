package com.sort.poc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sort.poc.exception.RandomNumberSizeException;
import com.sort.poc.model.SortedArrayInfo;
import com.sort.poc.service.SortArrayService;

/*
 * SortArrayController class responsible for request handling of sort Application like providing sort history
 *  and performing sorting , which forward requests to service layer
 * */
@RestController
public class SortArrayController {

	@Autowired
	private SortArrayService sortArrayService;
	/*
	 * This methods handles request for sorting numbers provided in request	 * 
	 * @input Param: Random numbers provided by user
	 */
	@RequestMapping(value = "sortArray", method = RequestMethod.POST)
	public SortedArrayInfo sortArray(@RequestBody List<Integer> randomNumbers) {

		SortedArrayInfo sortedArrayInfo = new SortedArrayInfo();
		try {
			// Throwing exception if random number list does not have minimum
			// two integer.
			if (randomNumbers == null)
				throw new RandomNumberSizeException("Minimum Two Integers Required");
			if (randomNumbers.size() < 2)
				throw new RandomNumberSizeException("Minimum Two Integers Required");

			sortedArrayInfo = sortArrayService.sortArray(randomNumbers);
		} catch (RandomNumberSizeException exeption) {
			throw exeption;

		}
		return sortedArrayInfo;

	}

	/* * This methods handles request providing history of sorted numbers	 * 
	 * @input Param:none
	 */
	@RequestMapping(value = "sortHistory", method = RequestMethod.POST)
	public List<SortedArrayInfo> sortHistory() {

		return sortArrayService.sortHistory();

	}

}
