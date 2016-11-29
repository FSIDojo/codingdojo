
Feature: full text keyword translate

Scenario Outline: user input words
When user input <keywords> with exactly <flag>
Then the translation output will be <output>
Examples:
|keywords| flag  | output  |
| word   | false |  word*  |
| *word* | false |  *word* |
| *word * | false | *word AND * |