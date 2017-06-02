DROP TABLE IF EXISTS cars CASCADE;

CREATE TABLE cars(
  id  SERIAL  PRIMARY KEY,
  brandId  INT REFERENCES brands (id),
  power INT,
  engineCapacity INT,
  model VARCHAR(40) NOT NULL UNIQUE,
  doorNumber SMALLINT NOT NULL CHECK(doorNumber>0 AND doorNumber<10)
);