create database lisst;
\c lisst

create table users(
	id bigserial primary key,
	name text
);

create table roles(
	id bigserial primary key,
	name text
	principal_id bigserial references users(id)
	subject_id bigserial references list(id)
);

create table category(
	id bigserial primary key,
	name text
);

create table list(
	id bigserial primary key,
	name text,
	is_instance boolean,
	category_id bigint references category(id),
	parent_id bigint references list(id)
);

insert into category (name) values ('foo');