create table Student (
	Id LONG not null primary key,
	Name VARCHAR(75) null,
	Address VARCHAR(75) null,
	Std INTEGER,
	Divison VARCHAR(75) null,
	PhoneNo LONG
);

create table StudentInfo (
	Id LONG not null primary key,
	StudentId LONG,
	FirstName VARCHAR(75) null,
	LastName VARCHAR(75) null,
	BloodGroup VARCHAR(75) null
);

create table ecw_StudentInfo (
	Id LONG not null primary key,
	StudentId LONG,
	FirstName VARCHAR(75) null,
	LastName VARCHAR(75) null,
	BloodGroup VARCHAR(75) null
);