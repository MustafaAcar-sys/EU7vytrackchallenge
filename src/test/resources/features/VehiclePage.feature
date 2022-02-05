@navigate
Feature:
  Background:
    Given the user is on the login page
    Then the user enters the sales manager information
    And the user navigates to  "Fleet" "Vehicles" page

@1
    Scenario: Navigating Filter Button
    Then the title verified as "All Cars"

@2
    Scenario: Navigating Manage Filter Button
    And the user clicks the filters icon
    Then the "Manage filters" button  should be displayed

@3
    Scenario: Clicking different filter types
    When the user clicks the filters icon
    And  the user clicks the Manage filters button
    And  the user clicks on a filter name
    Then the filter name should be displayed


@4
    Scenario Outline: Applying Filters by typing <filterName>
    When  the user clicking the Manage filters button
    Then   the user types a "<filterName>" on a filter type
    And  the written "<filterName>" should be displayed

    Examples:
      | filterName    |
      | License Plate |
      | Tags          |
      | Driver        |
      | Location      |
      | Model Year    |
      | Color         |

  @5
  Scenario: Removing Filters
    Given the user selected filters
    When  the user clicks the reset button
    Then  all the selected filters should be removed