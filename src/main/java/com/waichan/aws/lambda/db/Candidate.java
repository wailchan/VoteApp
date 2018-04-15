package com.waichan.aws.lambda.db;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;



/**
 * The Candidate class represents candidates of the new role in your organisation.
 * @author Wai Chan
 *
 */
@DynamoDBTable(tableName="Candidate")
public class Candidate {
	
	private String id;
	private String firstName;
	private String lastName;
	private int totalVote;



	/**
	 * Constructor.
	 */
	public Candidate() {	
	}

	/**
	 * Constructor.
	 * @param id the candidate id.
	 * @param firstName the candidate first name.
	 * @param lastName the candidate last name.
	 * @param totalVote the total number of votes for the candidate.
	 */
	public Candidate(String id, String firstName, String lastName, int totalVote) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.totalVote = totalVote;
	}


	/**
	 * @return the id
	 */
    @DynamoDBHashKey(attributeName="id")  
    public String getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}


	/**
	 * @return the firstName
	 */
    @DynamoDBAttribute(attributeName="firstName")
    public String getFirstName() {
		return firstName;
	}


	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	/**
	 * @return the lastName
	 */
    @DynamoDBAttribute(attributeName="lastName")
	public String getLastName() {
		return lastName;
	}


	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	/**
	 * @return the totalVote
	 */
    @DynamoDBAttribute(attributeName="totalVote")
	public int getTotalVote() {
		return totalVote;
	}


	/**
	 * @param totalVote the totalVote to set
	 */
	public void setTotalVote(int totalVote) {
		this.totalVote = totalVote;
	}
}