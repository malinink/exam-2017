----------------------
-- DROP FOREIGN KEYS
----------------------


----------------------
-- DROP TABLES
----------------------
DROP TABLE IF EXISTS students;
DROP TABLE IF EXISTS groups;


----------------------
-- CREATE TABLES
----------------------


CREATE TABLE groups(
    id SERIAL PRIMARY KEY,
    course INT
    );

CREATE TABLE students(
  id INT PRIMARY KEY,
  first_name TEXT,
  last_name TEXT,
  surname TEXT,
  group_id INT REFERENCES groups
  );


----------------------
-- INSERT DATA
----------------------

INSERT INTO groups (course) VALUES
  (1),
  (2),
  (3);

INSERT INTO students (id, first_name, last_name, surname, group_id) VALUES
  ('123', 'FirstName1', 'LastName1', 'Surname1', 1),
  ('234', 'FirstName2', 'LastName2', 'Surname2', 1),
  ('345', 'FirstName3', 'LastName3', 'Surname3', 2);
