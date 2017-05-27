

-- // linking_table
-- Migration SQL that makes the change goes here.



CREATE TABLE students_hobbys(
id INTEGER PRIMARY KEY ,
    students INT,
    hobby INT,
    FOREIGN KEY(student) REFERENCES students(id),

FOREIGN KEY(hobby) REFERENCES hobbys(id)
);


DROP TABLE IF EXISTS students_hobbys CASCADE;


-- //@UNDO
-- SQL to undo the change goes here.


