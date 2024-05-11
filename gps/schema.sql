CREATE DATABASE gps_test;
\c gps_test

CREATE TABLE Points_of_interest(
    "id" SERIAL,
    "title" VARCHAR(50),
    "coord_X" INTEGER NOT NULL,
    "coord_Y" INTEGER NOT NULL,
    CONSTRAINT "PK_ID_POINTS_OF_INTEREST" PRIMARY KEY (id)
);

CREATE USER aplication_test;
ALTER USER aplication_test WITH PASSWORD 'aplication_test';
GRANT ALL PRIVILEGES ON Points_of_interest TO aplication_test;
GRANT CONNECT ON DATABASE gps_test to aplication_test;


INSERT INTO Points_of_interest( title, "coord_X", "coord_Y")
VALUES ('A',10,20);
INSERT INTO Points_of_interest(id, title, "coord_X", "coord_Y")
VALUES (2,'teste2',15,5);
INSERT INTO Points_of_interest(id, title, "coord_X", "coord_Y")
VALUES (3,'teste3',20,30);
INSERT INTO Points_of_interest(id, title, "coord_X", "coord_Y")
VALUES (4,'teste4',40,20);
INSERT INTO Points_of_interest(id, title, "coord_X", "coord_Y")
VALUES (5,'teste5',5,25);


