import Sequifi.qa.AbstractCucumberTestNGTest;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@001_Settings_Locations",
        features = "src/test/resources/features",
        glue = {"StepDefinitions"},
        plugin = {"pretty"
                , "html:target/cucumber-html-reports"
                , "json:target/cucumber-html-reports/cucumber.json"
        },
        monochrome = true
)
public class Runner extends AbstractCucumberTestNGTest {
}]