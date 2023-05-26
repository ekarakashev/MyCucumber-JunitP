Feature: Google search functionality
  Agile story: As a user, when i am on the google search page i should be able to search anything and see relevant results

  Scenario: Search page def title verification

    When user is on google search page
    Then user should see title is Google
