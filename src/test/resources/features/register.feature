
Feature: Feature to test array functionality

  Scenario Outline: Check register with invalid credentials
    Given The user opens Register Page
    When The user enters <username> , <password> and <confirmpassword>
    And Clicks on register button
    Then User gets instruction
   
   Examples: 
      | username        | password        | confirmpassword|
      |                 |                 |                |
      | vijayBharathi22 |                 |               |
      | vijayBharathi22 | ds_algo22       |               |
      | hgjhjh_(8)      |                 |               |
      | vijayBharathi22 | SDET10          |               |
      | vijayBharathi22 |      7860946    |               |
     

  
  Scenario Outline: Check register with password missmatch
    Given The user opens Register Page
    When The user enters <username> , <password> and <confirmpassword>
    And Clicks on register button
    Then The User gets an error message for password missmatch	
    
     Examples: 
       | username            | password        | confirmpassword      |
       |  vijayBharathi22    |ds_algo22        |  SDET136bacc         |
       
        
#    Scenario Outline: Check register with valid credentials
 #   Given The user opens Register Page
  #  When The user enters <username> , <password> and <confirmpassword>
  #  Then  The user is navigated to the homepage
  
  #    Examples:
  #   | username            | password        | confirmpassword      |
   #   |  vijayBharathi22    |ds_algo22        |  ds_algo22              |