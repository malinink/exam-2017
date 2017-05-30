----------------------
-- DROP FOREIGN KEYS
----------------------


----------------------
-- DROP TABLES
----------------------
DROP TABLE IF EXISTS students CASCADE;
DROP TABLE IF EXISTS groups CASCADE;


----------------------
-- CREATE TABLES
----------------------

CREATE TABLE groups(
    id SERIAL PRIMARY KEY,
    number INT NOT NULL UNIQUE,
    course INT,
    captain INT
    );

CREATE TABLE students(
    id SERIAL PRIMARY KEY,
    first_name TEXT,
    last_name TEXT,
    surname TEXT,
    student_card INT NOT NULL UNIQUE,
    group_id INT REFERENCES groups
);

ALTER TABLE groups ADD FOREIGN KEY(captain) REFERENCES students(id);

----------------------
-- INSERT DATA
----------------------

INSERT INTO groups (number, course) VALUES
  ('307', '3'),
  ('308', '3'),
  ('310', '3'),
  ('211', '2'),
  ('111', '1'),
  ('666', '0');

INSERT INTO students (first_name, last_name, surname, student_card, group_id) VALUES
  ('Панченко', 'Антон', 'Дмитриевич', '11111', '1'),
  ('Каминский', 'Василий', 'Владимирович', '11112', '1'),
  ('Ермолаев', 'Алексей', 'Николаевич', '11113', '1'),
  ('Багаев', 'Артём', 'Робизонович', '11101', '1'),
  ('Иванов', 'Иван', 'Иванович', '11001', '2'),
  ('Сергеев', 'Алексей', 'Петрович', '11020', '2'),
  ('Бердин', 'Егор', 'Иванович', '21001', '2'),
  ('Унаров', 'Даниил', 'Олегович', '11345', '3'),
  ('Undefined', 'Captain', 'Here', '00000', '6');


UPDATE groups
SET captain = '1'
WHERE id = '1';

UPDATE groups
SET captain = '7'
WHERE id = '2';

UPDATE groups
SET captain = '8'
WHERE id = '3';

UPDATE groups
SET captain = '9'
WHERE id = '4';

UPDATE groups
SET captain = '9'
WHERE id = '5';
