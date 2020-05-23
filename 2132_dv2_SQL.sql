SET search_path = "2132_dv2";


CREATE TABLE GuestInfo(
	GuestFirstName VARCHAR(20),
	GuestLastName VARCHAR(20),
	GuestFullName VARCHAR(20),
	GuestID INTEGER,
	GuestBirth DATE,
	GuestAddress VARCHAR(20),
	GuestEmail VARCHAR(20),
	GuestPhone VARCHAR(20),
	PRIMARY KEY(GuestID)
);

CREATE TABLE BranchInfo(
	BranchName VARCHAR(20),
	BranchId INTEGER,
	BranchCity VARCHAR(20),
	BranchProvince VARCHAR(20),
	BranchCountry VARCHAR(20),
	PRIMARY KEY(BranchID)
);

CREATE TABLE HostInfo(
	HostID INTEGER,
	HostName VARCHAR(20),
	HostAddress VARCHAR(20),
	HostEmail VARCHAR(20),
	HostPhone INTEGER,
	PRIMARY KEY(HostID)
);

CREATE TABLE Payment(
	GuestID INTEGER,
	HostID INTEGER,
	ReceiptNumber VARCHAR(20),
	TypeOfPayment VARCHAR(20),
	AmountOfPayment NUMERIC(8,2),
	PaymentStatus VARCHAR(20),
	PRIMARY KEY(typeOfPayment),
	FOREIGN KEY(GuestID) REFERENCES GuestInfo,
	FOREIGN KEY (HostID) REFERENCES HostInfo
);

CREATE TABLE PropertyInfo(
	HostID INTEGER,
	BranchID INTEGER,
	AvailableDate DATE,
	RoomType VARCHAR(20),
	PropertyAddress VARCHAR(20),
	PropertyType VARCHAR(20),
	PropertyLocation VARCHAR(20),
	PropertyPrice NUMERIC(8,2),
	Rented BOOLEAN,
	Dates DATE,
	PRIMARY KEY(PropertyAddress),
	FOREIGN KEY(HostID) references HostInfo,
	FOREIGN KEY(BranchID) references BranchInfo
);

CREATE TABLE Agreement(
	GuestID INTEGER,
	HostID INTEGER,
	SigningDate DATE,
	StartDate DATE,
	EndDate DATE,
	PRIMARY KEY(SigningDate),
	FOREIGN KEY(GuestID) REFERENCES GuestInfo,
	FOREIGN KEY (HostID) REFERENCES HostInfo
);

CREATE TABLE ReviewRating(
	PropertyAddress VARCHAR(20),
	Rating NUMERIC(8,2),
	Communication VARCHAR(20),
	Cleanliness VARCHAR(20),
	GuestComment VARCHAR(20),
	PRIMARY KEY(Rating),
	FOREIGN KEY(PropertyAddress) references PropertyInfo
);

CREATE TABLE Employee(
	EmployeeID INTEGER,
	EmployeeBasicInformation VARCHAR(20),
	EmployeePosition VARCHAR(20),
	EmployeeSalary INTEGER,
	EmployeeName VARCHAR(20),
	BranchID INTEGER,
	password VARCHAR(20),
	PRIMARY KEY(EmployeeID),
	FOREIGN KEY(BranchID) REFERENCES BranchInfo


);

CREATE TABLE AdminInfo(
	AdminName VARCHAR(20),
	AdminID INTEGER,
	AdminPassword VARCHAR(20),
	Primary key(AdminID)
);

CREATE TABLE Manager(
	ManagerID INTEGER,
	ManagerBasicInformation VARCHAR(20),
	ManagerPosition VARCHAR(20),
	ManagerSalary INTEGER,
	ManagerName VARCHAR(20),
	ManagerBranchID INTEGER,
	PRIMARY KEY(ManagerID),
	FOREIGN KEY(ManagerBranchID) REFERENCES BranchInfo
);