/**
 * 商业素材表
 */
create table if not exists TB_COMMERCIAL_MATERIAL (
	ID TEXT PRIMARY KEY NOT NULL, 
	ITEM TEXT, 
	LVL INTEGER, 
	MAX_VALUE INTEGER, 
	TIME_MIN INTEGER, 
	MATS TEXT, 
	MAT_COST INTEGER, 
	PROFIT INTEGER, 
	PER_MIN INTEGER, 
	USED_IN TEXT, 
	IMG TEXT,
	STORE_ID INTEGER,

	FOREIGN KEY(STORE_ID) REFERENCES TB_COMMERCIAL_BUILDING(ID)
);

/**
 * build_supplies_store
 */ 
INSERT INTO TB_COMMERCIAL_MATERIAL ('ID', 'ITEM', 'LVL', 'MAX_VALUE', 'TIME_MIN', 'MATS', 'MAT_COST', 'PROFIT', 'PER_MIN', 'USED_IN', 'IMG', 'STORE_ID') values ('Bs-n', 'Nails', 1, 80, 5, 'Rs-i*2', 20, 60, 12.00, 'Fs-c Fs-t', 'http://vignette1.wikia.nocookie.net/simcity/images/4/48/Bs-n.png/revision/latest/scale-to-width-down/25?cb=20150912025505&format=webp', 1);
INSERT INTO TB_COMMERCIAL_MATERIAL ('ID', 'ITEM', 'LVL', 'MAX_VALUE', 'TIME_MIN', 'MATS', 'MAT_COST', 'PROFIT', 'PER_MIN', 'USED_IN', 'IMG', 'STORE_ID') values ('Bs-p', 'Planks', 3, 120, 30, 'Rs-w*2', 40, 80, 2.67, 'Fs-t Gs-f', 'http://vignette1.wikia.nocookie.net/simcity/images/f/fb/Bs-p.png/revision/latest/scale-to-width-down/25?cb=20150912025516&format=webp', 1);
INSERT INTO TB_COMMERCIAL_MATERIAL ('ID', 'ITEM', 'LVL', 'MAX_VALUE', 'TIME_MIN', 'MATS', 'MAT_COST', 'PROFIT', 'PER_MIN', 'USED_IN', 'IMG', 'STORE_ID') values ('Bs-b', 'Bricks', 13, 190, 20, 'Rs-m*2', 80, 110, 5.50, 'Gs-fp', 'http://vignette3.wikia.nocookie.net/simcity/images/a/a4/Bs-b.png/revision/latest/scale-to-width-down/25?cb=20150912025425&format=webp', 1);
INSERT INTO TB_COMMERCIAL_MATERIAL ('ID', 'ITEM', 'LVL', 'MAX_VALUE', 'TIME_MIN', 'MATS', 'MAT_COST', 'PROFIT', 'PER_MIN', 'USED_IN', 'IMG', 'STORE_ID') values ('Bs-c', 'Cement', 14, 440, 50, 'Rs-m*2 Rs-c*1', 140, 300, 6, 'Gs-fp Gs-gg', 'http://vignette2.wikia.nocookie.net/simcity/images/0/00/Bs-c.png/revision/latest/scale-to-width-down/25?cb=20150912025439&format=webp', 1);
INSERT INTO TB_COMMERCIAL_MATERIAL ('ID', 'ITEM', 'LVL', 'MAX_VALUE', 'TIME_MIN', 'MATS', 'MAT_COST', 'PROFIT', 'PER_MIN', 'USED_IN', 'IMG', 'STORE_ID') values ('Bs-g', 'Glue', 15, 440, 60, 'Rs-p*1 Rs-c*2', 85, 355, 5.92, 'Fs-co Gs-gg Fa-s Fa-bs', 'http://vignette2.wikia.nocookie.net/simcity/images/d/db/Bs-g.png/revision/latest/scale-to-width-down/25?cb=20150912025451&format=webp', 1);


/**
 * hardware_store
 */ 
