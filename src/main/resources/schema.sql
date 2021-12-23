DROP TABLE IF EXISTS tbl_user;

CREATE TABLE tbl_user
(
    username  VARCHAR(250) PRIMARY KEY,
    password  VARCHAR(250) NOT NULL,
    firstname VARCHAR(250) NOT NULL,
    lastname  VARCHAR(250) NOT NULL,
    email     VARCHAR(250) NOT NULL
);