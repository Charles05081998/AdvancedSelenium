package LoadRunner;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
@CucumberOptions(
		features = {"C:\Users\chrlaz\eclipse-workspace\Cucumber_Framework\src\test\java\Feature\login.feature"},
		dryRun = !true,
		glue = "Step"
		)
public class Runner extends AbstractTestNGCucumberTests
{
	
}