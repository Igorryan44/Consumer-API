/*Criação das tabelas utilizadas no sistema*/
CREATE TABLE users (
    id BIGINT PRIMARY KEY,
    name varchar(255),
    email varchar(255),
    password varchar(255)
);

CREATE TABLE systems (
    systemId BIGINT PRIMARY KEY,
    systemName varchar(255),
    endpointsId BIGINT,
    FOREIGN KEY (endpointsId) REFERENCES endpoints(endpointsId)

);

CREATE TABLE endpoints (
    endpointsId BIGINT PRIMARY KEY,
    endpointsName varchar(255),
    endpointUrl varchar(255),
    systemId BIGINT UNIQUE,
    FOREIGN KEY (systemId) REFERENCES systems(systemId)
);

