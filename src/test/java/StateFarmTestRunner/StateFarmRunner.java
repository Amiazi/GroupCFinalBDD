package StateFarmTestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/main/java/StateFarmFeature/StateFarm.feature"},
        glue = "StateFarmStepDefinition",
        // plugin = {"pretty","json:target/cucumber-reports/cucumber.json","html:target/cucumber-reports"},
        plugin= {"pretty","html:test-output", "html:target/site/cucumber-pretty","json:target/cucumber/cucumber.json"},
        strict =true ,
        monochrome =true ,
        dryRun = false,
        tags = ""

)
public class StateFarmRunner {
}