@BddTests
Feature: BddTests
Background:
Given i am on scenario "Background" 

@SA
Scenario: scenario A
     Given i am on scenario "A"
@SB    
     Scenario: scenario B
     Given i am on scenario "B"
@SC    
     Scenario: scenario C
     Given i am on scenario "C"
@SD    
     Scenario: scenario D
     Given i am on scenario "D"
@SE   
     Scenario: scenario E
     Given i am on scenario "E"
 @SXYZ    
      Scenario: scenario  XYZ
     Given i am on scenario "XYZ"

@outline
Scenario Outline: scenario F
	Given  i am on scenario "<keyword>"
Examples:
|	keyword |
|		B|
|		C|
|		D|
|		E|
|XYZ |
 
