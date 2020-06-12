-- begin NEWERP_STOCK
create table NEWERP_STOCK (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    GOODS_ID varchar(36),
    NUMBER_ integer,
    --
    primary key (ID)
)^
-- end NEWERP_STOCK
-- begin NEWERP_SALE
create table NEWERP_SALE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    GOODS_ID varchar(36) not null,
    NUMBER_ integer not null,
    DATE_ timestamp,
    --
    primary key (ID)
)^
-- end NEWERP_SALE
-- begin NEWERP_SUPPLIER
create table NEWERP_SUPPLIER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    TEL varchar(255),
    ADDRESS varchar(255),
    --
    primary key (ID)
)^
-- end NEWERP_SUPPLIER
-- begin NEWERP_PURCHASE
create table NEWERP_PURCHASE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    GOODS_ID varchar(36) not null,
    NUMBER_ integer not null,
    DATE_ timestamp,
    --
    primary key (ID)
)^
-- end NEWERP_PURCHASE
-- begin NEWERP_GOODS
create table NEWERP_GOODS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    SUPPLIER_ID varchar(36) not null,
    IN_PRICE decimal(19, 2),
    OUT_PRICE decimal(19, 2),
    --
    primary key (ID)
)^
-- end NEWERP_GOODS
-- begin NEWERP_DRIVER
create table NEWERP_DRIVER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    --
    primary key (ID)
)^
-- end NEWERP_DRIVER
-- begin NEWERP_CAR
create table NEWERP_CAR (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    VOLUME double precision,
    STATUS boolean,
    CODE varchar(255),
    --
    primary key (ID)
)^
-- end NEWERP_CAR
-- begin NEWERP_CAR_DRIVER_LINK
create table NEWERP_CAR_DRIVER_LINK (
    CAR_ID varchar(36) not null,
    DRIVER_ID varchar(36) not null,
    primary key (CAR_ID, DRIVER_ID)
)^
-- end NEWERP_CAR_DRIVER_LINK
