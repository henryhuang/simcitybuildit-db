/**
 * 工厂素材
 */
create table if not exists TB_FACTORY_MATERIAL(
	ID TEXT PRIMARY KEY NOT NULL,
	ITEM TEXT,
	LVL IMG,
	MAX_VALUE INTEGER,
	TIME_MIN INTEGER,
	IMG TEXT
);

INSERT INTO TB_FACTORY_MATERIAL ('ID', 'ITEM', 'LVL', 'MAX_VALUE', 'TIME_MIN', 'IMG') values ('Rs-i', 'Metal', 1, 10, 1, 'http://vignette2.wikia.nocookie.net/simcity/images/1/1d/Rs-i.png/revision/latest/scale-to-width-down/25?cb=20150912030811&format=webp');
INSERT INTO TB_FACTORY_MATERIAL ('ID', 'ITEM', 'LVL', 'MAX_VALUE', 'TIME_MIN', 'IMG') values ('Rs-w', 'Wood', 2, 20, 3, 'http://vignette1.wikia.nocookie.net/simcity/images/0/0d/Rs-w.png/revision/latest/scale-to-width-down/25?cb=20150912030924&format=webp');
INSERT INTO TB_FACTORY_MATERIAL ('ID', 'ITEM', 'LVL', 'MAX_VALUE', 'TIME_MIN', 'IMG') values ('Rs-p', 'Plastic', 5, 25, 9, 'http://vignette3.wikia.nocookie.net/simcity/images/7/73/Rs-p.png/revision/latest/scale-to-width-down/25?cb=20150912030834&format=webp');
INSERT INTO TB_FACTORY_MATERIAL ('ID', 'ITEM', 'LVL', 'MAX_VALUE', 'TIME_MIN', 'IMG') values ('Rs-s', 'Seeds', 7, 30, 20, 'http://vignette1.wikia.nocookie.net/simcity/images/1/1e/Rs-s.png/revision/latest/scale-to-width-down/25?cb=20150912030847&format=webp');
INSERT INTO TB_FACTORY_MATERIAL ('ID', 'ITEM', 'LVL', 'MAX_VALUE', 'TIME_MIN', 'IMG') values ('Rs-m', 'Minerals', 11, 40, 30, 'http://vignette4.wikia.nocookie.net/simcity/images/3/36/Rs-m.png/revision/latest/scale-to-width-down/25?cb=20150912030823&format=webp');
INSERT INTO TB_FACTORY_MATERIAL ('ID', 'ITEM', 'LVL', 'MAX_VALUE', 'TIME_MIN', 'IMG') values ('Rs-c', 'Chemicals', 13, 60, 120, 'http://vignette1.wikia.nocookie.net/simcity/images/7/77/Rs-c.png/revision/latest/scale-to-width-down/25?cb=20150912030732&format=webp');
INSERT INTO TB_FACTORY_MATERIAL ('ID', 'ITEM', 'LVL', 'MAX_VALUE', 'TIME_MIN', 'IMG') values ('Rs-t', 'Textiles', 15, 90, 180, 'http://vignette1.wikia.nocookie.net/simcity/images/b/b7/Rs-t.png/revision/latest/scale-to-width-down/25?cb=20150912030913&format=webp');
INSERT INTO TB_FACTORY_MATERIAL ('ID', 'ITEM', 'LVL', 'MAX_VALUE', 'TIME_MIN', 'IMG') values ('Rs-ss', 'Sugar & Spices', 17, 110, 240, 'http://vignette2.wikia.nocookie.net/simcity/images/6/6c/Rs-ss.png/revision/latest/scale-to-width-down/25?cb=20150912030900&format=webp');
INSERT INTO TB_FACTORY_MATERIAL ('ID', 'ITEM', 'LVL', 'MAX_VALUE', 'TIME_MIN', 'IMG') values ('Rs-g', 'Glass', '', 120, 300, 'http://vignette4.wikia.nocookie.net/simcity/images/5/5c/Rs-g.png/revision/latest/scale-to-width-down/25?cb=20150912030758&format=webp');
INSERT INTO TB_FACTORY_MATERIAL ('ID', 'ITEM', 'LVL', 'MAX_VALUE', 'TIME_MIN', 'IMG') values ('Rs-af', 'Animal Feed', 23, 140, 360, 'http://vignette2.wikia.nocookie.net/simcity/images/9/99/Rs-af.png/revision/latest/scale-to-width-down/25?cb=20150912030719&format=webp');
INSERT INTO TB_FACTORY_MATERIAL ('ID', 'ITEM', 'LVL', 'MAX_VALUE', 'TIME_MIN', 'IMG') values ('Rs-ec', 'Electrical Components', 29, 160, 420, 'http://vignette2.wikia.nocookie.net/simcity/images/5/5b/Rs-ec.png/revision/latest/scale-to-width-down/25?cb=20150912030743&format=webp');
