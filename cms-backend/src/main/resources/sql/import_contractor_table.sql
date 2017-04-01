LOAD DATA LOCAL INFILE  'C:/Users/ukazm/Desktop/projekt/dane do bazy/dane-contractor.csv'
INTO TABLE cms_database.contractor
FIELDS TERMINATED BY ',' 
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
(person_id, project_id);
