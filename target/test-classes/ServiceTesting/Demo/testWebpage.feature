Feature: Open google homepage

  Scenario: google homepage should show up
    Given A web browser
    When I try to open google homepage   
    Then the google homepage shows up
   And search for ATDD   

  #Scenario: CapitalOne homepage should show up
   # Given A web browser
   # When I try to open CapitalOne homepage
    #Then the CapitalOne homepage shows up
 #And search for ATDD   