package runner;

import baseclass.ProjectSpecificMethod;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/Login.feature",
//glue={"stepDef","hooks"}
glue="stepDef",
monochrome = true,
publish=true, tags = "@sanity or @dilip"
//@smoke and @sanity - it will check both smoke n sanity
//@smoke - 3sce
//not @smoke -smoke sce will not execute
)

//tags



//Extends  - AbstractTestNGCucumberTestS  in PSM 
// Extends ProjectSpecificMethod in RunnerCalss

public class LoginTC_001 extends ProjectSpecificMethod{

}