INSERT INTO TB_COMMERCIAL_MATERIAL ('ID', 'ITEM', 'LVL', 'MAX_VALUE', 'TIME_MIN', 'MATS', 'MAT_COST', 'PROFIT', 'PER_MIN', 'USED_IN', 'IMG', 'STORE_ID') values ('Hs-h', 'Hammer', 4, 90, 14, 'Rs-i*1 Rs-w*1', 30, 60, 5.29, 'Fs-c Fs-t', 'http://vignette3.wikia.nocookie.net/simcity/images/2/2d/Hs-h.png/revision/latest/scale-to-width-down/25?cb=20150912030644&format=webp', 2);
INSERT INTO TB_COMMERCIAL_MATERIAL ('ID', 'ITEM', 'LVL', 'MAX_VALUE', 'TIME_MIN', 'MATS', 'MAT_COST', 'PROFIT', 'PER_MIN', 'USED_IN', 'IMG', 'STORE_ID') values ('Hs-m', 'Measuring Tape', 6, 110, 29, 'Rs-i*1 Rs-p*1', 35, 75, 3.79, 'Fs-ht Fa-c Fa-bs', 'http://vignette1.wikia.nocookie.net/simcity/images/1/16/Hs-m.png/revision/latest/scale-to-width-down/25?cb=20150912030655&format=webp', 2);
INSERT INTO TB_COMMERCIAL_MATERIAL ('ID', 'ITEM', 'LVL', 'MAX_VALUE', 'TIME_MIN', 'MATS', 'MAT_COST', 'PROFIT', 'PER_MIN', 'USED_IN', 'IMG', 'STORE_ID') values ('Hs-s', 'Shovel', 9, 150, 30, 'Rs-i*1 Rs-w*1 Rs-p*1', 55, 95, 3.85, 'Gs-g Gs-t Gs-fp', 'http://vignette2.wikia.nocookie.net/simcity/images/3/36/Hs-s.png/revision/latest/scale-to-width-down/25?cb=20150912030705&format=webp', 2);
INSERT INTO TB_COMMERCIAL_MATERIAL ('ID', 'ITEM', 'LVL', 'MAX_VALUE', 'TIME_MIN', 'MATS', 'MAT_COST', 'PROFIT', 'PER_MIN', 'USED_IN', 'IMG', 'STORE_ID') values ('Hs-cu', 'Cooking Utensil', 17, 250, 45, 'Rs-i*2 Rs-w*2 Rs-p*2', 110, 95, 4.63, 'Ha-bb', 'http://vignette2.wikia.nocookie.net/simcity/images/3/31/Hs-cu.png/revision/latest/scale-to-width-down/25?cb=20150912030624&format=webp', 2);
INSERT INTO TB_COMMERCIAL_MATERIAL ('ID', 'ITEM', 'LVL', 'MAX_VALUE', 'TIME_MIN', 'MATS', 'MAT_COST', 'PROFIT', 'PER_MIN', 'USED_IN', 'IMG', 'STORE_ID') values ('Hs-d', 'Drill', 30, 590, 120, 'Rs-i*2 Rs-p*2 Rs-ec*1', 230, 360, 1.09, 'Fs-co', 'http://vignette1.wikia.nocookie.net/simcity/images/7/70/Hs-d.png/revision/latest/scale-to-width-down/25?cb=20150912030635&format=webp', 2);


/**
 * farmers_market
 */ 
