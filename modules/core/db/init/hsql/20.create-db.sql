-- begin NEWERP_STOCK
alter table NEWERP_STOCK add constraint FK_NEWERP_STOCK_ON_GOODS foreign key (GOODS_ID) references NEWERP_GOODS(ID)^
create index IDX_NEWERP_STOCK_ON_GOODS on NEWERP_STOCK (GOODS_ID)^
-- end NEWERP_STOCK
-- begin NEWERP_SALE
alter table NEWERP_SALE add constraint FK_NEWERP_SALE_ON_GOODS foreign key (GOODS_ID) references NEWERP_GOODS(ID)^
create index IDX_NEWERP_SALE_ON_GOODS on NEWERP_SALE (GOODS_ID)^
-- end NEWERP_SALE
-- begin NEWERP_PURCHASE
alter table NEWERP_PURCHASE add constraint FK_NEWERP_PURCHASE_ON_GOODS foreign key (GOODS_ID) references NEWERP_GOODS(ID)^
create index IDX_NEWERP_PURCHASE_ON_GOODS on NEWERP_PURCHASE (GOODS_ID)^
-- end NEWERP_PURCHASE
-- begin NEWERP_GOODS
alter table NEWERP_GOODS add constraint FK_NEWERP_GOODS_ON_SUPPLIER foreign key (SUPPLIER_ID) references NEWERP_SUPPLIER(ID)^
create index IDX_NEWERP_GOODS_ON_SUPPLIER on NEWERP_GOODS (SUPPLIER_ID)^
-- end NEWERP_GOODS
-- begin NEWERP_CAR_DRIVER_LINK
alter table NEWERP_CAR_DRIVER_LINK add constraint FK_CARDRI_ON_CAR foreign key (CAR_ID) references NEWERP_CAR(ID)^
alter table NEWERP_CAR_DRIVER_LINK add constraint FK_CARDRI_ON_DRIVER foreign key (DRIVER_ID) references NEWERP_DRIVER(ID)^
-- end NEWERP_CAR_DRIVER_LINK
