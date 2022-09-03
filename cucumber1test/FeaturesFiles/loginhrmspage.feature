

Feature: orangehrms login
  Scenario: logo presences on orangehrms home page
    Given I launch the chrome browser
    When I open the orange hrm homepage
    Then I verify that the logo present on the page
    And close the browser
      
