/*
SQLyog v10.2 
MySQL - 5.5.27 : Database - passionfruit
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`passionfruit` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `passionfruit`;

/*Table structure for table `farming_detail` */

DROP TABLE IF EXISTS `farming_detail`;

CREATE TABLE `farming_detail` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `farmingId` int(11) DEFAULT NULL COMMENT '农事操作id 外键',
  `farmingOperatingId` int(11) DEFAULT NULL COMMENT '操作id 外键',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=utf8;

/*Data for the table `farming_detail` */

insert  into `farming_detail`(`id`,`farmingId`,`farmingOperatingId`) values (34,33,3),(35,33,4),(36,34,3),(37,34,4),(38,34,8),(39,35,3),(40,35,2),(41,36,8),(42,36,7),(43,36,6),(44,36,5),(45,36,4),(46,36,3),(47,36,2),(48,36,1);

/*Table structure for table `farming_images` */

DROP TABLE IF EXISTS `farming_images`;

CREATE TABLE `farming_images` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `farmingId` int(11) DEFAULT NULL COMMENT '农事记录id 外键',
  `url` varchar(255) DEFAULT NULL COMMENT '图片存储地址',
  `name` varchar(255) DEFAULT NULL COMMENT '图片名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `farming_images` */

insert  into `farming_images`(`id`,`farmingId`,`url`,`name`) values (4,33,'/farming/33/','wxb60758bf6281a7d8.o6zAJs2rYPKa3yv1Jw884-x4IW50.eda8t2jR5v3n0127e7c4c9275b44221313e20a34826d.png'),(5,34,'/farming/34/','wxb60758bf6281a7d8.o6zAJs2rYPKa3yv1Jw884-x4IW50.fYSN6RXX2tTW0127e7c4c9275b44221313e20a34826d.png'),(6,34,'/farming/34/','wxb60758bf6281a7d8.o6zAJs2rYPKa3yv1Jw884-x4IW50.eda8t2jR5v3n0127e7c4c9275b44221313e20a34826d.png');

/*Table structure for table `farming_operating` */

DROP TABLE IF EXISTS `farming_operating`;

CREATE TABLE `farming_operating` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL COMMENT '农事操作名（育苗、灌水、修剪、授粉、疏花疏果）',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

/*Data for the table `farming_operating` */

insert  into `farming_operating`(`id`,`name`) values (1,'巡园'),(2,'灌水'),(3,'修剪'),(4,'育苗'),(5,'授粉'),(6,'疏花疏果'),(7,'培土'),(8,'人工除草');

/*Table structure for table `farmings` */

DROP TABLE IF EXISTS `farmings`;

CREATE TABLE `farmings` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `operationId` int(11) DEFAULT NULL COMMENT '操作表id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8;

/*Data for the table `farmings` */

insert  into `farmings`(`id`,`operationId`) values (33,33),(34,34),(35,35),(36,36);

/*Table structure for table `garden` */

DROP TABLE IF EXISTS `garden`;

