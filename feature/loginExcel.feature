Feature: Login Data Driven from ExcelSheet

Scenario Outline: Login Data Driven from ExcelSheet

	 Given User is in login page
	 Then passing Email and Password with excel row "<row_index>"
	 
	 Examples:
	 |row_index|
	 |1|
	 |2|
	 |3|
	 |4|