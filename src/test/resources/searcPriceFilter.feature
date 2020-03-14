Feature: Search price between numbers
#    background is specific for one feature file
#    background will run before every scenario or scenario outline
  Background:
    Given Navigate to website
    And Search for "Teddy bear"
    And Click on search button

  @SmokeTest
  Scenario: Search price between 75 to 100
    And click on price filter seventy five to hundred
    Then Verify all prices are between seventy five and hundred

  @SmokeTest
  Scenario: Search price between 25 to 75
  And click on price filter twenty five to seventy five
  Then Verify all prices are between twenty five to seventy five



