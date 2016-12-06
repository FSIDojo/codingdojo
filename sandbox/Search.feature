
Feature: search

Scenario: return all lines contains the user input words
Given the text content:
    |One little, two little, three little Indians|
    |Four little, five little, six little Indians|
    |Seven little, eight little, nine little Indians|
    |Ten little Indian boys.|
When I input <five>
Then the result will be: "Four little, five little, six little Indians"
