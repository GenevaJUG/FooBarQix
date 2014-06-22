Feature: Example

Scenario: Division by 3
    When I have a division by 3
    Then the result should contain Foo


Scenario: Division by 5
    When I have a division by 5
    Then the result should contain Bar


Scenario: Division by 7
    When I have a division by 7
    Then the result should contain Qix


Scenario: Contains 3
    When the number contains 3
    Then the result should contain Foo

Scenario: Contains 5
    When the number contains 5
    Then the result should contain Bar

Scenario: Contains 7
    When the number contains 7
    Then the result should contain Qix


Scenario: 51 should give FooBar
    When the number is 51
    Then the result should be FooBar

Scenario: 53 should give BarFoo
    When the number is 53
    Then the result should be BarFoo


Scenario: 21 should give FooQix
    When the number is 21
    Then the result should be FooQix

Scenario: 13 should give Foo
    When the number is 13
    Then the result should be Foo

Scenario: 15 should give FooBarBar
    When the number is 15
    Then the result should be FooBarBar

Scenario: 33 should give FooFooFoo
    When the number is 33
    Then the result should be FooFooFoo
