package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/features"},
        glue={"stepdefinitions"},
        plugin = {"pretty", "json:target/cucumber-reports/cucumber.json", "html:target/cucumber-reports"},
        strict = true,

        monochrome=true,
        tags={""}
        // tags={"@Test1,@Test2"}

)




public class GoogleRunner extends AbstractTestNGCucumberTests {






}

