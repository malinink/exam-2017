

-- // create_table_students
-- Migration SQL that makes the change goes here.
CREATE TABLE students (
            id         SERIAL      NOT NULL,
            first_name VARCHAR(30) NOT NULL,
            last_name VARCHAR(30) NOT NULL,
            surname VARCHAR(30) NOT NULL,
            birthday VARCHAR(30) NOT NULL,
             city VARCHAR(30) NOT NULL,


           hobby_id   INTEGER NOT NULL,
            student_id INTEGER UNIQUE ,

    PRIMARY KEY (id)
);

-- //@UNDO

    DROP TABLE students;




