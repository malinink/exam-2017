--
--    Copyright 2010-2016 the original author or authors.
--
--    Licensed under the Apache License, Version 2.0 (the "License");
--    you may not use this file except in compliance with the License.
--    You may obtain a copy of the License at
--
--       http://www.apache.org/licenses/LICENSE-2.0
--
--    Unless required by applicable law or agreed to in writing, software
--    distributed under the License is distributed on an "AS IS" BASIS,
--    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
--    See the License for the specific language governing permissions and
--    limitations under the License.
--

-- // groupstud
-- Migration SQL that makes the change goes here.



-- //@UNDO
-- SQL to undo the change goes here.

----------------------

CREATE TABLE groups(
  id SERIAL PRIMARY KEY,
  number INT NOT NULL UNIQUE,
  course INT,
  captain INT,
  facult TEXT
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

INSERT INTO groups (number, course,facult) VALUES
  ('407', '3','ПМ-ПУ'),
  ('408', '3','ПМ-ПУ'),
  ('410', '3','ПМ-ПУ'),
  ('411', '2','ПМ-ПУ'),
  ('211', '1','ПМ-ПУ'),
  ('566', '0','Unknown');

INSERT INTO students (first_name, last_name, surname, student_card, group_id) VALUES
    ('Шульга', 'Валентин', 'Александрович', '20111', '1'),
    ('Марков ', 'Владислав', 'Владимирович', '20112', '1'),
    ('Ермолаев', 'Алексей', 'Николаевич', '20113', '1'),
    ('Цыбулина', 'Марина', 'Александровна', '20101', '1'),
    ('Петров', 'Иван', 'Васильевич', '20001', '2'),
    ('Сергеев', 'Алексей', 'Петрович', '20020', '2'),
    ('Бердин', 'Егор', 'Иванович', '21001', '2'),
    ('Халиуллина', 'Лия', 'Рауфовна', '11345', '3'),
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