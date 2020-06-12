create table NEWERP_CAR_DRIVER_LINK (
    CAR_ID varchar(36) not null,
    DRIVER_ID varchar(36) not null,
    primary key (CAR_ID, DRIVER_ID)
);
