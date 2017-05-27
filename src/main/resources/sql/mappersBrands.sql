----------------------
-- DROP FOREIGN KEYS
----------------------


----------------------
-- DROP TABLES
----------------------
DROP TABLE IF EXISTS brands;
DROP TABLE IF EXISTS cars;


----------------------
-- CREATE TABLES
----------------------


CREATE TABLE brands(
  id SERIAL PRIMARY KEY,
  name VARCHAR(30),
  date VARCHAR(30),
  premial VARCHAR(30)
  );

CREATE TABLE cars(
  id INT PRIMARY KEY,
  power int,
  model VARCHAR(30),
  doors VARCHAR(30),
  brands_id INT REFERENCES brands
  );


----------------------
-- INSERT DATA
----------------------

INSERT INTO brands (name) VALUES
  (Vaz),
  (Ferrari),
  (Gaz);

INSERT INTO cars (id, power, model, doors, brands_id) VALUES
  ('100', 'Zhiguli', '5', 'Surname1', 1),
  ('200', 'Lada', '3', 'Surname2', 1),
  ('300', 'Spider', '3', 'Surname3', 2);