Feature: VIX Payment Feature

  @loginRakamin
  Scenario: Authenticated user checkout program (user already logged in)
    Given User navigates to the VIX detail page
    When User click “Daftar Sekarang”
    And User fill form application
    And User confirmed to continue
    And User checkout
    Then The system redirect to payment page
