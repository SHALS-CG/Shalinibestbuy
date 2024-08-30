Feature: Product Search and Filtering on E-commerce Site

Scenario: Accessing the "Back to School" Dropdown Menu
    Given I am on the homepage
    When I access the "Back to School" dropdown menu
    Then I should see the options related to "Back to School" products

Scenario: Navigating to a Category Page
    Given I am on the homepage
    When I navigate to the "Electronics" category page
    Then I should see products listed under the "Electronics" category

Scenario: Adding it to cart
  
    Given I am on the "Electronics" category page
    When I select a product "Smartphone" and add it to the shopping cart
    Then the shopping cart should contain the "Smartphone" product

 Scenario Outline: Applying Filters in a Category Page
    Given I am on the "<Category>" category page
    When I apply the filter "<Filter Type>" with the value "<Filter Value>"
    Then the category page should display only products that match the "<Filter Type>" filter criteria

 Examples:
      | Category    | Filter Type  | Filter Value       |
      | Electronics | Brand        | Sony               |
      | Clothing    | Size         | Medium             |
      | Books       | Author       | J.K. Rowling       |
      | Home        | Price Range  | $100 - $200        |
      
 Scenario: Comparing Multiple Products
    Given I am on the "Electronics" category page
    When I select the products "Smartphone", "Laptop", and "Tablet" for comparison
    Then I should be able to view a comparison of the selected products' features and prices
