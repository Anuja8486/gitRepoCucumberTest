package com.basic.diffrentFolder;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		monochrome=true,
		dryRun=false,
		features={"src/test/resources/differentfolderFF/"},
		glue={"com/basic/diffrentFolder/"}
		
		)

public class RunnerdiffrentfolderTest {

}
