Feature: Telecom

  Scenario Outline: Adding New Customer
    Given Launch the URL and get into the Add Customer Page
    When Fill the Credentials "<fname>","<lname>","<email>","<address>","<phno>"
    And Click the Submit
    Then Genrate the Customer ID
    And Return Success Message "Access Details to Guru99 Telecom"

    Examples: 
      | fname  | lname | email          | address  | phno       |
      | Rajesh | Kanna | raj@gmail.com  | saidapet | 9629736672 |
      | Guna   | sekar | guna@gmail.com | Avadi    | 9876543210 |
