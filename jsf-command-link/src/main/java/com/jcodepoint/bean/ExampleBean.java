package com.jcodepoint.bean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named("exampleBean")
@RequestScoped
public class ExampleBean {

	public String goToResultPage() {
		return "result";
	}

	public String goToResultParam() {
		return "result-param";
	}
	
}
