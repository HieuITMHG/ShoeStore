CREATE TABLE account (
    Id INT PRIMARY KEY AUTO_INCREMENT, 
    Username VARCHAR(100) NOT NULL UNIQUE,   
    Password VARCHAR(100) NOT NULL UNIQUE,    
    RoleType VARCHAR(100),
    Phone VARCHAR(100),
    Email VARCHAR(100) UNIQUE,      
    Address VARCHAR(250),
    Fullname VARCHAR(100),
    Balance DOUBLE,
    Sextype VARCHAR(20)
);

INSERT INTO account (Username, Password, RoleType, Phone, Email, Address, Fullname, Balance)
VALUES ('admin', '123456', 'ADMIN', NULL, NULL, NULL, NULL, NULL);