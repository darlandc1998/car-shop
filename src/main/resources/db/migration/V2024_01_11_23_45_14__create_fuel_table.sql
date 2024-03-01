-- create_fuel_table
create table if not exists fuels(
	id serial not null primary key,
	name text not null,
	identifier varchar(30) not null,
	active boolean not null default true,
	deleted boolean not null default false,
	created_at timestamp not null default current_timestamp,
	updated_at timestamp not null default current_timestamp
);