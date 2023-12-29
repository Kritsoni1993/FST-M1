package testRunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Features",
        glue = {"StepDefinitions"},
        tags = "@activity1",
        //plugin = {"pretty"},
        plugin = {"json:test-reports/json-report.json"},
        monochrome = true
)

public class ActivitiesRunner6
{
    //empty
}