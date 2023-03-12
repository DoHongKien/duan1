Create database ShopPCHT
go
use ShopPCHT
go

IF OBJECT_ID('KhachHang') IS NOT NULL
	DROP TABLE KhachHang
GO
CREATE TABLE KhachHang
(
	id int identity(1,1) not null,
	ma nchar(10) null,
	ten nvarchar(50) null,
	ngay_sinh date null,
	gioi_tinh nvarchar(10) null,
	sdt nchar(15) null,
	dia_chi nvarchar(50) null,
	ngay_tao date null,
	ngay_nhap date null,
	trang_thai int null,
	Constraint PK_KhachHang primary key (id)
)

IF OBJECT_ID('ChucVu') IS NOT NULL
	DROP TABLE ChucVu
GO
CREATE TABLE ChucVu
(
	id int identity(1,1) not null,
	chuc_vu nchar(10) null,
	ngay_tao date null,
	ngay_nhap date null,
	trang_thai int null,
	Constraint PK_TaiKhoan primary key (id)
)

IF OBJECT_ID('NhanVien') IS NOT NULL
	DROP TABLE NhanVien
GO
CREATE TABLE NhanVien
(
	id int identity(1,1) not null,
	id_chuc_vu int null,
	ma nchar(10) null,
	ten nvarchar(50) null,
	ngay_sinh date null,
	gioi_tinh nvarchar(10) null,
	sdt nchar(15) null,
	dia_chi nvarchar(50) null,
	mat_khau nchar(20) null,
	ngay_tao date null,
	ngay_nhap date null,
	trang_thai int null,
	Constraint PK_NhanVien Primary key (id),
	Constraint FK_NhanVien_TaiKhoan Foreign key (id_chuc_vu) references ChucVu
)

IF OBJECT_ID('KhuyenMai') IS NOT NULL
	DROP TABLE KhuyenMai
GO
CREATE TABLE KhuyenMai
(
	id int identity(1,1) not null,
	ma nchar(10) null,
	gia_tri int null,
	ngay_tao date null,
	ngay_het_han date null,
	ngay_nhap date null,
	trang_thai int null,
	Constraint PK_KhuyenMai Primary key (id)
)

IF OBJECT_ID('HoaDon') IS NOT NULL
	DROP TABLE HoaDon
GO
CREATE TABLE HoaDon
(
	id int IDENTITY(1,1) not null,
	id_nhan_vien int null,
	id_khach_hang int null,
	ma nchar(10) null,
	ngay_tao date null,
	ngay_thanh_toan date null,
	tong_tien decimal(20,0) null,
	ngay_nhap date null,
	trang_thai int null,
	Constraint PK_HoaDon Primary key (id),
	Constraint FK_HoaDon_NhanVien Foreign key (id_nhan_vien) references NhanVien,
	Constraint FK_HoaDon_KhachHang Foreign key (id_khach_hang) references KhachHang
)

IF OBJECT_ID('SanPham') IS NOT NULL
	DROP TABLE SanPham
GO
CREATE TABLE SanPham
(
	id int IDENTITY(1,1) not null,
	ma nchar(10) null,
	ten nvarchar(50) null,
	ngay_tao date null,
	ngay_nhap date null,
	trang_thai int null,
	Constraint PK_SanPham Primary key (id)
)

IF OBJECT_ID('Hang') IS NOT NULL
	DROP TABLE Hang
GO
CREATE TABLE Hang
(
	id int IDENTITY(1,1) not null,
	ma nchar(10) null,
	ten nvarchar(50) null,
	ngay_tao date null,
	ngay_nhap date null,
	trang_thai int null,
	Constraint PK_Hang Primary key (id)
)

IF OBJECT_ID('CPU') IS NOT NULL
	DROP TABLE CPU
GO
CREATE TABLE CPU
(
	id int IDENTITY(1,1) not null,
	ma nchar(10) null,
	ten nvarchar(50) null,
	ngay_tao date null,
	ngay_nhap date null,
	trang_thai int null,
	Constraint PK_CPU Primary key (id)
)

IF OBJECT_ID('ManHinh') IS NOT NULL
	DROP TABLE ManHinh
GO
CREATE TABLE ManHinh
(
	id int IDENTITY(1,1) not null,
	ma nchar(10) null,
	ten nvarchar(50) null,
	ngay_tao date null,
	ngay_nhap date null,
	trang_thai int null,
	Constraint PK_ManHinh Primary key (id)
)

IF OBJECT_ID('MauSac') IS NOT NULL
	DROP TABLE MauSac
