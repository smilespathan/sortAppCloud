package com.sort.poc.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import com.sort.poc.constants.AppConstants;
import com.sort.poc.model.SortedArrayInfo;

/*
 * BubbleSortAlgorithm class holds logic for sorting with bubble sort algorithm.
 * 
 */
public class BubbleSortAlgorithm {

	/*
	 * This static method implements bubble sort
	 * 
	 */
	public static SortedArrayInfo runAlgorithm(List<Integer> randomNumbers) {

		DateFormat dateFormate = new SimpleDateFormat(AppConstants.DATE_FORMATE);
		Calendar cal = Calendar.getInstance();
		long startTime = System.currentTimeMillis();

		SortedArrayInfo info = new SortedArrayInfo();
		int randomNumbersSize = randomNumbers.size();
		int swapCount = 0;
		int temp = 0;

		Integer intermediateArray[] = new Integer[randomNumbersSize];
		randomNumbers.toArray(intermediateArray);
		info.setRandomNumbers(convertString(intermediateArray));
		info.setCreatedDate(dateFormate.format(cal.getTime()));

		for (int i = 0; i < randomNumbersSize; i++) {
			for (int j = 1; j < (randomNumbersSize - i); j++) {
				if (intermediateArray[j - 1] > intermediateArray[j]) {
					// swap elements
					temp = intermediateArray[j - 1];
					intermediateArray[j - 1] = intermediateArray[j];
					intermediateArray[j] = temp;
					swapCount++;
				}

			}
		}

		info.setNoOfSwapOperations(swapCount);
		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;
		info.setProcessingMiliSeconds(elapsedTime);
		info.setSortedNumbers(convertString(intermediateArray));

		return info;

	}

	/*
	 * This static method convert array into string having number separated by
	 * comma(,)
	 * 
	 */
	public static String convertString(Integer randomNumbers[]) {

		int randomNumbersSize = randomNumbers.length;
		StringBuilder randomNumberString = new StringBuilder();

		for (int counter = 0; counter < randomNumbersSize; counter++) {
			if (counter < randomNumbersSize - 1) {
				randomNumberString.append(randomNumbers[counter].toString() + ",");

			} else {
				randomNumberString.append(randomNumbers[counter].toString());

			}
		}

		return randomNumberString.toString();

	}

}
