package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/CreateLead.feature",
glue="stepDef" ,
monochrome = true,
publish=true)


public class CreateLead_TC_002 extends AbstractTestNGCucumberTests{

}
