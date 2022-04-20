@login @Regression1
Feature: TC_001_Login Page Test Cases

  @TC01
  Scenario: Verify that New Tours logo image is displayed in top left
    Given New Tours Web Page is opened
    Then New Tours logo image is displayed in top left
    Then I Close the browser

  @TC02
  Scenario: User is able to login successfully
    Given New Tours Web Page is opened
    Then User enter username, password and click on submit
    Then User validate the welcome message

  @headers
  Scenario Outline: Validate Headers
    Given New Tours Website is opened and logged in
    Then Validate header "<headerName>" displayed on the page

    Examples: 
      | headerName |
      | Home       |
      | Book       |
      | XYX        |
      | ABC        |

      
     