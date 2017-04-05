package com.rjohnson

class BookReview {

  

Book 	book
Date 	dateCreated
Student	student
String	review
	

   	static constraints = {
	
	book blank:false, nullable:false
	dateCreated blank:false, nullable:false
	student blank:false, nullable:false
	review blank:false, nullable:false
	


    }
} 

