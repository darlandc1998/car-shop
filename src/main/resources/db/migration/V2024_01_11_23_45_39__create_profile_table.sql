-- create_profile_table
create table if not exists profiles(
	id serial not null primary key,
	id_customer int not null,
	name text not null,
	type varchar(50) not null default 'ROOT',
	active boolean not null default true,
	deleted boolean not null default false,
    created_at timestamp not null default current_timestamp,
    updated_at timestamp not null default current_timestamp,
	foreign key (id_customer) references customers(id)
);