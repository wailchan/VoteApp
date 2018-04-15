/**
 * 
 */
package com.waichan.aws.lambda.db;

import com.waichan.aws.lambda.db.Candidate;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;



/**
 * @author Wai Chan
 *
 */
public class CandidateTest extends TestCase {


	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public CandidateTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(CandidateTest.class);
	}

	/**
	 * Test the setup method.
	 */
	public void testSetup() {
	}

	/**
	 * Test the Candidate getter methods.
	 */
	public void testCandidate() {
		Candidate candidate = new Candidate("1", "Wai", "Chan", 100);
		assertEquals("1", candidate.getId());
		assertEquals("Wai", candidate.getFirstName());
		assertEquals("Chan", candidate.getLastName());
		assertEquals(100, candidate.getTotalVote());
	}
}