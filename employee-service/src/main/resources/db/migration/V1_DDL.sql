CREATE TABLE Employee
  (
     id             UUID NOT NULL,
     name           VARCHAR(255),
     age            INT NOT NULL,
     position       VARCHAR(255) NOT NULL,
     organizationId UUID,
     departmentId   UUID,
     PRIMARY KEY (id)
  );