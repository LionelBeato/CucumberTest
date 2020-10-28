### As a user I want to check to see how many penguins I can physically punt into the sea
  ### so that the ice caps don't melt


  Feature: Happy Feet


    Scenario: Not enough penguins were punted
      Given I am punting penguins
      When less than 60 penguins are punted
      Then the ice caps should be "melting"



    Scenario: Enough penguins were punted
      Given I am punting penguins
      When 60 or more penguins are punted
      Then then ice caps should be "fine"



