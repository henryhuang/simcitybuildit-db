/**
 * 商业建筑表
 */
create table if not exists TB_COMMERCIAL_BUILDING(
	ID INTEGER PRIMARY KEY NOT NULL,
	NAME TEXT,
	CAPTION TEXT
);

insert into TB_COMMERCIAL_BUILDING (ID, NAME, CAPTION) values (1, 'BuildingStore', '建材店');
insert into TB_COMMERCIAL_BUILDING (ID, NAME, CAPTION) values (2, 'HardwareStore', '五金店');
insert into TB_COMMERCIAL_BUILDING (ID, NAME, CAPTION) values (3, 'AgriculturalMarket', '农贸市场');
insert into TB_COMMERCIAL_BUILDING (ID, NAME, CAPTION) values (4, 'FurnitureShop', '家居店');
insert into TB_COMMERCIAL_BUILDING (ID, NAME, CAPTION) values (5, 'GardeningShop', '园艺店');
insert into TB_COMMERCIAL_BUILDING (ID, NAME, CAPTION) values (6, 'Dessert', '甜品店');
insert into TB_COMMERCIAL_BUILDING (ID, NAME, CAPTION) values (7, 'Boutiques', '时装店');
insert into TB_COMMERCIAL_BUILDING (ID, NAME, CAPTION) values (8, 'FastFoodShop', '快餐店');
insert into TB_COMMERCIAL_BUILDING (ID, NAME, CAPTION) values (9, 'HomeAppliancesStore', '家电商铺');