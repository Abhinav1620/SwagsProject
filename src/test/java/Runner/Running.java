package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/java/Feature"}, glue = {"StepDefinations"}, monochrome = true, plugin = {"pretty","html:target/Report.html"})
public class Running extends AbstractTestNGCucumberTests {
}
