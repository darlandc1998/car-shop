-- create_model_table
create table if not exists models (
	id serial not null primary key,
	id_brand int not null,
	name text not null,
	description text,
	cover text,
	active boolean not null default true,
	deleted boolean not null default false,
	created_at timestamp not null default current_timestamp,
	updated_at timestamp not null default current_timestamp,
	foreign key (id_brand) references brands(id)
);