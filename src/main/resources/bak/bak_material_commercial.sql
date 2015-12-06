/**
 * 商业素材表
 */
create table if not exists TB_MATERIAL_COMMERCIAL(
	ID INTEGER PRIMARY KEY NOT NULL,
	NAME TEXT,
	CAPTION TEXT,
	HOUR INTEGER,
	MINUTE INTEGER,
	SECOND INTEGER,
	STORE_ID INTEGER,
	FOREIGN KEY(STORE_ID) REFERENCES TB_COMMERCIAL_BUILDING(ID)
);

/**
 * 建材店
 */
insert into TB_MATERIAL_COMMERCIAL (ID, NAME, CAPTION, HOUR, MINUTE, SECOND, STORE_ID) values (1, 'Nail', '钉子', 0, 4, 0, 1);
insert into TB_MATERIAL_COMMERCIAL (ID, NAME, CAPTION, HOUR, MINUTE, SECOND, STORE_ID) values (2, 'Plank', '厚木板', 0, 24, 0, 1);
insert into TB_MATERIAL_COMMERCIAL (ID, NAME, CAPTION, HOUR, MINUTE, SECOND, STORE_ID) values (3, 'Brick', '砖块', 0, 16, 0, 1);
insert into TB_MATERIAL_COMMERCIAL (ID, NAME, CAPTION, HOUR, MINUTE, SECOND, STORE_ID) values (4, 'Cement', '水泥', 0, 40, 0, 1);
insert into TB_MATERIAL_COMMERCIAL (ID, NAME, CAPTION, HOUR, MINUTE, SECOND, STORE_ID) values (5, 'Glue', '胶水', 0, 48, 0, 1);

/**
 * 五金店
 */
insert into TB_MATERIAL_COMMERCIAL (ID, NAME, CAPTION, HOUR, MINUTE, SECOND, STORE_ID) values (6, 'Hammer', '锤子', 0, 11, 12, 2);
insert into TB_MATERIAL_COMMERCIAL (ID, NAME, CAPTION, HOUR, MINUTE, SECOND, STORE_ID) values (7, 'TapeMeasure', '卷尺', 0, 16, 0, 2);
insert into TB_MATERIAL_COMMERCIAL (ID, NAME, CAPTION, HOUR, MINUTE, SECOND, STORE_ID) values (8, 'Shovel', '铲子', 0, 24, 0, 2);
insert into TB_MATERIAL_COMMERCIAL (ID, NAME, CAPTION, HOUR, MINUTE, SECOND, STORE_ID) values (9, 'Kitchenware', '厨具', 0, 36, 0, 2);
insert into TB_MATERIAL_COMMERCIAL (ID, NAME, CAPTION, HOUR, MINUTE, SECOND, STORE_ID) values (10, 'Drill', '钻子', 1, 36, 0, 2);

/**
 * 农贸市场
 */
insert into TB_MATERIAL_COMMERCIAL (ID, NAME, CAPTION, HOUR, MINUTE, SECOND, STORE_ID) values (11, 'Vegetable', '蔬菜', 0, 16, 0, 3);
insert into TB_MATERIAL_COMMERCIAL (ID, NAME, CAPTION, HOUR, MINUTE, SECOND, STORE_ID) values (12, 'FlourBag', '袋装面粉', 0, 24, 0, 3);
insert into TB_MATERIAL_COMMERCIAL (ID, NAME, CAPTION, HOUR, MINUTE, SECOND, STORE_ID) values (13, 'FruitBerry', '水果和浆果', 1, 12, 0, 3);
insert into TB_MATERIAL_COMMERCIAL (ID, NAME, CAPTION, HOUR, MINUTE, SECOND, STORE_ID) values (14, 'Cream', '奶油', 1, 0, 0, 3);
insert into TB_MATERIAL_COMMERCIAL (ID, NAME, CAPTION, HOUR, MINUTE, SECOND, STORE_ID) values (15, 'Cheese', '奶酪', 1, 24, 0, 3);
insert into TB_MATERIAL_COMMERCIAL (ID, NAME, CAPTION, HOUR, MINUTE, SECOND, STORE_ID) values (16, 'Beef', '牛肉', 2, 0, 0, 3);

/**
 * 家居店
 */
insert into TB_MATERIAL_COMMERCIAL (ID, NAME, CAPTION, HOUR, MINUTE, SECOND, STORE_ID) values (17, 'Chair', '椅子', 0, 17, 0, 4);
insert into TB_MATERIAL_COMMERCIAL (ID, NAME, CAPTION, HOUR, MINUTE, SECOND, STORE_ID) values (18, 'Desk', '桌子', 0, 25, 30, 4);
insert into TB_MATERIAL_COMMERCIAL (ID, NAME, CAPTION, HOUR, MINUTE, SECOND, STORE_ID) values (19, 'Textile', '家用纺织品', 1, 3, 0, 4);
insert into TB_MATERIAL_COMMERCIAL (ID, NAME, CAPTION, HOUR, MINUTE, SECOND, STORE_ID) values (20, 'Sofa', '沙发', 2, 7, 0, 4);

/**
 * 家居店
 */
