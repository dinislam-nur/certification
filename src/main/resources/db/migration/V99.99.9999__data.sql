-- password = user
INSERT INTO users (login, password)
VALUES ('user', '$2y$08$MWChLAB5pSj//YsedRq/beD1lqeJrOPNDsl0MlIunQvGvqrMxDAtq');

INSERT INTO students (full_name, course, discipline)
VALUES ('Pavel Petrov', 2, 'Math'),
       ('Marie Ivanova', 1, 'Eng'),
       ('Stepan Murov', 4, 'Phy'),
       ('Ilya Bars', 1, 'History');