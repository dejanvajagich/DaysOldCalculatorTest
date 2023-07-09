package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import org.junit.Assert;

import java.awt.*;

import static org.junit.Assert.assertEquals;

public class AgeCalculationSteps {
    private String birthDate;
    private int ageInDays;

    @Given("I have entered my birth date as {string}")
    public void i_have_entered_my_birth_date_as(String date) {
        birthDate = date;
    }
    @When("I calculate the age")
    public void i_calculate_the_age() {
        LocalDate currentDate = LocalDate.now();
        LocalDate parsedBirthDate = LocalDate.parse(birthDate);
        ageInDays = (int) ChronoUnit.DAYS.between(parsedBirthDate, currentDate);
    }
    @Then("I should see the age in days as {string}")
    public void i_should_see_the_age_in_days_as(String expectedAge) {
        int expectedAgeInDays = Integer.parseInt(expectedAge);
        Assert.assertEquals(expectedAgeInDays, ageInDays);
    }
}
