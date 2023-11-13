CREATE TABLE if NOT EXISTS PRODUCT(
    id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(45),
    price DOUBLE,
    serving VARCHAR(45),
    PRIMARY KEY (id));

CREATE TABLE if NOT EXISTS EMPLOYEE(
    id INT NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(45),
    last_name VARCHAR(45),
    salary DOUBLE,
    employee_role VARCHAR(45),
    PRIMARY KEY (id));

    CREATE TABLE if NOT EXISTS CUSTOMER(
    id INT NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(45),
    last_name VARCHAR(45),
    phone_number BIGINT,
    PRIMARY KEY (id));
