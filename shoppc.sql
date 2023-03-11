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