Feature: Test facebook 
Scenario Outline: Test login

	Given Open
	
	And Login "<username>" and "<password>" at "C:\Users\KBK3\eclipse-workspace\CucumExam\src\test\java\CucumP\logins.xlsx"
	
	
Examples:
	
	|username|password|
	|soujanya.mongolu@gmail.com|fbpassword16|
	
	











































