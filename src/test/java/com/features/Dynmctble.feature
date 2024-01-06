Feature: Dynamic table
 @Test
  Scenario: Validate Dynamic table HTML TAG
    Given User lands on "https://testpages.herokuapp.com/styled/tag/dynamic-table.html"
    When User Inserts the data in input text box
    And User clicks on Refresh Table
    Then User validates the entered data with Json

 