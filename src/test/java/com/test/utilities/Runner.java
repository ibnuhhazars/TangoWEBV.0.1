package com.test.utilities;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = { "json:cucumber.json","html:target//cucumber-pretty" }, 
		features = { "feature" },
	    tags = { "@parameterizeSearchBar" },
		glue = { "com.test.helper","com.test.stepDeff"})
public class Runner {

}
