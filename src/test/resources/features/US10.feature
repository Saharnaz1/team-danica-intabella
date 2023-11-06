  Feature:  As a user, I want to write the “Description” when I create a calendar event. (Iframe)
  @Wip
  Scenario: Users should be able to write messages in the Description ** field on the calendar event page.
    Given the user logged in as "driver"
    When the user click on the Activities
    And user clicks on the Calendar Events button
    And user clicks on the Create Calendar Event button
    And user writes the message in the Description field
    Then user verifies the written message is displayed