INSERT INTO TB_COMMERCIAL_MATERIAL ('ID', 'ITEM', 'LVL', 'MAX_VALUE', 'TIME_MIN', 'MATS', 'MAT_COST', 'PROFIT', 'PER_MIN', 'USED_IN', 'IMG', 'STORE_ID') values ('Fm-v', 'Vegetables', 8, 160, 20, 'Rs-s*2', 60, 100, 4.00, 'Ds-gs Ff-cf', 'http://vignette3.wikia.nocookie.net/simcity/images/7/7b/Fm-v.png/revision/latest/scale-to-width-down/25?cb=20150912030351&format=webp', 3);
INSERT INTO TB_COMMERCIAL_MATERIAL ('ID', 'ITEM', 'LVL', 'MAX_VALUE', 'TIME_MIN', 'MATS', 'MAT_COST', 'PROFIT', 'PER_MIN', 'USED_IN', 'IMG', 'STORE_ID') values ('Fm-f', 'Flour Bag', 17, 570, 30, 'Rs-s*2 Rs-t*2', 240, 330, 2.71, 'Ds-d Ds-br Ds-cc Ff-p', 'http://vignette4.wikia.nocookie.net/simcity/images/e/eb/Fm-f.png/revision/latest/scale-to-width-down/25?cb=20150912030333&format=webp', 3);
INSERT INTO TB_COMMERCIAL_MATERIAL ('ID', 'ITEM', 'LVL', 'MAX_VALUE', 'TIME_MIN', 'MATS', 'MAT_COST', 'PROFIT', 'PER_MIN', 'USED_IN', 'IMG', 'STORE_ID') values ('Fm-fb', 'Fruit and Berries', 18, 730, 90, 'Rs-s*2 Gs-t*1', 480, 250, 3.17, 'Ds-gs Ds-cc Ds-fy Ff-lb', 'http://vignette4.wikia.nocookie.net/simcity/images/4/4f/Fm-fb.png/revision/latest/scale-to-width-down/25?cb=20150912030342&format=webp', 3);
INSERT INTO TB_COMMERCIAL_MATERIAL ('ID', 'ITEM', 'LVL', 'MAX_VALUE', 'TIME_MIN', 'MATS', 'MAT_COST', 'PROFIT', 'PER_MIN', 'USED_IN', 'IMG', 'STORE_ID') values ('Fm-c', 'Cream', 23, 440, 75, 'Rs-af*1', 140, 300, 1.01, 'Ds-br Ds-fy Ff-ic', 'http://vignette2.wikia.nocookie.net/simcity/images/d/d8/Fm-c.png/revision/latest/scale-to-width-down/25?cb=20150912030313&format=webp', 3);
INSERT INTO TB_COMMERCIAL_MATERIAL ('ID', 'ITEM', 'LVL', 'MAX_VALUE', 'TIME_MIN', 'MATS', 'MAT_COST', 'PROFIT', 'PER_MIN', 'USED_IN', 'IMG', 'STORE_ID') values ('Fm-ch', 'Cheese', 25, 660, 105, 'Rs-af*2', 280, 380, 1.42, 'Ds-cc Ff-p Ff-cf', 'http://vignette1.wikia.nocookie.net/simcity/images/4/43/Fm-ch.png/revision/latest/scale-to-width-down/25?cb=20150912030322&format=webp', 3);
INSERT INTO TB_COMMERCIAL_MATERIAL ('ID', 'ITEM', 'LVL', 'MAX_VALUE', 'TIME_MIN', 'MATS', 'MAT_COST', 'PROFIT', 'PER_MIN', 'USED_IN', 'IMG', 'STORE_ID') values ('Fm-b', 'Beef', 27, 860, 150, 'Rs-af*3', 420, 440, 1.69, 'Ff-p Ff-b', 'http://vignette1.wikia.nocookie.net/simcity/images/e/ea/Fm-b.png/revision/latest/scale-to-width-down/25?cb=20150912030302&format=webp', 3);


/**
 * furniture_store
 */ 
