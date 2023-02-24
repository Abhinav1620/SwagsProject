Feature: Login functionality
  checking

  Scenario Outline: Login functionality with correct username and correct password
    Given I navigated to portal
    And Enter "<username>" and "<password>"
    When I click on login
    Then I should be able to see dashboard

    Examples:
      | username      | password     |
      | standard_user | secret_sauce |

  Scenario Outline: Login functionality with correct username and incorrect password
    Given I navigated to portal
    And Enter "<username>" and "<password>"
    When I click on login
    Then I should be able to see dashboard

    Examples:
      | username      | password |
      | standard_user | secret   |


  Scenario Outline: Login functionality with incorrect username and correct password
    Given I navigated to portal
    And Enter "<username>" and "<password>"
    When I click on login
    Then I should be able to see dashboard

    Examples:
      | username | password     |
      | standard | secret_sauce |

  Scenario Outline: Login functionality with incorrect username and incorrect password
    Given I navigated to portal
    And Enter "<username>" and "<password>"
    When I click on login
    Then I should be able to see dashboard

    Examples:
      | username | password |
      | standard | secret   |