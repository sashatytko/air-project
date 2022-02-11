create table if not exists aircraft
(
	id integer not null
		constraint aircraft_pkey
		primary key,
	icaoaddress varchar(255),
	aircraft_type varchar(255),
	registration varchar(255),
	released date,
	serial_number varchar(255)
);

alter table aircraft owner to postgres;

create table if not exists airport
(
	id integer not null
		constraint airport_pkey
		primary key,
	iatacode varchar(255),
	icaocode varchar(255),
	elevation integer not null,
	lat double precision not null,
	lng double precision not null,
	operational_time_finish time,
	operational_time_start time,
	phone_no varchar(255),
	postal_address varchar(255)
);

alter table airport owner to postgres;

create table if not exists flight
(
	id varchar(255) not null
		constraint flight_pkey
		primary key,
	arrival_aip_code varchar(255),
	arrival_time timestamp,
	departure_aip_code varchar(255),
	departure_time timestamp,
	flight_no varchar(255)
);

alter table flight owner to postgres;

create table if not exists flight_airport
(
	flight_id varchar(255) not null
		constraint fk8j5odgw4l0c0nmuuqudwvo01x
		references flight,
	airport_id integer not null
		constraint fk2vt4iiksmjrsvpfye064d88xm
		references airport
);

alter table flight_airport owner to postgres;

create table if not exists passenger
(
	id integer not null
		constraint passenger_pkey
		primary key,
	first_name varchar(255),
	last_name varchar(255)
);

alter table passenger owner to postgres;

create table if not exists scheduled_flight
(
	id integer not null
		constraint scheduled_flight_pkey
		primary key,
	squawk integer,
	call_sign varchar(255),
	cruising_level bigint,
	departure date,
	aircraft_id integer
		constraint fkovcd1axqmy7e4frd5ets25g11
		references aircraft,
	flight_id varchar(255)
		constraint fkmajl7pmy97mtmuiebnt1a6as8
		references flight
);

alter table scheduled_flight owner to postgres;

create table if not exists flight_passenger
(
	scheduled_flight_id integer not null
		constraint fk5l9wa83xn0s1420psh8kynyuw
		references scheduled_flight,
	passenger_id integer not null
		constraint fkqtmm5vy87mn7cqdldv3jwcpwg
		references passenger,
	constraint flight_passenger_pkey
		primary key (scheduled_flight_id, passenger_id)
);

alter table flight_passenger owner to postgres;

create table if not exists technical_worker
(
	id integer not null
		constraint technical_worker_pkey
		primary key,
	first_name varchar(255),
	last_name varchar(255),
	position varchar(255)
);

alter table technical_worker owner to postgres;

create table if not exists flight_technical_workers
(
	scheduled_flight_id integer not null
		constraint fk2ybvjku3jeejv8s0grarc35kl
		references scheduled_flight,
	technical_worker_id integer not null
		constraint fk4acp5vipmulpuuxtoqsf63k1d
		references technical_worker,
	constraint flight_technical_workers_pkey
		primary key (scheduled_flight_id, technical_worker_id)
);

alter table flight_technical_workers owner to postgres;

create table if not exists waypoint
(
	id integer not null
		constraint waypoint_pkey
		primary key,
	is_report_obligatory boolean not null,
	lat double precision not null,
	lng double precision not null,
	name varchar(255)
);

alter table waypoint owner to postgres;

create table if not exists flight_waypoint
(
	flight_id varchar(255) not null
		constraint fkhcwcqt0ho18bb1gjl1owrqwmp
		references flight,
	waypoint_id integer not null
		constraint fkqpvun04l5a7kb6nh9fmdum8hp
		references waypoint
);

alter table flight_waypoint owner to postgres;

