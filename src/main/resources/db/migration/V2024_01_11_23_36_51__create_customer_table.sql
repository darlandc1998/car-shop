-- create_customer_table
create table if not exists customers(
	id serial not null primary key,
	name text not null,
	cod_name text not null,
	cover text,
	description text,
	active boolean not null default true,
	deleted boolean not null default false,
	created_at timestamp not null default current_timestamp,
	updated_at timestamp not null default current_timestamp
);