GO
CREATE TABLE MauSac
(
	id int IDENTITY(1,1) not null,
	ma nchar(10) null,
	ten nvarchar(50) null,
	ngay_tao date null,
	ngay_nhap date null,
	trang_thai int null,
	Constraint PK_MauSac Primary key (id)
)

IF OBJECT_ID('OCung') IS NOT NULL
	DROP TABLE OCung
GO
CREATE TABLE OCung
(
	id int IDENTITY(1,1) not null,
	ma nchar(10) null,
	ten nvarchar(50) null,
	ngay_tao date null,
	ngay_nhap date null,
	trang_thai int null,
	Constraint PK_OCung Primary key (id)
)

IF OBJECT_ID('RAM') IS NOT NULL
	DROP TABLE RAM
GO
CREATE TABLE RAM
(
	id int IDENTITY(1,1) not null,
	ma nchar(10) null,
	ten nvarchar(50) null,
	ngay_tao date null,
	ngay_nhap date null,
	trang_thai int null,
	Constraint PK_RAM Primary key (id)
)

IF OBJECT_ID('VGA') IS NOT NULL
	DROP TABLE VGA
GO
CREATE TABLE VGA
(
	id int IDENTITY(1,1) not null,
	ma nchar(10) null,
	ten nvarchar(50) null,
	ngay_tao date null,
	ngay_nhap date null,
	trang_thai int null,
	Constraint PK_VGA Primary key (id)
)

IF OBJECT_ID('ChiTietSanPham') IS NOT NULL
	DROP TABLE ChiTietSanPham
GO
CREATE TABLE ChiTietSanPham
(
	id int IDENTITY(1,1) not null,
	id_san_pham int null,
	id_cpu int null,
	id_hang int null,
	id_man_hinh int null,
	id_mau_sac int null,
	id_o_cung int null,
	id_ram int null,
	id_vga int null,
	id_serial nchar(10) null,
	so_luong_ton int null,
	gia_nhap decimal(20,0),
	gia_ban decimal(20,0),
	ngay_tao date null,
	ngay_nhap date null,
	trang_thai int null,
	Constraint PK_ChiTietSanPham Primary key(Id),
	Constraint FK_ChiTietSanPham_SanPham Foreign key(id_san_pham) references SanPham,
	Constraint FK_ChiTietSanPham_CPU Foreign key(id_cpu) references CPU,
	Constraint FK_ChiTietSanPham_Hang Foreign key(id_hang) references Hang,
	Constraint FK_ChiTietSanPham_ManHinh Foreign key(id_man_hinh) references ManHinh,
	Constraint FK_ChiTietSanPham_MauSac Foreign key(id_mau_sac) references MauSac,
	Constraint FK_ChiTietSanPham_OCung Foreign key(id_o_cung) references OCung,
	Constraint FK_ChiTietSanPham_RAM Foreign key(id_ram) references RAM,
	Constraint FK_ChiTietSanPham_VGA Foreign key(id_vga) references VGA
)

IF OBJECT_ID('Serial') IS NOT NULL
	DROP TABLE Serial
GO
CREATE TABLE Serial
(
	id int IDENTITY(1,1) not null,
	id_ctsp int null,
	ma nchar(10) null,
	ngay_tao date null,
	ngay_nhap date null,
	trang_thai int null,
	Constraint PK_Serial Primary key (id),
	Constraint FK_Serial_ChiTietSanPham Foreign key(id_ctsp) references ChiTietSanPham
)

IF OBJECT_ID('ChiTietHoaDon') IS NOT NULL
	DROP TABLE ChiTietHoaDon
GO
CREATE TABLE ChiTietHoaDon
(
	id int IDENTITY(1,1) not null,
	id_ctsp int null,
	id_hoa_don int null,
	id_khuyen_mai int null,
	so_luong int null,
	don_gia float null,
	ngay_tao date null,
	ngay_nhap date null,
	trang_thai int null,
	Constraint PK_ChiTietHoaDon Primary key(id),
	Constraint FK_ChiTietHoaDon_ChiTietSanPham Foreign key (id_ctsp) references ChiTietSanPham,
	Constraint FK_ChiTietHoaDon_HoaDon Foreign key (id_hoa_don) references HoaDon,
	Constraint FK_ChiTietHoaDon_KhuyenMai Foreign key (id_khuyen_mai) references KhuyenMai
)

