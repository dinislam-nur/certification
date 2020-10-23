
CREATE TABLE students
(
  student_id BIGSERIAL,
  full_name TEXT NOT NULL,
  course INTEGER NOT NULL,
  discipline TEXT NOT NULL,
  CONSTRAINT pk_students_student_id PRIMARY KEY (student_id),
  CONSTRAINT uq_students_full_name UNIQUE (full_name)
);