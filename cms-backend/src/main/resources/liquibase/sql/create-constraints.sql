ALTER TABLE cms_database.contract
  ADD CONSTRAINT check_salary CHECK (salary>=0);

ALTER TABLE cms_database.address
  ADD CONSTRAINT check_flat CHECK (flat>0);

ALTER TABLE cms_database.project
  ADD CONSTRAINT check_price CHECK (price>=0);