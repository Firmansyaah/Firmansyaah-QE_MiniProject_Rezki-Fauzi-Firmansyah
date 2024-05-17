Feature: Access Mini Book Store Brand Page
  As a user
  I want to access the website with valid credentials
  So that I can navigate to the Mini Book Store brand page

  Scenario: Successfully access Mini Book Store brand page
    Given I entered the Mini Bookstore website in my web browser
    Then I am successfully accesses the Mini Book Store brand page

  Scenario: Attempt to access website with invalid link
    Given I am input the invalid Mini Book Store website
    Then I am receives an error or invalid page message