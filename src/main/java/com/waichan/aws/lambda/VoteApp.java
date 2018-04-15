package com.waichan.aws.lambda;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.waichan.aws.lambda.db.Candidate;
import com.waichan.aws.lambda.request.VoteRequest;



public class VoteApp implements RequestHandler<VoteRequest, Candidate> {
	
	/**
	 * Someone votes for the candidate
	 * @param id the candidate id
	 * @param context
	 * @return the vote results
	 */
	public Candidate handleRequest(VoteRequest request, Context context) {
        Candidate candidate = null;
		
		AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard().build();

		DynamoDBMapper mapper = new DynamoDBMapper(client);
		
		Candidate keySchema = new Candidate();
        keySchema.setId(request.getId());

        try {
            candidate = mapper.load(keySchema);
            if (candidate != null) {
            	candidate.setTotalVote(candidate.getTotalVote() + 1);
            	mapper.save(candidate);
            } else {
                System.err.println("Unable to retrieve data: ");
            }
        } catch (Exception e) {
            System.err.println("Unable to retrieve data: ");
            System.err.println(e.getMessage());
        }
        
		return candidate;
	}
}