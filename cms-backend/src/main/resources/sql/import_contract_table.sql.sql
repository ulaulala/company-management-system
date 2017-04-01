LOAD DATA LOCAL INFILE  'C:/Users/ukazm/Desktop/projekt/dane do bazy/dane-contract.csv'
INTO TABLE cms_database.contract
FIELDS TERMINATED BY ',' 
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
(person_id, job_title, salary, start_date);
