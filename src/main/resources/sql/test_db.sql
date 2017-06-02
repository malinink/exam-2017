----------------------
-- DROP FOREIGN KEYS
----------------------


----------------------
-- DROP TABLES
----------------------
DROP TABLE IF EXISTS flats;
DROP TABLE IF EXISTS room;



----------------------
-- CREATE TABLES
----------------------


CREATE TABLE flats(
  id SERIAL PRIMARY KEY,
  floor INT,
  entrance INT,
  adress TEXT
);

CREATE TABLE room(
  id SERIAL PRIMARY KEY,
  square INT,
  function TEXT,
  isliving BOOLEAN,
  flat_id INT REFERENCES flats(id)
);



----------------------
-- INSERT DATA
----------------------

INSERT INTO flats (floor, entrance,adress) VALUES
  ('1', '5', 'botanicheskaya 5'),
  ('12', '3', 'nevskii 10'),
  ('7', '2', 'dvortsovaya 15b');

INSERT INTO room (square, function, isliving, flat_id) VALUES
  ('120', 'living', TRUE, '1'),
  ('200', 'kitchen', FALSE , '2'),
  ('100', 'bedroom', TRUE , '2');
