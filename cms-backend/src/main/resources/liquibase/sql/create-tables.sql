USE cms_database;

SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS address;

CREATE TABLE address
(
  address_id  INT         NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (address_id),
  home        VARCHAR(40) NOT NULL,
  flat        INT         NOT NULL,
  postal_code VARCHAR(6)  NOT NULL,
  city        VARCHAR(30) NOT NULL
);

DROP TABLE IF EXISTS person;

CREATE TABLE person
(
  person_id  INT         NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (person_id),
  role_id    INT         NOT NULL,
  FOREIGN KEY (role_id) REFERENCES role (role_id),
  first_name VARCHAR(15) NOT NULL,
  last_name  VARCHAR(30) NOT NULL,
  birthday   DATETIME    NOT NULL,
  address_id INT         NOT NULL,
  FOREIGN KEY (address_id) REFERENCES address (address_id)
);

DROP TABLE IF EXISTS contract;

CREATE TABLE contract
(
  contract_id INT         NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (contract_id),
  person_id   INT         NOT NULL,
  FOREIGN KEY (person_id) REFERENCES person (person_id),
  job_title   VARCHAR(30) NOT NULL,
  salary      INT         NOT NULL,
  start_date  DATETIME    NOT NULL,
  end_date    DATETIME    NOT NULL
);

DROP TABLE IF EXISTS project;

CREATE TABLE project
(
  project_id  INT          NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (project_id),
  title       VARCHAR(30)  NOT NULL,
  principal   VARCHAR(30)  NOT NULL,
  price       INT          NOT NULL,
  start_date  DATETIME     NOT NULL,
  end_date    DATETIME     NOT NULL,
  description VARCHAR(255) NOT NULL
);

DROP TABLE IF EXISTS contractor;

CREATE TABLE contractor
(
  project_id INT NOT NULL,
  FOREIGN KEY (project_id) REFERENCES project (project_id),
  person_id  INT NOT NULL,
  FOREIGN KEY (person_id) REFERENCES person (person_id)
);

DROP TABLE IF EXISTS role;

CREATE TABLE role
(
  role_id INT         NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (role_id),
  name    VARCHAR(30) NOT NULL
);