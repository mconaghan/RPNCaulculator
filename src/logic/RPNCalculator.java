package logic;

import interfaces.IRPNCalculator;
import interfaces.IStack;

public class RPNCalculator implements IRPNCalculator {	

	// default constrcutor
	public RPNCalculator() {
		
	}

	@Override
	public IStack process(IStack inputStack) {
		return inputStack;
	}	

}
