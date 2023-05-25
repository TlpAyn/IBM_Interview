Feature: Karriere Feature

  Background:
    Given Navigate to IBM HomePages

      Scenario: Go to career page and open to "This is why we love IBM"
        When Click Mehr and Karriere
        And Go to the Software Engineering Page
        And Click Software Tester (QA)
        Then Verify the authenticity of the page

