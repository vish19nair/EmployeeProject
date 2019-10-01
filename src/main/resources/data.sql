INSERT INTO designation(DESGNID,designation,level) VALUES (1,'DIRECTOR',1);
INSERT INTO designation(DESGNID,designation,level) VALUES (2,'MANAGER',10);
INSERT INTO designation(DESGNID,designation,level)VALUES (3,'LEAD',20);
INSERT INTO designation(DESGNID,designation,level) VALUES (4,'DEVELOPER',30);
INSERT INTO designation(DESGNID,designation,level) VALUES (5,'DEVOPS',30);
INSERT INTO designation(DESGNID,designation,level) VALUES (6,'QA',30);
INSERT INTO designation(DESGNID,designation,level)VALUES (7,'INTERN',40);

INSERT INTO EMPLOYEE(EMPID,EMPNAME,managerid,DESGNID) VALUES (1,'THOR',NULL,1 );
INSERT INTO EMPLOYEE (EMPID,EMPNAME,managerid,DESGNID) VALUES (2,'IRONMAN',1,2);
INSERT INTO EMPLOYEE (EMPID,EMPNAME,managerid,DESGNID) VALUES (3,'HULK',1,3 );
INSERT INTO EMPLOYEE (EMPID,EMPNAME,managerid,DESGNID) VALUES (4,'CAPTAINAMERICA',1,2);
INSERT INTO EMPLOYEE (EMPID,EMPNAME,managerid,DESGNID) VALUES (5,'WARMACHINE',2,6);
INSERT INTO EMPLOYEE (EMPID,EMPNAME,managerid,DESGNID) VALUES (6,'VISION',2,5);
INSERT INTO EMPLOYEE (EMPID,EMPNAME,managerid,DESGNID) VALUES (8,'BLACKWIDOW',3,4);
INSERT INTO EMPLOYEE (EMPID,EMPNAME,managerid,DESGNID) VALUES (9,'FALCON',4,5);
INSERT INTO EMPLOYEE (EMPID,EMPNAME,managerid,DESGNID) VALUES (10,'ANTMAN',4,3);