INSERT INTO TB_COMMERCIAL_MATERIAL ('ID', 'ITEM', 'LVL', 'MAX_VALUE', 'TIME_MIN', 'MATS', 'MAT_COST', 'PROFIT', 'PER_MIN', 'USED_IN', 'IMG', 'STORE_ID') values ('Fs-c', 'Chairs', 10, 300, 20, 'Rs-w*2 Bs-n*1 Hs-h*1', 210, 90, 8.11, '', 'http://vignette1.wikia.nocookie.net/simcity/images/6/61/Fs-c.png/revision/latest/scale-to-width-down/25?cb=20150912030400&format=webp', 4);
INSERT INTO TB_COMMERCIAL_MATERIAL ('ID', 'ITEM', 'LVL', 'MAX_VALUE', 'TIME_MIN', 'MATS', 'MAT_COST', 'PROFIT', 'PER_MIN', 'USED_IN', 'IMG', 'STORE_ID') values ('Fs-t', 'Tables', 16, 500, 30, 'Bs-n*1 Bs-p*1 Hs-h*1', 370, 130, 6.85, '', 'http://vignette2.wikia.nocookie.net/simcity/images/4/4d/Fs-t.png/revision/latest/scale-to-width-down/25?cb=20150912030429&format=webp', 4);
INSERT INTO TB_COMMERCIAL_MATERIAL ('ID', 'ITEM', 'LVL', 'MAX_VALUE', 'TIME_MIN', 'MATS', 'MAT_COST', 'PROFIT', 'PER_MIN', 'USED_IN', 'IMG', 'STORE_ID') values ('Fs-ht', 'Home Textiles', 25, 610, 75, 'Rs-t*2 Hs-m*1', 9000, 320, 2.22, '', 'http://vignette2.wikia.nocookie.net/simcity/images/0/08/Fs-ht.png/revision/latest/scale-to-width-down/25?cb=20150912030419&format=webp', 4);
INSERT INTO TB_COMMERCIAL_MATERIAL ('ID', 'ITEM', 'LVL', 'MAX_VALUE', 'TIME_MIN', 'MATS', 'MAT_COST', 'PROFIT', 'PER_MIN', 'USED_IN', 'IMG', 'STORE_ID') values ('Fs-co', 'Couch', 33, '1,810', 150, 'Rs-t*3 Bs-g*1 Hs-d*1', '1,300', 510, 2.62, '', 'http://vignette1.wikia.nocookie.net/simcity/images/d/d0/Fs-co.png/revision/latest/scale-to-width-down/25?cb=20150912030410&format=webp', 4);


/**
 * gardening_supplies
 */ 
INSERT INTO TB_COMMERCIAL_MATERIAL ('ID', 'ITEM', 'LVL', 'MAX_VALUE', 'TIME_MIN', 'MATS', 'MAT_COST', 'PROFIT', 'PER_MIN', 'USED_IN', 'IMG', 'STORE_ID') values ('Gs-g', 'Grass', 14, 310, 30, 'Rs-s*1 Hs-s*1', 180, 130, 3.88, '', 'http://vignette1.wikia.nocookie.net/simcity/images/b/b7/Gs-g.png/revision/latest/scale-to-width-down/25?cb=20150912030458&format=webp', 5);
INSERT INTO TB_COMMERCIAL_MATERIAL ('ID', 'ITEM', 'LVL', 'MAX_VALUE', 'TIME_MIN', 'MATS', 'MAT_COST', 'PROFIT', 'PER_MIN', 'USED_IN', 'IMG', 'STORE_ID') values ('Gs-t', 'Tree Saplings', 16, 420, 90, 'Rs-s*2 Hs-s*1', 210, 210, 3.00, 'Fm-fb', 'http://vignette2.wikia.nocookie.net/simcity/images/1/16/Gs-t.png/revision/latest/scale-to-width-down/25?cb=20150912030519&format=webp', 5);
INSERT INTO TB_COMMERCIAL_MATERIAL ('ID', 'ITEM', 'LVL', 'MAX_VALUE', 'TIME_MIN', 'MATS', 'MAT_COST', 'PROFIT', 'PER_MIN', 'USED_IN', 'IMG', 'STORE_ID') values ('Gs-f', 'Garden Furniture', 21, 820, 135, 'Rs-p*2 Rs-t*2 Bs-p*2', 470, 350, 2.19, '', 'http://vignette3.wikia.nocookie.net/simcity/images/c/c6/Gs-f.png/revision/latest/scale-to-width-down/25?cb=20150912030439&format=webp', 5);
INSERT INTO TB_COMMERCIAL_MATERIAL ('ID', 'ITEM', 'LVL', 'MAX_VALUE', 'TIME_MIN', 'MATS', 'MAT_COST', 'PROFIT', 'PER_MIN', 'USED_IN', 'IMG', 'STORE_ID') values ('Gs-fp', 'Fire Pit', 28, '1,740', 240, 'Bs-b*2 Bs-c*2 Hs-s*1', '1,560', 180, 3.48, '', 'http://vignette1.wikia.nocookie.net/simcity/images/0/07/Gs-fp.png/revision/latest/scale-to-width-down/25?cb=20150912030449&format=webp', 5);
INSERT INTO TB_COMMERCIAL_MATERIAL ('ID', 'ITEM', 'LVL', 'MAX_VALUE', 'TIME_MIN', 'MATS', 'MAT_COST', 'PROFIT', 'PER_MIN', 'USED_IN', 'IMG', 'STORE_ID') values ('Gs-gg', 'Garden Gnomes', 34, '1,600', 90, 'Bs-c*2 Bs-g*1', '1,320', 280, 4.32, '', 'http://vignette2.wikia.nocookie.net/simcity/images/4/46/Gs-gg.png/revision/latest/scale-to-width-down/25?cb=20150912030508&format=webp', 5);


