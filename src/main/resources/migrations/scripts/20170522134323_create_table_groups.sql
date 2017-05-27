

-- // create_table_groups
-- Migration SQL that makes the change goes here.

CREATE TABLE hobbys (

            title   VARCHAR(30) NOT NULL,
            country  VARCHAR(30) NOT NULL,
            description  VARCHAR(30) NOT NULL
           PRIMARY KEY (id)
);

-- //@UNDO

    DROP TABLE hobbys;

-- //@UNDO
-- SQL to undo the change goes here.


