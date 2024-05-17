Feature: Create Book List
  As a user
  I want to create a book list with valid credentials
  So that I can manage and organize my books effectively

  Scenario: Successfully create a book list
    Given I open the homepage
    When I click Add Book button
    And I input the details of the book to be added
    And I click the save book button
    Then I see a success message Book added successfully

  Scenario: Create book details with 5-digit publish year
    Given I open the homepage
    When I click Add Book button
    And I input invalid book details with 5-digit publish year
    And I click the save book button
    Then I see a failure message The book failed to be added

  Scenario: create book details with numeric author
    Given I open the homepage
    When I click Add Book button
    And I input invalid book details with numeric author
    And I click the save book button
    Then I see a failure message The book failed to be added

  Scenario: Create book details with empty credentials
    Given I open the homepage
    When I click Add Book button
    And I input empty book details
    And I click the save book button
    Then I see a failure message The book failed to be added

