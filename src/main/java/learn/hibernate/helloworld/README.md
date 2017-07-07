This example is mainly for settig up project and get it to run

Go to File->setting->search for SQL dialect->pick src folder and choose postgres as SQL dialect

Let intellij connect to DB so it can detect error

Also note pgadmin 4 might be slower than pgadmin3 since 4 is a hybird /desktop/web app and 3 is a desktop app.

run this to insert some data into database

create table People (
	person_id  integer,
	age integer,
    name varchar(50) NOT NULL
)

insert into people values(1, 14, 'tom');
insert into people values(1, 25, 'sam');