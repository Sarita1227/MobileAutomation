Feature: Sample Mobile app automation

  Scenario Outline: Sample Mobile app automation
    Given Enter username as <User Name> and password as <Password>
    Then Click on Login Button
    Then Verify if house image is available

    Examples:
      | User Name 			| Password |
      | percival@gmail.com 	| 123456   |
      | arthur@gmail.com 	| 98765    |
