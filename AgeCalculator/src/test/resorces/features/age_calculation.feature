Feature: Age Calculation
  As a user
  I want to calculate my age in days
  So that I know the number of days since my birth

  Scenario: Calculate age in days
    Given I have entered my birth date as "2023-07-02"
    When I calculate the age
    Then I should see the age in days as "1"

  Scenario: Calculate age in days
    Given I have entered my birth date as "2023-06-23"
    When I calculate the age
    Then I should see the age in days as "10"

  Scenario: Calculate age in days
    Given I have entered my birth date as "1990-01-01"
    When I calculate the age
    Then I should see the age in days as "12236"
