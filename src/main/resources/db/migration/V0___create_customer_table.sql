create table if not exists customers (
	id serial not null primary key,
	name text not null,
	active int not null default 1,
	deleted int not null default 0,
	created_at timestamp not null default current_timestamp,
	updated_at timestamp not null default current_timestamp
);