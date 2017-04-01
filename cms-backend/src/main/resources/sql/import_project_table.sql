LOAD DATA LOCAL INFILE  'C:/Users/ukazm/Desktop/projekt/dane do bazy/dane-project.csv'
INTO TABLE cms_database.project
FIELDS TERMINATED BY ',' 
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
(principal, price, start_date, end_date, title);

