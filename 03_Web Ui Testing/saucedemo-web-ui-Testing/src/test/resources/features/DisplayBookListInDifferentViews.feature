Feature: Display Book List in Different Views
  As a user
  I want to view the book list in different formats
  So that I can choose the most suitable display for my preference

  Scenario: Display Book List in Card View
    Given I open the homepage
    When I click on the Card button in the website header
    Then I see the book list displayed in card format arranged in a 4x4 grid on a single page

  Scenario: Display Book List in Table View
    Given I open the homepage
    When I click on the Table button in the website header
    Then I see the book list displayed in table format arranged vertically downwards
