create database  check_one
use check_one;
go

create table Customer(
	cus_id nvarchar(50) primary key,
	cus_name nvarchar(50),
	gender smallint,
	birth_day date,
	country nvarchar(120),
	email nvarchar(255) unique,
	phone_number nvarchar(11),
	bank_number varchar(20),
	banking varchar(5) default 'VIB'
);
go

/* PROCEDURE */

create or alter proc cre_new_cus
(
	@cus_id varchar(50),
	@cus_name varchar(50),
	@gender smallint,
	@birth_day date,
	@country varchar(120),
	@email varchar(255),
	@phone_number varchar(11),
	@bank_number varchar(20),
	@banking varchar(5)
)
as
begin
	insert into Customer values(@cus_id,@cus_name,@gender,@birth_day,@country,@email,@phone_number,@bank_number,@banking);
end
go

create or alter proc get_all
as
begin
	select * from Customer;
end
go

create or alter proc update_cus
(
	@old_id varchar(50),
	@cus_name varchar(50),
	@gender smallint,
	@birth_day date,
	@country varchar(120),
	@email varchar(255),
	@phone_number varchar(11),
	@bank_number varchar(20),
	@banking varchar(5)
)
as	
begin
	update Customer set cus_name = @cus_name, gender=@gender,birth_day=@birth_day,country= @country,email = @email,phone_number=@phone_number,bank_number= @bank_number,banking = @banking where cus_id = @old_id
end
go

create or alter proc delete_cus
(
	@id_delete varchar(50)
)
as
begin
	delete from Customer where cus_id = @id_delete;
end
go

create or alter proc view_inf
(
	@id_detail varchar(50)
)
as
begin
	select * from Customer where cus_id = @id_detail;
end
go

create or alter proc find_by_name
(
	@name_wanted varchar(50)
)
as
begin
	select * from Customer where cus_name like '%' +@name_wanted+'%';
end
go

create or alter proc find_by_country
(
	@country_wanted varchar(120)
)
as
begin
	select * from Customer where country like '%' +@country_wanted+'%';
end
go

create or alter proc find_by_phone
(
	@phone_wanted varchar(11)
)
as
begin
	select * from Customer where phone_number like '%' +@phone_wanted+'%';
end
go