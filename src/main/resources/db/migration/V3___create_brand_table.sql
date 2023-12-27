create table if not exists brands (
	id serial not null primary key,
	id_customer int not null,
	name text not null,
	deleted int not null default 0,
	created_at timestamp not null default current_timestamp,
	updated_at timestamp not null default current_timestamp,
	foreign key (id_customer) references customers(id)
);