insert into KhachHang 
values 
		('Ma01','Khach Hang1','2003-01-12','Nam','0379431893','Dia chi 1','2023-03-12','2023-03-12','1'),
		('Ma02','Khach Hang2','2002-03-21','Nu','0379431122','Dia chi 2','2023-03-12','2023-03-12','0'),
		('Ma03','Khach Hang3','2001-04-21','Nu','0379431111','Dia chi 3','2023-03-12','2023-03-12','0'),
		('Ma04','Khach Hang4','2002-07-22','Nu','0379432233','Dia chi 4','2023-03-12','2023-03-12','1'),
		('Ma05','Khach Hang5','2000-11-19','Nam','0379412393','Dia chi 5','2023-03-12','2023-03-12','0')

	
insert into ChucVu
values 
		('Chuc Vu 1','2023-03-12','2023-03-12','0'),
		('Chuc Vu 2','2023-03-12','2023-03-12','0'),
		('Chuc Vu 3','2023-03-12','2023-03-12','1'),
		('Chuc Vu 4','2023-03-12','2023-03-12','0'),
		('Chuc Vu 5','2023-03-12','2023-03-12','1')
	
	
insert into NhanVien
values 
		('1','NV1','NhanVien1','2000-01-02','Nam','0345678912','Dia Chi Nhan Vien 1','1234','2023-03-12','2023-03-12','0'),
		('4','NV2','NhanVien1','2002-05-22','Nu','0345672222','Dia Chi Nhan Vien 2','1234','2023-03-12','2023-03-12','1'),
		('5','NV3','NhanVien1','2001-08-02','Nu','0345333912','Dia Chi Nhan Vien 3','1234','2023-03-12','2023-03-12','0'),
		('2','NV4','NhanVien1','2003-12-16','Nam','0345558912','Dia Chi Nhan Vien 4','1234','2023-03-12','2023-03-12','0'),
		('3','NV5','NhanVien1','2002-11-24','Nam','0341238912','Dia Chi Nhan Vien 5','1234','2023-03-12','2023-03-12','1')

	
insert into KhuyenMai
values 
		('KM1','10000','2023-03-12','2023-03-22','2023-03-12','0'),
		('KM2','110000','2023-03-12','2023-03-12','2023-03-12','0'),
		('KM3','20000','2023-03-12','2023-04-21','2023-03-12','1'),
		('KM4','40000','2023-03-12','2023-05-12','2023-03-12','0'),
		('KM5','150000','2023-03-12','2023-03-15','2023-03-12','1')

	

insert into HoaDon
values 
		('2','2','HD1','2023-03-12','2023-03-12','100000','2023-03-12','0'),
		('3','3','HD2','2023-03-12','2023-03-12','120000','2023-03-12','1'),
		('4','5','HD3','2023-03-12','2023-03-12','200000','2023-03-12','0'),
		('1','1','HD4','2023-03-12','2023-03-12','410000','2023-03-12','1'),
		('5','4','HD5','2023-03-12','2023-03-12','310000','2023-03-12','0')

	

insert into SanPham
values
		('SP1','San Pham 1','2023-03-12','2023-03-12','0'),
		('SP2','San Pham 2','2023-03-12','2023-03-12','1'),
		('SP3','San Pham 3','2023-03-12','2023-03-12','0'),
		('SP4','San Pham 4','2023-03-12','2023-03-12','0'),
		('SP5','San Pham 5','2023-03-12','2023-03-12','1')

	

insert into Hang
values 
		('Hang1','Mat Hang 1','2023-03-12','2023-03-12','0'),
		('Hang2','Mat Hang 2','2023-03-12','2023-03-12','0'),
		('Hang3','Mat Hang 3','2023-03-12','2023-03-12','0'),
		('Hang4','Mat Hang 4','2023-03-12','2023-03-12','1'),
		('Hang5','Mat Hang 5','2023-03-12','2023-03-12','1')

	

insert into CPU
values 
		('CPU1','Ten CPU 1','2023-03-12','2023-03-12','0'),
		('CPU2','Ten CPU 2','2023-03-12','2023-03-12','1'),
		('CPU3','Ten CPU 3','2023-03-12','2023-03-12','0'),
		('CPU4','Ten CPU 4','2023-03-12','2023-03-12','0'),
		('CPU5','Ten CPU 5','2023-03-12','2023-03-12','1')

	

insert into ManHinh
values
		('MH1','Man Hinh 1','2023-03-12','2023-03-12','0'),
		('MH2','Man Hinh 2','2023-03-12','2023-03-12','1'),
		('MH3','Man Hinh 3','2023-03-12','2023-03-12','1'),
		('MH4','Man Hinh 4','2023-03-12','2023-03-12','1'),
		('MH5','Man Hinh 5','2023-03-12','2023-03-12','0')

	

