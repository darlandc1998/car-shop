-- create_color_table
create table if not exists colors (
	id serial not null primary key,
	name text not null,
	rgb text,
	active boolean not null default true,
	deleted boolean not null default false,
	created_at timestamp not null default current_timestamp,
	updated_at timestamp not null default current_timestamp
);