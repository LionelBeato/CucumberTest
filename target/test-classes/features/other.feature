# As a user I want to enter my credentials so that I can login

#Feature: Login
#
#  Scenario: Successful Login
#    Given I input my credentials
#    And those credentials are correct
#    And I had less than five login attempts
#    When I hit the login prompt
#    Then I login successfully
#
#  Scenario: Unsuccessful login due to too many attempts
#    Given I input my credentials
#    But I attempted more than four login attempts
#    When I hit the login prompt
#    Then I cannot login