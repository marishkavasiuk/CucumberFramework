Feature: Search answers
  Existing stackoverflow user should be able to find answer for his question

Scenario: Search answers for correct request
    Given User opens home page
    And User enters a valid request
    When User clicks search
    Then User should get correct response
