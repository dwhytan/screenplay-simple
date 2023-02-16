import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = { "pretty", "json:target/build/cucumber.json" },
        features = {"src/test/resources/features"},
        tags = "@Orange",
        monochrome = true,
        stepNotifications = true
)
public class RunnerTest {
}