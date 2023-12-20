insert into user_details(id,birth_date,name) values (10001,CURRENT_DATE(),'Harmeet');
insert into user_details(id,birth_date,name) values (10002,CURRENT_DATE(),'Payal');
insert into user_details(id,birth_date,name) values (10003,CURRENT_DATE(),'Renu');

insert into post(id,description,user_id) values (20001,'LEARN AWS',10001);
insert into post(id,description,user_id) values (20002,'LEARN GCP',10001);
insert into post(id,description,user_id) values (20003,'LEARN DEVOPS',10001);

insert into post(id,description,user_id) values (20004,'CERTIFY DEVOPS',10002);

insert into post(id,description,user_id) values (20005,'CERTIFY AWS',10002);