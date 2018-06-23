CREATE TABLE Address (
    id BIGINT AUTO_INCREMENT,
    number VARCHAR(255) ,
    street VARCHAR(255) ,
    PRIMARY KEY ( id )
);

CREATE TABLE Person (
    id BIGINT  AUTO_INCREMENT,
    name varchar,
    PRIMARY KEY ( id )
);

CREATE TABLE Person_Address (
    Person_id BIGINT NOT NULL ,
    addresses_id BIGINT NOT NULL
);

ALTER TABLE Person_Address
ADD CONSTRAINT addresses_id_fk
FOREIGN KEY (addresses_id) REFERENCES Address;

ALTER TABLE Person_Address
ADD CONSTRAINT Person_id_fk
FOREIGN KEY (Person_id) REFERENCES Person;