
import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/SI20466403/eclipse-workspace/ProjectforJenkins/src/main/resources/Features/cucmberfeature.feature", glue = "stepDefinitions")
public class CucumberRunner extends AbstractTestNGCucumberTests {

}
