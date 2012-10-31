package edu.berkeley.path.newapp;

/**
 * Top level class for the imputer with the main method
 * XML in - XML out for the time being
 */

public class Imputer {
	
	// fields
	private String inputFileName;
	private String outputFileName;
	
	// constructors
	public Imputer(String inFile, String outFile) {
		inputFileName = inFile;
		outputFileName = outFile;		
	}
	
	// getters and setters
	public String getInputFileName() {
		return inputFileName;
	}

	public void setInputFileName(String inputFileName) {
		this.inputFileName = inputFileName;
	}

	public String getOutputFileName() {
		return outputFileName;
	}

	public void setOutputFileName(String outputFileName) {
		this.outputFileName = outputFileName;
	}
	

}
