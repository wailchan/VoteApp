package com.waichan.aws.lambda.request;

public class VoteRequest {
	private String id;

	public VoteRequest() {
	}

	public VoteRequest(String id) {
		this.id = id;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	
}
