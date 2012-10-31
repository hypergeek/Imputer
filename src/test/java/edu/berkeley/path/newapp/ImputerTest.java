package edu.berkeley.path.newapp;

import junit.framework.TestCase;

public class ImputerTest extends TestCase {
	
	public void testImputer() {
		Imputer imp1 = new Imputer("TestInput","TestOutput");
		assertEquals("TestInput", imp1.getInputFileName());
		assertEquals("TestOutput", imp1.getOutputFileName()); 
	}

}
