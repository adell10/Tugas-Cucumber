Feature: Login SauceDemo

  @positive
  Scenario: Login Success
    Given User berada di halaman login
    When User input username "standard_user"
    And User input password "secret_sauce"
    And User klik tombol login
    Then User berhasil login

  @negative
  Scenario: Login Failed
    Given User berada di halaman login
    When User input username "wrong_user"
    And User input password "wrong_pass"
    And User klik tombol login
    Then Error message tampil