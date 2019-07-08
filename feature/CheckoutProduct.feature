@checkoutProduct
Feature: Transaction
  As a user, i want to search product, so that i can buy some product

  Background: i At amazone homepage

  Scenario: Checkout Product
		When i login with user "testgojekibnuh@gmail.com"
		And i click menu Departements Headphone
		And i click one item available
		And i click add to cart
		Then i see product already "Added to Cart"
		When i navigate to homepage
		And i search "Macbook pro"
    And i add to cart two Available product with "2" qty
    And i click cart from homepage 
    And i remove headphone from cart 
    Then i see headphone "Bose QuietComfort 35 II Wireless Bluetooth Headphones, Noise-Can... was removed from Shopping Cart."
    When i reduce quantity of the macbook pro to "1"
    And i process to checkout  
    Then i see shipping page
    
  	
