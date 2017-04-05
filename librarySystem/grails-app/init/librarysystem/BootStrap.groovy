package com.rjohnson

class BootStrap {

def init = { servletContext ->

def library1 = new Library (

	building: 'Collegiate',
	address: '12 Night Street',
	openingHours: '12-8',
	location: 'town',
	studySpaces: '59959'
).save()

def library2 = new Library (

	building: 'City',
	address: '144 Night Street',
	openingHours: '4-9',
	location: 'City',
	studySpaces: '1'
).save()

def course1 = new Course (

	title: 'IT',
	code: '9876',
	leader: 'Tonderai',
	department: 'Computing',
	description: 'info here',
	studyMode: 'part-time'
).save()

def course2 = new Course (

	title: 'Maths',
	code: '98768444',
	leader: 'Jacky',
	department: 'Science',
	description: 'Maths 4 lyf',
	studyMode: 'full-time'
).save()

    

def student1 = new Student (

	name: 'Daniel',
	email: 'b501@my.shu.ac.uk',
	userName: 'b501',
	password: 'asdfd',
	studentId: '224242',
	course: course1,
	library: library1
).save()

def student2 = new Student (


	name: 'Scott',
	email: 'b50140344545@my.shu.ac.uk',
	userName: 'b58585',
	password: 'qwerty',
	studentId: '33333',
	course: course2,
	library: library2
).save()

def book1 = new Book (	

	title: 'Harry Potter',
	subject: 'sci-fi',
	author: 'JK Rowling',
	isbn: '001',
	dateBorrowed: new Date('10/11/1996'),
	returnDate: new Date ('21/11/1996'),
	student: student1,
	overdue: true,
	library: library1
).save()

def book2 = new Book (

	title: 'Lord of the rings',
	subject: 'lol',
	author: 'lol',
	isbn: '0008',
	dateBorrowed: new Date('19/01/1965'),
	returnDate: new Date ('19/01/1996'),
	student:student2,
	overdue: true,
	library: library2
).save()

def bookreview1 = new BookReview (

	book:book2,
	dateCreated: new Date('12/14/1995'),
	student: student1,
	review: 'This book was sick'
).save()

def bookreview2 = new BookReview (


	book: 'Harry Potter',
	dateCreated: new Date('18/12/1985'),
	student: student2,
	review: 'This book was magic'
).save()


def librarian1 = new Librarian (
	
	name: 'Ryan Librarian',
	email: 'ryjohnson1996@hotmail.co.uk',	
	office: 'Back Office',
	userName: 'ryannnn96',
	password: 'dfsdfsf',
	telephone: '07925878482',
	library: library1
).save()

def librarian2 = new Librarian (


	name: 'Scott Librarian',
	email: 'ryjshannon1996@hotmail.co.uk',	
	office: 'Cantor',
	userName: 'shaz97',
	password: 'qwerty',
	telephone: '56565857',
	library: library2
).save()
}

    
    def destroy = {
    }
}
