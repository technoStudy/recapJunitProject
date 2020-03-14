Feature: Search price between numbers
  @SmokeTest
  Scenario: Search price between 75 to 100

  Given Navigate to website
  And Search for "Teddy bear"
  And Click on search button
  And click on price filter seventy five to hundred
  Then Verify all prices are between seventy five and hundred

  Scenario: Search price between 25 to 75

    Given Navigate to website
    And Search for "Teddy bear"
    And Click on search button
    And click on price filter twenty five to seventy five
    Then Verify all prices are between twenty five to seventy five



