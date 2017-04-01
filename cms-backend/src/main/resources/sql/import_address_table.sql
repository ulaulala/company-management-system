LOAD DATA LOCAL INFILE  'C:\Users\Daniel\Desktop\baza\dane-address.csv'
INTO TABLE cms_database.address
FIELDS TERMINATED BY ',' 
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
(home, flat, postal_code, city);

