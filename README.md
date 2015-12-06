### 概述

玩了几个月的**SimCity Buildit**，这个游戏也算比较耐玩吧，每天登录两次造造东西，挺有意思。

刚开始的时候，东西造起来时间比较短没需求，现在不一样了， 造一个东西少则半小时，多的甚至3小时多，所以需要一个时间计算器，有了这么个需求后就到网上找相关资料，找到了[Wikia](http://simcity.wikia.com/wiki/List_of_items_in_SimCity_BuildIt)，但是查询使用不太灵活。

所以自己写了这么一个简单的**SimCity Buildit**数据库，外加一些查询接口。

### 文件说明

- doc/

	- data_manual.md

		手抄的数据（一个一个打，真的很累）。
	
	- wikia/

		从Wikia上面获取到的数据的html源码
		
		- build\_supplies\_store.html 建材店
		- hardware\_store.html 五金店
		- farmers\_market.html 农贸市场
		- furniture\_store.html 家居店
		- gardening\_supplies.html 园艺店
		- donut\_shop.html 甜品店
		- fashion\_store.html 时装店
		- fast\_food\_restaurant.html 快餐店
		- home_appliances.html 家电商铺