insert into TB_MATERIAL_COMMERCIAL (ID, NAME, CAPTION, HOUR, MINUTE, SECOND, STORE_ID) values (21, 'Grass', '草', 0, 25, 30, 5);
insert into TB_MATERIAL_COMMERCIAL (ID, NAME, CAPTION, HOUR, MINUTE, SECOND, STORE_ID) values (22, 'Tree', '树苗', 1, 16, 0, 5);
insert into TB_MATERIAL_COMMERCIAL (ID, NAME, CAPTION, HOUR, MINUTE, SECOND, STORE_ID) values (23, 'PatioFurniture', '庭院家具', 1, 54, 0, 5);
insert into TB_MATERIAL_COMMERCIAL (ID, NAME, CAPTION, HOUR, MINUTE, SECOND, STORE_ID) values (24, 'FirePit', '火坑', 3, 24, 0, 5);
insert into TB_MATERIAL_COMMERCIAL (ID, NAME, CAPTION, HOUR, MINUTE, SECOND, STORE_ID) values (25, 'GnomeStatue', '花园地精雕像', 1, 16, 0, 5);

/**
 * 甜品店
 */
insert into TB_MATERIAL_COMMERCIAL (ID, NAME, CAPTION, HOUR, MINUTE, SECOND, STORE_ID) values (26, 'Grass', '甜甜圈', 0, 40, 30, 6);
insert into TB_MATERIAL_COMMERCIAL (ID, NAME, CAPTION, HOUR, MINUTE, SECOND, STORE_ID) values (27, 'Tree', '绿色冰沙', 0, 27, 0, 6);
insert into TB_MATERIAL_COMMERCIAL (ID, NAME, CAPTION, HOUR, MINUTE, SECOND, STORE_ID) values (28, 'PatioFurniture', '面包圈', 0, 54, 0, 6);
insert into TB_MATERIAL_COMMERCIAL (ID, NAME, CAPTION, HOUR, MINUTE, SECOND, STORE_ID) values (29, 'FirePit', '樱桃芝士蛋糕', 1, 21, 0, 6);
insert into TB_MATERIAL_COMMERCIAL (ID, NAME, CAPTION, HOUR, MINUTE, SECOND, STORE_ID) values (30, 'GnomeStatue', '冻酸奶', 3, 36, 0, 6);

/**
 * 时装店
 */
insert into TB_MATERIAL_COMMERCIAL (ID, NAME, CAPTION, HOUR, MINUTE, SECOND, STORE_ID) values (31, 'Hat', '帽子', 0, 54, 0, 7);
insert into TB_MATERIAL_COMMERCIAL (ID, NAME, CAPTION, HOUR, MINUTE, SECOND, STORE_ID) values (32, 'Shoes', '鞋子', 1, 7, 0, 7);
insert into TB_MATERIAL_COMMERCIAL (ID, NAME, CAPTION, HOUR, MINUTE, SECOND, STORE_ID) values (33, 'Watch', '手表', 1, 21, 0, 7);
insert into TB_MATERIAL_COMMERCIAL (ID, NAME, CAPTION, HOUR, MINUTE, SECOND, STORE_ID) values (34, 'Suit', '西装', 3, 9, 0, 7);

/**
 * 快餐店
 */
insert into TB_MATERIAL_COMMERCIAL (ID, NAME, CAPTION, HOUR, MINUTE, SECOND, STORE_ID) values (35, 'Grass', 'IceCreamSandwich', 0, 12, 36, 8);
insert into TB_MATERIAL_COMMERCIAL (ID, NAME, CAPTION, HOUR, MINUTE, SECOND, STORE_ID) values (36, 'Pizza', '披萨', 0, 21, 36, 8);
insert into TB_MATERIAL_COMMERCIAL (ID, NAME, CAPTION, HOUR, MINUTE, SECOND, STORE_ID) values (37, 'Hamburg', '汉堡', 0, 31, 30, 8);
insert into TB_MATERIAL_COMMERCIAL (ID, NAME, CAPTION, HOUR, MINUTE, SECOND, STORE_ID) values (38, 'CheeseFries', '芝士薯条', 0, 16, 0, 8);
insert into TB_MATERIAL_COMMERCIAL (ID, NAME, CAPTION, HOUR, MINUTE, SECOND, STORE_ID) values (39, 'BottledLemonJuice', '瓶装柠檬汁', 0, 54, 0, 8);

/**
 * 家用商铺
 */
insert into TB_MATERIAL_COMMERCIAL (ID, NAME, CAPTION, HOUR, MINUTE, SECOND, STORE_ID) values (40, 'Grill', '烧烤架', 2, 28, 0, 9);
insert into TB_MATERIAL_COMMERCIAL (ID, NAME, CAPTION, HOUR, MINUTE, SECOND, STORE_ID) values (41, 'Fridge', '冰箱', 3, 9, 0, 9);
insert into TB_MATERIAL_COMMERCIAL (ID, NAME, CAPTION, HOUR, MINUTE, SECOND, STORE_ID) values (42, 'LightingSystem', '照明系统', 1, 34, 0, 9);
insert into TB_MATERIAL_COMMERCIAL (ID, NAME, CAPTION, HOUR, MINUTE, SECOND, STORE_ID) values (43, 'Telvision', '电视', 2, 15, 0, 9);
