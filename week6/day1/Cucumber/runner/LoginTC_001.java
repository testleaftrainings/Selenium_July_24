package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/Login.feature",
glue="stepDef" ,
monochrome = true,
publish=true)


//glue- gel the featurefile data with stepDef
//monChrome- delete unwant data from console
//publish- generate the basic report for cucumber

public class LoginTC_001 extends AbstractTestNGCucumberTests{

}
