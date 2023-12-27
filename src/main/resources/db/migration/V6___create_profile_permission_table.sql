create table if not exists profiles_permissions(
    id_customer int not null,
	id_profile int not null,
	id_permission int not null,
	view smallint not null default 0,
	insert smallint not null default 0,
	update smallint not null default 0,
	delete smallint not null default 0,
	foreign key (id_customer) references customers(id),
	foreign key (id_profile) references profiles(id),
	foreign key (id_permission) references permissions(id),
	primary key(id_customer, id_profile, id_permission)
); 