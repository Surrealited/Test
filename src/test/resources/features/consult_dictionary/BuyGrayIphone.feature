Feature: Open https://rozetka.com.ua
  Search for "iPhone"
  Choose "iPhone 11" from dropdown list and go to category page
  Choose any phone with "Grey" color and go to product page
  Change color to "Space Gray"
  Add product to the basket




  Scenario: Looking for results of 'Iphone'
    Given the user is on the Rozetka home page
    When the user enters in search field 'Iphone xs'
    When the user click on result iphone xs
    When the user choose gray iphone xs
    When the user choose silver color iphone xs
    When the user choose gray color of iphone xs
    When the user add gray iphone to basket
    Then check that button 'Оформить заказ' is available
