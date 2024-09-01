Feature: Product Search and Filtering on E-commerce Site

Scenario: Accessing the webpage by scrolling
    Given I am on the homepage
    When I select country if needed
    Then the user clicks on the user
    And I scroll down

Scenario: Navigating to a Category Page
    
    When I navigate to the "Laptops" category page
    Then I should see products listed under the "Laptops" category

Scenario: Adding it to cart
    When I select a product "Smartphone" and add it to the shopping cart
    Then the shopping cart should contain the "Smartphone" product
    
Scenario Outline: Applying Filters in a Category Page
    
    When I apply the filter "<Filter Type>" with the value "<Filter Value>"
    Then the category page should display only products that match the "<Filter Type>" filter criteria

    Examples:
      | Category    | Filter Type  | Filter Value       |
      | Electronics | Brand        | Sony               |
      | Laptops     | Features     | Bluetooth          |
      | Laptops     | Color        | Black              |
      | All         | Price Range  | $100 - $200        |
      
Scenario: Comparing Multiple Products
    
    When I select the products  for comparison
    Then I should be able to view a comparison of the selected products' features and prices
