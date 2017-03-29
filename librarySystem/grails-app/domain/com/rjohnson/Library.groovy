package com.rjohnson

class Library {

    static constraints = {
    }
}

String 	name/building
String	address
String	openingHours
String	location
String	studySpaces
}	
	

    static constraints = {
	
	name/building blank:false, nullable:false
	address blank:false, nullable:false
	openingHours:false, nullable:false
	location blank:false, nullable:false
	studySpaces blank:false, nullable:false

    }
} 
