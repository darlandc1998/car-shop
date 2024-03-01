-- create_version_table
create table if not exists versions(
	id serial not null primary key,
	id_model int not null,
	name text not null,
	active boolean not null default true,
	deleted boolean not null default false,
	created_at timestamp not null default current_timestamp,
	updated_at timestamp not null default current_timestamp
);