CREATE TABLE `garden` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userId` int(11) DEFAULT NULL,
  `varietyId` int(11) DEFAULT NULL COMMENT '品种信息表id 外键',
  `periodId` int(11) DEFAULT NULL COMMENT '物候期信息表id 外键',
  `name` varchar(255) DEFAULT NULL COMMENT '果园名',
  `age` float DEFAULT NULL COMMENT '树龄',
  `area` varchar(255) DEFAULT NULL COMMENT '种植面积:12亩 20亩',
  `loc` varchar(255) DEFAULT NULL COMMENT '位置,存经纬度',
  `address` varchar(255) DEFAULT NULL COMMENT '地址，经腾讯地图api转换地址',
  `lastModified` datetime DEFAULT NULL COMMENT '最后一次修改时间',
  `created` datetime DEFAULT NULL COMMENT '新建记录时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `garden` */

insert  into `garden`(`id`,`userId`,`varietyId`,`periodId`,`name`,`age`,`area`,`loc`,`address`,`lastModified`,`created`) values (5,1405619599,1,1,'果园222',12311,'123456','24.28154,109.44726','广西壮族自治区柳州市鱼峰区九头山路','2019-03-08 01:22:30','2019-03-06 01:20:40'),(6,1405619599,3,5,'guoyuan B',1,'11','24.28154,109.44726','广西壮族自治区柳州市鱼峰区九头山路','2019-03-30 01:20:48','2019-03-08 00:56:56');

/*Table structure for table `garden_images` */

DROP TABLE IF EXISTS `garden_images`;

CREATE TABLE `garden_images` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `gardenId` int(11) DEFAULT NULL COMMENT '果园id',
  `url` varchar(255) DEFAULT NULL COMMENT '图片存储地址',
  `name` varchar(255) DEFAULT NULL COMMENT '图片名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8;

/*Data for the table `garden_images` */

insert  into `garden_images`(`id`,`gardenId`,`url`,`name`) values (28,6,'/garden/6/','wxb60758bf6281a7d8.o6zAJs2rYPKa3yv1Jw884-x4IW50.FZ6RpB9Q0eWS0127e7c4c9275b44221313e20a34826d.png'),(29,6,'/garden/6/','wxb60758bf6281a7d8.o6zAJs2rYPKa3yv1Jw884-x4IW50.feDKIyqtIfLz0127e7c4c9275b44221313e20a34826d.png');

/*Table structure for table `operation` */

DROP TABLE IF EXISTS `operation`;

CREATE TABLE `operation` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `gardenId` int(11) DEFAULT NULL,
  `weatherId` int(11) DEFAULT NULL COMMENT '天气情况id 外键',
  `periodId` int(11) DEFAULT NULL COMMENT '物候期id外键',
  `time` time DEFAULT NULL COMMENT '操作时间，用户自己选择',
  `date` date DEFAULT NULL COMMENT '操作日期，用户自己选择',
  `lastModified` datetime DEFAULT NULL COMMENT '最后一次修改时间',
  `created` datetime DEFAULT NULL COMMENT '新建记录时间',
  `remarks` datetime DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8;

/*Data for the table `operation` */

insert  into `operation`(`id`,`gardenId`,`weatherId`,`periodId`,`time`,`date`,`lastModified`,`created`,`remarks`) values (33,5,1,1,'12:01:00','2018-12-25',NULL,'2019-03-10 01:13:00',NULL),(34,5,4,5,'12:01:00','2018-12-25',NULL,'2019-03-10 01:15:33',NULL),(35,6,5,5,'14:01:00','2015-12-25',NULL,'2019-03-10 12:45:21',NULL),(36,6,8,5,'15:01:00','2020-09-01',NULL,'2019-03-10 12:45:55',NULL);

/*Table structure for table `period` */

DROP TABLE IF EXISTS `period`;

CREATE TABLE `period` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL COMMENT '物候期名称（育苗期、发芽期、新梢生长期、开花结果期、越冬期）',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `period` */

insert  into `period`(`id`,`name`) values (1,'育苗期'),(2,'发芽期'),(3,'新梢生长期'),(4,'开花结果期'),(5,'越冬期');

/*Table structure for table `reason` */

DROP TABLE IF EXISTS `reason`;

CREATE TABLE `reason` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `parentId` int(11) DEFAULT NULL COMMENT '父级id，表内联，id=0为一级分类',
  `name` varchar(255) DEFAULT NULL COMMENT '原因名称：黑斑病、红蜘蛛、生根、催花',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

/*Data for the table `reason` */

insert  into `reason`(`id`,`parentId`,`name`) values (1,0,'虫害'),(2,0,'草害'),(3,0,'病害'),(4,0,'植物营养'),(5,1,'蜗牛'),(6,1,'蓟马'),(7,1,'叩头甲'),(8,1,'金龟子'),(9,3,'黄花叶病毒病'),(10,3,'病毒病'),(11,3,'褐腐病'),(12,3,'疫病'),(13,2,'半年生杂草'),(14,2,'一年生杂草'),(15,2,'多年生杂草'),(16,2,'顽固型杂草'),(17,4,'生根'),(18,4,'促根'),(19,4,'控梢'),(20,4,'转色'),(21,4,'催花');

/*Table structure for table `usages` */

DROP TABLE IF EXISTS `usages`;

CREATE TABLE `usages` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `operationId` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `usages` */

/*Table structure for table `usages_detail` */

DROP TABLE IF EXISTS `usages_detail`;

CREATE TABLE `usages_detail` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `usagesId` int(11) DEFAULT NULL COMMENT '肥药使用记录表id',
  `reasonId` int(11) DEFAULT NULL COMMENT '此次操作的原因id 外键',
  `name` varchar(255) DEFAULT '' COMMENT '所使用物品名称，用户自己填写（黑斑病、红蜘蛛、生根、催花、xx化肥）',
  `dose` varchar(255) DEFAULT NULL COMMENT '使用用量:12ml 30L 10g 20kg',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `usages_detail` */

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `nickName` varchar(255) DEFAULT NULL COMMENT '昵称',
  `avatar` varchar(255) DEFAULT NULL COMMENT '头像地址',
  `phone` varchar(255) DEFAULT NULL COMMENT '手机号码',
  `password` varchar(255) DEFAULT NULL COMMENT '后台登录密码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`id`,`nickName`,`avatar`,`phone`,`password`) values (1405619599,'KDWIN','https://wx.qlogo.cn/mmopen/vi_32/L9VVrMFqrzeQUqf1S8TWLcVuuKrE9kbQYibuqJumhNDfuXFWoC6ic2KaiaPqBKBZvFibVhpZicEJBicXmY1MeKHKBBCQ/132',NULL,NULL);

/*Table structure for table `user_auth` */

DROP TABLE IF EXISTS `user_auth`;

CREATE TABLE `user_auth` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userId` int(11) DEFAULT NULL COMMENT 'user表id，外键',
  `identityType` varchar(255) DEFAULT NULL COMMENT '第三方登陆的类型，（手机号 邮箱 用户名）或第三方应用名称（微信 微博等）',
  `identifier` varchar(255) DEFAULT NULL COMMENT '手机号、邮箱 用户名或第三方应用的唯一标识码',
  `credential` varchar(255) DEFAULT NULL COMMENT '密码凭证（站内的保存密码，站外的不保存或保存token）',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `user_auth` */

insert  into `user_auth`(`id`,`userId`,`identityType`,`identifier`,`credential`) values (5,1405619599,'wx','oeJ3D5C1KnksEN6jeSbqwhi44Tzk','VVRJkFVngt8MmGV5TPG5GQ==');

/*Table structure for table `variety` */

DROP TABLE IF EXISTS `variety`;

CREATE TABLE `variety` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL COMMENT '品种名称（黄色百香果、紫色百香果、紫红色百香果）',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `variety` */

insert  into `variety`(`id`,`name`) values (1,'品种A'),(2,'品种b'),(3,'品种C');

/*Table structure for table `weather` */

DROP TABLE IF EXISTS `weather`;

CREATE TABLE `weather` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL COMMENT '天气名称（下雨、晴天、暴雨）',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

/*Data for the table `weather` */

insert  into `weather`(`id`,`name`) values (1,'晴'),(2,'多云'),(3,'阴天'),(4,'阵雨'),(5,'雷阵雨'),(6,'小雨'),(7,'中雨'),(8,'浓雾');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
