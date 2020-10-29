Feature: Bowling average
  As a user
  I want to have my score calculated
  So that I can compare it to the perfect score

  Scenario: Score doesn't match perfect score
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