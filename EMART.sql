create database emart;

use emart;
show tables;
drop table Customers;

create table EMART_USERS(
	UID int primary key auto_increment,
    UNM varchar(30) not null unique,
    PWD varchar(16000) not null,
    ROLE varchar(30) not null
);

drop table customers;
CREATE TABLE CUSTOMERS (
    CSID int primary key auto_increment,
    FNM varchar(150) not null,
    LNM varchar(150) not null,
    EML varchar(200) not null,
    MBN char(10) not null,
    DNO varchar(20) not null,
    STRT varchar(150) not null,
    CITY varchar(150) not null,
    STATE varchar(150) not null,
    PIN char(6) not null,
    UID int references EMART_USERS(UID)
);

show tables;
    
CREATE TABLE CATEGORIES (
    CTID int primary key auto_increment,
    CTNM varchar(200) not null,
    DSCP varchar(1000)
);

CREATE TABLE SUB_CATEGORIES (
    SBID int primary key auto_increment,
    SBNM varchar(200) not null,
    DSCP varchar(1000),
    CTID int references CATEGORIES(CTID)
);

CREATE TABLE PRODUCTS (
    PID int primary key auto_increment,
    PNM varchar(200) not null,
    PRICE numeric not null,
    PDESC varchar(600) not null,
    CTID int references CATEGORIES(CTID),
    SBID int references SUB_CATEGORIES(SBID)
);

create table DISCOUNTS(
	DSID int primary key auto_increment,
    PRCT numeric not null,
    SDT date not null,
    EDT date not null,
    MAXC int
);

CREATE TABLE CART (
    CRTID int primary key auto_increment,
    CSID int references CUSTOMERS(CSID),
    PID int references PRODUCTS(PID),
    QTY int not null
);

CREATE TABLE CUSTOMER_CATEGORY (
    CSID int references CUSTOMERS(CSID),
    CTID int references CATEGORIES(CTID),
    PRIMARY KEY(CSID,CTID)
);

CREATE TABLE PRODUCTS_CART (
    PID int references PRODUCTS(PID),
    CRTID int references CART(CRTID),
    PRIMARY KEY(PID,CRTID)
);

CREATE TABLE CHECKOUT (
	CHKID int primary key auto_increment,
	CRTID int references CART(CRTID),
	GTA numeric,
    -- GST AMOUNT
    GST numeric,
    -- DISCOUNT AMOUNT
    DSAMT numeric,
    -- NET PAYABLE AMOUNT
    NPA numeric,
    DSID int references DISCOUNTS(DSID)
);

create table TRANSACTIONS(
	TXNID int primary key auto_increment,
    CHKID int references CHECKOUT(CHKID),
    AMT numeric,
    TXNDT date,
    TTYPE int,
    CSID int references CUSTOMERS(CSID),
    DSCP varchar(250)
);

CREATE TABLE BILLS (
    BID int primary key auto_increment,
    CSID int references CUSTOMERS(CSID),
    SID int references SELLERS(SID),
    BDT datetime not null,
    CHKID int references CHECKOUT(CHKID)
);

CREATE TABLE SELLERS(
	SID int primary key auto_increment,
	SNM varchar(150) not null,
	MBN char(10) not null,
    EML varchar(200) not null,
   	PID int references PRODUCTS(PID),
    STOCK int not null,
	CPNAME varchar(200) not null,
    ABOUTC varchar(500) not null,
    UID int references EMART_USERS(UID)
);
