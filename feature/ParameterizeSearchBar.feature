@parameterizeSearchBar
Feature: Search Bar
  As a user, i want to search product with multiple data, so that i can find any product

  Background: i At amazone homepage

  Scenario Outline: Search Product
  	When i search "<product>"
  	Then i see search label is "<searchLbl>"
  
  Examples:
  |product|searchLbl|
  |Macbook|"Macbook"|
  |Samsung|"Samsung"|
  |Sony|"Sony"|
  |Lg|"Lg"|
  |Asus|"Asus"|