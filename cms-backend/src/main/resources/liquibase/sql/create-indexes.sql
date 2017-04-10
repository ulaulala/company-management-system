CREATE INDEX idx_person_name
  ON person (last_name, first_name);

CREATE INDEX idx_principal
  ON project (principal);

CREATE INDEX idx_principal_title
  ON project (principal, title);

CREATE INDEX idx_jobtitle
  ON contract (job_title);

CREATE INDEX idx_salary
  ON contract (salary);

CREATE INDEX idx_city
  ON address (city);