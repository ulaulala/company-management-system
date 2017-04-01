LOAD DATA LOCAL INFILE  'C:/Users/ukazm/Desktop/projekt/dane do bazy/dane-person.csv'
INTO TABLE cms_database.person
FIELDS TERMINATED BY ',' 
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
(role_id, first_name, last_name, address_id);