/**
 * donut_shop
 */ 
INSERT INTO TB_COMMERCIAL_MATERIAL ('ID', 'ITEM', 'LVL', 'MAX_VALUE', 'TIME_MIN', 'MATS', 'MAT_COST', 'PROFIT', 'PER_MIN', 'USED_IN', 'IMG', 'STORE_ID') values ('Ds-d', 'Donuts', 18, 950, 45, 'Rs-ss*1 Fm-f', 680, 270, 3.02, '', 'http://vignette2.wikia.nocookie.net/simcity/images/6/68/Ds-d.png/revision/latest/scale-to-width-down/25?cb=20150912025542&format=webp', 6);
INSERT INTO TB_COMMERCIAL_MATERIAL ('ID', 'ITEM', 'LVL', 'MAX_VALUE', 'TIME_MIN', 'MATS', 'MAT_COST', 'PROFIT', 'PER_MIN', 'USED_IN', 'IMG', 'STORE_ID') values ('Ds-gs', 'Green Smoothie', 20, '1,150', 30, 'Fm-v*1 Fm-fb*1', 890, 260, 4.11, '', 'http://vignette1.wikia.nocookie.net/simcity/images/0/06/Ds-gs.png/revision/latest/scale-to-width-down/25?cb=20150912025603&format=webp', 6);
INSERT INTO TB_COMMERCIAL_MATERIAL ('ID', 'ITEM', 'LVL', 'MAX_VALUE', 'TIME_MIN', 'MATS', 'MAT_COST', 'PROFIT', 'PER_MIN', 'USED_IN', 'IMG', 'STORE_ID') values ('Ds-br', 'Bread Roll', 24, '1,840', 60, 'Fm-f*2 Fm-c*1', '1,580', 260, 3.32, 'Ff-ic Ff-b', 'http://vignette2.wikia.nocookie.net/simcity/images/d/d8/Ds-br.png/revision/latest/scale-to-width-down/25?cb=20150912025524&format=webp', 6);
INSERT INTO TB_COMMERCIAL_MATERIAL ('ID', 'ITEM', 'LVL', 'MAX_VALUE', 'TIME_MIN', 'MATS', 'MAT_COST', 'PROFIT', 'PER_MIN', 'USED_IN', 'IMG', 'STORE_ID') values ('Ds-cc', 'Cherry Cheesecake', 27, '2,240', 90, 'Fm-f*1 Fm-fb*1 Fm-ch*1', '1,960', 280, 2.82, '', 'http://vignette2.wikia.nocookie.net/simcity/images/2/28/Ds-cc.png/revision/latest/scale-to-width-down/25?cb=20150912025532&format=webp', 6);
INSERT INTO TB_COMMERCIAL_MATERIAL ('ID', 'ITEM', 'LVL', 'MAX_VALUE', 'TIME_MIN', 'MATS', 'MAT_COST', 'PROFIT', 'PER_MIN', 'USED_IN', 'IMG', 'STORE_ID') values ('Ds-fy', 'Frozen Yogurt', 28, '1,750', 240, 'Rs-ss*1 Fm-fb*1 Fm-c*1', '1,280', 470, 1.98, '', 'http://vignette1.wikia.nocookie.net/simcity/images/3/3c/Ds-fy.png/revision/latest/scale-to-width-down/25?cb=20150912025554&format=webp', 6);


/**
 * fashion_store
 */ 
