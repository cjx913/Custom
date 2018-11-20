package com.cjx913.design_mode.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class AwarderList {
	private List<AAwarder> awarders = new ArrayList<>();
	
	public void addAwarder(AAwarder awarder) {
		awarders.add(awarder);
	}
	
	public void accept(AAwardCheck awardCheck) {
		for(AAwarder awarder:awarders) {
			awarder.accept(awardCheck);
		}
	}
}
