package com.adap;

public class AssignmentWork {
	
	private Pen p;
	// Since its variable we require getter/setter for it 

	public Pen getP() {
		return p;
	}
	public void setP(Pen p) {
		this.p = p;
	}
	
    public void writeAssignment(String str) {
    	// To Write the Assignment we require Pen
    	//Then We will get the Error - Null Pointer
    	p.write(str);// Pen will write
    }
}
