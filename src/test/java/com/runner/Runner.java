package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//TestNg runner file, used testNg dependencies
@CucumberOptions(features="/Assignement_SDET/src/test/java/com/features/Dynmctble.feature",
                 glue="com/stepfiles",
                 monochrome=true,
                 dryRun=false,
                 tags= "@Test",
                 plugin= {"pretty","html: Assignmentresult.html"}
                                       )

public class Runner extends AbstractTestNGCucumberTests {


}