INSERT INTO TB_COMMERCIAL_MATERIAL ('ID', 'ITEM', 'LVL', 'MAX_VALUE', 'TIME_MIN', 'MATS', 'MAT_COST', 'PROFIT', 'PER_MIN', 'USED_IN', 'IMG', 'STORE_ID') values ('Fa-c', 'Cap', 19, 600, 60, 'Rs-t*2 Hs-m*1', 290, 310, 2.31, '', 'http://vignette4.wikia.nocookie.net/simcity/images/6/6f/Fa-c.png/revision/latest/scale-to-width-down/25?cb=20150912025621&format=webp', 7);
INSERT INTO TB_COMMERCIAL_MATERIAL ('ID', 'ITEM', 'LVL', 'MAX_VALUE', 'TIME_MIN', 'MATS', 'MAT_COST', 'PROFIT', 'PER_MIN', 'USED_IN', 'IMG', 'STORE_ID') values ('Fa-s', 'Shoes', 21, 980, 75, 'Rs-p*2 Rs-t*2 Bs-g*1', 645, 335, 3.11, '', 'http://vignette2.wikia.nocookie.net/simcity/images/8/83/Fa-s.png/revision/latest/scale-to-width-down/25?cb=20150912025629&format=webp', 7);
INSERT INTO TB_COMMERCIAL_MATERIAL ('ID', 'ITEM', 'LVL', 'MAX_VALUE', 'TIME_MIN', 'MATS', 'MAT_COST', 'PROFIT', 'PER_MIN', 'USED_IN', 'IMG', 'STORE_ID') values ('Fa-w', 'Watch', 22, 580, 90, 'Rs-p*2 Rs-c*1 Rs-g*1', 230, 350, 1.49, '', 'http://vignette3.wikia.nocookie.net/simcity/images/3/37/Fa-w.png/revision/latest/scale-to-width-down/25?cb=20150912025638&format=webp', 7);
INSERT INTO TB_COMMERCIAL_MATERIAL ('ID', 'ITEM', 'LVL', 'MAX_VALUE', 'TIME_MIN', 'MATS', 'MAT_COST', 'PROFIT', 'PER_MIN', 'USED_IN', 'IMG', 'STORE_ID') values ('Fa-bs', 'Business Suits', 32, '1,170', 210, 'Rs-t*3 Bs-g*1 Hs-m*1', 820, 350, 2.60, '', 'http://vignette4.wikia.nocookie.net/simcity/images/1/19/Fa-bs.png/revision/latest/scale-to-width-down/25?cb=20150912025611&format=webp', 7);


/**
 * fast_food_restaurant
 */ 
INSERT INTO TB_COMMERCIAL_MATERIAL ('ID', 'ITEM', 'LVL', 'MAX_VALUE', 'TIME_MIN', 'MATS', 'MAT_COST', 'PROFIT', 'PER_MIN', 'USED_IN', 'IMG', 'STORE_ID') values ('Ff-ic', 'Ice Cream Sandwich', 25, '2,560', 14, 'Fm-c*1 Ds-br*1', '2,280', 280, 5.70, '', 'http://vignette2.wikia.nocookie.net/simcity/images/8/83/Ff-ic.png/revision/latest/scale-to-width-down/25?cb=20150912025704&format=webp', 8);
INSERT INTO TB_COMMERCIAL_MATERIAL ('ID', 'ITEM', 'LVL', 'MAX_VALUE', 'TIME_MIN', 'MATS', 'MAT_COST', 'PROFIT', 'PER_MIN', 'USED_IN', 'IMG', 'STORE_ID') values ('Ff-p', 'Pizza', 28, '2,560', 24, 'Fm-f*1 Fm-ch*1 Fm-b*1', '2,090', 470, 3.83, '', 'http://vignette2.wikia.nocookie.net/simcity/images/7/79/Ff-p.png/revision/latest/scale-to-width-down/25?cb=20150912030252&format=webp', 8);
INSERT INTO TB_COMMERCIAL_MATERIAL ('ID', 'ITEM', 'LVL', 'MAX_VALUE', 'TIME_MIN', 'MATS', 'MAT_COST', 'PROFIT', 'PER_MIN', 'USED_IN', 'IMG', 'STORE_ID') values ('Ff-b', 'Burgers', 31, '3,620', 35, 'Fm-b*1 Ds-br*1 Ha-bb*1', '3,230', 390, 5.98, '', 'http://vignette2.wikia.nocookie.net/simcity/images/1/1b/Ff-b.png/revision/latest/scale-to-width-down/25?cb=20150912025646&format=webp', 8);
INSERT INTO TB_COMMERCIAL_MATERIAL ('ID', 'ITEM', 'LVL', 'MAX_VALUE', 'TIME_MIN', 'MATS', 'MAT_COST', 'PROFIT', 'PER_MIN', 'USED_IN', 'IMG', 'STORE_ID') values ('Ff-cf', 'Cheese Fries', 33, '1,050', 20, 'Fm-v*1 Fm-ch*1', 820, 230, 2.08, '', 'http://vignette2.wikia.nocookie.net/simcity/images/a/ab/Ff-cf.png/revision/latest/scale-to-width-down/25?cb=20150912025654&format=webp', 8);
INSERT INTO TB_COMMERCIAL_MATERIAL ('ID', 'ITEM', 'LVL', 'MAX_VALUE', 'TIME_MIN', 'MATS', 'MAT_COST', 'PROFIT', 'PER_MIN', 'USED_IN', 'IMG', 'STORE_ID') values ('Ff-lb', 'Lemonade Bottle', 37, '1,690', 60, 'Rs-ss*2 Rs-g*2 Fm-fb*1', '1,190', 500, 2.17, '', 'http://vignette1.wikia.nocookie.net/simcity/images/1/14/Ff-lb.png/revision/latest/scale-to-width-down/25?cb=20150912025714&format=webp', 8);


