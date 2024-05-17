Feature: Delete Book
  As a user
  I want to delete a book from the list
  So that it is removed from the database

  Scenario: Successfully delete a book
    Given I open the homepage
    When I click the Delete button for a book
    And I confirm the deletion by clicking Yes
    Then I see a success message Book deleted successfully
