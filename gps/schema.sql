CREATE DATABASE gps_test;
\c gps_test

CREATE  TABLE Points_of_interest(
    "id" SERIAL PRIMARY KEY ,
    "title" VARCHAR(50),
    "coord_x" INTEGER NOT NULL,
    "coord_y" INTEGER NOT NULL
);

CREATE USER aplication_test;
ALTER USER aplication_test WITH PASSWORD 'aplication_test';
GRANT ALL PRIVILEGES ON Points_of_interest TO aplication_test;
GRANT CONNECT ON DATABASE gps_test to aplication_test;
GRANT USAGE, SELECT ON ALL SEQUENCES IN SCHEMA public TO aplication_test;


INSERT INTO Points_of_interest( title, "coord_x", "coord_y")
VALUES ('A',10,20);
INSERT INTO Points_of_interest( title, "coord_x", "coord_y")
VALUES ('teste2',15,5);
INSERT INTO Points_of_interest(title, "coord_x", "coord_y")
VALUES ('teste3',20,30);
INSERT INTO Points_of_interest(title, "coord_x", "coord_y")
VALUES ('teste4',40,20);
INSERT INTO Points_of_interest(title, "coord_x", "coord_y")
VALUES ('teste5',5,25);