/**
 * home_appliances
 */ 
INSERT INTO TB_COMMERCIAL_MATERIAL ('ID', 'ITEM', 'LVL', 'MAX_VALUE', 'TIME_MIN', 'MATS', 'MAT_COST', 'PROFIT', 'PER_MIN', 'USED_IN', 'IMG', 'STORE_ID') values ('Ha-bb', 'BBQ Grill', 29, 530, 165, 'Rs-i*3 Hs-cu*1', 280, 250, 2.42, 'Ff-b', 'http://vignette3.wikia.nocookie.net/simcity/images/e/e9/Ha-bb.png/revision/latest/scale-to-width-down/25?cb=20150912030530&format=webp', 9);
INSERT INTO TB_COMMERCIAL_MATERIAL ('ID', 'ITEM', 'LVL', 'MAX_VALUE', 'TIME_MIN', 'MATS', 'MAT_COST', 'PROFIT', 'PER_MIN', 'USED_IN', 'IMG', 'STORE_ID') values ('Ha-r', 'Refrigerator', 35, '1,060', 210, 'Rs-p*2 Rs-c*2 Rs-ec*2', 490, 570, 1.68, '', 'http://vignette1.wikia.nocookie.net/simcity/images/a/a0/Ha-r.png/revision/latest/scale-to-width-down/25?cb=20150912030600&format=webp', 9);
INSERT INTO TB_COMMERCIAL_MATERIAL ('ID', 'ITEM', 'LVL', 'MAX_VALUE', 'TIME_MIN', 'MATS', 'MAT_COST', 'PROFIT', 'PER_MIN', 'USED_IN', 'IMG', 'STORE_ID') values ('Ha-ls', 'Lighting System', 36, 890, 105, 'Rs-c*1 Rs-g*1 Rs-ec*1', 340, 550, 1.70, '', 'http://vignette4.wikia.nocookie.net/simcity/images/a/aa/Ha-ls.png/revision/latest/scale-to-width-down/25?cb=20150912030540&format=webp', 9);
INSERT INTO TB_COMMERCIAL_MATERIAL ('ID', 'ITEM', 'LVL', 'MAX_VALUE', 'TIME_MIN', 'MATS', 'MAT_COST', 'PROFIT', 'PER_MIN', 'USED_IN', 'IMG', 'STORE_ID') values ('Ha-t', 'Television', 38, '1,280', 150, 'Rs-p*2 Rs-g*2 Rs-ec*2', 450, 830, 2.25, '', 'http://vignette3.wikia.nocookie.net/simcity/images/8/82/Ha-t.png/revision/latest/scale-to-width-down/25?cb=20150912030612&format=webp', 9);
