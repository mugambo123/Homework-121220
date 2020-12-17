Feature: amazon.co.uk Christmas Deals
  As a user I want to visit amazon.co.uk for christmas offers

  @Sanity
  Scenario: User can check Last Minute Deals for Computer&Software and Sort by Price Low to High
    Given I am on home page
    When I click on Last Minute Deals
    And I should be on Last Minute Deals Page expectedMessage "Last Minute Christmas Deals"
    And I click on Computers & Software
    And I should be on Deals on Computer and Software expectedMsg "Deals on Computers and Software"
    And I click on Sort by Featured
    And I  from dropdown select "Price - Low to High"
    Then products should be displayed accordingly

  @Smoke
  Scenario: User wants to see highest discounted offers in Last Minute Deals
    Given I am on home page
    When I click on Last Minute Deals
    And I should be on Last Minute Deals Page expectedMessage "Last Minute Christmas Deals"
    And click on Shop All Deals
    And I should be on Shop deals page expectedText "Shop deals"
    And I click on Sort by Featured
    And from dropdown I select option Discount - High to Low
    Then I should get list of highest discounted products

  @Regression
  Scenario Outline: New customer wants to create account in amazon.co.uk
    Given I am on home page
    When I mouse hover on Hello, Sign in
    And I click on New customer? Start here.
    And I should be on Create account page with expectedText "Create account"
    And I enter name "<name>"
    And I enter email "<randomEmailAddress>"
    And I enter password "<randomPassword>"
    And I click on Create your Amazon account
    Then Verify that you are a real person text "<realPersonText>"
    Examples:
      | name    | randomEmailAddress | randomPassword | realPersonText                                                |
      | Jagira  | randomEmailAddress | randomPassword | Please solve this puzzle so we know that you're a real person |
      | Mowgali | randomEmailAddress | randomPassword | Please solve this puzzle so we know that you're a real person |


