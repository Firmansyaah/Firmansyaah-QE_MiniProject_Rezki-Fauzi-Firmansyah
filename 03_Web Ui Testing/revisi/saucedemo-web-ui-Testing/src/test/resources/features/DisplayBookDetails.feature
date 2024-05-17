Feature: Display Book Details
  As a user
  I want to view the details of a book
  So that I can see its information

  Scenario: Successfully view book details in list view
    Given I open the homepage
    When I click on the Table button in the website header
    And I click on the I button in the Operations column for a book in list view
    Then I see the details of the book displayed

  Scenario: Successfully view book details in card view
    Given I open the homepage
    When I click on the Card button in the website header
    And I click on the I button in the Operations column for a book in card view
    Then I see the details of the book displayed
