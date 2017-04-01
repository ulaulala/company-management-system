use cms_database;

SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS address;

create table address
(
	address_id int not null AUTO_INCREMENT,  PRIMARY KEY (address_id),
    home varchar(40),
    flat int,
    postal_code char(6),
    city varchar(30)
);

DROP TABLE IF EXISTS person;

create table person
(
	person_id int not null AUTO_INCREMENT, PRIMARY KEY (person_id),
    role_id int not null, foreign key (role_id) references role(role_id),
    first_name varchar(15) not null,
    last_name varchar(30) not null,
    birthday datetime,
    address_id int not null, FOREIGN KEY (address_id) REFERENCES address(address_id)
);

DROP TABLE IF EXISTS contract;

create table contract
(
	contract_id int not null AUTO_INCREMENT, PRIMARY KEY (contract_id),
    person_id int, FOREIGN KEY (person_id) REFERENCES person(person_id),
    job_title varchar(30),
    salary int,
    start_date datetime,
	end_date datetime
);

DROP TABLE IF EXISTS project;

create table project
(
	project_id int not null AUTO_INCREMENT, PRIMARY KEY (project_id),
    title varchar(30),
    principal varchar(30),
    price int,
    start_date datetime,
    end_date datetime
);

DROP TABLE IF EXISTS contractor;

create table contractor
(
	project_id int not null, foreign key (project_id) references project(project_id),
    person_id int not null, foreign key (person_id) references person(person_id)
);

DROP TABLE IF EXISTS role;

create table role
(
	role_id int not null, PRIMARY KEY (role_id),
    name varchar(30)
);

