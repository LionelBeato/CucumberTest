# Feature is a functionality of your application

Feature: Bowling average
  # a User Story is a user-oriented statement that describes
  # a behavior of your application
  As a user
  I want to have my score calculated
  So that I can compare it to the perfect score

  # Below would be your acceptance criteria
  # this describes the conditions your application has to meet
  # before being accepted

  # a Scenario describes a hypothetical situation that
  # involves the behavior of your application
  Scenario: Score doesn't match perfect score
    # Given-When-Then is syntax taken from Gherkin
    # Gherkin is a plain english language for writing acceptance tests
    # In cucumber, these describe your steps
    Given a set of scores:
    | 200 |
    | 190 |
    | 270 |
    When I calculate average
    Then my score is not a perfect score

  Scenario: Score does match perfect score
    Given a set of scores:
      | 300 |
      | 300 |
      | 300 |
    When I calculate average
    Then my score is a perfect score