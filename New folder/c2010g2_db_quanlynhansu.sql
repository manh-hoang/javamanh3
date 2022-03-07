-- DROP DATABASE dbemp

-- Tạo csdl quản lý nhân sự
CREATE DATABASE dbemp
GO

USE dbemp
GO

CREATE TABLE deparment(
	id int IDENTITY(1,1) PRIMARY KEY,
	code varchar(5) NOT NULL,
	name nvarchar(50) NOT NULL,
	status bit DEFAULT 1
)
GO

-- Dữ liệu phòng ban
INSERT INTO deparment VALUES
('KT', N'Kỹ thuật', 1),
('HC', N'Hành chính', 1),
('TH', N'Tổng hợp', 1)
GO

CREATE TABLE employee(
	id int IDENTITY(1,1) PRIMARY KEY,
	iddep int FOREIGN KEY REFERENCES deparment(id),
	firstname nvarchar(50) NOT NULL,
	lastname nvarchar(50) NOT NULL,
	address nvarchar(100),
	gender bit,
	birthday date,
	salary float,
	status bit,
	imglink varchar(100)
)
GO

-- Dữ liệu nhân viên
INSERT INTO employee VALUES
(1, N'Nguyễn', N'Thị Mai', N'Bắc Giang', 0, '1995-05-19', 235.94, 1,''),
(1, N'Lê', N'Thị Hương', N'Hà Nội', 0, '1999-07-22', 535.94, 1,''),
(2, N'Phạm', N'Mai Trang', N'Hà Nội', 0, '1993-11-18',335.94, 1,''),
(2, N'Bùi', N'Thu Lệ', N'Nha Trang', 0, '2000-12-12', 995.94, 0,''),
(2, N'Tống', N'Ngọc Trinh', N'Gia Lai', 0, '1991-03-05', 885.94, 1,'')
GO

INSERT INTO employee VALUES
(1, N'Ngô', N'Trung Kiên', N'Vinh', 1, '1998-12-22', 935.88, 1,'')

SELECT * FROM deparment
SELECT * FROM employee

UPDATE employee set imglink = 'test.jpg'
DELETE FROM employee WHERE id IN (7,8,9)
	