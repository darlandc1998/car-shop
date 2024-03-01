-- create_category_table
create table if not exists categories(
	id serial not null primary key,
	name text not null,
	description text,
	cover text,
	active boolean not null default true,
	deleted boolean not null default false,
	created_at timestamp not null default current_timestamp,
	updated_at timestamp not null default current_timestamp
);