CREATE TABLE `properties` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `prop_key` varchar(128) NOT NULL,
  `prop_value` varchar(128) NOT NULL,
  `application` varchar(128) NOT NULL,
  `profile` varchar(64) NOT NULL,
  `label` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

INSERT INTO `properties` VALUES (1,'name','wangwei','qbm','core','dev'),(2,'bucket','wangwei1','qbm','oss','dev'),(3,'url','http://10.1.1.37','qbm','solr','dev');
