package com.sort.poc.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * SortedArrayInfo  entity represents Business Object which is mapped to database
 * It has ID as primary key(auto incremented)
 * It stores sorting information with required statistical data.
 * 
 */

@Entity
@Table(name="sorted_array_info")
public class SortedArrayInfo {	
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
	String randomNumbers;
	String sortedNumbers;
	int noOfSwapOperations;
	long processingMiliSeconds;
	String createdDate;
	public SortedArrayInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SortedArrayInfo(long id, String randomNumbers, String sortedNumbers, int noOfSwapOperations,
			long processingMiliSeconds, String createdDate) {
		super();
		this.id = id;
		this.randomNumbers = randomNumbers;
		this.sortedNumbers = sortedNumbers;
		this.noOfSwapOperations = noOfSwapOperations;
		this.processingMiliSeconds = processingMiliSeconds;
		this.createdDate = createdDate;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getRandomNumbers() {
		return randomNumbers;
	}
	public void setRandomNumbers(String randomNumbers) {
		this.randomNumbers = randomNumbers;
	}
	public String getSortedNumbers() {
		return sortedNumbers;
	}
	public void setSortedNumbers(String sortedNumbers) {
		this.sortedNumbers = sortedNumbers;
	}
	public int getNoOfSwapOperations() {
		return noOfSwapOperations;
	}
	public void setNoOfSwapOperations(int noOfSwapOperations) {
		this.noOfSwapOperations = noOfSwapOperations;
	}
	public long getProcessingMiliSeconds() {
		return processingMiliSeconds;
	}
	public void setProcessingMiliSeconds(long processingMiliSeconds) {
		this.processingMiliSeconds = processingMiliSeconds;
	}
	@Override
	public String toString() {
		return "SortedArrayInfo [id=" + id + ", randomNumbers=" + randomNumbers + ", sortedNumbers=" + sortedNumbers
				+ ", noOfSwapOperations=" + noOfSwapOperations + ", processingMiliSeconds=" + processingMiliSeconds + ", createdDate="
				+ createdDate + "]";
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	
	
	
	

}
