CREATE TABLE if NOT EXISTS product(
id INT NOT NULL AUTO_INCREMENT,
name VARCHAR(45),
price DOUBLE,
serving VARCHAR(45),
PRIMARY KEY (id));

CREATE TABLE if NOT EXISTS zip(
    zip INT NOT NULL AUTO_INCREMENT,
    city VARCHAR(45),
    state VARCHAR(45),
    PRIMARY KEY (zip));

INSERT INTO zip VALUES (55501, 'Minnetonka', 'Minnesota');
INSERT INTO zip VALUES (55502, 'Moorhead', 'Minnesota');
INSERT INTO zip VALUES (55503, 'Wayzata', 'Minnesota');
INSERT INTO zip VALUES (55504, 'New Ulm', 'Minnesota');