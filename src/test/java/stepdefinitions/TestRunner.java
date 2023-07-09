package stepdefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        // Set name of .feature file in test/resources/features like age_calculaion.feature and glue it to this folder stepdefinitions 
        features = {"classpath:features/age_calculation.feature"},
        glue = {"stepdefinitions"},
        plugin = {"pretty", "json:target/cucumber.json"}
)
public class TestRunner {
    public static void main(String[] args) {
        // Print additional information before running the tests
        System.out.println("Starting Cucumber tests...");
        
        // Execute the Cucumber tests
        io.cucumber.core.cli.Main.main(args);
        
        // When finished
        System.out.println("Cucumber tests finished.");
    }
}
