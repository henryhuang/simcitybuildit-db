/**
 * 工厂素材
 */
create table if not exists TB_MATERIAL_FACTORY(
	ID INTEGER PRIMARY KEY NOT NULL,
	NAME TEXT,
	CAPTION TEXT,
	CASH INTEGER,
	HOUR INTEGER,
	MINUTE INTEGER,
	SECOND INTEGER
);

insert into TB_MATERIAL_FACTORY (ID, NAME, CAPTION, CASH, HOUR, MINUTE, SECOND) values (1, 'Metal', '金属', 1, 0, 1, 0);
insert into TB_MATERIAL_FACTORY (ID, NAME, CAPTION, CASH, HOUR, MINUTE, SECOND) values (2, 'Wood', '木材', 2, 0, 3, 0);
insert into TB_MATERIAL_FACTORY (ID, NAME, CAPTION, CASH, HOUR, MINUTE, SECOND) values (3, 'Plastic', '塑料', 5, 0, 9, 0);
insert into TB_MATERIAL_FACTORY (ID, NAME, CAPTION, CASH, HOUR, MINUTE, SECOND) values (4, 'Seed', '种子', 9, 0, 20, 0);
insert into TB_MATERIAL_FACTORY (ID, NAME, CAPTION, CASH, HOUR, MINUTE, SECOND) values (5, 'Mineral', '矿物质', 12, 0, 30, 0);
insert into TB_MATERIAL_FACTORY (ID, NAME, CAPTION, CASH, HOUR, MINUTE, SECOND) values (6, 'Chemistry', '化学物质', 28, 2, 0, 0);
insert into TB_MATERIAL_FACTORY (ID, NAME, CAPTION, CASH, HOUR, MINUTE, SECOND) values (7, 'Textile', '纺织品', 36, 3, 0, 0);
insert into TB_MATERIAL_FACTORY (ID, NAME, CAPTION, CASH, HOUR, MINUTE, SECOND) values (8, 'SugarSpice', '糖和香料', 44, 4, 0, 0);
insert into TB_MATERIAL_FACTORY (ID, NAME, CAPTION, CASH, HOUR, MINUTE, SECOND) values (9, 'Glass', '玻璃', 52, 5, 0, 0);
insert into TB_MATERIAL_FACTORY (ID, NAME, CAPTION, CASH, HOUR, MINUTE, SECOND) values (10, 'AnimalFeed', '动物饲料', 60, 6, 0, 0);
insert into TB_MATERIAL_FACTORY (ID, NAME, CAPTION, CASH, HOUR, MINUTE, SECOND) values (11, 'Electron', '电子元件', 65, 7, 0, 0);
