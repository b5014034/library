package com.rjohnson

class Student {

  

String	name
String	email	
String	userName
String	password
String	studentId
Course	course	
Library library

String toString()[

return name]


	static hasMany=[books:Book]
	

    	static constraints = {
	
	name blank:false, nullable:false
	email blank:false, nullable:false
	userName blank:false, nullable:false
	password blank:false, nullable:false
	studentId blank:false, nullable:false
	course blank:false, nullable:false

    }
} 
