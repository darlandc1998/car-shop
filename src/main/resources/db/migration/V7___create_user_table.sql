create table if not exists users (
  id serial not null primary key,
  id_customer int not null,
  id_profile int not null,
  name text not null,
  username text unique,
  password text,
  email text unique,
  deleted int not null default 0,
  created_at timestamp not null default current_timestamp,
  updated_at timestamp not null default current_timestamp,
  foreign key (id_customer) references customers(id),
  foreign key (id_profile) references profiles(id)
);