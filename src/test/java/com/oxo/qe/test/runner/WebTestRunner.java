package com.oxo.qe.test.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features="src/test/resources/features/web/OXO_Sample.feature",
		glue="com.oxo.qe.test.stepdefinition.web",
		monochrome=true, 
		dryRun=true,
    	format={"pretty","html:target/cucumber-reports/cucumber-html-reports", "json:target/cucumber-reports/cucumber-html-reports/common.json"}		
		/*plugin={ "html:target/cucumber-html-reports", "json:target/cucumber.json",
		          "pretty:target/cucumber-pretty.txt", "junit:target/cucumber-results.xml" }*/		
		) 

public class WebTestRunner{	
	
}

