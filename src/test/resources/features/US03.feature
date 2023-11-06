@US03
Feature:

  Background: User is already in the log in page
    Given the user is on the login page



  Scenario: I want to learn how to use the pinbar.
    Given the user logged in with username as "user1" and password as "UserUser123"
    When click the “Learn how to use this space” link on the homepage,
    And see: “How To Use Pinbar”
    And “Use the pin icon on the right top corner of the page to create fast access link in the pinbar.”
    Then users should see an image on the page.

      #[in automation testing,  just verify the image source.]
      # source:/bundles/oronavigation/images/pinbar-location.jpg