insert into MauSac
values 
		('MS1','Mau Sac 1','2023-03-12','2023-03-12','0'),
		('MS2','Mau Sac 2','2023-03-12','2023-03-12','1'),
		('MS3','Mau Sac 3','2023-03-12','2023-03-12','1'),
		('MS4','Mau Sac 4','2023-03-12','2023-03-12','0'),
		('MS5','Mau Sac 5','2023-03-12','2023-03-12','0')

	

insert into OCung
values
		('OC1','O Cung 1','2023-03-12','2023-03-12','1'),
		('OC2','O Cung 2','2023-03-12','2023-03-12','1'),
		('OC3','O Cung 3','2023-03-12','2023-03-12','0'),
		('OC4','O Cung 4','2023-03-12','2023-03-12','0'),
		('OC5','O Cung 5','2023-03-12','2023-03-12','1')

	

insert into RAM
values
		('R1','Ram 1','2023-03-12','2023-03-12','0'),
		('R2','Ram 2','2023-03-12','2023-03-12','1'),
		('R3','Ram 3','2023-03-12','2023-03-12','1'),
		('R4','Ram 4','2023-03-12','2023-03-12','0'),
		('R5','Ram 5','2023-03-12','2023-03-12','1')

	

insert into VGA
values 
		('V1','VGA 1','2023-03-12','2023-03-12','0'),
		('V2','VGA 2','2023-03-12','2023-03-12','1'),
		('V3','VGA 3','2023-03-12','2023-03-12','1'),
		('V4','VGA 4','2023-03-12','2023-03-12','1'),
		('V5','VGA 5','2023-03-12','2023-03-12','0')

	

insert into Serial
values	
		('1','SE11','2023-03-12','2023-03-12','0'),
		('2','SE12','2023-03-12','2023-03-12','0'),
		('3','SE13','2023-03-12','2023-03-12','1'),
		('4','SE14','2023-03-12','2023-03-12','1'),
		('5','SE15','2023-03-12','2023-03-12','0'),
		('2','SE16','2023-03-12','2023-03-12','1'),
		('3','SE17','2023-03-12','2023-03-12','0'),
		('2','SE18','2023-03-12','2023-03-12','1'),
		('4','SE19','2023-03-12','2023-03-12','0'),
		('5','SE10','2023-03-12','2023-03-12','1'),
		('2','SE11','2023-03-12','2023-03-12','0'),
		('1','SE12','2023-03-12','2023-03-12','1'),
		('2','SE13','2023-03-12','2023-03-12','1'),
		('4','SE14','2023-03-12','2023-03-12','0'),
		('5','SE15','2023-03-12','2023-03-12','0'),
		('3','SE16','2023-03-12','2023-03-12','0'),
		('5','SE17','2023-03-12','2023-03-12','1'),
		('4','SE18','2023-03-12','2023-03-12','1'),
		('2','SE19','2023-03-12','2023-03-12','0'),
		('4','SE20','2023-03-12','2023-03-12','1')

	


insert into ChiTietSanPham(id_san_pham,id_cpu,id_hang,id_man_hinh,id_mau_sac,id_o_cung,id_ram,id_vga,so_luong_ton,gia_nhap,gia_ban,ngay_tao,ngay_nhap,trang_thai)
values
		('1','3','1','1','2','3','5','4','22','200000','120000','2023-03-12','2023-03-12','0'),
		('4','2','3','4','5','2','3','1','12','110000','200000','2023-03-12','2023-03-12','0'),
		('2','4','2','5','4','5','1','5','21','210000','320000','2023-03-12','2023-03-12','0'),
		('3','5','5','2','3','4','2','2','12','220000','300000','2023-03-12','2023-03-12','0'),
		('5','1','4','3','1','2','3','1','32','120000','200000','2023-03-12','2023-03-12','0')

	

insert into ChiTietHoaDon
values
		('1','3','3','12','2000000','2023-03-12','2023-03-12','0'),
		('3','7','2','22','1400000','2023-03-12','2023-03-12','1'),
		('4','5','5','15','1600000','2023-03-12','2023-03-12','1'),
		('2','4','4','22','2400000','2023-03-12','2023-03-12','0'),
		('5','6','1','12','4400000','2023-03-12','2023-03-12','1')

	select * from KhachHang
	select * from ChiTietSanPham
	select * from ChiTietHoaDon
	select * from ChucVu
	select * from NhanVien
	select*from KhuyenMai
	select * from HoaDon
	select * from SanPham
	select * from CPU
	select * from Hang
	select * from ManHinh
	select * from MauSac
	select * from OCung
	select * from RAM
	select * from VGA
	select * from Serial