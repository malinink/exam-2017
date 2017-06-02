DROP TABLE IF EXISTS brands CASCADE;

CREATE TABLE brands(
  id  SERIAL  PRIMARY KEY,
  name VARCHAR(40) NOT NULL UNIQUE,
  foundationDate SMALLINT NOT NULL CHECK(foundationDate>0 AND foundationDate<2017),
  premium VARCHAR(5) NOT NULL CHECK (premium='yes' OR premium='no')
);