-- create_user_table
create table if not exists users (
  id serial not null primary key,
  id_customer int not null,
  id_profile int not null,
  name text not null,
  username text unique,
  password text not null,
  email text unique,
  active boolean not null default true,
  deleted boolean not null default false,
  created_at timestamp not null default current_timestamp,
  updated_at timestamp not null default current_timestamp,
  foreign key (id_customer) references customers(id),
  foreign key (id_profile) references profiles(id)
);