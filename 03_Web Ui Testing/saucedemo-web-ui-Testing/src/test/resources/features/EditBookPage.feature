Feature: Edit Details Book
  As a user
  I want to edit book details with valid credentials
  So that I can update the book information

  Scenario: Successfully edit book details
    Given I open the homepage
    When I click the Edit button for a book
    And I input the details of the book to be edited
    And I click the Edit Book button
    Then I see a success message Book edited successfully

  Scenario: Edit book details with 5-digit publish year
    Given I open the homepage
    When I click the Edit button for a book
    And I input invalid book details with 5-digit publish year
    And I click the Edit Book button
    Then I see a failure message The book failed to be edited

  Scenario: Edit book details with numeric author
    Given I open the homepage
    When I click the Edit button for a book
    And I input invalid book details with numeric author
    And I click the Edit Book button
    Then I see a failure message The book failed to be edited

  Scenario: Edit book details with empty credentials
    Given I open the homepage
    When I click the Edit button for a book
    And I input empty book details
    And I click the Edit Book button
    Then I see a failure message The book failed to be edited
