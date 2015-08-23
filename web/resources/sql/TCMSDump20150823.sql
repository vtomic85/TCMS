CREATE DATABASE  IF NOT EXISTS `tcms` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `tcms`;
-- MySQL dump 10.13  Distrib 5.6.17, for Win32 (x86)
--
-- Host: localhost    Database: tcms
-- ------------------------------------------------------
-- Server version	5.5.27

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cms_element`
--

DROP TABLE IF EXISTS `cms_element`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cms_element` (
  `id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `url` varchar(100) NOT NULL,
  `admin_url` varchar(100) NOT NULL,
  `object_id` mediumint(8) unsigned NOT NULL,
  `object_holder_id` mediumint(8) unsigned NOT NULL,
  `object_table` varchar(50) NOT NULL,
  `object_type_id` mediumint(9) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cms_element`
--

LOCK TABLES `cms_element` WRITE;
/*!40000 ALTER TABLE `cms_element` DISABLE KEYS */;
INSERT INTO `cms_element` VALUES (1,'Horoskop za jun: Očekuju vas velike promene','news/view.xhtml?id=1&amp;holderId=0','../news/newsForm.xhtml?newsId=1',1,0,'news',8),(2,'Neredi na tribinama pre derbija','news/view.xhtml?id=2&amp;holderId=7','../news/newsForm.xhtml?newsId=2',2,7,'news',8),(4,'Zabranjena okupljanja ispred Skupštine','news/view.xhtml?id=4&amp;holderId=18','../news/newsForm.xhtml?newsId=4',4,18,'news',8),(5,'Promenio ime kako bi jeftinije letovao','page/view.xhtml?id=5&amp;holderId=17','../page/pageForm.xhtml?pageId=5',5,17,'page',7),(6,'Prva strana','page/view.xhtml?id=1&amp;holderId=0','../page/pageForm.xhtml?pageId=1',1,0,'page',7),(11,'Četvrti naslov test vesti','news/view.xhtml?id=11&amp;holderId=5','../news/newsForm.xhtml?newsId=11',11,5,'news',8),(12,'Peti naslov test vesti','news/view.xhtml?id=12&amp;holderId=7','../news/newsForm.xhtml?newsId=12',12,7,'news',8),(13,'Zašto Amerikanci ne mere u metrima?','page/view.xhtml?id=3&amp;holderId=17','../page/pageForm.xhtml?pageId=3',3,17,'page',7),(14,'Gde je nestao \"Gangnam stajl\"?','page/view.xhtml?id=4&amp;holderId=17','../page/pageForm.xhtml?pageId=4',4,17,'page',7),(15,'Promenio ime kako bi jeftinije letova','page/view.xhtml?id=5&amp;holderId=17','../page/pageForm.xhtml?pageId=5',5,17,'page',7),(16,'Zabranjena okupljanja ispred Skupštine','news/view.xhtml?id=4&amp;holderId=5','../news/newsForm.xhtml?newsId=4',4,5,'news',8),(17,'Kikinda Short traži volontere','event/view.xhtml?id=4&amp;holderId=4','../event/eventForm.xhtml?eventId=4',4,4,'event',9),(18,'Odlučeno - kopamo put ispod Fruške Gore','news/view.xhtml?id=5&amp;holderId=18','../news/newsForm.xhtml?newsId=5',5,18,'news',8),(19,'FSS poništio odluke FSV','news/view.xhtml?id=6&amp;holderId=7','../news/newsForm.xhtml?newsId=6',6,7,'news',8),(20,'Ratovi zvezda: Han Solo je oženjen?','page/view.xhtml?id=6&amp;holderId=17','../page/pageForm.xhtml?pageId=6',6,17,'page',7),(21,'Berluskoni odbio milijardu za Milan','news/view.xhtml?id=7&amp;holderId=7','../news/newsForm.xhtml?newsId=7',7,7,'news',8),(22,'KKP: Karte za Metalac u nedelju','event/view.xhtml?id=5&amp;holderId=9','../event/eventForm.xhtml?eventId=5',5,9,'event',9),(23,'Zašto Amerikanci ne mere u metrima?','page/view.xhtml?id=3&amp;holderId=17','../page/pageForm.xhtml?pageId=3',3,17,'page',7),(24,'Zašto Amerikanci ne mere u metrima?','page/view.xhtml?id=3&amp;holderId=17','../page/pageForm.xhtml?pageId=3',3,17,'page',7),(25,'Zašto Amerikanci ne mere u metrima?','page/view.xhtml?id=3&amp;holderId=17','../page/pageForm.xhtml?pageId=3',3,17,'page',7),(26,'Zašto Amerikanci ne mere u metrima?','page/view.xhtml?id=3&amp;holderId=17','../page/pageForm.xhtml?pageId=3',3,17,'page',7),(27,'Druga strana','page/view.xhtml?id=7&amp;holderId=13','../page/pageForm.xhtml?pageId=7',7,13,'page',7),(28,'Treća strana','page/view.xhtml?id=8&amp;holderId=13','../page/pageForm.xhtml?pageId=8',8,13,'page',7),(29,'Četvrta strana','page/view.xhtml?id=9&amp;holderId=17','../page/pageForm.xhtml?pageId=9',9,17,'page',7),(30,'Peta strana','page/view.xhtml?id=10&amp;holderId=17','../page/pageForm.xhtml?pageId=10',10,17,'page',7),(31,'Događaj broj 1','event/view.xhtml?id=6&amp;holderId=4','../event/eventForm.xhtml?eventId=6',6,4,'event',9),(32,'Drugi događaj','event/view.xhtml?id=7&amp;holderId=11','../event/eventForm.xhtml?eventId=7',7,11,'event',9),(33,'Film!','event/view.xhtml?id=8&amp;holderId=4','../event/eventForm.xhtml?eventId=8',8,4,'event',9),(34,'Test događaj br. 4','event/view.xhtml?id=12&amp;holderId=10','../event/eventForm.xhtml?eventId=12',12,10,'event',9),(35,'Test događaj br. 3','event/view.xhtml?id=11&amp;holderId=10','../event/eventForm.xhtml?eventId=11',11,10,'event',9),(36,'Test događaj br. 1','event/view.xhtml?id=9&amp;holderId=9','../event/eventForm.xhtml?eventId=9',9,9,'event',9),(37,'Test događaj br. 2','event/view.xhtml?id=10&amp;holderId=9','../event/eventForm.xhtml?eventId=10',10,9,'event',9),(38,'Prvi naslov test vesti','news/view.xhtml?id=8&amp;holderId=5','../news/newsForm.xhtml?newsId=8',8,5,'news',8),(39,'Drugi naslov test vesti','news/view.xhtml?id=9&amp;holderId=5','../news/newsForm.xhtml?newsId=9',9,5,'news',8),(40,'Treći naslov test vesti','news/view.xhtml?id=10&amp;holderId=18','../news/newsForm.xhtml?newsId=10',10,18,'news',8);
/*!40000 ALTER TABLE `cms_element` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `comment`
--

DROP TABLE IF EXISTS `comment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `comment` (
  `id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
  `component_type_id` int(10) unsigned NOT NULL,
  `component_id` int(10) unsigned NOT NULL,
  `user_id` mediumint(8) unsigned DEFAULT NULL,
  `user_name` varchar(50) NOT NULL,
  `body` varchar(1000) NOT NULL,
  `date_created` date NOT NULL,
  `published` tinyint(1) unsigned DEFAULT NULL,
  `positive_votes` int(10) unsigned DEFAULT NULL,
  `negative_votes` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comment`
--

LOCK TABLES `comment` WRITE;
/*!40000 ALTER TABLE `comment` DISABLE KEYS */;
INSERT INTO `comment` VALUES (1,8,2,0,'Anonymous','Prvi komentar na vest o derbiju od anonimnog člana.','2015-06-02',1,4,0),(2,8,2,1,'admin','Drugi komentar, od administratora.\r\nMalo specijalnih karaktera: !\"#$%&/()=?*\'+\r\n;delete from comment;','2015-06-02',1,2,3),(3,8,2,1,'admin','Testiram SQL injection zaštitu\";delete from comment;','2015-06-02',1,2,2),(4,20,3,0,'Anonymous','Lepa priča','2015-06-03',1,1,0),(5,20,3,0,'Anonymous','Drugi pokušaj ostavljanja komentara','2015-06-03',1,2,1),(6,20,3,0,'Anonymous','Treći pokušaj ostavljanja komentara','2015-06-03',1,0,1),(7,7,6,0,'Autor CMS-a','Nikad nisam gledao \"Star Wars\"...','2015-06-06',1,0,0),(8,9,1,2,'user','Ostavljam komentar koji ću kasnije oceniti.','2015-06-07',1,0,0),(9,8,3,2,'user','Svašta...','2015-06-07',1,0,0),(10,8,1,2,'user','A vi verujete u horoskop?','2015-06-07',1,0,1),(11,8,4,2,'user','I gde sad da slavimo Novu godinu???','2015-06-07',1,1,0),(12,8,5,1,'admin','Sigurno nećemo kopati iznad...','2015-06-07',1,1,0),(13,20,4,1,'admin','Neki komentar','2015-06-14',1,0,0),(14,20,1,2,'user','Moj prvi komentar ostavljen u svrhu testiranja top liste.','2015-06-14',1,0,0),(15,20,1,2,'user','Moj drugi komentar ostavljen u svrhu testiranja top liste.','2015-06-14',1,0,0),(16,7,9,1,'admin','Najbolja vest koju sam ikada pročitao!','2015-06-27',0,0,0),(17,9,9,1,'admin','Možemo li da dobijemo detaljnije informacije o ovom događaju?','2015-06-27',0,0,0);
/*!40000 ALTER TABLE `comment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `comment_rate`
--

DROP TABLE IF EXISTS `comment_rate`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `comment_rate` (
  `id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` mediumint(8) unsigned NOT NULL,
  `comment_id` mediumint(8) unsigned NOT NULL,
  `positive` tinyint(1) unsigned DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comment_rate`
--

LOCK TABLES `comment_rate` WRITE;
/*!40000 ALTER TABLE `comment_rate` DISABLE KEYS */;
INSERT INTO `comment_rate` VALUES (1,2,1,1),(2,2,2,0),(3,2,3,0),(4,1,2,1),(5,1,11,1),(6,1,12,1),(7,1,10,0);
/*!40000 ALTER TABLE `comment_rate` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `component_type`
--

DROP TABLE IF EXISTS `component_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `component_type` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `component_type`
--

LOCK TABLES `component_type` WRITE;
/*!40000 ALTER TABLE `component_type` DISABLE KEYS */;
INSERT INTO `component_type` VALUES (3,'Gallery'),(7,'Page'),(8,'News'),(9,'Event'),(20,'UserPart');
/*!40000 ALTER TABLE `component_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contact`
--

DROP TABLE IF EXISTS `contact`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `contact` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `address1` varchar(200) DEFAULT NULL,
  `address2` varchar(200) DEFAULT NULL,
  `address3` varchar(200) DEFAULT NULL,
  `phone1` varchar(50) DEFAULT NULL,
  `phone2` varchar(50) DEFAULT NULL,
  `phone3` varchar(50) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `website` varchar(100) DEFAULT NULL,
  `twitter` varchar(100) DEFAULT NULL,
  `facebook` varchar(100) DEFAULT NULL,
  `linkedin` varchar(100) DEFAULT NULL,
  `foursquare` varchar(100) DEFAULT NULL,
  `gmap` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contact`
--

LOCK TABLES `contact` WRITE;
/*!40000 ALTER TABLE `contact` DISABLE KEYS */;
INSERT INTO `contact` VALUES (1,'Šumadijska 28','11550','Lazarevac','+381 64 6124820','','','vladimir.tomic.la@gmail.com','www.vladimir-tomic.com','https://twitter.com/vtomic85','www.facebook.com/vladimir.tomic.la','rs.linkedin.com/in/vladimirtomic','','');
/*!40000 ALTER TABLE `contact` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `country`
--

DROP TABLE IF EXISTS `country`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `country` (
  `id` int(5) unsigned NOT NULL AUTO_INCREMENT,
  `code` varchar(2) NOT NULL DEFAULT '',
  `name` varchar(50) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=252 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `country`
--

LOCK TABLES `country` WRITE;
/*!40000 ALTER TABLE `country` DISABLE KEYS */;
INSERT INTO `country` VALUES (1,'AD','Andorra'),(2,'AE','United Arab Emirates'),(3,'AF','Afghanistan'),(4,'AG','Antigua and Barbuda'),(5,'AI','Anguilla'),(6,'AL','Albania'),(7,'AM','Armenia'),(8,'AO','Angola'),(9,'AQ','Antarctica'),(10,'AR','Argentina'),(11,'AS','American Samoa'),(12,'AT','Austria'),(13,'AU','Australia'),(14,'AW','Aruba'),(15,'AX','Åland'),(16,'AZ','Azerbaijan'),(17,'BA','Bosnia and Herzegovina'),(18,'BB','Barbados'),(19,'BD','Bangladesh'),(20,'BE','Belgium'),(21,'BF','Burkina Faso'),(22,'BG','Bulgaria'),(23,'BH','Bahrain'),(24,'BI','Burundi'),(25,'BJ','Benin'),(26,'BL','Saint Barthélemy'),(27,'BM','Bermuda'),(28,'BN','Brunei'),(29,'BO','Bolivia'),(30,'BQ','Bonaire'),(31,'BR','Brazil'),(32,'BS','Bahamas'),(33,'BT','Bhutan'),(34,'BV','Bouvet Island'),(35,'BW','Botswana'),(36,'BY','Belarus'),(37,'BZ','Belize'),(38,'CA','Canada'),(39,'CC','Cocos [Keeling] Islands'),(40,'CD','Democratic Republic of the Congo'),(41,'CF','Central African Republic'),(42,'CG','Republic of the Congo'),(43,'CH','Switzerland'),(44,'CI','Ivory Coast'),(45,'CK','Cook Islands'),(46,'CL','Chile'),(47,'CM','Cameroon'),(48,'CN','China'),(49,'CO','Colombia'),(50,'CR','Costa Rica'),(51,'CU','Cuba'),(52,'CV','Cape Verde'),(53,'CW','Curacao'),(54,'CX','Christmas Island'),(55,'CY','Cyprus'),(56,'CZ','Czech Republic'),(57,'DE','Germany'),(58,'DJ','Djibouti'),(59,'DK','Denmark'),(60,'DM','Dominica'),(61,'DO','Dominican Republic'),(62,'DZ','Algeria'),(63,'EC','Ecuador'),(64,'EE','Estonia'),(65,'EG','Egypt'),(66,'EH','Western Sahara'),(67,'ER','Eritrea'),(68,'ES','Spain'),(69,'ET','Ethiopia'),(70,'FI','Finland'),(71,'FJ','Fiji'),(72,'FK','Falkland Islands'),(73,'FM','Micronesia'),(74,'FO','Faroe Islands'),(75,'FR','France'),(76,'GA','Gabon'),(77,'GB','United Kingdom'),(78,'GD','Grenada'),(79,'GE','Georgia'),(80,'GF','French Guiana'),(81,'GG','Guernsey'),(82,'GH','Ghana'),(83,'GI','Gibraltar'),(84,'GL','Greenland'),(85,'GM','Gambia'),(86,'GN','Guinea'),(87,'GP','Guadeloupe'),(88,'GQ','Equatorial Guinea'),(89,'GR','Greece'),(90,'GS','South Georgia and the South Sandwich Islands'),(91,'GT','Guatemala'),(92,'GU','Guam'),(93,'GW','Guinea-Bissau'),(94,'GY','Guyana'),(95,'HK','Hong Kong'),(96,'HM','Heard Island and McDonald Islands'),(97,'HN','Honduras'),(98,'HR','Croatia'),(99,'HT','Haiti'),(100,'HU','Hungary'),(101,'ID','Indonesia'),(102,'IE','Ireland'),(103,'IL','Israel'),(104,'IM','Isle of Man'),(105,'IN','India'),(106,'IO','British Indian Ocean Territory'),(107,'IQ','Iraq'),(108,'IR','Iran'),(109,'IS','Iceland'),(110,'IT','Italy'),(111,'JE','Jersey'),(112,'JM','Jamaica'),(113,'JO','Jordan'),(114,'JP','Japan'),(115,'KE','Kenya'),(116,'KG','Kyrgyzstan'),(117,'KH','Cambodia'),(118,'KI','Kiribati'),(119,'KM','Comoros'),(120,'KN','Saint Kitts and Nevis'),(121,'KP','North Korea'),(122,'KR','South Korea'),(123,'KW','Kuwait'),(124,'KY','Cayman Islands'),(125,'KZ','Kazakhstan'),(126,'LA','Laos'),(127,'LB','Lebanon'),(128,'LC','Saint Lucia'),(129,'LI','Liechtenstein'),(130,'LK','Sri Lanka'),(131,'LR','Liberia'),(132,'LS','Lesotho'),(133,'LT','Lithuania'),(134,'LU','Luxembourg'),(135,'LV','Latvia'),(136,'LY','Libya'),(137,'MA','Morocco'),(138,'MC','Monaco'),(139,'MD','Moldova'),(140,'ME','Montenegro'),(141,'MF','Saint Martin'),(142,'MG','Madagascar'),(143,'MH','Marshall Islands'),(144,'MK','Macedonia'),(145,'ML','Mali'),(146,'MM','Myanmar [Burma]'),(147,'MN','Mongolia'),(148,'MO','Macao'),(149,'MP','Northern Mariana Islands'),(150,'MQ','Martinique'),(151,'MR','Mauritania'),(152,'MS','Montserrat'),(153,'MT','Malta'),(154,'MU','Mauritius'),(155,'MV','Maldives'),(156,'MW','Malawi'),(157,'MX','Mexico'),(158,'MY','Malaysia'),(159,'MZ','Mozambique'),(160,'NA','Namibia'),(161,'NC','New Caledonia'),(162,'NE','Niger'),(163,'NF','Norfolk Island'),(164,'NG','Nigeria'),(165,'NI','Nicaragua'),(166,'NL','Netherlands'),(167,'NO','Norway'),(168,'NP','Nepal'),(169,'NR','Nauru'),(170,'NU','Niue'),(171,'NZ','New Zealand'),(172,'OM','Oman'),(173,'PA','Panama'),(174,'PE','Peru'),(175,'PF','French Polynesia'),(176,'PG','Papua New Guinea'),(177,'PH','Philippines'),(178,'PK','Pakistan'),(179,'PL','Poland'),(180,'PM','Saint Pierre and Miquelon'),(181,'PN','Pitcairn Islands'),(182,'PR','Puerto Rico'),(183,'PS','Palestine'),(184,'PT','Portugal'),(185,'PW','Palau'),(186,'PY','Paraguay'),(187,'QA','Qatar'),(188,'RE','Réunion'),(189,'RO','Romania'),(190,'RS','Serbia'),(191,'RU','Russia'),(192,'RW','Rwanda'),(193,'SA','Saudi Arabia'),(194,'SB','Solomon Islands'),(195,'SC','Seychelles'),(196,'SD','Sudan'),(197,'SE','Sweden'),(198,'SG','Singapore'),(199,'SH','Saint Helena'),(200,'SI','Slovenia'),(201,'SJ','Svalbard and Jan Mayen'),(202,'SK','Slovakia'),(203,'SL','Sierra Leone'),(204,'SM','San Marino'),(205,'SN','Senegal'),(206,'SO','Somalia'),(207,'SR','Suriname'),(208,'SS','South Sudan'),(209,'ST','São Tomé and Príncipe'),(210,'SV','El Salvador'),(211,'SX','Sint Maarten'),(212,'SY','Syria'),(213,'SZ','Swaziland'),(214,'TC','Turks and Caicos Islands'),(215,'TD','Chad'),(216,'TF','French Southern Territories'),(217,'TG','Togo'),(218,'TH','Thailand'),(219,'TJ','Tajikistan'),(220,'TK','Tokelau'),(221,'TL','East Timor'),(222,'TM','Turkmenistan'),(223,'TN','Tunisia'),(224,'TO','Tonga'),(225,'TR','Turkey'),(226,'TT','Trinidad and Tobago'),(227,'TV','Tuvalu'),(228,'TW','Taiwan'),(229,'TZ','Tanzania'),(230,'UA','Ukraine'),(231,'UG','Uganda'),(232,'UM','U.S. Minor Outlying Islands'),(233,'US','United States'),(234,'UY','Uruguay'),(235,'UZ','Uzbekistan'),(236,'VA','Vatican City'),(237,'VC','Saint Vincent and the Grenadines'),(238,'VE','Venezuela'),(239,'VG','British Virgin Islands'),(240,'VI','U.S. Virgin Islands'),(241,'VI','U.S. Virgin Islands'),(242,'VN','Vietnam'),(243,'VU','Vanuatu'),(244,'WF','Wallis and Futuna'),(245,'WS','Samoa'),(246,'XK','Kosovo'),(247,'YE','Yemen'),(248,'YT','Mayotte'),(249,'ZA','South Africa'),(250,'ZM','Zambia'),(251,'ZW','Zimbabwe');
/*!40000 ALTER TABLE `country` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `event`
--

DROP TABLE IF EXISTS `event`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `event` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `item_id` int(10) unsigned NOT NULL,
  `title` varchar(100) NOT NULL,
  `lead` varchar(2000) DEFAULT NULL,
  `body` varchar(10000) NOT NULL,
  `image_id` int(10) unsigned DEFAULT NULL,
  `gallery_id` int(10) unsigned DEFAULT NULL,
  `event_date` date NOT NULL,
  `category_id` int(3) unsigned NOT NULL,
  `published` tinyint(4) unsigned NOT NULL DEFAULT '0',
  `author` varchar(100) NOT NULL,
  `date_created` date NOT NULL,
  `comments` int(10) unsigned DEFAULT '0',
  `views` int(10) unsigned NOT NULL DEFAULT '0',
  `img_path` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `event`
--

LOCK TABLES `event` WRITE;
/*!40000 ALTER TABLE `event` DISABLE KEYS */;
INSERT INTO `event` VALUES (1,11,'\"Beton mahala\" 14. juna ponovo u Zvezdara teatru','Zabranjivana predstava \"Beton mahala\" u režiji Branislava Trifunovića i Rifata Rifatovića koju izvodi grupa mladih glumaca iz Novog Pazara biće zbog velikog interesovanja ponovo izvedena 14. juna u Zvezdara teatru.','Kašnjenje predstave zbog redova ispred biletarnice, prepuno gledalište, ovacije, smeh i aplauz od nekoliko minuta obeležili su majsko gostovanje ove trupe, navodi se u saopštenju Zvezdara teatra. <br><br>Predstava se bavi problemima mladih otvarajući religijska, politička i druga društvena pitanja. Baveći se ovim problemima, predstava suštinski govori o ljubavi. Izazvala je burne reakcije u svojoj sredini. <br><br>Predstava se trenutno nalazi na turneji po gradovima Srbije i regiona, gde se sa velikim uspehom izvodi. <br><br>Smeh, suze i oduševljenje su reakcije koje ova predstava izaziva gde god da se igra. <br><br>Makedonska publika je svoje mišljenje o Beton mahali pretočila u nagradu publike (Grand Prix na Dramskom amaterskom festivalu u Kočanima), a Amar Ćorović je dobio nagradu za najbolju mušku ulogu.',0,0,'2015-06-14',10,1,'Agencija Beta','2015-06-04',1,44,'/resources/img/event/event_11433156667856beton.jpg'),(2,11,'“Balkanski špijun” u Zvezdara teatru na japanskom','Predstavu \"Balkanski špijun” po kultnoj drami Dušana Kovačevića, u prevodu na japanski, premijerno će u Srbiji izvesti pozorišna trupa \"A la place\" iz Tokija u Zvezdara teatru u petak, 29.maja, najavljeno je danas na konferenciji za novinare.','Pozorišna publika u Srbiji u nekoliko gradova moći će da pogleda komad koji je Kovačević pisao pre 35 godina i koji veoma dobro poznaje ali u viđenju japanskih pozorišnih umetnika. <br><br>Lik Ilije Čvorovića, prema rečima autora, prevazišao je sva njegova očekivanja. <br><br>\"Pisao sam ga da špijunira u nekadašnjoj Jugoslaviji a on se ne samo proširio na Evropu, sada ide i špijunira u Japanu\", našalio se Kovačević. <br><br>On je na današnjoj konferenciji za novinare u pozorištu čiji je direktor poželeo dobrodošlicu japanskim umetnicima i rekao da jedva čeka petak da vidi kako predstava izgleda na japanskom. <br><br>Kovačević je istakao da mu je veoma drago što će nakon Beograda predstavu poznatog japanskog pozorišta iz Tokija sa titlom na srpskom videti publika u Novom Sadu, Senti, Užicu i Šapcu i što će imati priliku da na jeziku jedne tradicionalne i sjajne kulture vidi predstavu za koju veruje da su je već gledali, specifičnu za lokalno, balkansko područje. <br><br>Kako će japanski Ilija Čvorović reagovati na poziv na rutinski razgovor sa policijom? Da li će njegov paranoičan nadzor podstanara, koji je najveća pretnja nacionalnoj bezbednosti, biti jednako urnebesan i na japanskom videće pozorišna publika koja dodje na premijeru predstave \"Balkanski špijun\". <br><br>Prema rečima reditelja Sugijama Cjoši koji je ovaj komad prvi put postavio u novembru prošle godine u pozorištu Breht Raum u Tokiju, tekst ima mnogo lokalnih elemenata ali i univerzalnih, ima mnogo probelma koji dotiču savremenog čoveka u Japanu. <br><br>\"To su problemi koje i mi imamo danas, zato sam hteo da japanska publika oseti tu univerzalnost, pokušao sam da sačuvam specifičnu atmosferu Balkana u predstavi, istovremeno je prilagođavajući japanskom stilu života. Kovačevićeva ironija i humor su još tu, a predstavu završavamo u stilu Tenesija Vilijamsa, čistom dramom, rekao je režiser. <br><br>Njegova je želja da u Srbiji, gde je delo napisano, izvedu \"Balkanskog špijuna\" i da vide da li će i srpska publika razumeti njihovu postavku. <br><br>Producent predstave Hirojuki Munešige i direktor pozorišta Crni šator” (Black Tent Theater) rekao je da japanska publika sada već poznaje srpsko pozorište jer je 2009. godine u produkciji ovog teatra u Tokiju izvedena predstava \"Putujuće pozorište Šopalović\" (Ljubomira Simovića) a 2010. godine predstava \"Paviljoni\" (Milene Marković). Prošle godine je izveden Kovačevićev \"Balkanski špijun\". <br><br>On je istakao da japanskim izvodjačima nije lako da izraze delikatnu priču Kovačevića, da izraze suštinu ove drame ali ona nije samo drama o srpskom društvu, već i o svima. <br><br>Predstava se održava uz podršku kompanije Japan Tobacco International (JTI) i Ambasade Japana u Srbiji.',0,0,'2015-05-29',10,1,'Tanjug','2015-06-04',0,5,'/resources/img/event/event_21433156989768balkanski.jpg'),(3,10,'Gudački kvartet Beogradske filharmonije u Parizu','Gudački kvartet Beogradske filharmonije nastupio je u punoj sali u Srpskom kulturnom centru u Parizu, saopšteno je danas iz te institucije.','Publika, naviknuta na koncerte svih stilova i epoha u klasičnoj muzici, s pažnjom je sinoć ispratila Gudački kvartet Dalajraka, malo poznatog francuskog stvaraoca iz doba Revolucije, kao i \"Počasnicu Stevanu Mokranjcu\" Dejana Despića, pre nego što je s puno entuzijazma pozdravila izvodjenje Betovenovog kvarteta pod nazivom \"Harfni\". <br><br>Muzičari Gudačkog kvarteta Beogradske filharmonije su na bis izveli \"Noveletu Orientale\" Aleksandra Glazunova. <br><br>Kvartet su činili Jelena Dragnić (prva violina), Vladan Lončar (druga violina), Boris Brezovac (viola) i Aleksandar Latković (violončelo). <br><br>\"Koncert u Srpskom kulturnom centru u Parizu je za nas čast i jedno novo, lepo iskustvo. To je značajno mesto na kome su nastupali mnogi naši priznati umetnici i nama otvara nove mogućnosti predstavljanja Kvarteta u inostranstvu\", rekao je Lončar. <br><br>Koncert je bio prilika da se zahtevnoj francuskoj publici predstavi reprezentativni deo orkestra Beogradske filharmonije, ali i prilika Kvarteta da promoviše svoj prvi CD van granica naše zemlje.',0,0,'2015-05-30',9,1,'Srpski kulturni centar','2015-06-04',0,8,'/resources/img/event/event_31433157087886gudacki.jpg'),(4,4,'Kikinda Short traži volontere','Festivalu kratke priče Kikinda Short i ove godine su potrebni volonteri iz Kikinde, Beograda i Zrenjanina. Prednost imaju osobe koje znaju engleski, nemački, španski, mađarski, rumunski, slovenački, makedonski ili bugarski jezik. ','Posao volontera će biti da pomognu kako bi se autori kratkih priča što bolje osećali u našoj zemlji. <br><br> Za Beograd će volonteri biti potrebni 30. juna i 4. jula 2015, za Kikindu od 30. juna do 3. jula, a za Zrenjanin 3. jula 2015. <br><br>\r\n Deseti po redu festival kratke priče KIKINDA SHORT će se održati od 1. \r\ndo 4. jula, a organizatori su rešili da naprave omaž i rekapitulaciju \r\nprethodnih festivala, te su ove godine promenili pravilo da na festival \r\nmože da se dođe samo jednom. Pozvani su gosti koji su na ranijim \r\nfestivalima ostavili najsnažnije utiske, bilo na publiku, bilo na \r\norganizatore, ali članovi selektorske komisije su rekli da je ove \r\ngodine bio najveći problem izabrati goste te da bi najrađe pozvali svih \r\n140 autora koji su do sad učestvovali. <br><br> Rok za prijavu za \r\nvolontiranje je 25.06.2015. a prijave se šalju na \r\nsrdjan.papic@kikindashort.org.rs. U prijavi je potrebno navesti osnovne \r\ninformacije o sebi, kratko motivaciono pismo, kao i ime grada u kom se \r\nželi volontirati. <br><br> Više informacija na www.kikindashort.org.rs',0,0,'2015-06-05',8,1,'N.N.','2015-06-05',0,29,'/resources/img/event/event_41433523210005kikinda.jpg'),(5,9,'KKP: Karte za Metalac u nedelju','Ulaznice za prvi meč polufinala plej-ofa košarkaške Superlige Srbije između Partizana i Metalca prodavaće se na dan utakmice u nedelju, 7. juna. ','<p>Utakmica između Partizana i Metalca igra u nedelju od 20.00 u \r\nBeogradu, a ulaznice će se prodavati od 17.00 na blagajnama hale Pionir,\r\n saopštili su \'crno-beli\'. </p><p>Cena ulaznica je 200 dinara za tribine i 400 dinara za parter.  </p>            \r\n            <p>Polufinalna serija se igra na dve dobijene utakmice, a \r\ncrno-beli imaju prednost domaćeg terena. Drugi meč je na programu u 9. \r\njuna u Valjevu.</p>',0,0,'2015-06-05',1,1,'B92','2015-06-05',0,4,'/resources/img/event/event_51433524183628kkp.jpg'),(6,4,'Događaj broj 1','Prvi događaj','<div id=\"lipsum\">\r\n<p>\r\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque \r\nnec est in dui tincidunt ultrices. Quisque auctor cursus nulla, at \r\naliquam arcu interdum at. Sed ac hendrerit lorem, a pretium ante. Mauris\r\n id ante libero. Etiam ullamcorper, ante ac rhoncus hendrerit, enim \r\nlacus rutrum dui, vel euismod est ex a odio. Pellentesque habitant morbi\r\n tristique senectus et netus et malesuada fames ac turpis egestas. In \r\neget diam quis dui volutpat pulvinar ac id orci. Vestibulum vestibulum \r\nlorem a enim blandit semper. Donec bibendum ligula ac metus rutrum, id \r\nposuere diam semper. Mauris non orci aliquet, eleifend ipsum gravida, \r\nmollis sapien. Cras sollicitudin orci suscipit arcu sollicitudin, nec \r\nconvallis eros lobortis. Pellentesque a nunc a enim vestibulum tempus. \r\nAliquam ac finibus ligula. Fusce tempor quis odio vitae dapibus. \r\nSuspendisse potenti. Donec semper odio commodo, efficitur nisi sed, \r\ncondimentum dolor.\r\n</p>\r\n<p>\r\nUt venenatis est enim, a dignissim mi consectetur sit amet. Donec sit \r\namet lacus ultricies, bibendum turpis non, viverra orci. Nam odio quam, \r\nfinibus ac magna quis, malesuada tempor dolor. Aliquam pellentesque \r\negestas eros, et aliquet ante consectetur nec. Vestibulum vitae ex \r\nviverra, tempor odio a, euismod lacus. In finibus odio id dolor \r\nefficitur, non accumsan lorem ultrices. Quisque pulvinar nibh eget augue\r\n luctus pretium. Donec fringilla vehicula nunc id consectetur.\r\n</p>\r\n<p>\r\nCurabitur magna ligula, mollis sit amet enim nec, volutpat ultricies \r\ndolor. Vivamus id urna ut eros luctus consequat. Vestibulum non \r\nullamcorper ex. Fusce convallis tortor eleifend nisi consectetur finibus\r\n eget eleifend erat. Sed cursus dui tincidunt dolor euismod, sed maximus\r\n dui porttitor. Morbi luctus at leo vitae viverra. Nullam at laoreet \r\nmassa, quis imperdiet nulla. Cum sociis natoque penatibus et magnis dis \r\nparturient montes, nascetur ridiculus mus. Duis nec neque lectus.\r\n</p>\r\n<p>\r\nAenean feugiat vel risus in tristique. Cras mattis enim quis libero \r\nbibendum, non scelerisque tellus maximus. Praesent nulla libero, sodales\r\n eu mauris eu, commodo condimentum enim. Aenean volutpat blandit nisl in\r\n aliquam. Nunc malesuada orci quis nulla tristique varius. Donec \r\nplacerat odio nulla, et pharetra odio vestibulum interdum. Phasellus \r\ngravida felis id nisi tincidunt, eu elementum massa euismod. Nulla \r\nviverra lacinia suscipit. Fusce tincidunt justo velit, sed tristique \r\neros malesuada vitae. Sed gravida id odio eu aliquet. Cras a dapibus \r\nleo. Nam non velit ut orci tempor maximus eget ut nunc. In dui nulla, \r\npulvinar at sapien accumsan, ultrices efficitur enim. Cras lobortis \r\nsapien lacinia neque semper, viverra ultrices turpis consectetur. \r\nPhasellus ornare est leo, vel posuere dui porta id.\r\n</p>\r\n<p>\r\nProin rutrum, risus eget eleifend tempor, tellus metus sodales eros, \r\ntincidunt placerat odio leo non risus. Aliquam quis tempus diam, a \r\nvarius elit. Donec interdum leo sem, vel viverra urna ornare quis. Donec\r\n condimentum efficitur erat, nec blandit metus hendrerit ut. \r\nPellentesque viverra, ligula in iaculis hendrerit, augue lacus varius \r\nenim, quis euismod quam quam vel urna. Proin libero dolor, vulputate et \r\nluctus nec, sagittis eget lorem. Nam quis eleifend tortor. Vivamus \r\nlobortis nisi nec nisl porta fringilla. Aliquam tincidunt nisl \r\nsollicitudin, tempor ex eget, aliquam justo.\r\n</p></div>',0,0,'2015-06-23',13,1,'VT','2015-06-14',0,0,'/resources/img/event/event_614342927166733.png'),(7,11,'Drugi događaj','Događaj broj 2','<div id=\"lipsum\">\r\n<p>\r\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque \r\nnec est in dui tincidunt ultrices. Quisque auctor cursus nulla, at \r\naliquam arcu interdum at. Sed ac hendrerit lorem, a pretium ante. Mauris\r\n id ante libero. Etiam ullamcorper, ante ac rhoncus hendrerit, enim \r\nlacus rutrum dui, vel euismod est ex a odio. Pellentesque habitant morbi\r\n tristique senectus et netus et malesuada fames ac turpis egestas. In \r\neget diam quis dui volutpat pulvinar ac id orci. Vestibulum vestibulum \r\nlorem a enim blandit semper. Donec bibendum ligula ac metus rutrum, id \r\nposuere diam semper. Mauris non orci aliquet, eleifend ipsum gravida, \r\nmollis sapien. Cras sollicitudin orci suscipit arcu sollicitudin, nec \r\nconvallis eros lobortis. Pellentesque a nunc a enim vestibulum tempus. \r\nAliquam ac finibus ligula. Fusce tempor quis odio vitae dapibus. \r\nSuspendisse potenti. Donec semper odio commodo, efficitur nisi sed, \r\ncondimentum dolor.\r\n</p>\r\n<p>\r\nUt venenatis est enim, a dignissim mi consectetur sit amet. Donec sit \r\namet lacus ultricies, bibendum turpis non, viverra orci. Nam odio quam, \r\nfinibus ac magna quis, malesuada tempor dolor. Aliquam pellentesque \r\negestas eros, et aliquet ante consectetur nec. Vestibulum vitae ex \r\nviverra, tempor odio a, euismod lacus. In finibus odio id dolor \r\nefficitur, non accumsan lorem ultrices. Quisque pulvinar nibh eget augue\r\n luctus pretium. Donec fringilla vehicula nunc id consectetur.\r\n</p>\r\n<p>\r\nCurabitur magna ligula, mollis sit amet enim nec, volutpat ultricies \r\ndolor. Vivamus id urna ut eros luctus consequat. Vestibulum non \r\nullamcorper ex. Fusce convallis tortor eleifend nisi consectetur finibus\r\n eget eleifend erat. Sed cursus dui tincidunt dolor euismod, sed maximus\r\n dui porttitor. Morbi luctus at leo vitae viverra. Nullam at laoreet \r\nmassa, quis imperdiet nulla. Cum sociis natoque penatibus et magnis dis \r\nparturient montes, nascetur ridiculus mus. Duis nec neque lectus.\r\n</p>\r\n<p>\r\nAenean feugiat vel risus in tristique. Cras mattis enim quis libero \r\nbibendum, non scelerisque tellus maximus. Praesent nulla libero, sodales\r\n eu mauris eu, commodo condimentum enim. Aenean volutpat blandit nisl in\r\n aliquam. Nunc malesuada orci quis nulla tristique varius. Donec \r\nplacerat odio nulla, et pharetra odio vestibulum interdum. Phasellus \r\ngravida felis id nisi tincidunt, eu elementum massa euismod. Nulla \r\nviverra lacinia suscipit. Fusce tincidunt justo velit, sed tristique \r\neros malesuada vitae. Sed gravida id odio eu aliquet. Cras a dapibus \r\nleo. Nam non velit ut orci tempor maximus eget ut nunc. In dui nulla, \r\npulvinar at sapien accumsan, ultrices efficitur enim. Cras lobortis \r\nsapien lacinia neque semper, viverra ultrices turpis consectetur. \r\nPhasellus ornare est leo, vel posuere dui porta id.\r\n</p>\r\n<p>\r\nProin rutrum, risus eget eleifend tempor, tellus metus sodales eros, \r\ntincidunt placerat odio leo non risus. Aliquam quis tempus diam, a \r\nvarius elit. Donec interdum leo sem, vel viverra urna ornare quis. Donec\r\n condimentum efficitur erat, nec blandit metus hendrerit ut. \r\nPellentesque viverra, ligula in iaculis hendrerit, augue lacus varius \r\nenim, quis euismod quam quam vel urna. Proin libero dolor, vulputate et \r\nluctus nec, sagittis eget lorem. Nam quis eleifend tortor. Vivamus \r\nlobortis nisi nec nisl porta fringilla. Aliquam tincidunt nisl \r\nsollicitudin, tempor ex eget, aliquam justo.\r\n</p></div>',0,1,'2015-06-12',18,1,'VT','2015-06-14',0,1,'/resources/img/event/event_21433156989768balkanski.jpg'),(8,4,'Film!','Samo u bioskopu Ušće Cineplexx!','<div id=\"lipsum\">\r\n<p>\r\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque \r\nnec est in dui tincidunt ultrices. Quisque auctor cursus nulla, at \r\naliquam arcu interdum at. Sed ac hendrerit lorem, a pretium ante. Mauris\r\n id ante libero. Etiam ullamcorper, ante ac rhoncus hendrerit, enim \r\nlacus rutrum dui, vel euismod est ex a odio. Pellentesque habitant morbi\r\n tristique senectus et netus et malesuada fames ac turpis egestas. In \r\neget diam quis dui volutpat pulvinar ac id orci. Vestibulum vestibulum \r\nlorem a enim blandit semper. Donec bibendum ligula ac metus rutrum, id \r\nposuere diam semper. Mauris non orci aliquet, eleifend ipsum gravida, \r\nmollis sapien. Cras sollicitudin orci suscipit arcu sollicitudin, nec \r\nconvallis eros lobortis. Pellentesque a nunc a enim vestibulum tempus. \r\nAliquam ac finibus ligula. Fusce tempor quis odio vitae dapibus. \r\nSuspendisse potenti. Donec semper odio commodo, efficitur nisi sed, \r\ncondimentum dolor.\r\n</p>\r\n<p>\r\nUt venenatis est enim, a dignissim mi consectetur sit amet. Donec sit \r\namet lacus ultricies, bibendum turpis non, viverra orci. Nam odio quam, \r\nfinibus ac magna quis, malesuada tempor dolor. Aliquam pellentesque \r\negestas eros, et aliquet ante consectetur nec. Vestibulum vitae ex \r\nviverra, tempor odio a, euismod lacus. In finibus odio id dolor \r\nefficitur, non accumsan lorem ultrices. Quisque pulvinar nibh eget augue\r\n luctus pretium. Donec fringilla vehicula nunc id consectetur.\r\n</p>\r\n<p>\r\nCurabitur magna ligula, mollis sit amet enim nec, volutpat ultricies \r\ndolor. Vivamus id urna ut eros luctus consequat. Vestibulum non \r\nullamcorper ex. Fusce convallis tortor eleifend nisi consectetur finibus\r\n eget eleifend erat. Sed cursus dui tincidunt dolor euismod, sed maximus\r\n dui porttitor. Morbi luctus at leo vitae viverra. Nullam at laoreet \r\nmassa, quis imperdiet nulla. Cum sociis natoque penatibus et magnis dis \r\nparturient montes, nascetur ridiculus mus. Duis nec neque lectus.\r\n</p>\r\n<p>\r\nAenean feugiat vel risus in tristique. Cras mattis enim quis libero \r\nbibendum, non scelerisque tellus maximus. Praesent nulla libero, sodales\r\n eu mauris eu, commodo condimentum enim. Aenean volutpat blandit nisl in\r\n aliquam. Nunc malesuada orci quis nulla tristique varius. Donec \r\nplacerat odio nulla, et pharetra odio vestibulum interdum. Phasellus \r\ngravida felis id nisi tincidunt, eu elementum massa euismod. Nulla \r\nviverra lacinia suscipit. Fusce tincidunt justo velit, sed tristique \r\neros malesuada vitae. Sed gravida id odio eu aliquet. Cras a dapibus \r\nleo. Nam non velit ut orci tempor maximus eget ut nunc. In dui nulla, \r\npulvinar at sapien accumsan, ultrices efficitur enim. Cras lobortis \r\nsapien lacinia neque semper, viverra ultrices turpis consectetur. \r\nPhasellus ornare est leo, vel posuere dui porta id.\r\n</p>\r\n<p>\r\nProin rutrum, risus eget eleifend tempor, tellus metus sodales eros, \r\ntincidunt placerat odio leo non risus. Aliquam quis tempus diam, a \r\nvarius elit. Donec interdum leo sem, vel viverra urna ornare quis. Donec\r\n condimentum efficitur erat, nec blandit metus hendrerit ut. \r\nPellentesque viverra, ligula in iaculis hendrerit, augue lacus varius \r\nenim, quis euismod quam quam vel urna. Proin libero dolor, vulputate et \r\nluctus nec, sagittis eget lorem. Nam quis eleifend tortor. Vivamus \r\nlobortis nisi nec nisl porta fringilla. Aliquam tincidunt nisl \r\nsollicitudin, tempor ex eget, aliquam justo.\r\n</p></div>',0,0,'2015-06-24',13,1,'VT','2015-06-14',0,1,'/resources/img/event/event_81434292824033beton.jpg'),(9,9,'Test događaj br. 1','Test događaj br. 1','<div id=\"lipsum\">\r\n<p>\r\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque \r\nnec est in dui tincidunt ultrices. Quisque auctor cursus nulla, at \r\naliquam arcu interdum at. Sed ac hendrerit lorem, a pretium ante. Mauris\r\n id ante libero. Etiam ullamcorper, ante ac rhoncus hendrerit, enim \r\nlacus rutrum dui, vel euismod est ex a odio. Pellentesque habitant morbi\r\n tristique senectus et netus et malesuada fames ac turpis egestas. In \r\neget diam quis dui volutpat pulvinar ac id orci. Vestibulum vestibulum \r\nlorem a enim blandit semper. Donec bibendum ligula ac metus rutrum, id \r\nposuere diam semper. Mauris non orci aliquet, eleifend ipsum gravida, \r\nmollis sapien. Cras sollicitudin orci suscipit arcu sollicitudin, nec \r\nconvallis eros lobortis. Pellentesque a nunc a enim vestibulum tempus. \r\nAliquam ac finibus ligula. Fusce tempor quis odio vitae dapibus. \r\nSuspendisse potenti. Donec semper odio commodo, efficitur nisi sed, \r\ncondimentum dolor.\r\n</p>\r\n<p>\r\nUt venenatis est enim, a dignissim mi consectetur sit amet. Donec sit \r\namet lacus ultricies, bibendum turpis non, viverra orci. Nam odio quam, \r\nfinibus ac magna quis, malesuada tempor dolor. Aliquam pellentesque \r\negestas eros, et aliquet ante consectetur nec. Vestibulum vitae ex \r\nviverra, tempor odio a, euismod lacus. In finibus odio id dolor \r\nefficitur, non accumsan lorem ultrices. Quisque pulvinar nibh eget augue\r\n luctus pretium. Donec fringilla vehicula nunc id consectetur.\r\n</p>\r\n<p>\r\nCurabitur magna ligula, mollis sit amet enim nec, volutpat ultricies \r\ndolor. Vivamus id urna ut eros luctus consequat. Vestibulum non \r\nullamcorper ex. Fusce convallis tortor eleifend nisi consectetur finibus\r\n eget eleifend erat. Sed cursus dui tincidunt dolor euismod, sed maximus\r\n dui porttitor. Morbi luctus at leo vitae viverra. Nullam at laoreet \r\nmassa, quis imperdiet nulla. Cum sociis natoque penatibus et magnis dis \r\nparturient montes, nascetur ridiculus mus. Duis nec neque lectus.\r\n</p>\r\n<p>\r\nAenean feugiat vel risus in tristique. Cras mattis enim quis libero \r\nbibendum, non scelerisque tellus maximus. Praesent nulla libero, sodales\r\n eu mauris eu, commodo condimentum enim. Aenean volutpat blandit nisl in\r\n aliquam. Nunc malesuada orci quis nulla tristique varius. Donec \r\nplacerat odio nulla, et pharetra odio vestibulum interdum. Phasellus \r\ngravida felis id nisi tincidunt, eu elementum massa euismod. Nulla \r\nviverra lacinia suscipit. Fusce tincidunt justo velit, sed tristique \r\neros malesuada vitae. Sed gravida id odio eu aliquet. Cras a dapibus \r\nleo. Nam non velit ut orci tempor maximus eget ut nunc. In dui nulla, \r\npulvinar at sapien accumsan, ultrices efficitur enim. Cras lobortis \r\nsapien lacinia neque semper, viverra ultrices turpis consectetur. \r\nPhasellus ornare est leo, vel posuere dui porta id.\r\n</p>\r\n<p>\r\nProin rutrum, risus eget eleifend tempor, tellus metus sodales eros, \r\ntincidunt placerat odio leo non risus. Aliquam quis tempus diam, a \r\nvarius elit. Donec interdum leo sem, vel viverra urna ornare quis. Donec\r\n condimentum efficitur erat, nec blandit metus hendrerit ut. \r\nPellentesque viverra, ligula in iaculis hendrerit, augue lacus varius \r\nenim, quis euismod quam quam vel urna. Proin libero dolor, vulputate et \r\nluctus nec, sagittis eget lorem. Nam quis eleifend tortor. Vivamus \r\nlobortis nisi nec nisl porta fringilla. Aliquam tincidunt nisl \r\nsollicitudin, tempor ex eget, aliquam justo.\r\n</p></div>',0,0,'2015-06-24',8,1,'VT','2015-06-14',0,3,'/resources/img/event/event_614342927166733.png'),(10,9,'Test događaj br. 2','Test događaj br. 2','<div id=\"lipsum\">\r\n<p>\r\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque \r\nnec est in dui tincidunt ultrices. Quisque auctor cursus nulla, at \r\naliquam arcu interdum at. Sed ac hendrerit lorem, a pretium ante. Mauris\r\n id ante libero. Etiam ullamcorper, ante ac rhoncus hendrerit, enim \r\nlacus rutrum dui, vel euismod est ex a odio. Pellentesque habitant morbi\r\n tristique senectus et netus et malesuada fames ac turpis egestas. In \r\neget diam quis dui volutpat pulvinar ac id orci. Vestibulum vestibulum \r\nlorem a enim blandit semper. Donec bibendum ligula ac metus rutrum, id \r\nposuere diam semper. Mauris non orci aliquet, eleifend ipsum gravida, \r\nmollis sapien. Cras sollicitudin orci suscipit arcu sollicitudin, nec \r\nconvallis eros lobortis. Pellentesque a nunc a enim vestibulum tempus. \r\nAliquam ac finibus ligula. Fusce tempor quis odio vitae dapibus. \r\nSuspendisse potenti. Donec semper odio commodo, efficitur nisi sed, \r\ncondimentum dolor.\r\n</p>\r\n<p>\r\nUt venenatis est enim, a dignissim mi consectetur sit amet. Donec sit \r\namet lacus ultricies, bibendum turpis non, viverra orci. Nam odio quam, \r\nfinibus ac magna quis, malesuada tempor dolor. Aliquam pellentesque \r\negestas eros, et aliquet ante consectetur nec. Vestibulum vitae ex \r\nviverra, tempor odio a, euismod lacus. In finibus odio id dolor \r\nefficitur, non accumsan lorem ultrices. Quisque pulvinar nibh eget augue\r\n luctus pretium. Donec fringilla vehicula nunc id consectetur.\r\n</p>\r\n<p>\r\nCurabitur magna ligula, mollis sit amet enim nec, volutpat ultricies \r\ndolor. Vivamus id urna ut eros luctus consequat. Vestibulum non \r\nullamcorper ex. Fusce convallis tortor eleifend nisi consectetur finibus\r\n eget eleifend erat. Sed cursus dui tincidunt dolor euismod, sed maximus\r\n dui porttitor. Morbi luctus at leo vitae viverra. Nullam at laoreet \r\nmassa, quis imperdiet nulla. Cum sociis natoque penatibus et magnis dis \r\nparturient montes, nascetur ridiculus mus. Duis nec neque lectus.\r\n</p>\r\n<p>\r\nAenean feugiat vel risus in tristique. Cras mattis enim quis libero \r\nbibendum, non scelerisque tellus maximus. Praesent nulla libero, sodales\r\n eu mauris eu, commodo condimentum enim. Aenean volutpat blandit nisl in\r\n aliquam. Nunc malesuada orci quis nulla tristique varius. Donec \r\nplacerat odio nulla, et pharetra odio vestibulum interdum. Phasellus \r\ngravida felis id nisi tincidunt, eu elementum massa euismod. Nulla \r\nviverra lacinia suscipit. Fusce tincidunt justo velit, sed tristique \r\neros malesuada vitae. Sed gravida id odio eu aliquet. Cras a dapibus \r\nleo. Nam non velit ut orci tempor maximus eget ut nunc. In dui nulla, \r\npulvinar at sapien accumsan, ultrices efficitur enim. Cras lobortis \r\nsapien lacinia neque semper, viverra ultrices turpis consectetur. \r\nPhasellus ornare est leo, vel posuere dui porta id.\r\n</p>\r\n<p>\r\nProin rutrum, risus eget eleifend tempor, tellus metus sodales eros, \r\ntincidunt placerat odio leo non risus. Aliquam quis tempus diam, a \r\nvarius elit. Donec interdum leo sem, vel viverra urna ornare quis. Donec\r\n condimentum efficitur erat, nec blandit metus hendrerit ut. \r\nPellentesque viverra, ligula in iaculis hendrerit, augue lacus varius \r\nenim, quis euismod quam quam vel urna. Proin libero dolor, vulputate et \r\nluctus nec, sagittis eget lorem. Nam quis eleifend tortor. Vivamus \r\nlobortis nisi nec nisl porta fringilla. Aliquam tincidunt nisl \r\nsollicitudin, tempor ex eget, aliquam justo.\r\n</p></div>',0,0,'2015-06-22',9,1,'VT','2015-06-14',0,2,'/resources/img/event/event_51433524183628kkp.jpg'),(11,10,'Test događaj br. 3','Test događaj br. 3','<div id=\"lipsum\">\r\n<p>\r\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque \r\nnec est in dui tincidunt ultrices. Quisque auctor cursus nulla, at \r\naliquam arcu interdum at. Sed ac hendrerit lorem, a pretium ante. Mauris\r\n id ante libero. Etiam ullamcorper, ante ac rhoncus hendrerit, enim \r\nlacus rutrum dui, vel euismod est ex a odio. Pellentesque habitant morbi\r\n tristique senectus et netus et malesuada fames ac turpis egestas. In \r\neget diam quis dui volutpat pulvinar ac id orci. Vestibulum vestibulum \r\nlorem a enim blandit semper. Donec bibendum ligula ac metus rutrum, id \r\nposuere diam semper. Mauris non orci aliquet, eleifend ipsum gravida, \r\nmollis sapien. Cras sollicitudin orci suscipit arcu sollicitudin, nec \r\nconvallis eros lobortis. Pellentesque a nunc a enim vestibulum tempus. \r\nAliquam ac finibus ligula. Fusce tempor quis odio vitae dapibus. \r\nSuspendisse potenti. Donec semper odio commodo, efficitur nisi sed, \r\ncondimentum dolor.\r\n</p>\r\n<p>\r\nUt venenatis est enim, a dignissim mi consectetur sit amet. Donec sit \r\namet lacus ultricies, bibendum turpis non, viverra orci. Nam odio quam, \r\nfinibus ac magna quis, malesuada tempor dolor. Aliquam pellentesque \r\negestas eros, et aliquet ante consectetur nec. Vestibulum vitae ex \r\nviverra, tempor odio a, euismod lacus. In finibus odio id dolor \r\nefficitur, non accumsan lorem ultrices. Quisque pulvinar nibh eget augue\r\n luctus pretium. Donec fringilla vehicula nunc id consectetur.\r\n</p>\r\n<p>\r\nCurabitur magna ligula, mollis sit amet enim nec, volutpat ultricies \r\ndolor. Vivamus id urna ut eros luctus consequat. Vestibulum non \r\nullamcorper ex. Fusce convallis tortor eleifend nisi consectetur finibus\r\n eget eleifend erat. Sed cursus dui tincidunt dolor euismod, sed maximus\r\n dui porttitor. Morbi luctus at leo vitae viverra. Nullam at laoreet \r\nmassa, quis imperdiet nulla. Cum sociis natoque penatibus et magnis dis \r\nparturient montes, nascetur ridiculus mus. Duis nec neque lectus.\r\n</p>\r\n<p>\r\nAenean feugiat vel risus in tristique. Cras mattis enim quis libero \r\nbibendum, non scelerisque tellus maximus. Praesent nulla libero, sodales\r\n eu mauris eu, commodo condimentum enim. Aenean volutpat blandit nisl in\r\n aliquam. Nunc malesuada orci quis nulla tristique varius. Donec \r\nplacerat odio nulla, et pharetra odio vestibulum interdum. Phasellus \r\ngravida felis id nisi tincidunt, eu elementum massa euismod. Nulla \r\nviverra lacinia suscipit. Fusce tincidunt justo velit, sed tristique \r\neros malesuada vitae. Sed gravida id odio eu aliquet. Cras a dapibus \r\nleo. Nam non velit ut orci tempor maximus eget ut nunc. In dui nulla, \r\npulvinar at sapien accumsan, ultrices efficitur enim. Cras lobortis \r\nsapien lacinia neque semper, viverra ultrices turpis consectetur. \r\nPhasellus ornare est leo, vel posuere dui porta id.\r\n</p>\r\n<p>\r\nProin rutrum, risus eget eleifend tempor, tellus metus sodales eros, \r\ntincidunt placerat odio leo non risus. Aliquam quis tempus diam, a \r\nvarius elit. Donec interdum leo sem, vel viverra urna ornare quis. Donec\r\n condimentum efficitur erat, nec blandit metus hendrerit ut. \r\nPellentesque viverra, ligula in iaculis hendrerit, augue lacus varius \r\nenim, quis euismod quam quam vel urna. Proin libero dolor, vulputate et \r\nluctus nec, sagittis eget lorem. Nam quis eleifend tortor. Vivamus \r\nlobortis nisi nec nisl porta fringilla. Aliquam tincidunt nisl \r\nsollicitudin, tempor ex eget, aliquam justo.\r\n</p></div>',0,1,'2015-06-23',13,1,'VT','2015-06-14',0,3,'/resources/img/event/event_41433523210005kikinda.jpg'),(12,10,'Test događaj br. 4','Test događaj br. 4','<div id=\"lipsum\">\r\n<p>\r\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque \r\nnec est in dui tincidunt ultrices. Quisque auctor cursus nulla, at \r\naliquam arcu interdum at. Sed ac hendrerit lorem, a pretium ante. Mauris\r\n id ante libero. Etiam ullamcorper, ante ac rhoncus hendrerit, enim \r\nlacus rutrum dui, vel euismod est ex a odio. Pellentesque habitant morbi\r\n tristique senectus et netus et malesuada fames ac turpis egestas. In \r\neget diam quis dui volutpat pulvinar ac id orci. Vestibulum vestibulum \r\nlorem a enim blandit semper. Donec bibendum ligula ac metus rutrum, id \r\nposuere diam semper. Mauris non orci aliquet, eleifend ipsum gravida, \r\nmollis sapien. Cras sollicitudin orci suscipit arcu sollicitudin, nec \r\nconvallis eros lobortis. Pellentesque a nunc a enim vestibulum tempus. \r\nAliquam ac finibus ligula. Fusce tempor quis odio vitae dapibus. \r\nSuspendisse potenti. Donec semper odio commodo, efficitur nisi sed, \r\ncondimentum dolor.\r\n</p>\r\n<p>\r\nUt venenatis est enim, a dignissim mi consectetur sit amet. Donec sit \r\namet lacus ultricies, bibendum turpis non, viverra orci. Nam odio quam, \r\nfinibus ac magna quis, malesuada tempor dolor. Aliquam pellentesque \r\negestas eros, et aliquet ante consectetur nec. Vestibulum vitae ex \r\nviverra, tempor odio a, euismod lacus. In finibus odio id dolor \r\nefficitur, non accumsan lorem ultrices. Quisque pulvinar nibh eget augue\r\n luctus pretium. Donec fringilla vehicula nunc id consectetur.\r\n</p>\r\n<p>\r\nCurabitur magna ligula, mollis sit amet enim nec, volutpat ultricies \r\ndolor. Vivamus id urna ut eros luctus consequat. Vestibulum non \r\nullamcorper ex. Fusce convallis tortor eleifend nisi consectetur finibus\r\n eget eleifend erat. Sed cursus dui tincidunt dolor euismod, sed maximus\r\n dui porttitor. Morbi luctus at leo vitae viverra. Nullam at laoreet \r\nmassa, quis imperdiet nulla. Cum sociis natoque penatibus et magnis dis \r\nparturient montes, nascetur ridiculus mus. Duis nec neque lectus.\r\n</p>\r\n<p>\r\nAenean feugiat vel risus in tristique. Cras mattis enim quis libero \r\nbibendum, non scelerisque tellus maximus. Praesent nulla libero, sodales\r\n eu mauris eu, commodo condimentum enim. Aenean volutpat blandit nisl in\r\n aliquam. Nunc malesuada orci quis nulla tristique varius. Donec \r\nplacerat odio nulla, et pharetra odio vestibulum interdum. Phasellus \r\ngravida felis id nisi tincidunt, eu elementum massa euismod. Nulla \r\nviverra lacinia suscipit. Fusce tincidunt justo velit, sed tristique \r\neros malesuada vitae. Sed gravida id odio eu aliquet. Cras a dapibus \r\nleo. Nam non velit ut orci tempor maximus eget ut nunc. In dui nulla, \r\npulvinar at sapien accumsan, ultrices efficitur enim. Cras lobortis \r\nsapien lacinia neque semper, viverra ultrices turpis consectetur. \r\nPhasellus ornare est leo, vel posuere dui porta id.\r\n</p>\r\n<p>\r\nProin rutrum, risus eget eleifend tempor, tellus metus sodales eros, \r\ntincidunt placerat odio leo non risus. Aliquam quis tempus diam, a \r\nvarius elit. Donec interdum leo sem, vel viverra urna ornare quis. Donec\r\n condimentum efficitur erat, nec blandit metus hendrerit ut. \r\nPellentesque viverra, ligula in iaculis hendrerit, augue lacus varius \r\nenim, quis euismod quam quam vel urna. Proin libero dolor, vulputate et \r\nluctus nec, sagittis eget lorem. Nam quis eleifend tortor. Vivamus \r\nlobortis nisi nec nisl porta fringilla. Aliquam tincidunt nisl \r\nsollicitudin, tempor ex eget, aliquam justo.\r\n</p></div>',0,0,'2015-06-21',18,1,'VT','2015-06-14',0,4,'/resources/img/event/event_31433157087886gudacki.jpg');
/*!40000 ALTER TABLE `event` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `event_category`
--

DROP TABLE IF EXISTS `event_category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `event_category` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `parent_id` int(10) unsigned NOT NULL,
  `name` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `event_category`
--

LOCK TABLES `event_category` WRITE;
/*!40000 ALTER TABLE `event_category` DISABLE KEYS */;
INSERT INTO `event_category` VALUES (1,0,'Sport'),(2,1,'Fudbal'),(3,1,'Košarka'),(4,1,'Odbojka'),(5,1,'Rukomet'),(6,1,'Tenis'),(7,1,'Vaterpolo'),(8,0,'Kultura'),(9,8,'Koncerti'),(10,8,'Pozorište'),(11,8,'Opera'),(12,8,'Predstave'),(13,8,'Filmovi'),(14,0,'Politika'),(15,14,'Vesti iz zemlje'),(16,14,'Vesti iz sveta'),(17,0,'Crna hronika'),(18,0,'Zabava'),(19,18,'Horoskop'),(20,18,'Hrana i piće'),(21,18,'Enigmatika'),(22,18,'Ljubimci');
/*!40000 ALTER TABLE `event_category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gallery`
--

DROP TABLE IF EXISTS `gallery`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `gallery` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `title` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gallery`
--

LOCK TABLES `gallery` WRITE;
/*!40000 ALTER TABLE `gallery` DISABLE KEYS */;
INSERT INTO `gallery` VALUES (1,'Gledaoci reporteri 1'),(2,'Derbi');
/*!40000 ALTER TABLE `gallery` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gallery_images`
--

DROP TABLE IF EXISTS `gallery_images`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `gallery_images` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `gallery_id` int(10) unsigned NOT NULL,
  `image_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gallery_images`
--

LOCK TABLES `gallery_images` WRITE;
/*!40000 ALTER TABLE `gallery_images` DISABLE KEYS */;
/*!40000 ALTER TABLE `gallery_images` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `image`
--

DROP TABLE IF EXISTS `image`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `image` (
  `id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
  `title` varchar(100) DEFAULT NULL,
  `img_path` varchar(200) NOT NULL,
  `gallery_id` mediumint(8) unsigned NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `image`
--

LOCK TABLES `image` WRITE;
/*!40000 ALTER TABLE `image` DISABLE KEYS */;
INSERT INTO `image` VALUES (1,'','/resources/img/gallery/gallery_11433151531833Chrysanthemum.jpg',1),(2,'','/resources/img/gallery/gallery_11433151555126Desert.jpg',1),(3,'','/resources/img/gallery/gallery_11433151799328Hydrangeas.jpg',1),(4,'','/resources/img/gallery/gallery_11433152018270Jellyfish.jpg',1),(5,'','/resources/img/gallery/gallery_11433152060988Koala.jpg',1),(6,'','/resources/img/gallery/gallery_11433152230788Lighthouse.jpg',1),(7,'','/resources/img/gallery/gallery_11433152320328Penguins.jpg',1),(8,'','/resources/img/gallery/gallery_11433235639005Tulips.jpg',1),(9,'','/resources/img/gallery/gallery_214334068215032dv279l.jpg',2),(10,'','/resources/img/gallery/gallery_214334068267228_wall_grobari.jpg',2),(11,'','/resources/img/gallery/gallery_21433406832269316072_1.jpg',2),(12,'','/resources/img/gallery/gallery_2143340683625723541589.jpg',2),(13,'','/resources/img/gallery/gallery_214334068457898766134846_a1ac903452_b.jpg',2),(14,'','/resources/img/gallery/gallery_214334068572558763531473_070eef5a5b_b.jpg',2),(15,'','/resources/img/gallery/gallery_21433406862052Delije_sever.jpg',2),(16,'','/resources/img/gallery/gallery_21433406865708partizan_1024x768.jpg',2);
/*!40000 ALTER TABLE `image` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `index_part`
--

DROP TABLE IF EXISTS `index_part`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `index_part` (
  `id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
  `part_id` mediumint(8) unsigned NOT NULL,
  `ord` int(10) unsigned NOT NULL,
  `width` int(10) unsigned NOT NULL,
  `right` tinyint(1) unsigned NOT NULL,
  `toplist_id` mediumint(8) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `index_part`
--

LOCK TABLES `index_part` WRITE;
/*!40000 ALTER TABLE `index_part` DISABLE KEYS */;
/*!40000 ALTER TABLE `index_part` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `item`
--

DROP TABLE IF EXISTS `item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `item` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `parent_id` int(10) unsigned NOT NULL,
  `level` int(5) unsigned NOT NULL,
  `type_id` int(3) unsigned NOT NULL,
  `name` varchar(100) NOT NULL,
  `published` tinyint(1) unsigned NOT NULL DEFAULT '0',
  `primary_navigation` tinyint(1) unsigned NOT NULL DEFAULT '1',
  `secondary_navigation` tinyint(1) unsigned NOT NULL DEFAULT '1',
  `content_id` int(10) unsigned DEFAULT NULL,
  `img_path` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item`
--

LOCK TABLES `item` WRITE;
/*!40000 ALTER TABLE `item` DISABLE KEYS */;
INSERT INTO `item` VALUES (1,0,0,1,'Index',1,1,1,0,'/resources/img/item/item_114334166023525.png'),(2,1,1,2,'Kontakt',1,1,1,0,'/resources/img/item/item_21433416747774horoskop.jpg'),(3,1,1,10,'Sport',1,1,1,0,'/resources/img/item/item_3143341671538310428076_831186643629583_754157176763836008_n.jpg'),(4,1,1,6,'Kultura',1,1,1,0,'/resources/img/item/item_41433416684461gudacki.jpg'),(5,1,1,5,'Politika',1,1,1,0,'/resources/img/item/item_5143341669130595943301854e42d016bc07716055226_v4 big.jpg'),(6,1,1,3,'Gledaoci reporteri',1,1,1,1,'/resources/img/item/item_614334166645408.png'),(7,3,2,5,'Fudbal',1,1,1,0,'/resources/img/item/item_7143341673661811390544_830704850344429_503510662749518524_n.jpg'),(8,3,2,5,'Košarka',1,1,1,0,'/resources/img/item/item_814334167223686.jpg'),(9,3,2,6,'Najave utakmica',1,1,1,0,'/resources/img/item/item_9143341672949311182081_817517221663192_2971236353096082468_n.jpg'),(10,4,2,6,'Koncerti',1,1,1,0,'/resources/img/item/item_101433416708930balkanski.jpg'),(11,4,2,6,'Pozorište',1,1,1,0,'/resources/img/item/item_111433416701118beton.jpg'),(12,1,1,8,'Vest dana',1,1,1,1,'/resources/img/item/item_1214334166463052.gif'),(13,1,1,4,'Priče čitalaca',1,1,1,0,'/resources/img/item/item_1314334166400861.png'),(14,1,1,21,'Reč urednika',1,1,1,0,'/resources/img/item/item_1414334166589937.png'),(15,10,3,3,'Test galerija',1,1,1,1,'/resources/img/item/item_1514334371015889.png'),(16,10,3,7,'Test strana',1,1,1,1,'/resources/img/item/item_1614335160868545.png'),(17,1,1,4,'Zanimljivosti',1,1,1,0,'/resources/img/item/item_171433521954158ime.jpg'),(18,5,2,5,'Vesti iz zemlje',1,1,1,0,'/resources/img/item/item_181433522737113okupljanje.jpg'),(19,1,1,9,'Događaj godine!',1,1,1,3,'/resources/img/item/item_191436604427098beton.jpg'),(20,1,1,7,'Priča nedelje',1,1,1,5,'/resources/img/item/item_2014366044954896.jpg');
/*!40000 ALTER TABLE `item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `item_type`
--

DROP TABLE IF EXISTS `item_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `item_type` (
  `id` int(3) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item_type`
--

LOCK TABLES `item_type` WRITE;
/*!40000 ALTER TABLE `item_type` DISABLE KEYS */;
INSERT INTO `item_type` VALUES (1,'Index'),(2,'Contact'),(3,'Gallery'),(4,'PageHolder'),(5,'NewsHolder'),(6,'EventHolder'),(7,'Page'),(8,'News'),(9,'Event'),(10,'NoContent'),(20,'UserPart'),(21,'UserPartHolder');
/*!40000 ALTER TABLE `item_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `message`
--

DROP TABLE IF EXISTS `message`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `message` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `from_id` int(10) unsigned NOT NULL,
  `to_id` int(10) unsigned NOT NULL,
  `date` datetime NOT NULL,
  `subject` varchar(100) DEFAULT NULL,
  `body` varchar(2000) NOT NULL,
  `msg_read` tinyint(1) unsigned NOT NULL DEFAULT '0',
  `folder_id` int(10) unsigned DEFAULT NULL,
  `owner_id` mediumint(8) unsigned NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `message`
--

LOCK TABLES `message` WRITE;
/*!40000 ALTER TABLE `message` DISABLE KEYS */;
INSERT INTO `message` VALUES (1,4,0,'2015-06-02 00:00:00','','',0,2,4),(2,4,0,'2015-06-02 00:00:00','','',0,2,4),(3,2,1,'2015-06-02 00:00:00','Poruka 1','Test poruka 1<br>',0,3,2),(4,2,3,'2015-06-02 00:00:00','Poruka 2','Test poruka 2<br>',0,999,2),(5,2,3,'2015-06-02 00:00:00','Poruka 2','Test poruka 2<br>',1,1,3),(6,2,1,'2015-06-02 00:00:00','Poruka 1','Test poruka 1<br>',1,1,1),(7,1,2,'2015-06-02 00:00:00','RE: Poruka 1','Odgovor na poruku 1<br><br>=== On Tue, 2 Jun 2015 00:00:00, user wrote: ===<br>Test poruka 1<br>',1,3,1),(8,1,2,'2015-06-02 00:00:00','RE: Poruka 1','Odgovor na poruku 1<br><br>=== On Tue, 2 Jun 2015 00:00:00, user wrote: ===<br>Test poruka 1<br>',0,1,2),(9,2,1,'2015-06-07 00:00:00','Test poruka','Samo da nešto bude u Inboxu<br>',0,3,2),(10,2,1,'2015-06-07 00:00:00','Test poruka','Samo da nešto bude u Inboxu<br>',1,1,1),(11,1,2,'2015-06-07 00:00:00','RE: Test poruka','Evo odgovora, da i ti imaš nešto u inboxu<br><br>=== On Sun, 7 Jun 2015 00:00:00, user wrote: ===<br>Samo da nešto bude u Inboxu<br>',1,3,1),(12,1,2,'2015-06-07 00:00:00','RE: Test poruka','Evo odgovora, da i ti imaš nešto u inboxu<br><br>=== On Sun, 7 Jun 2015 00:00:00, user wrote: ===<br>Samo da nešto bude u Inboxu<br>',1,1,2),(13,2,1,'2015-06-14 00:00:00','Poruka sa mobilnog','Test',0,4,2),(14,2,1,'2015-06-14 00:00:00','Poruka sa mobilnog','Test',0,1,1),(15,1,2,'2015-06-14 00:00:00','RE: Poruka sa mobilnog','Sve je ok, test poruka primljena<br><br>=== On Sun, 14 Jun 2015 00:00:00, user wrote: ===<br>Test',1,3,1),(16,1,2,'2015-06-14 00:00:00','RE: Poruka sa mobilnog','Sve je ok, test poruka primljena<br><br>=== On Sun, 14 Jun 2015 00:00:00, user wrote: ===<br>Test',1,1,2),(17,1,2,'2015-06-14 00:00:00','Opet...','Još jedna poruka za mobilni<br>',0,3,1),(18,1,2,'2015-06-14 00:00:00','TEST123','TEST123',0,3,1),(19,1,1,'2015-06-14 00:00:00','TEST321','Test poruka za brisanje<br>',1,3,1),(20,1,1,'2015-06-14 00:00:00','TEST321','Test poruka za brisanje<br>',0,4,1),(21,1,2,'2015-06-14 00:00:00','TEST555','Još jedna test poruka za brisanje<br>',0,3,1),(22,1,2,'2015-06-14 00:00:00','TEST555','Još jedna test poruka za brisanje<br>',1,999,2),(23,2,0,'2015-06-14 00:00:00','','',0,2,2),(24,2,1,'2015-06-14 00:00:00','RE: RE: Poruka 1','Radi :)<br><br>=== On Tue, 2 Jun 2015 00:00:00, admin wrote: ===<br>Odgovor na poruku 1<br><br>=== On Tue, 2 Jun 2015 00:00:00, user wrote: ===<br>Test poruka 1<br>',0,3,2),(25,2,1,'2015-06-14 00:00:00','RE: RE: Poruka 1','Radi :)<br><br>=== On Tue, 2 Jun 2015 00:00:00, admin wrote: ===<br>Odgovor na poruku 1<br><br>=== On Tue, 2 Jun 2015 00:00:00, user wrote: ===<br>Test poruka 1<br>',0,1,1),(26,2,1,'2015-06-14 00:00:00','RE: RE: Poruka 1','<br><br>=== On Tue, 2 Jun 2015 00:00:00, admin wrote: ===<br>Odgovor na poruku 1<br><br>=== On Tue, 2 Jun 2015 00:00:00, user wrote: ===<br>Test poruka 1<br>',0,2,2),(27,1,0,'2015-06-14 00:00:00','','',0,2,1);
/*!40000 ALTER TABLE `message` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `message_folder`
--

DROP TABLE IF EXISTS `message_folder`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `message_folder` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `message_folder`
--

LOCK TABLES `message_folder` WRITE;
/*!40000 ALTER TABLE `message_folder` DISABLE KEYS */;
INSERT INTO `message_folder` VALUES (1,'Inbox'),(2,'Drafts'),(3,'Sent'),(4,'Deleted');
/*!40000 ALTER TABLE `message_folder` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `news`
--

DROP TABLE IF EXISTS `news`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `news` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `item_id` int(10) unsigned NOT NULL,
  `title` varchar(100) NOT NULL,
  `lead` varchar(2000) DEFAULT NULL,
  `body` varchar(10000) NOT NULL,
  `image_id` int(10) unsigned DEFAULT NULL,
  `gallery_id` int(10) unsigned DEFAULT NULL,
  `author` varchar(100) NOT NULL DEFAULT 'Admin',
  `date_created` datetime NOT NULL,
  `date_modified` datetime DEFAULT NULL,
  `category_id` int(3) unsigned NOT NULL,
  `published` tinyint(1) unsigned NOT NULL DEFAULT '0',
  `comments` int(10) unsigned DEFAULT '0',
  `views` int(10) unsigned NOT NULL DEFAULT '0',
  `img_path` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `news`
--

LOCK TABLES `news` WRITE;
/*!40000 ALTER TABLE `news` DISABLE KEYS */;
INSERT INTO `news` VALUES (1,0,'Horoskop za jun: Očekuju vas velike promene','Pročitajte šta nas očekuje u junu...','Tokom ovog meseca imamo više značajnih planetarnih prelaza koji će doneti drugačiji tip energije nego što je to bilo u maju. Jun započinjemo sa Mesecom u znaku Škorpije, prirodnom polju kriza, promena, turbulencije, ali i karmičkih ljubavi, strasti. Na svom prelasku u znak Strelca „sudariće“ se sa retrogradnim Saturnom, nosiocem težine, blokada, ograničenja i karmičkih dugova i odmah posle toga postati Pun Mesec. Strelac je znak oslobođenja, pa je simbolika očigledna – neke karmičke priče (emotivne ili životne situacije) u procesu su završetka. Pun Mesec donosi baš to – vrhunac dešavanja i posle toga opadanje i nestajanje.....Vreme je da se neke stvari ostave za sobom i period pred nama nagoveštava poslednju fazu vraćanja dugova. Krug je pri završetku. <br><br>To potvrđuje i ponovni ulazak Saturna u znak Škorpije 15.-og juna. U svom retrogradnom kretanju u ovom znaku pred nama je još jedna, poslednja šansa da sa nekim stvarima završimo zauvek, da se naučimo odgovornosti prvenstveno prema sebi i prema onome što nam je važno. Ova prilika će biti otvorena i aktuelna do polovine septembra kada Saturn napušta Škorpiju. <br><br>U međuvremenu će Venera preći u znak Lava 7.-og juna hitajući ka konjukciji sa Jupiterom koja će postati aktuelna pred kraj ovog meseca i obeležiti ceo idući. Aspekt velike sreće, velikih ljubavnih dešavanja, velikih pozitivnih pomaka na polju novca, još jedna naznaka da posle kiše uvek dolazi Sunce....dugo je ova kiša trajala, tako da ne sumnjam da ste nestrpljivi, baš kao i ja....no, samo još malo! <br><br>I Merkur kreće direktnim hodom 11.-og juna u znaku Blizanaca....vratili smo neke dugove, ponovo smo pokrenuli neke priče, borili smo se sa problemima u komunikaciji, u saobraćaju, sa tehničkim sredstvima – vreme je da stvari počnu da se vraćaju na svoje mesto.... <br><br>Od polovine juna postaje aktuelan i trigon Urana iz znaka Ovna i Jupitera iz znaka Lava – neočekivani preokreti, neočekivane povoljne okolnosti koje menjaju situaciju....aspekt iznenadnih promena na bolje....nije loše, jel da? <br><br>Pun Mesec u znaku Blizanaca 18.-og, u znaku koji vlada mislima, pokretom, komunikacijom, doneće nove početke na jedan lakši i lepršaviji način. Sve je spremno, jedna velika pozornica je otvorena za nova dešavanja, ostaje samo još da se glumci pripreme – i krećemo.... <br><br>U periodu od 21.-og do 25.-og Sunce i Mars prelaze u znak Raka, bacajući akcenat na sve porodične relacije, od ovog perioda očekujte porast veridbi, venčanja, prinova, bitnih dogovora i poslovnih saradnji....lepo sam rekla da je sve spremno za jedan veliki preokret.... <br><br>I poslednjeg dana juna imamo veliki vatreni trigon – Venera i Jupiter su u konjukciji u znaku Lava, u trigonu sa Uranom iz znaka Ovna i Mesecom iz znaka Strelca. Ogroman porast energije, dobre sreće, pozitivnosti i optimizma na svim poljima.... <br><br>I da za kraj rezimiramo.....sada je već jasno da će do nekih velikih preokreta u dešavanjima doći. No, ono što je sigurno je da će i ovaj preokret biti pod budnim okom Saturna, planete vremena i karme, koji će na sve priče dati svoj završni pečat. Iako Saturna doživljavamo kao planetu koja samo kažnjava, to ni malo nema veze sa istinom. Ono što se traži je uvek odgovornost, a ukoliko ta odgovornost postoji, postoje i zasluženi Saturnovi darovi....Pozitivne promene ćemo osetiti svi, to stoji – ali, ukoliko ste radili u skladu sa Saturnovim učenjima i lekcijama, ta nagrada će biti neuporedivo veća. Oni koji se još uvek nisu oslobodili nekih karmičkih okova, ili ni ne pokušavaju da urade nešto za sebe dobiće jedan maleni podstrek i ništa više od toga....Prema tome, poenta je jasna – sve ono otrovno (Škorpija) za šta već odavno znate da vam smeta i koči vas – morate odbaciti da biste mogli lakše da nastavite dalje. U nekim životnim segmentima morate se organizovati, morate početi da se ponašate odgovorno, i za to ćete biti nagrađeni. U svakom slučaju, uživajte u ovom divnom, obećavajućem mesecu i ne bojte se promena! <br>',0,0,'Vaš astrolog','2015-06-01 00:00:00','2015-06-04 00:00:00',19,1,1,40,'/resources/img/news/news_11433155228514horoskop.jpg'),(2,7,'Neredi na tribinama pre derbija','Večiti 148. derbi između Crvene zvezde i Partizana nije ni počeo, a na tribinama stadiona ’Rajko Mitić’ dogodili su se incidenti.','Sukobi su se dogodili na istočnoj i severnoj tribini našeg najvećeg stadiona, pa je morala da interveniše i Žandarmerija koju su stolicama zasule pristalice domaćih.<br><br>Tek posle više od 20 minuta organi reda krenuli su u kontraofanzivu i uspeli da suzbiju prisutne na \"Severu\".<br><br>Reporter televizije Prva javio je u direktnom prenosu da je navijačka grupa Partizana \"Zabranjeni\" pokušala ispred ulaza na istočnu tribinu da probije kordon policije i sukobi se sa navijačima rivalske ekipe, ali u tome je tek uspela po ulasku na stadion. <br><br>Posle toga došlo je do napada \"Delija\" na Žandarmeriju, koji je trajao više od 20 minuta.',0,2,'B92','2015-06-02 00:00:00','2015-06-05 00:00:00',2,1,3,61,'/resources/img/news/news_2143323803624911182081_817517221663192_2971236353096082468_n.jpg'),(3,5,'Anketa: Buš popularniji od Obame','Bivši predsednik Džordž Buš, na vlasti od 2001. do 2009, popularniji je među Amerikancima nego aktuelni stanar Bele kuće Barak Obama. ','<p>Prema anketi koju je objavio CNN/ORC, 52 odsto \r\nispitanika ima pozitivno mišljenje o bivšem republikanskom predsedniku \r\nprema 49 odsto za sadašnjeg predsednika, demokratu Baraka Obamu.</p>            \r\n            <p>Udaljenost sa vlasti i relativno diskretno prisustvo u medijima izgleda da čini dobro, navodi agencija Frans pres. <br><br>\r\n Ovo je prvi put za deset godina od kada Džordž Buš mlađi, koji je \r\nnapustio Belu kuću u januaru 2009. sa slabom popularnošću prema \r\nanketama, ima više onih koji o njemu ima pozitivno mišljenje nego onih \r\nkoji ga negativno gledaju (52 prema 43 odsto) pokazuje ta anketa.</p><p>Od pet poslednjih predsednika SAD, dvojica se jasno ističu - Džordž Buš \r\nstariji, na vlasti od 1989. do 1993. i Bil Klinton (od 1993. 2001), \r\nobojica imaju po 64 odsto pozitivnih glasova. Ovi podaci imaju posebnu \r\ntežinu sa približavanjem predsedničkih izbora 2016. godine na kojima se \r\nčekuje da će te dve porodice ponovo igrati glavne uloge. <br><br> Hilari\r\n Klinton, supruga Bila Klintona, veliki je favorit za presedničkog \r\nkandidata u demokratskom bloku a Džeb Buš, brat Dordža Buša mlađeg i sin\r\n Džordža Buša starijeg, ne krije nameru da se uključi u borbu za \r\nrepublikansku nominaciju za predsedničkog kandidata, mada to nije još \r\nzvanično objavio. Anketa je obavljena telefonom od 29. do 31. maja na \r\nreprezentativnom uzorku od 1.025 Amerikanaca.</p>',0,0,'Beta','2015-06-03 00:00:00','2015-06-04 00:00:00',16,1,1,13,'/resources/img/news/news_3143334574879795943301854e42d016bc07716055226_v4 big.jpg'),(4,18,'Zabranjena okupljanja ispred Skupštine','Odlukom Administrativnog odbora ubuduće neće biti dozvoljena okupljanja građana pred zgradom Skupštine na Trgu Nikole Pašića, ali ni u Ulici kralja Milana. ','<p>Mesto za protest radnika, maturanata ili političara ali i mesto za \r\nvelika slavlja posle medalja i uspeha naših sportista. Na nekom drugom \r\nmestu će biti novi skupovi za slavlje ali i kritike. Bivši predsednik \r\nSkupštine, sada ministar policije Nebojša Stefanović nije upoznat sa \r\novom odlukom. </p>            \r\n            <p>\"Niko mi to nije predložio, ni meni nije palo na pamet \r\nali je bilo trenutaka kada je skupština bila pod velikim pritiskom i ako\r\n hoćete jednu nezavisnu instituciju, ako hoćete najviše zakonodavno telo\r\n u zemlji da donosi zakone i radi bez problema onda ne možete da \r\ndozvolite baš svaki dan da neko bude ispred jer se to često politički \r\nzolupotrebljava\", kaže ministar i funkcioner SNS. <br><br> Za člana Administrativnog odbora, demokratu Borislava Stefanovića, uvođenje ovih pravila nije bilo neophodno. <br><br>\r\n \"Imamo paradoksalnu situaciju da smo istom odlukom potpuno otvorili \r\nSkupštinu Srbije građanima, jer to je njihova zgrada. Unutra sede \r\nnjihovi poslanici i oni mogu u svakom momentu da uđu i razgovaraju sa \r\nposlanicima. Sa druge strane, zabranjujemo okupljanja. I vrlo je \r\ninteresantno i to što ova odluka dolazi nakon takozvanih spontanih \r\nokupljanja u znak podrške Aleksandru Vučiću i SNS\", kaže Borislav \r\nStefanović iz DS. <br><br> Oštrija pravila ponašanja podrazumevaju da u \r\nskupštini neće biti moguće isticanje stranačkih simbola, službenici i \r\ngosti moraće da budu prikladno obučeni za ulazak u Skupštinu. <br><br> Osim toga, u samoj zgradi Skupštine, u vreme pauze u restoranu ili bifeu biće dozvoljen boravak samo poslanicima. <br><br>\r\n \"Nemam nikakve sumnje da, kada je u pitanju okupljanje građana po bilo \r\nkom osnovu, ono izaziva određene probleme u smislu komunalnog nereda i \r\nevenutalnog funkcionisanja skupštine. To je prosto jedan okvir \r\ndemokratije u kojoj se živi\", kaže Đorđe Vuković iz CESID-a. <br><br> \r\nOdluku da zabrani okupljanja u centru grada nedavno je donela i lokalna \r\nvlast u Zaječaru. Skupovi su dozvoljeni uz taksu od 30.000 dinara i to \r\nna određenim mestima u gradu.</p>',0,0,'B92','2015-06-05 00:00:00','2015-06-05 00:00:00',15,1,1,25,'/resources/img/news/news_41434195643430okupljanje.jpg'),(5,18,'Odlučeno - kopamo put ispod Fruške Gore','Vlada Srbije i Fond za kapitalna ulaganja Vojvodine sufinansiraće izradu idejnog projekta tri deonice puta Novi Sad – Ruma.','<p>Potpredsednica vlade Zorana Mihajlović i direktor Uprave za kapitalna\r\n ulaganja AP Vojvodina Nebojša Malenković potpisali su ugovor koji \r\npredviđa prenos 76,8 miliona dinara tom ministarstvu za sufinansiranje \r\nizrade idejnog projekta za tri deonice brze saobraćajnice od Novog Sada \r\ndo Rume.  </p>            \r\n            <p>Po ranijim informacijama, novi put između Rume i Novog \r\nSada s tunelom kroz Frušku Goru, trebalo bi da bude dugačak 33 kilometra\r\n i da ima obilaznice oko Rume i Petrovaradina. <br><br> \"Dosta je bilo \r\npriče - gradićemo Fruškogorski koridor, o kojem se do sada puno pričalo,\r\n ali je malo urađeno. Mi želimo da se to promeni i današnjim \r\npotpisivanjem ugovora o prenosu sredstava za sufinansiranje idejnog \r\nprojekta ubrzano stvaramo preduslove da se ovaj putni pravac gradi\", \r\nrekla je Mihajlović u Vladi Srbije. <br><br> Ona je poručila da je stav \r\nvlade i ministarstva da nijedan projekat ne sme da stoji, kao i da je \r\ntzv. Fruškogorski koridor projekat od velikog značaja za građane \r\nVojvodine i Srbije. <br><br> \"Insistirala sam da se ovaj projekat vrati \r\nmeđu prioritete i da se na njemu radi mnogo brže nego u prethodnim \r\ngodinama. Izgradnja Fruškogorskog koridora omogućava rasterećenje \r\nsaobraćaja u gradskom jezgru Novog Sada, spajanje industrijskih zona i \r\nbolje povezivanje Srema i Mačve sa Banatom\", dodala je Mihajlovićeva. <br><br>\r\n Prema njenim rečima, u perspektivi ovaj putni pravac treba da omogući \r\npovezivanje Koridora 10 i Koridora 4 i stvaranje najkraće veze između \r\nBosne i Rumunije. <br><br> Javna nabavka za izradu Idejnog projekta tri \r\ndeonice, ukupne dužine 37,18 kilometara, biće raspisana do 19. juna. \r\nUkupna vrednost javne nabavke je 153,8 miliona dinara, od čega je u \r\ndržavnom budžetu obezbeđeno 77 miliona. <br><br> Zaključivanje ugovora s najboljim ponuđačem očekuje se najkasnije sredinom septembra, piše u saopštenju. <br><br>\r\n Do kraja ove godine trebalo bi da bude završen idejni projekat za \r\nnajmanje jednu deonicu, što će omogućiti početak sukcesivne izgradnje \r\ndeonica već u prvoj polovini sledeće godine. <br><br> Paralelno sa izradom Idejnog projekta, radiće se ekonomske analize da bi se našlo najbolje rešenje za finansiranje izgradnje. <br><br>\r\n Idejni projekat za četvrtu deonicu Fruškogorskog koridora - od početka \r\nobilaznice oko Rume, do petlje sa autoputem Beograd-Zagreb, biće urađen \r\npo završetku studije izvodljivosti koju pripremaju Putevi Srbije, navodi\r\n se u saopštenju.</p>',0,0,'BETA','2015-06-05 00:00:00','2015-06-05 00:00:00',15,1,1,4,'/resources/img/news/news_51433522820426put.jpg'),(6,7,'FSS poništio odluke FSV','Fudbalski savez Srbije saopštio je da su poništene sve odluke FSV donesene 22. maja jer nisu u skladu sa statutom Saveza','<p>Fudbalski savez Vojvodine tada je izmenio sastav svog Izvršnog odbora\r\n i zamenio svoje delegate u FSS, među kojima je  i Tomislav Karadžić.</p><p>Sednici\r\n Odbora za hitna pitanja prethodila je sednica Komisije za pravna \r\npitanja FSS, koja je analizirala kompletnu dokumentaciju vezanu za \r\nproblematiku FS Vojvodine. </p>            \r\n            <p>\"<em>Odbor za hitna pitanja FSS je u potpunosti uvažio \r\nzaključke Komisije za pravna pitanja FSS, koja je utvrdila da Statut FS \r\nVojvodine nije usklađen sa Statuom FS Srbije i konstatovala niz \r\nnepravilnosti prilikom donošenja istog. Na sednici Odbora za hitna \r\npitanja FSS, a na osnovu mišljenja Komisije za pravna pitanja FSS, \r\nponištene su sve odluke Izvršnog odbora FS Vojvodine sa sednice održane \r\n22. maja 2015. godine, jer su one nestatutarne.</em> <br><br> <em>Takođe,\r\n Odbor za hitna pitanja FSS dao je rok od 30 dana FS Vojvodine za \r\notklanjanje svih nepravilnosti. U suprotnom, ukoliko se ne primene gore \r\nnavedene odluke, Odbor za hitna pitanja FSS će, u skladu sa članovima 81\r\n i 82 Statuta FSS i ovlašćenja sa prethodne sednice Izvršnog odbora FSS,\r\n uvesti privremene mere u FS Vojvodine.</em> <br><br> <em>Na sednici \r\ndonesena je odluka o pružanju pomoći FK Javor po pitanju podizanja \r\nreflektora na stadionu ovog kluba i očekuje se brza realizacija \r\nprojekta. Takođe, odobrena su dopunska sredstva za FK Radnički iz \r\nObrenovca, FK Budućnost iz Valjeva i FK Metalac iz Gornjeg Milanovca za \r\nsaniranje posledica od poplava.</em> <br><br> <em>Obzirom na važnost \r\nodređenih zadataka koji se nalaze pred FS Srbije, upućuje se zahtev \r\nSudijskoj komisiji FSS i sudijskoj organizaciji da do 25. juna izaberu \r\nsvoje organe i tela, kao i da završe sve izveštaje i pripreme seminare \r\nsudija za narednu sezonu, obzirom da će ona početi sredinom jula. \r\nIstovremeno, Izvršni odbor FSS će do istog termina analizirati rad \r\nSudijske komisije FSS i doneti adekvatnu odluku\", </em>stoji na sajtu FSS.</p>',0,0,'B92','2015-06-05 00:00:00','2015-06-05 00:00:00',1,1,0,2,'/resources/img/news/news_61433525971231fss.JPG'),(7,7,'Berluskoni odbio milijardu za Milan','Predsednik Milana Silvio Berluskoni odbio je ponudu kineskog biznismena Bija Taečaubola vrednu milijardu evra, predomislio se i više ne želi da proda klub ','<p>Kako navodi ugledni list „Gazeta delo Sport“, Berluskoni i Taečaubol \r\nsastali su se u četvrtak, ali je prvi čovek ’Rosonera’ odbio da proda \r\nvećinski deo akcija sedmostrukog šampiona Evrope.</p>            \r\n            <p>Ipak, Berluskoni je voljan da proda manjinski deo akcija jer ima želju da još dugo vodi Milan. <br><br>\r\n Berluskoni i Taečabol već nekoliko meseci vode pregovore, a navijači \r\nMilana su zbog aktuelne situacije bojkotovali nekoliko utakmica u Seriji\r\n A.</p>',0,0,'B92','2015-06-05 00:00:00','2015-06-05 00:00:00',2,1,0,2,'/resources/img/news/news_71433523098828milan.jpg'),(8,5,'Prvi naslov test vesti','Lorem Ipsum is simply dummy text of the printing and typesetting industry.','<div id=\"lipsum\">\r\n<p>\r\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum \r\nvarius ante vestibulum nibh varius, ultrices iaculis libero suscipit. \r\nNam eget sem fermentum, posuere dolor ac, semper magna. Donec in gravida\r\n lorem. Mauris hendrerit molestie lorem a tincidunt. Pellentesque \r\nlaoreet, nulla a vehicula sollicitudin, augue mauris sollicitudin lacus,\r\n eu interdum ipsum nisl a nunc. Nulla sapien quam, condimentum non purus\r\n ut, interdum laoreet lacus. Nulla mollis ut felis nec vulputate. Mauris\r\n ut lacinia lacus, vel ultricies lorem. Donec nec orci lacinia, blandit \r\nleo nec, molestie quam. Sed luctus nulla id elementum consectetur. \r\nAliquam et diam scelerisque, consectetur neque a, rhoncus massa. Quisque\r\n lobortis dolor eget rutrum tristique. Nunc quis vestibulum magna. \r\nSuspendisse potenti. Vivamus dictum nulla non laoreet fermentum.\r\n</p>\r\n<p>\r\nCras placerat scelerisque urna sit amet rhoncus. Suspendisse maximus \r\nipsum neque, sit amet dapibus risus venenatis in. Fusce venenatis mauris\r\n vitae erat euismod, non blandit sapien placerat. Nullam ipsum turpis, \r\nvolutpat ut pellentesque a, cursus quis velit. Sed sit amet sollicitudin\r\n tellus. Ut porta ligula interdum dolor dapibus, ut maximus eros \r\naliquet. Nam sed magna vehicula, finibus quam id, dictum quam. Nullam \r\ndapibus enim nec dui fringilla tempor. Proin ac erat vel arcu tempus \r\nullamcorper. Praesent porttitor, risus nec efficitur aliquam, arcu metus\r\n hendrerit nunc, at porttitor nisl lacus eu odio. Nulla eu tellus vitae \r\naugue laoreet volutpat. Suspendisse accumsan mi felis, nec lobortis nunc\r\n mollis ac. Ut viverra nulla eget scelerisque semper. Donec sem sapien, \r\nporttitor nec neque ut, dictum mollis tortor.\r\n</p>\r\n<p>\r\nDonec rhoncus vel purus nec lobortis. Vestibulum eget tempor dolor. \r\nAenean vestibulum eget odio at rutrum. Fusce ac accumsan lacus. Nulla \r\nfacilisi. Praesent lacinia ipsum purus, ornare vehicula lectus congue \r\nsit amet. Sed efficitur velit vitae nibh condimentum, sit amet ornare \r\nnulla interdum. Ut dictum augue id quam malesuada iaculis. Nam nec risus\r\n vel dolor pellentesque egestas non ac felis. Duis congue nunc libero, a\r\n congue quam varius sed.\r\n</p></div>',0,1,'VT','2015-06-04 00:00:00','2015-06-14 00:00:00',16,1,0,1,'/resources/img/news/news_3143334574879795943301854e42d016bc07716055226_v4 big.jpg'),(9,5,'Drugi naslov test vesti','Lorem Ipsum has been the industry\'s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.','<div id=\"lipsum\">\r\n<p>\r\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum \r\nvarius ante vestibulum nibh varius, ultrices iaculis libero suscipit. \r\nNam eget sem fermentum, posuere dolor ac, semper magna. Donec in gravida\r\n lorem. Mauris hendrerit molestie lorem a tincidunt. Pellentesque \r\nlaoreet, nulla a vehicula sollicitudin, augue mauris sollicitudin lacus,\r\n eu interdum ipsum nisl a nunc. Nulla sapien quam, condimentum non purus\r\n ut, interdum laoreet lacus. Nulla mollis ut felis nec vulputate. Mauris\r\n ut lacinia lacus, vel ultricies lorem. Donec nec orci lacinia, blandit \r\nleo nec, molestie quam. Sed luctus nulla id elementum consectetur. \r\nAliquam et diam scelerisque, consectetur neque a, rhoncus massa. Quisque\r\n lobortis dolor eget rutrum tristique. Nunc quis vestibulum magna. \r\nSuspendisse potenti. Vivamus dictum nulla non laoreet fermentum.\r\n</p>\r\n<p>\r\nCras placerat scelerisque urna sit amet rhoncus. Suspendisse maximus \r\nipsum neque, sit amet dapibus risus venenatis in. Fusce venenatis mauris\r\n vitae erat euismod, non blandit sapien placerat. Nullam ipsum turpis, \r\nvolutpat ut pellentesque a, cursus quis velit. Sed sit amet sollicitudin\r\n tellus. Ut porta ligula interdum dolor dapibus, ut maximus eros \r\naliquet. Nam sed magna vehicula, finibus quam id, dictum quam. Nullam \r\ndapibus enim nec dui fringilla tempor. Proin ac erat vel arcu tempus \r\nullamcorper. Praesent porttitor, risus nec efficitur aliquam, arcu metus\r\n hendrerit nunc, at porttitor nisl lacus eu odio. Nulla eu tellus vitae \r\naugue laoreet volutpat. Suspendisse accumsan mi felis, nec lobortis nunc\r\n mollis ac. Ut viverra nulla eget scelerisque semper. Donec sem sapien, \r\nporttitor nec neque ut, dictum mollis tortor.\r\n</p>\r\n<p>\r\nDonec rhoncus vel purus nec lobortis. Vestibulum eget tempor dolor. \r\nAenean vestibulum eget odio at rutrum. Fusce ac accumsan lacus. Nulla \r\nfacilisi. Praesent lacinia ipsum purus, ornare vehicula lectus congue \r\nsit amet. Sed efficitur velit vitae nibh condimentum, sit amet ornare \r\nnulla interdum. Ut dictum augue id quam malesuada iaculis. Nam nec risus\r\n vel dolor pellentesque egestas non ac felis. Duis congue nunc libero, a\r\n congue quam varius sed.\r\n</p></div>',0,0,'VT','2015-04-05 00:00:00','2015-06-14 00:00:00',2,1,0,2,'/resources/img/news/news_41434195643430okupljanje.jpg'),(10,18,'Treći naslov test vesti','It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.','<div id=\"lipsum\">\r\n<p>\r\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum \r\nvarius ante vestibulum nibh varius, ultrices iaculis libero suscipit. \r\nNam eget sem fermentum, posuere dolor ac, semper magna. Donec in gravida\r\n lorem. Mauris hendrerit molestie lorem a tincidunt. Pellentesque \r\nlaoreet, nulla a vehicula sollicitudin, augue mauris sollicitudin lacus,\r\n eu interdum ipsum nisl a nunc. Nulla sapien quam, condimentum non purus\r\n ut, interdum laoreet lacus. Nulla mollis ut felis nec vulputate. Mauris\r\n ut lacinia lacus, vel ultricies lorem. Donec nec orci lacinia, blandit \r\nleo nec, molestie quam. Sed luctus nulla id elementum consectetur. \r\nAliquam et diam scelerisque, consectetur neque a, rhoncus massa. Quisque\r\n lobortis dolor eget rutrum tristique. Nunc quis vestibulum magna. \r\nSuspendisse potenti. Vivamus dictum nulla non laoreet fermentum.\r\n</p>\r\n<p>\r\nCras placerat scelerisque urna sit amet rhoncus. Suspendisse maximus \r\nipsum neque, sit amet dapibus risus venenatis in. Fusce venenatis mauris\r\n vitae erat euismod, non blandit sapien placerat. Nullam ipsum turpis, \r\nvolutpat ut pellentesque a, cursus quis velit. Sed sit amet sollicitudin\r\n tellus. Ut porta ligula interdum dolor dapibus, ut maximus eros \r\naliquet. Nam sed magna vehicula, finibus quam id, dictum quam. Nullam \r\ndapibus enim nec dui fringilla tempor. Proin ac erat vel arcu tempus \r\nullamcorper. Praesent porttitor, risus nec efficitur aliquam, arcu metus\r\n hendrerit nunc, at porttitor nisl lacus eu odio. Nulla eu tellus vitae \r\naugue laoreet volutpat. Suspendisse accumsan mi felis, nec lobortis nunc\r\n mollis ac. Ut viverra nulla eget scelerisque semper. Donec sem sapien, \r\nporttitor nec neque ut, dictum mollis tortor.\r\n</p>\r\n<p>\r\nDonec rhoncus vel purus nec lobortis. Vestibulum eget tempor dolor. \r\nAenean vestibulum eget odio at rutrum. Fusce ac accumsan lacus. Nulla \r\nfacilisi. Praesent lacinia ipsum purus, ornare vehicula lectus congue \r\nsit amet. Sed efficitur velit vitae nibh condimentum, sit amet ornare \r\nnulla interdum. Ut dictum augue id quam malesuada iaculis. Nam nec risus\r\n vel dolor pellentesque egestas non ac felis. Duis congue nunc libero, a\r\n congue quam varius sed.\r\n</p></div>',0,2,'VT','2015-05-06 00:00:00','2015-06-14 00:00:00',2,1,0,3,'/resources/img/news/news_51433522820426put.jpg'),(11,5,'Četvrti naslov test vesti','It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.','<div id=\"lipsum\">\r\n<p>\r\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum \r\nvarius ante vestibulum nibh varius, ultrices iaculis libero suscipit. \r\nNam eget sem fermentum, posuere dolor ac, semper magna. Donec in gravida\r\n lorem. Mauris hendrerit molestie lorem a tincidunt. Pellentesque \r\nlaoreet, nulla a vehicula sollicitudin, augue mauris sollicitudin lacus,\r\n eu interdum ipsum nisl a nunc. Nulla sapien quam, condimentum non purus\r\n ut, interdum laoreet lacus. Nulla mollis ut felis nec vulputate. Mauris\r\n ut lacinia lacus, vel ultricies lorem. Donec nec orci lacinia, blandit \r\nleo nec, molestie quam. Sed luctus nulla id elementum consectetur. \r\nAliquam et diam scelerisque, consectetur neque a, rhoncus massa. Quisque\r\n lobortis dolor eget rutrum tristique. Nunc quis vestibulum magna. \r\nSuspendisse potenti. Vivamus dictum nulla non laoreet fermentum.\r\n</p>\r\n<p>\r\nCras placerat scelerisque urna sit amet rhoncus. Suspendisse maximus \r\nipsum neque, sit amet dapibus risus venenatis in. Fusce venenatis mauris\r\n vitae erat euismod, non blandit sapien placerat. Nullam ipsum turpis, \r\nvolutpat ut pellentesque a, cursus quis velit. Sed sit amet sollicitudin\r\n tellus. Ut porta ligula interdum dolor dapibus, ut maximus eros \r\naliquet. Nam sed magna vehicula, finibus quam id, dictum quam. Nullam \r\ndapibus enim nec dui fringilla tempor. Proin ac erat vel arcu tempus \r\nullamcorper. Praesent porttitor, risus nec efficitur aliquam, arcu metus\r\n hendrerit nunc, at porttitor nisl lacus eu odio. Nulla eu tellus vitae \r\naugue laoreet volutpat. Suspendisse accumsan mi felis, nec lobortis nunc\r\n mollis ac. Ut viverra nulla eget scelerisque semper. Donec sem sapien, \r\nporttitor nec neque ut, dictum mollis tortor.\r\n</p>\r\n<p>\r\nDonec rhoncus vel purus nec lobortis. Vestibulum eget tempor dolor. \r\nAenean vestibulum eget odio at rutrum. Fusce ac accumsan lacus. Nulla \r\nfacilisi. Praesent lacinia ipsum purus, ornare vehicula lectus congue \r\nsit amet. Sed efficitur velit vitae nibh condimentum, sit amet ornare \r\nnulla interdum. Ut dictum augue id quam malesuada iaculis. Nam nec risus\r\n vel dolor pellentesque egestas non ac felis. Duis congue nunc libero, a\r\n congue quam varius sed.\r\n</p></div>',0,0,'VT','2015-06-06 00:00:00','2015-06-14 00:00:00',1,1,0,4,'/resources/img/news/news_61433525971231fss.JPG'),(12,7,'Peti naslov test vesti','Contrary to popular belief, Lorem Ipsum is not simply random text.','<div id=\"lipsum\">\r\n<p>\r\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum \r\nvarius ante vestibulum nibh varius, ultrices iaculis libero suscipit. \r\nNam eget sem fermentum, posuere dolor ac, semper magna. Donec in gravida\r\n lorem. Mauris hendrerit molestie lorem a tincidunt. Pellentesque \r\nlaoreet, nulla a vehicula sollicitudin, augue mauris sollicitudin lacus,\r\n eu interdum ipsum nisl a nunc. Nulla sapien quam, condimentum non purus\r\n ut, interdum laoreet lacus. Nulla mollis ut felis nec vulputate. Mauris\r\n ut lacinia lacus, vel ultricies lorem. Donec nec orci lacinia, blandit \r\nleo nec, molestie quam. Sed luctus nulla id elementum consectetur. \r\nAliquam et diam scelerisque, consectetur neque a, rhoncus massa. Quisque\r\n lobortis dolor eget rutrum tristique. Nunc quis vestibulum magna. \r\nSuspendisse potenti. Vivamus dictum nulla non laoreet fermentum.\r\n</p>\r\n<p>\r\nCras placerat scelerisque urna sit amet rhoncus. Suspendisse maximus \r\nipsum neque, sit amet dapibus risus venenatis in. Fusce venenatis mauris\r\n vitae erat euismod, non blandit sapien placerat. Nullam ipsum turpis, \r\nvolutpat ut pellentesque a, cursus quis velit. Sed sit amet sollicitudin\r\n tellus. Ut porta ligula interdum dolor dapibus, ut maximus eros \r\naliquet. Nam sed magna vehicula, finibus quam id, dictum quam. Nullam \r\ndapibus enim nec dui fringilla tempor. Proin ac erat vel arcu tempus \r\nullamcorper. Praesent porttitor, risus nec efficitur aliquam, arcu metus\r\n hendrerit nunc, at porttitor nisl lacus eu odio. Nulla eu tellus vitae \r\naugue laoreet volutpat. Suspendisse accumsan mi felis, nec lobortis nunc\r\n mollis ac. Ut viverra nulla eget scelerisque semper. Donec sem sapien, \r\nporttitor nec neque ut, dictum mollis tortor.\r\n</p>\r\n<p>\r\nDonec rhoncus vel purus nec lobortis. Vestibulum eget tempor dolor. \r\nAenean vestibulum eget odio at rutrum. Fusce ac accumsan lacus. Nulla \r\nfacilisi. Praesent lacinia ipsum purus, ornare vehicula lectus congue \r\nsit amet. Sed efficitur velit vitae nibh condimentum, sit amet ornare \r\nnulla interdum. Ut dictum augue id quam malesuada iaculis. Nam nec risus\r\n vel dolor pellentesque egestas non ac felis. Duis congue nunc libero, a\r\n congue quam varius sed.\r\n</p></div>',0,0,'VT','2015-05-05 00:00:00','2015-06-14 00:00:00',1,1,0,5,'/resources/img/news/news_71433523098828milan.jpg');
/*!40000 ALTER TABLE `news` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `news_category`
--

DROP TABLE IF EXISTS `news_category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `news_category` (
  `id` int(5) unsigned NOT NULL AUTO_INCREMENT,
  `parent_id` int(5) unsigned NOT NULL,
  `name` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `news_category`
--

LOCK TABLES `news_category` WRITE;
/*!40000 ALTER TABLE `news_category` DISABLE KEYS */;
INSERT INTO `news_category` VALUES (1,0,'Sport'),(2,1,'Fudbal'),(3,1,'Košarka'),(4,1,'Odbojka'),(5,1,'Rukomet'),(6,1,'Tenis'),(7,1,'Vaterpolo'),(8,0,'Kultura'),(9,8,'Koncerti'),(10,8,'Pozorište'),(11,8,'Opera'),(12,8,'Predstave'),(13,8,'Filmovi'),(14,0,'Politika'),(15,14,'Vesti iz zemlje'),(16,14,'Vesti iz sveta'),(17,0,'Crna hronika'),(18,0,'Zabava'),(19,18,'Horoskop'),(20,18,'Hrana i piće'),(21,18,'Enigmatika'),(22,18,'Ljubimci');
/*!40000 ALTER TABLE `news_category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `page`
--

DROP TABLE IF EXISTS `page`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `page` (
  `id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
  `item_id` int(10) unsigned NOT NULL,
  `title` varchar(100) NOT NULL,
  `subtitle` varchar(2000) DEFAULT NULL,
  `body` varchar(10000) NOT NULL,
  `author` varchar(100) NOT NULL DEFAULT 'Admin',
  `date_created` datetime NOT NULL,
  `published` tinyint(1) DEFAULT '0',
  `comments` int(10) unsigned DEFAULT '0',
  `views` int(10) unsigned NOT NULL DEFAULT '0',
  `img_path` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `page`
--

LOCK TABLES `page` WRITE;
/*!40000 ALTER TABLE `page` DISABLE KEYS */;
INSERT INTO `page` VALUES (1,13,'Prva strana','Za one koji vole Lorem Ipsum tekstove','<div id=\"lipsum\">\r\n<p>\r\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam ut nibh \r\naliquam, laoreet risus in, tristique est. Vivamus quis elementum felis. \r\nSuspendisse potenti. Etiam commodo tellus quis ante varius euismod ut ac\r\n odio. Praesent molestie ante ac massa dapibus, nec sagittis diam \r\naccumsan. Vestibulum iaculis nisl at tortor eleifend, eget interdum elit\r\n placerat. Integer elementum magna sit amet neque dapibus fermentum. \r\nPhasellus iaculis mi id lorem pellentesque, vehicula rutrum massa \r\nefficitur. Maecenas gravida ipsum facilisis sapien malesuada maximus a \r\nvitae eros. Aenean sem arcu, scelerisque sed diam sed, egestas gravida \r\nquam. Cum sociis natoque penatibus et magnis dis parturient montes, \r\nnascetur ridiculus mus. Sed et consectetur mi. Donec hendrerit hendrerit\r\n interdum. Praesent condimentum vulputate elit, nec lacinia nulla \r\nimperdiet quis. Nam ullamcorper ligula sed metus facilisis elementum.\r\n</p>\r\n<p>\r\nMauris non tortor a leo consectetur finibus nec id ipsum. Praesent \r\nfaucibus luctus metus, sit amet interdum elit maximus vitae. Aliquam \r\ninterdum faucibus urna, a lobortis leo condimentum et. Praesent bibendum\r\n elit ac turpis aliquam venenatis. Cras nec feugiat odio. Maecenas quis \r\nnulla vel ante varius semper nec et velit. Curabitur id finibus massa. \r\nInteger finibus orci tempor mi viverra cursus. Phasellus aliquet diam \r\nsed arcu fringilla hendrerit. Integer fringilla tempus mi non ultrices. \r\nDonec et eros consequat odio pharetra congue. Sed malesuada cursus urna.\r\n</p>\r\n<p>\r\nSed augue dui, elementum sit amet massa nec, varius congue erat. Sed id \r\njusto sed diam placerat ullamcorper ut eu erat. Suspendisse feugiat nisi\r\n non purus imperdiet egestas. Sed iaculis efficitur felis. Ut cursus \r\ndiam eget nisl sagittis, sit amet euismod est volutpat. Nunc urna quam, \r\ncursus sed lacus nec, dignissim sagittis enim. In quis neque enim. \r\nAliquam nec dolor eros. Donec dignissim placerat tortor.\r\n</p>\r\n<p>\r\nCurabitur eros magna, viverra a sapien in, vulputate pharetra nulla. Nam\r\n volutpat tristique risus pharetra consequat. Vivamus egestas sem vel \r\ntortor pharetra maximus. Sed porta quis mi ac egestas. In sodales magna \r\nvel nisl pharetra, eget luctus ipsum tristique. Curabitur iaculis, diam \r\neu porta congue, nunc libero lacinia ipsum, nec dictum nisl odio in \r\neros. Mauris interdum dui eget gravida bibendum. Cras eu metus turpis. \r\nNullam convallis mauris ac leo tincidunt accumsan. Maecenas at leo a \r\nodio finibus bibendum. Integer aliquet sed ante in varius. Suspendisse \r\npotenti.\r\n</p>\r\n<p>\r\nPhasellus non euismod justo. Ut maximus lorem non neque efficitur \r\nhendrerit. Maecenas a neque vestibulum, viverra sapien vitae, varius \r\nest. Proin rutrum tellus a sem vestibulum, non pulvinar augue pulvinar. \r\nAenean efficitur justo sem, quis scelerisque lorem consectetur a. \r\nCurabitur suscipit sed ligula sit amet dapibus. Integer orci velit, \r\npellentesque nec neque sed, ultrices pellentesque diam. Morbi aliquet \r\npurus ac nunc dictum suscipit. Suspendisse vitae lacinia mi.\r\n</p></div>','Vladimir Tomić','2015-06-02 00:00:00',1,0,14,'/resources/img/page/page_114332356029901.png'),(2,13,'Iz Pariza: Poslednji Novakov trening pred Rafu','Novak Đoković trenirao je četrdesetak minuta na stadionu Filip Šatrije pred okršaj sa Rafaelom Nadalom. ','<p>Baš kao i prethodnih dana, Novakov sparing partner bio je levoruki Francuz Nikola Devilder.</p><p>Počelo\r\n je oko 12.15 laganim prebacivanjem preko mreže, a onda se prešlo na \r\nšablone – Devilder je prvo imao zadatak da pošalje dve visoke loptice na\r\n bekhend, a zatim da napadne forhend paralelom (nešto što Nadal često \r\nradi).</p>            \r\n            Potom su uloge bile obrnute, Novak je završavao forhend \r\nparalelom, a onda je kraći deo treninga posvećen volejima – prvo u \r\nmestu, a zatim i izlazak na mrežu posle udarca s osnovne linije. <br><br>\r\n Beker i Novak davali su instrukcije Devilderu kakve su lopte potrebne, a\r\n posle nekoliko smečeva prešlo se na servis. Francuz je trebalo jednom \r\nda vrati ritern na Đokovićev forhend, a sledeći put na bekhend. <br><br>\r\n Odigrao je Đoković i dva-tri drop šota posle servisa, a zatim je vežbao\r\n ritern – od Devildera je tražio različite stvari, npr. slajs servis ili\r\n servis po širini sa ’djus’ strane, jačinu prvog ili drugog servisa i \r\nsl. <br><br> Ostao je Novak koji minut duže nego što je planirano na \r\nterenu, a posle treninga je bio nasmejan – potpisao je Devilderu \r\nnekoliko loptica, a pre izlaska sa terena zastao je i dao još nekoliko \r\nautograma malobrojnima koji su nekako dospeli do terena na Šatrijeu. <br><br> Posle Đokovićevog treninga razgovarao sam sa <b>Arančom Sančes-Vikario</b>, nije imala mnogo vremena, ali je kratko najavila duel. <br><br> <i>“Biće\r\n neverovatan meč, i dalje mi je neobično što igraju u četvrtfinalu. \r\nMislim da je Đoković favorit jer je prvi na svetu, ali Nadal je u celoj \r\nsvojoj karijeri izgubio samo jedan meč ovde. Španjolka sam i nadam se \r\nRafinoj pobedi, ali ako Novak danas pobedi, favorit je i da osvoji \r\ntitulu“,</i> rekla je Aranča za B92. <br><br> Pročitajte šta o predstojećem meču misle <b><a href=\"http://www.b92.net/sport/rolandgarros2015/ozmo-na-sljaci.php?yyyy=2015&amp;mm=06&amp;dd=03&amp;nav_id=999417\">Mats Vilander</a></b>, <b><a href=\"http://www.b92.net/sport/rolandgarros2015/ozmo-na-sljaci.php?yyyy=2015&amp;mm=06&amp;dd=03&amp;nav_id=999675\">Sebastijan Grožan</a></b>, <b><a href=\"http://www.b92.net/sport/rolandgarros2015/vesti.php?yyyy=2015&amp;mm=06&amp;dd=02&amp;nav_id=999801\">Rodžer Federer</a></b> i <b><a href=\"http://www.b92.net/sport/rolandgarros2015/ozmo-na-sljaci.php?yyyy=2015&amp;mm=06&amp;dd=02&amp;nav_id=999545\">Fabris Santoro</a></b>, a pogledajte i našu <b><a href=\"http://www.b92.net/sport/rolandgarros2015/vesti.php?yyyy=2015&amp;mm=06&amp;dd=03&amp;nav_id=999406\">najavu predstojećeg okršaja</a></b>. <br><br>\r\n Poslednje podsećanje, Novak Đoković i Rafael Nadal igraju drugi meč na \r\nstadionu Filip Šatrije, posle meča Serena Vilijams – Sara Erani koji \r\npočinje u 14 časova. ','B92','2015-06-03 00:00:00',1,0,1,'/resources/img/page/page_214333333693221236774632556ee652c415e673348341_w640.JPG'),(3,17,'Zašto Amerikanci ne mere u metrima?','Svaki izborni krug nosi nove vizije i obećanja kandidata koji nekada dosežu epohalne razmere. Ove godine, međutim, bivši guverner Roud Ajlenda Linkoln Čejfi tokom govora za američke predsedničke izbore 2016. godine otišao je korak dalje. ','Metrički sistem pojavio se prvi put u Francuskoj u 17. veku kao način \r\npredupređivanja brojnih prevara farmera i trgovaca koji su koristili \r\nrazličite merne sisteme onako kako je njima najviše odgovaralo, u svoju \r\nkorist. <br><br> Naučnici su takođe zahtevali uvođenje standardizovanog \r\nsistema kako bi bila olakšana međunarodna saradnja u brojnim \r\nistraživanjima. <br><br> Tada je predstavljen metar, koji je definisan kao desetmilioniti deo razdaljine od ekvatora do jednog od zemljinih polova. <br><br> Metrički sistem takođe se pokazao kao naročito koristan zato što se zasnivao na decimalnom sistemu. <br><br>\r\n Francuska je zvanično usvojila metrički sistem u ranom 19. veku \r\nnadajući se da će na taj način pospešiti trgovačku razmenu, a preostali \r\ndeo kontinenta brzo se prilagodio promenama. <br><br> Tokom narednih sto\r\n godina, metrički sistem posto je globalno rasprostranjen. Britanski \r\nKomonvelt dugo mu se opirao, da bi 1970. godine konačno posustao, a \r\ntradicionalne mere otišle u istoriju. Danas, SAD, Mjanmar i Liberija \r\njedine su zemlje čije se merne jedinice zasnivaju na drugim sistemima. <br><br>\r\n Zvanično, Amerika jeste prešla na metrički sistem 1975. godine, kada je\r\n nacionalni savet francuske republike poništio dotadašnje mere koje su \r\nse razlikovale u čitavoj zemlji. Jarda, funta i galon zvanično su \r\ndefinisani pozivanjem na metričke jedinice. Međutim, ova promena \r\nodvijala se veoma sporo i do početka osamdesetih godina napredak se \r\nogledao jedino u tome što su likeri i vina mereni u litrima. <br><br> \r\nIdeja je ponovo oživela 1988. godine kada je Kongres doneo zakon da sve \r\nvladine agencije pređu na metrički sistem do 1992. godine. <br><br> \r\nDanas, agencije sa veoma značajnom međunarodnom saradnjom poput NASA-e \r\nili Ministarstva odbrane skoro su u potpunosti prešle na novi merni \r\nsistem. Ministarstvo obrazovanja, međutim, malo je učinilo po tom \r\npitanju, a isto se može reći i za američki privatni sektor, gde metrički\r\n sistem koriste uglavnom velike kompanije koje se bave trgovinom i \r\nizvozom robe. <br><br> Promeni, koja je kulminirala sedamdesetih i \r\nosamdesetih, najviše su se protivili sindikati čiji su predstavnici \r\nsmatrali da radnici neće moći da nauče nove mere i prilagode se novom \r\nsistemu. Prelazak na mašine i ostale brojne proizvode zasnovane na \r\nmetričkom sistemu takođe je predstavljao veoma skup poduhvat. Trebalo je\r\n promeniti saobraćajne znake, uneti izmene u postojeće zakone… Ali, sa \r\nistim problemima suočile su se sve ostale zemlje koje su prethodno \r\nprešle na novi merni sistem. Međutim, u Americi za tim nije bilo ni \r\npotrebe, s obzirom na izuzetnu ekonomsku moć u svetu zbog koje su \r\nSjedinjene države vodile glavnu reč i određivale pravila. <br><br> \r\nIgnorisanje metričkog sistema uzelo je svoj “danak” 1999. godine kada je\r\n NASA ostala bez sonde zvane “Mars Climate Orbiter”, vredne 125 miliona \r\ndolara. Razlog? Neusklađenost dela navigacionog sistema zasnovanog na \r\nengleskim mernim jedinicama sa onim koji je funkcionisao po metričkom \r\nsistemu izazvao je skretanje sonde sa putanje i njeno sagorevanje u \r\norbiti Marsa. <br><br> \"Prigrlimo internacionalizam: pridružimo se zemljama koje su usvojile metrički sistem\" ističe sada Čejfi. <br><br>\r\n Jedini problem sa ovim stavom je što veliki broj glasača stari merni \r\nsistem smatra osloncem američkog individualizma, koji je u ovoj zemlji \r\nizraženiji nego u drugim kulturama. Čejfijeva politika, mogla bi, zato, \r\nmnogima da zvuči prilično neubedljivo. ','CNBC','2015-06-05 00:00:00',1,0,4,'/resources/img/page/page_31433522291020metri.jpg'),(4,17,'Gde je nestao \"Gangnam stajl\"?','Neko vreme bilo je gotovo nemoguće otići negde, a ne čuti pesmu Gangnam stajl, koji je postao globalni hit 2012. godine. ','Međutim, uprkos uspehu još dva singla i pričama o osvajanju američkog \r\ntržišta, od tada se malo čulo o reperu iz Južne Koreje-Saju. <br><br> \r\nK-pop čini muzičku scenu Koreje, a njen ambasador je Saj koji je na \r\nZapadu zaradio oko 55 miliona dolara, a slične iznose zarađuje i od \r\nunosnog kineskog tržišta gde sarađuje sa svetski poznatim pijanistom \r\nLang Langom. <br><br> Sajeva odluka da se fokusira na muzičko tržište u \r\nAziji može biti pokazatelj da idustrija zabave tu ima najveći profit \r\nkoji se procenjuje na 95.7 milijardi dolara. <br><br> Menadžer Skuter \r\nBraun koji je otkrio megazvezde poput Džastina Bibera i Karli Rej \r\nDžepsen izjavio je za BBC da mu je upravo Saj otvorio oči kada je u \r\npitanju južnokorejska muzička scena i njene zvezde. <br><br> \"K-pop kao \r\nžanr ulaže mnogo u svoje spotove sa jedinstvenim vizualnim efektima,\" \r\nrekao je Braun i dodao da upravo takvi vizualni efekti omogućavaju \r\nljudima koji ne razumeju jezik, da ipak razumeju tu vrstu muzike. <br><br> Oni koji nisu svesni popularnosti ovog žanra, Braunovo otkriće će to promeniti. <br><br>\r\n Dvadesetčetvorogodišnja korejska pop senzacija CL (Čarin Li) privlači \r\npažnju mnogih američkih producenata i modnih kreatora. Ona je bila deo \r\nnajpopularnije grupe 2NE1 i kao pevačica i reperka stekla je veliku \r\npopularnost. <br><br> “Želimo da joj pomognemo da svoj talenat prenese i u Sjedinjene Američke Države,” rekao je Braun. <br><br>\r\n Sada se postavlja pitanje da li će njoj poći za rukom da uradi ono što \r\nje Saju zamalo uspelo, a to je da uspešno K-pop predstavi ostatku sveta.\r\n <br><br> \"Odrasla sam slušajući engleske bendove i američki pop,\" \r\nizjavila je CL i dodala da je nakon osam godina karijere na azijskom \r\nmuzičkom tržištu spremna za nove izazove. <br><br> Kao mnogi pripadnici K-pop industrije, CL je započela svoj \"trening\" sa 15 godina. <br><br>\r\n Od nje se očekivalo da uskladi školu i svakodnevne vežbe koje su \r\nuključivale pevanje, igranje, glumu, časove jezika i u ekstremnim \r\nslučajevima plastičnu hirurgiju. <br><br> To je iscrpljujući proces koji može da potraje godinama pre nego što umetnik postane spreman za debitovanje. <br><br>\r\n \"Celokupna razvojna struktura umetnika je potpuno drugačija u SAD nego u\r\n Koreji,\" izjavio je Skuter Braun i dodao da će tek doći do prodora \r\nK-popa na američko ali i svetsko muzičko tržište.','BBC','2015-06-05 00:00:00',1,0,2,'/resources/img/page/page_41433522382223gangnam.jpg'),(5,17,'Promenio ime kako bi jeftinije letovao','Jedan štedljivi student promenio je ime, zato što se ispostavilo da će ga to koštati jeftinije, nego da plaća nadoknadu za promenu rezervacije za Ryanair let.','Adam Armstrong (19) rezervisao je letovanje na Ibici sa devojkom Indijom\r\n Lomas. Međutim, Indijin očuh je greškom rezervisao let u niskobudžetnoj\r\n kompaniji na ime “Adam Vest”. <br><br> Mladić kaže da je Ryanair tražio 220 funti za promenu podataka na avionskoj karti, što je dvostruko više od cene leta. <br><br>\r\n Pošto nije želeo da plati tako visok iznos, student je zaključio da će \r\nmu mnogo jeftinije biti da pravno promeni svoje ime. Tako je postao Adam\r\n Vest i naručio novi pasoš. <br><br> Promena imena ga nije koštala ništa, a novi pasoš 103 funte, što je daleko manje od iznosa koju je tražio Ryanair.','Independent','2015-06-05 00:00:00',1,0,2,'/resources/img/page/page_51433522476171ime.jpg'),(6,17,'Ratovi zvezda: Han Solo je oženjen?','Pisci zvaničnog stripa “Ratovi zvezda” šokirali su fanove dodajući novi obrt vezan za lik Hana Sola, jednog od omiljenih likova u franšizi Džordža Lukasa. ','U filmu se Solo, kog igra Harison Ford, zaljubljuje u princezu Leju. \r\nMeđutim, novi strip koji opisuje događaje nakon onih u filmu “A New \r\nHope” iz 1977. a pre “Imperija uzvraća udarac” (1980.) otkriva da ovaj \r\nkrijumčar i lutalica već ima ženu. <br><br> Poslednje izdanje Marvelovog\r\n stripa predstavlja Sanu Solo, Hanovu suprugu, koja se pojavljuje \r\nmaskirana i “vreba” u jednom od njegovih omiljenih utočišta, kantini Mos\r\n Eisley na Tatuinu. <br><br> Marvel i “Ratovi zvezda” su u vlasništvu iste kuće, od kako je “stripadžije” i Lukasovu kompaniju Lucasfilm kupio Disney. <br><br>\r\n U novom stripu, Han pokušava da impresionira Leju svojim poznavanjem \r\nvina, a u tom trenutku Sana izlazi iz svemirskog broda i predstavlja se \r\nLeji. <br><br> Moguće je da Sana ne govori istinu, ali još ne znamo kako će na sve to reagovati Leja.','Independent','2015-06-05 00:00:00',1,1,4,'/resources/img/page/page_61434045041738han solo.jpg'),(7,13,'Druga strana','Lorem ipsum 1','<div id=\"lipsum\">\r\n<p>\r\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque \r\nnec est in dui tincidunt ultrices. Quisque auctor cursus nulla, at \r\naliquam arcu interdum at. Sed ac hendrerit lorem, a pretium ante. Mauris\r\n id ante libero. Etiam ullamcorper, ante ac rhoncus hendrerit, enim \r\nlacus rutrum dui, vel euismod est ex a odio. Pellentesque habitant morbi\r\n tristique senectus et netus et malesuada fames ac turpis egestas. In \r\neget diam quis dui volutpat pulvinar ac id orci. Vestibulum vestibulum \r\nlorem a enim blandit semper. Donec bibendum ligula ac metus rutrum, id \r\nposuere diam semper. Mauris non orci aliquet, eleifend ipsum gravida, \r\nmollis sapien. Cras sollicitudin orci suscipit arcu sollicitudin, nec \r\nconvallis eros lobortis. Pellentesque a nunc a enim vestibulum tempus. \r\nAliquam ac finibus ligula. Fusce tempor quis odio vitae dapibus. \r\nSuspendisse potenti. Donec semper odio commodo, efficitur nisi sed, \r\ncondimentum dolor.\r\n</p>\r\n<p>\r\nUt venenatis est enim, a dignissim mi consectetur sit amet. Donec sit \r\namet lacus ultricies, bibendum turpis non, viverra orci. Nam odio quam, \r\nfinibus ac magna quis, malesuada tempor dolor. Aliquam pellentesque \r\negestas eros, et aliquet ante consectetur nec. Vestibulum vitae ex \r\nviverra, tempor odio a, euismod lacus. In finibus odio id dolor \r\nefficitur, non accumsan lorem ultrices. Quisque pulvinar nibh eget augue\r\n luctus pretium. Donec fringilla vehicula nunc id consectetur.\r\n</p>\r\n<p>\r\nCurabitur magna ligula, mollis sit amet enim nec, volutpat ultricies \r\ndolor. Vivamus id urna ut eros luctus consequat. Vestibulum non \r\nullamcorper ex. Fusce convallis tortor eleifend nisi consectetur finibus\r\n eget eleifend erat. Sed cursus dui tincidunt dolor euismod, sed maximus\r\n dui porttitor. Morbi luctus at leo vitae viverra. Nullam at laoreet \r\nmassa, quis imperdiet nulla. Cum sociis natoque penatibus et magnis dis \r\nparturient montes, nascetur ridiculus mus. Duis nec neque lectus.\r\n</p>\r\n<p>\r\nAenean feugiat vel risus in tristique. Cras mattis enim quis libero \r\nbibendum, non scelerisque tellus maximus. Praesent nulla libero, sodales\r\n eu mauris eu, commodo condimentum enim. Aenean volutpat blandit nisl in\r\n aliquam. Nunc malesuada orci quis nulla tristique varius. Donec \r\nplacerat odio nulla, et pharetra odio vestibulum interdum. Phasellus \r\ngravida felis id nisi tincidunt, eu elementum massa euismod. Nulla \r\nviverra lacinia suscipit. Fusce tincidunt justo velit, sed tristique \r\neros malesuada vitae. Sed gravida id odio eu aliquet. Cras a dapibus \r\nleo. Nam non velit ut orci tempor maximus eget ut nunc. In dui nulla, \r\npulvinar at sapien accumsan, ultrices efficitur enim. Cras lobortis \r\nsapien lacinia neque semper, viverra ultrices turpis consectetur. \r\nPhasellus ornare est leo, vel posuere dui porta id.\r\n</p>\r\n<p>\r\nProin rutrum, risus eget eleifend tempor, tellus metus sodales eros, \r\ntincidunt placerat odio leo non risus. Aliquam quis tempus diam, a \r\nvarius elit. Donec interdum leo sem, vel viverra urna ornare quis. Donec\r\n condimentum efficitur erat, nec blandit metus hendrerit ut. \r\nPellentesque viverra, ligula in iaculis hendrerit, augue lacus varius \r\nenim, quis euismod quam quam vel urna. Proin libero dolor, vulputate et \r\nluctus nec, sagittis eget lorem. Nam quis eleifend tortor. Vivamus \r\nlobortis nisi nec nisl porta fringilla. Aliquam tincidunt nisl \r\nsollicitudin, tempor ex eget, aliquam justo.\r\n</p></div>','VT','2015-06-14 00:00:00',1,0,0,'/resources/img/page/page_7143429251893410.png'),(8,13,'Treća strana','Lorem ipsum 2','<div id=\"lipsum\">\r\n<p>\r\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque \r\nnec est in dui tincidunt ultrices. Quisque auctor cursus nulla, at \r\naliquam arcu interdum at. Sed ac hendrerit lorem, a pretium ante. Mauris\r\n id ante libero. Etiam ullamcorper, ante ac rhoncus hendrerit, enim \r\nlacus rutrum dui, vel euismod est ex a odio. Pellentesque habitant morbi\r\n tristique senectus et netus et malesuada fames ac turpis egestas. In \r\neget diam quis dui volutpat pulvinar ac id orci. Vestibulum vestibulum \r\nlorem a enim blandit semper. Donec bibendum ligula ac metus rutrum, id \r\nposuere diam semper. Mauris non orci aliquet, eleifend ipsum gravida, \r\nmollis sapien. Cras sollicitudin orci suscipit arcu sollicitudin, nec \r\nconvallis eros lobortis. Pellentesque a nunc a enim vestibulum tempus. \r\nAliquam ac finibus ligula. Fusce tempor quis odio vitae dapibus. \r\nSuspendisse potenti. Donec semper odio commodo, efficitur nisi sed, \r\ncondimentum dolor.\r\n</p>\r\n<p>\r\nUt venenatis est enim, a dignissim mi consectetur sit amet. Donec sit \r\namet lacus ultricies, bibendum turpis non, viverra orci. Nam odio quam, \r\nfinibus ac magna quis, malesuada tempor dolor. Aliquam pellentesque \r\negestas eros, et aliquet ante consectetur nec. Vestibulum vitae ex \r\nviverra, tempor odio a, euismod lacus. In finibus odio id dolor \r\nefficitur, non accumsan lorem ultrices. Quisque pulvinar nibh eget augue\r\n luctus pretium. Donec fringilla vehicula nunc id consectetur.\r\n</p>\r\n<p>\r\nCurabitur magna ligula, mollis sit amet enim nec, volutpat ultricies \r\ndolor. Vivamus id urna ut eros luctus consequat. Vestibulum non \r\nullamcorper ex. Fusce convallis tortor eleifend nisi consectetur finibus\r\n eget eleifend erat. Sed cursus dui tincidunt dolor euismod, sed maximus\r\n dui porttitor. Morbi luctus at leo vitae viverra. Nullam at laoreet \r\nmassa, quis imperdiet nulla. Cum sociis natoque penatibus et magnis dis \r\nparturient montes, nascetur ridiculus mus. Duis nec neque lectus.\r\n</p>\r\n<p>\r\nAenean feugiat vel risus in tristique. Cras mattis enim quis libero \r\nbibendum, non scelerisque tellus maximus. Praesent nulla libero, sodales\r\n eu mauris eu, commodo condimentum enim. Aenean volutpat blandit nisl in\r\n aliquam. Nunc malesuada orci quis nulla tristique varius. Donec \r\nplacerat odio nulla, et pharetra odio vestibulum interdum. Phasellus \r\ngravida felis id nisi tincidunt, eu elementum massa euismod. Nulla \r\nviverra lacinia suscipit. Fusce tincidunt justo velit, sed tristique \r\neros malesuada vitae. Sed gravida id odio eu aliquet. Cras a dapibus \r\nleo. Nam non velit ut orci tempor maximus eget ut nunc. In dui nulla, \r\npulvinar at sapien accumsan, ultrices efficitur enim. Cras lobortis \r\nsapien lacinia neque semper, viverra ultrices turpis consectetur. \r\nPhasellus ornare est leo, vel posuere dui porta id.\r\n</p>\r\n<p>\r\nProin rutrum, risus eget eleifend tempor, tellus metus sodales eros, \r\ntincidunt placerat odio leo non risus. Aliquam quis tempus diam, a \r\nvarius elit. Donec interdum leo sem, vel viverra urna ornare quis. Donec\r\n condimentum efficitur erat, nec blandit metus hendrerit ut. \r\nPellentesque viverra, ligula in iaculis hendrerit, augue lacus varius \r\nenim, quis euismod quam quam vel urna. Proin libero dolor, vulputate et \r\nluctus nec, sagittis eget lorem. Nam quis eleifend tortor. Vivamus \r\nlobortis nisi nec nisl porta fringilla. Aliquam tincidunt nisl \r\nsollicitudin, tempor ex eget, aliquam justo.\r\n</p></div>','VT','2015-06-14 00:00:00',1,0,1,'/resources/img/page/page_814342925659554.gif'),(9,17,'Četvrta strana','Lorem ipsum 3','<div id=\"lipsum\">\r\n<p>\r\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque \r\nnec est in dui tincidunt ultrices. Quisque auctor cursus nulla, at \r\naliquam arcu interdum at. Sed ac hendrerit lorem, a pretium ante. Mauris\r\n id ante libero. Etiam ullamcorper, ante ac rhoncus hendrerit, enim \r\nlacus rutrum dui, vel euismod est ex a odio. Pellentesque habitant morbi\r\n tristique senectus et netus et malesuada fames ac turpis egestas. In \r\neget diam quis dui volutpat pulvinar ac id orci. Vestibulum vestibulum \r\nlorem a enim blandit semper. Donec bibendum ligula ac metus rutrum, id \r\nposuere diam semper. Mauris non orci aliquet, eleifend ipsum gravida, \r\nmollis sapien. Cras sollicitudin orci suscipit arcu sollicitudin, nec \r\nconvallis eros lobortis. Pellentesque a nunc a enim vestibulum tempus. \r\nAliquam ac finibus ligula. Fusce tempor quis odio vitae dapibus. \r\nSuspendisse potenti. Donec semper odio commodo, efficitur nisi sed, \r\ncondimentum dolor.\r\n</p>\r\n<p>\r\nUt venenatis est enim, a dignissim mi consectetur sit amet. Donec sit \r\namet lacus ultricies, bibendum turpis non, viverra orci. Nam odio quam, \r\nfinibus ac magna quis, malesuada tempor dolor. Aliquam pellentesque \r\negestas eros, et aliquet ante consectetur nec. Vestibulum vitae ex \r\nviverra, tempor odio a, euismod lacus. In finibus odio id dolor \r\nefficitur, non accumsan lorem ultrices. Quisque pulvinar nibh eget augue\r\n luctus pretium. Donec fringilla vehicula nunc id consectetur.\r\n</p>\r\n<p>\r\nCurabitur magna ligula, mollis sit amet enim nec, volutpat ultricies \r\ndolor. Vivamus id urna ut eros luctus consequat. Vestibulum non \r\nullamcorper ex. Fusce convallis tortor eleifend nisi consectetur finibus\r\n eget eleifend erat. Sed cursus dui tincidunt dolor euismod, sed maximus\r\n dui porttitor. Morbi luctus at leo vitae viverra. Nullam at laoreet \r\nmassa, quis imperdiet nulla. Cum sociis natoque penatibus et magnis dis \r\nparturient montes, nascetur ridiculus mus. Duis nec neque lectus.\r\n</p>\r\n<p>\r\nAenean feugiat vel risus in tristique. Cras mattis enim quis libero \r\nbibendum, non scelerisque tellus maximus. Praesent nulla libero, sodales\r\n eu mauris eu, commodo condimentum enim. Aenean volutpat blandit nisl in\r\n aliquam. Nunc malesuada orci quis nulla tristique varius. Donec \r\nplacerat odio nulla, et pharetra odio vestibulum interdum. Phasellus \r\ngravida felis id nisi tincidunt, eu elementum massa euismod. Nulla \r\nviverra lacinia suscipit. Fusce tincidunt justo velit, sed tristique \r\neros malesuada vitae. Sed gravida id odio eu aliquet. Cras a dapibus \r\nleo. Nam non velit ut orci tempor maximus eget ut nunc. In dui nulla, \r\npulvinar at sapien accumsan, ultrices efficitur enim. Cras lobortis \r\nsapien lacinia neque semper, viverra ultrices turpis consectetur. \r\nPhasellus ornare est leo, vel posuere dui porta id.\r\n</p>\r\n<p>\r\nProin rutrum, risus eget eleifend tempor, tellus metus sodales eros, \r\ntincidunt placerat odio leo non risus. Aliquam quis tempus diam, a \r\nvarius elit. Donec interdum leo sem, vel viverra urna ornare quis. Donec\r\n condimentum efficitur erat, nec blandit metus hendrerit ut. \r\nPellentesque viverra, ligula in iaculis hendrerit, augue lacus varius \r\nenim, quis euismod quam quam vel urna. Proin libero dolor, vulputate et \r\nluctus nec, sagittis eget lorem. Nam quis eleifend tortor. Vivamus \r\nlobortis nisi nec nisl porta fringilla. Aliquam tincidunt nisl \r\nsollicitudin, tempor ex eget, aliquam justo.\r\n</p></div>','VT','2015-06-14 00:00:00',1,0,2,'/resources/img/page/page_914342925947836.jpg'),(10,17,'Peta strana','Lorem ipsum 4','<div id=\"lipsum\">\r\n<p>\r\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque \r\nnec est in dui tincidunt ultrices. Quisque auctor cursus nulla, at \r\naliquam arcu interdum at. Sed ac hendrerit lorem, a pretium ante. Mauris\r\n id ante libero. Etiam ullamcorper, ante ac rhoncus hendrerit, enim \r\nlacus rutrum dui, vel euismod est ex a odio. Pellentesque habitant morbi\r\n tristique senectus et netus et malesuada fames ac turpis egestas. In \r\neget diam quis dui volutpat pulvinar ac id orci. Vestibulum vestibulum \r\nlorem a enim blandit semper. Donec bibendum ligula ac metus rutrum, id \r\nposuere diam semper. Mauris non orci aliquet, eleifend ipsum gravida, \r\nmollis sapien. Cras sollicitudin orci suscipit arcu sollicitudin, nec \r\nconvallis eros lobortis. Pellentesque a nunc a enim vestibulum tempus. \r\nAliquam ac finibus ligula. Fusce tempor quis odio vitae dapibus. \r\nSuspendisse potenti. Donec semper odio commodo, efficitur nisi sed, \r\ncondimentum dolor.\r\n</p>\r\n<p>\r\nUt venenatis est enim, a dignissim mi consectetur sit amet. Donec sit \r\namet lacus ultricies, bibendum turpis non, viverra orci. Nam odio quam, \r\nfinibus ac magna quis, malesuada tempor dolor. Aliquam pellentesque \r\negestas eros, et aliquet ante consectetur nec. Vestibulum vitae ex \r\nviverra, tempor odio a, euismod lacus. In finibus odio id dolor \r\nefficitur, non accumsan lorem ultrices. Quisque pulvinar nibh eget augue\r\n luctus pretium. Donec fringilla vehicula nunc id consectetur.\r\n</p>\r\n<p>\r\nCurabitur magna ligula, mollis sit amet enim nec, volutpat ultricies \r\ndolor. Vivamus id urna ut eros luctus consequat. Vestibulum non \r\nullamcorper ex. Fusce convallis tortor eleifend nisi consectetur finibus\r\n eget eleifend erat. Sed cursus dui tincidunt dolor euismod, sed maximus\r\n dui porttitor. Morbi luctus at leo vitae viverra. Nullam at laoreet \r\nmassa, quis imperdiet nulla. Cum sociis natoque penatibus et magnis dis \r\nparturient montes, nascetur ridiculus mus. Duis nec neque lectus.\r\n</p>\r\n<p>\r\nAenean feugiat vel risus in tristique. Cras mattis enim quis libero \r\nbibendum, non scelerisque tellus maximus. Praesent nulla libero, sodales\r\n eu mauris eu, commodo condimentum enim. Aenean volutpat blandit nisl in\r\n aliquam. Nunc malesuada orci quis nulla tristique varius. Donec \r\nplacerat odio nulla, et pharetra odio vestibulum interdum. Phasellus \r\ngravida felis id nisi tincidunt, eu elementum massa euismod. Nulla \r\nviverra lacinia suscipit. Fusce tincidunt justo velit, sed tristique \r\neros malesuada vitae. Sed gravida id odio eu aliquet. Cras a dapibus \r\nleo. Nam non velit ut orci tempor maximus eget ut nunc. In dui nulla, \r\npulvinar at sapien accumsan, ultrices efficitur enim. Cras lobortis \r\nsapien lacinia neque semper, viverra ultrices turpis consectetur. \r\nPhasellus ornare est leo, vel posuere dui porta id.\r\n</p>\r\n<p>\r\nProin rutrum, risus eget eleifend tempor, tellus metus sodales eros, \r\ntincidunt placerat odio leo non risus. Aliquam quis tempus diam, a \r\nvarius elit. Donec interdum leo sem, vel viverra urna ornare quis. Donec\r\n condimentum efficitur erat, nec blandit metus hendrerit ut. \r\nPellentesque viverra, ligula in iaculis hendrerit, augue lacus varius \r\nenim, quis euismod quam quam vel urna. Proin libero dolor, vulputate et \r\nluctus nec, sagittis eget lorem. Nam quis eleifend tortor. Vivamus \r\nlobortis nisi nec nisl porta fringilla. Aliquam tincidunt nisl \r\nsollicitudin, tempor ex eget, aliquam justo.\r\n</p></div>','VT','2015-06-14 00:00:00',0,0,0,'/resources/img/page/page_1014342926458147.png');
/*!40000 ALTER TABLE `page` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `part`
--

DROP TABLE IF EXISTS `part`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `part` (
  `id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
  `folder` varchar(100) NOT NULL,
  `name` varchar(100) NOT NULL,
  `item_type` int(10) unsigned NOT NULL,
  `toplist_needed` tinyint(1) unsigned NOT NULL,
  `width` int(10) unsigned NOT NULL,
  `toplist_id` int(10) unsigned DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=139 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `part`
--

LOCK TABLES `part` WRITE;
/*!40000 ALTER TABLE `part` DISABLE KEYS */;
INSERT INTO `part` VALUES (1,'full','latest10EventsFull.xhtml',9,0,100,0),(2,'full','latest10NewsFull.xhtml',8,0,100,0),(3,'full','latest10PagesFull.xhtml',7,0,100,0),(17,'oneHalf','latest10PagesHalf.xhtml',7,0,50,0),(18,'oneThird','latest10PagesThird.xhtml',7,0,33,0),(19,'twoThirds','latest10PagesTwoThirds.xhtml',7,0,66,0),(20,'oneHalf','latest10EventsHalf.xhtml',9,0,50,0),(21,'oneHalf','latest10NewsHalf.xhtml',8,0,50,0),(22,'twoThirds','latest10NewsTwoThirds.xhtml',8,0,66,0),(23,'twoThirds','latest10EventsTwoThirds.xhtml',9,0,66,0),(24,'oneThird','latest10NewsThird.xhtml',8,0,33,0),(25,'oneThird','latest10EventsThird.xhtml',9,0,33,0),(26,'oneThird','topComment10PagesThird.xhtml',7,0,33,0),(27,'oneThird','topComment10NewsThird.xhtml',8,0,33,0),(28,'oneThird','topComment10EventsThird.xhtml',9,0,33,0),(29,'oneThird','topViewed10PagesThird.xhtml',7,0,33,0),(30,'oneThird','topViewed10NewsThird.xhtml',8,0,33,0),(31,'oneThird','topViewed10EventsThird.xhtml',9,0,33,0),(32,'twoThirds','topComment10PagesTwoThirds.xhtml',7,0,66,0),(33,'twoThirds','topComment10NewsTwoThirds.xhtml',8,0,66,0),(34,'twoThirds','topComment10EventsTwoThirds.xhtml',9,0,66,0),(35,'twoThirds','topViewed10PagesTwoThirds.xhtml',7,0,66,0),(36,'twoThirds','topViewed10NewsTwoThirds.xhtml',8,0,66,0),(37,'twoThirds','topViewed10EventsTwoThirds.xhtml',9,0,66,0),(38,'full','topComment10PagesFull.xhtml',7,0,100,0),(39,'full','topComment10NewsFull.xhtml',8,0,100,0),(40,'full','topComment10EventsFull.xhtml',9,0,100,0),(41,'full','topViewed10PagesFull.xhtml',7,0,100,0),(42,'full','topViewed10NewsFull.xhtml',8,0,100,0),(43,'full','topViewed10EventsFull.xhtml',9,0,100,0),(44,'oneHalf','topComment10PagesHalf.xhtml',7,0,50,0),(45,'oneHalf','topComment10NewsHalf.xhtml',8,0,50,0),(46,'oneHalf','topComment10EventsHalf.xhtml',9,0,50,0),(47,'oneHalf','topViewed10PagesHalf.xhtml',7,0,50,0),(48,'oneHalf','topViewed10NewsHalf.xhtml',8,0,50,0),(49,'oneHalf','topViewed10EventsHalf.xhtml',9,0,50,0),(75,'full','latest3EventsFull.xhtml',9,0,100,0),(82,'full','latest3NewsFull.xhtml',8,0,100,0),(83,'full','latest3PagesFull.xhtml',7,0,100,0),(101,'twoThirds','topViewed10UserPartsTwoThirds.xhtml',20,0,66,0),(103,'twoThirds','topComment10UserPartsTwoThirds.xhtml',20,0,66,0),(105,'twoThirds','latest10UserPartsTwoThirds.xhtml',20,0,66,0),(107,'oneThird','topViewed10UserPartsThird.xhtml',20,0,33,0),(109,'oneThird','topComment10UserPartsThird.xhtml',20,0,33,0),(111,'oneThird','latest10UserPartsThird.xhtml',20,0,33,0),(113,'oneHalf','topViewed10UserPartsHalf.xhtml',20,0,50,0),(115,'oneHalf','topComment10UserPartsHalf.xhtml',20,0,50,0),(117,'oneHalf','latest10UserPartsHalf.xhtml',20,0,50,0),(118,'full','topViewed10UserPartsFull.xhtml',20,0,100,0),(119,'full','topComment10UserPartsFull.xhtml',20,0,100,0),(120,'full','latest3UserPartsFull.xhtml',20,0,100,0),(121,'full','latest10UserPartsFull.xhtml',20,0,100,0),(122,'oneHalf','topListEventsHalf.xhtml',9,1,50,2),(123,'oneHalf','latest3EventsHalf.xhtml',9,0,50,0),(124,'oneHalf','latest3NewsHalf.xhtml',8,0,50,0),(125,'oneHalf','latest3PagesHalf.xhtml',7,0,50,0),(126,'oneHalf','latest3UserPartsHalf.xhtml',20,0,50,0),(127,'oneHalf','latest5EventsHalf.xhtml',9,0,50,0),(128,'oneHalf','latest5NewsHalf.xhtml',8,0,50,0),(129,'oneHalf','latest5PagesHalf.xhtml',7,0,50,0),(130,'oneHalf','latest5UserPartsHalf.xhtml',20,0,50,0),(131,'oneThird','latest5EventsThird.xhtml',9,0,33,0),(132,'oneThird','latest5NewsThird.xhtml',8,0,33,0),(133,'oneThird','latest5PagesThird.xhtml',7,0,33,0),(134,'oneThird','latest5UserPartsThird.xhtml',20,0,33,0),(135,'twoThirds','latest5EventsTwoThirds.xhtml',9,0,66,0),(136,'twoThirds','latest5NewsTwoThirds.xhtml',8,0,66,0),(137,'twoThirds','latest5PagesTwoThirds.xhtml',7,0,66,0),(138,'twoThirds','latest5UserPartsTwoThirds.xhtml',20,0,66,0);
/*!40000 ALTER TABLE `part` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `region`
--

DROP TABLE IF EXISTS `region`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `region` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `ord` int(10) unsigned NOT NULL,
  `width` int(10) unsigned NOT NULL,
  `right_aligned` tinyint(1) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `region`
--

LOCK TABLES `region` WRITE;
/*!40000 ALTER TABLE `region` DISABLE KEYS */;
INSERT INTO `region` VALUES (1,'Upper-left',1,66,0),(2,'Upper-right',2,33,1),(3,'Bottom',3,100,0);
/*!40000 ALTER TABLE `region` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `region_part`
--

DROP TABLE IF EXISTS `region_part`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `region_part` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `region_id` int(10) unsigned NOT NULL,
  `part_id` int(10) unsigned NOT NULL,
  `ord` int(10) unsigned NOT NULL,
  `title` varchar(50) NOT NULL,
  `toplist_id` int(10) unsigned DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `region_part`
--

LOCK TABLES `region_part` WRITE;
/*!40000 ALTER TABLE `region_part` DISABLE KEYS */;
INSERT INTO `region_part` VALUES (1,1,19,1,'Index Part 1',0),(2,2,25,1,'Događaji',0),(3,3,82,1,'Najnovije vesti!',0);
/*!40000 ALTER TABLE `region_part` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `system_parameters`
--

DROP TABLE IF EXISTS `system_parameters`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `system_parameters` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `automatic_request_processing` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `system_parameters`
--

LOCK TABLES `system_parameters` WRITE;
/*!40000 ALTER TABLE `system_parameters` DISABLE KEYS */;
INSERT INTO `system_parameters` VALUES (1,1);
/*!40000 ALTER TABLE `system_parameters` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `toplist`
--

DROP TABLE IF EXISTS `toplist`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `toplist` (
  `id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `type_id` mediumint(8) unsigned NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `toplist`
--

LOCK TABLES `toplist` WRITE;
/*!40000 ALTER TABLE `toplist` DISABLE KEYS */;
INSERT INTO `toplist` VALUES (1,'Toplista 1',8);
/*!40000 ALTER TABLE `toplist` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `toplist_element`
--

DROP TABLE IF EXISTS `toplist_element`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `toplist_element` (
  `id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `toplist_id` mediumint(8) unsigned NOT NULL,
  `table` varchar(50) NOT NULL,
  `cms_element_id` mediumint(8) unsigned NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `toplist_element`
--

LOCK TABLES `toplist_element` WRITE;
/*!40000 ALTER TABLE `toplist_element` DISABLE KEYS */;
/*!40000 ALTER TABLE `toplist_element` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `toplist_element_relation`
--

DROP TABLE IF EXISTS `toplist_element_relation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `toplist_element_relation` (
  `id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
  `toplist_id` mediumint(8) unsigned NOT NULL,
  `cms_element_id` mediumint(8) unsigned NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `toplist_element_relation`
--

LOCK TABLES `toplist_element_relation` WRITE;
/*!40000 ALTER TABLE `toplist_element_relation` DISABLE KEYS */;
INSERT INTO `toplist_element_relation` VALUES (1,1,2),(2,1,12);
/*!40000 ALTER TABLE `toplist_element_relation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `type_id` int(3) unsigned NOT NULL,
  `first_name` varchar(50) DEFAULT NULL,
  `last_name` varchar(50) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  `city` varchar(100) DEFAULT NULL,
  `country_id` int(5) unsigned DEFAULT NULL,
  `date_of_birth` date DEFAULT NULL,
  `phone` varchar(30) DEFAULT NULL,
  `active` tinyint(1) unsigned NOT NULL,
  `img_path` varchar(200) NOT NULL DEFAULT '/resources/img/cms/user.png',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'admin','21232f297a57a5a743894a0e4a801fc3',1,'Vladimir','Tomić','admin@tcms.com','Šumadijska 28','Lazarevac',190,'1985-07-04','+381 64 6124820',1,'/resources/img/user/user_114286947677199.png'),(2,'user','ee11cbb19052e40b07aac0ca060c23ee',3,'User','User','user@tcms.com','User Street 1','Userville',190,'1985-07-04','012 3456789',1,'/resources/img/cms/user.png'),(3,'mika','07af613eea059030daaed3bde1fd1ce7',3,'Mika','Mikic','mika@dzimejl.kom','Mikina 1','Ub',190,'2015-06-09','012 345567678',1,'/resources/img/cms/user.png'),(4,'zika','300aabd4e3e0f7db7c76ae50e370d96f',3,'Žika','Žikić','zika@dzimejl.kom','Žikina 1','Popučke',190,'2015-06-16','012 345567679',1,'/resources/img/cms/user.png'),(5,'novi','832f72b7a13b2cedcfb108603a10e2a6',3,'','','novi@gmail.com','','',190,'2015-06-07','',1,'/resources/img/cms/user.png'),(6,'stari','fa142c51c31272a57870457cf4d4632c',3,'','','stari@gmail.com','','',190,'2015-06-07','',1,'/resources/img/cms/user.png');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_part`
--

DROP TABLE IF EXISTS `user_part`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_part` (
  `id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
  `config_id` mediumint(8) unsigned NOT NULL,
  `item_id` mediumint(8) unsigned NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `title` varchar(100) DEFAULT NULL,
  `subtitle` varchar(2000) DEFAULT NULL,
  `lead` varchar(2000) DEFAULT NULL,
  `body` varchar(10000) DEFAULT NULL,
  `date_created` date DEFAULT NULL,
  `date_modified` date DEFAULT NULL,
  `author` varchar(100) DEFAULT NULL,
  `img_path` varchar(200) DEFAULT NULL,
  `gallery_id` mediumint(8) unsigned DEFAULT NULL,
  `comments` int(10) unsigned DEFAULT '0',
  `views` int(10) unsigned DEFAULT '0',
  `published` tinyint(1) unsigned DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_part`
--

LOCK TABLES `user_part` WRITE;
/*!40000 ALTER TABLE `user_part` DISABLE KEYS */;
INSERT INTO `user_part` VALUES (1,1,14,'User part br. 1','User part br. 1','Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit...',NULL,'<div id=\"lipsum\">\r\n<p>\r\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum \r\nvarius ante vestibulum nibh varius, ultrices iaculis libero suscipit. \r\nNam eget sem fermentum, posuere dolor ac, semper magna. Donec in gravida\r\n lorem. Mauris hendrerit molestie lorem a tincidunt. Pellentesque \r\nlaoreet, nulla a vehicula sollicitudin, augue mauris sollicitudin lacus,\r\n eu interdum ipsum nisl a nunc. Nulla sapien quam, condimentum non purus\r\n ut, interdum laoreet lacus. Nulla mollis ut felis nec vulputate. Mauris\r\n ut lacinia lacus, vel ultricies lorem. Donec nec orci lacinia, blandit \r\nleo nec, molestie quam. Sed luctus nulla id elementum consectetur. \r\nAliquam et diam scelerisque, consectetur neque a, rhoncus massa. Quisque\r\n lobortis dolor eget rutrum tristique. Nunc quis vestibulum magna. \r\nSuspendisse potenti. Vivamus dictum nulla non laoreet fermentum.\r\n</p>\r\n<p>\r\nCras placerat scelerisque urna sit amet rhoncus. Suspendisse maximus \r\nipsum neque, sit amet dapibus risus venenatis in. Fusce venenatis mauris\r\n vitae erat euismod, non blandit sapien placerat. Nullam ipsum turpis, \r\nvolutpat ut pellentesque a, cursus quis velit. Sed sit amet sollicitudin\r\n tellus. Ut porta ligula interdum dolor dapibus, ut maximus eros \r\naliquet. Nam sed magna vehicula, finibus quam id, dictum quam. Nullam \r\ndapibus enim nec dui fringilla tempor. Proin ac erat vel arcu tempus \r\nullamcorper. Praesent porttitor, risus nec efficitur aliquam, arcu metus\r\n hendrerit nunc, at porttitor nisl lacus eu odio. Nulla eu tellus vitae \r\naugue laoreet volutpat. Suspendisse accumsan mi felis, nec lobortis nunc\r\n mollis ac. Ut viverra nulla eget scelerisque semper. Donec sem sapien, \r\nporttitor nec neque ut, dictum mollis tortor.\r\n</p>\r\n<p>\r\nDonec rhoncus vel purus nec lobortis. Vestibulum eget tempor dolor. \r\nAenean vestibulum eget odio at rutrum. Fusce ac accumsan lacus. Nulla \r\nfacilisi. Praesent lacinia ipsum purus, ornare vehicula lectus congue \r\nsit amet. Sed efficitur velit vitae nibh condimentum, sit amet ornare \r\nnulla interdum. Ut dictum augue id quam malesuada iaculis. Nam nec risus\r\n vel dolor pellentesque egestas non ac felis. Duis congue nunc libero, a\r\n congue quam varius sed.\r\n</p></div>','2015-06-10','2015-06-14','VT',NULL,1,2,0,1),(2,2,14,'User part br. 2','User part br. 2','Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit...',NULL,'<div id=\"lipsum\">\r\n<p>\r\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum \r\nvarius ante vestibulum nibh varius, ultrices iaculis libero suscipit. \r\nNam eget sem fermentum, posuere dolor ac, semper magna. Donec in gravida\r\n lorem. Mauris hendrerit molestie lorem a tincidunt. Pellentesque \r\nlaoreet, nulla a vehicula sollicitudin, augue mauris sollicitudin lacus,\r\n eu interdum ipsum nisl a nunc. Nulla sapien quam, condimentum non purus\r\n ut, interdum laoreet lacus. Nulla mollis ut felis nec vulputate. Mauris\r\n ut lacinia lacus, vel ultricies lorem. Donec nec orci lacinia, blandit \r\nleo nec, molestie quam. Sed luctus nulla id elementum consectetur. \r\nAliquam et diam scelerisque, consectetur neque a, rhoncus massa. Quisque\r\n lobortis dolor eget rutrum tristique. Nunc quis vestibulum magna. \r\nSuspendisse potenti. Vivamus dictum nulla non laoreet fermentum.\r\n</p>\r\n<p>\r\nCras placerat scelerisque urna sit amet rhoncus. Suspendisse maximus \r\nipsum neque, sit amet dapibus risus venenatis in. Fusce venenatis mauris\r\n vitae erat euismod, non blandit sapien placerat. Nullam ipsum turpis, \r\nvolutpat ut pellentesque a, cursus quis velit. Sed sit amet sollicitudin\r\n tellus. Ut porta ligula interdum dolor dapibus, ut maximus eros \r\naliquet. Nam sed magna vehicula, finibus quam id, dictum quam. Nullam \r\ndapibus enim nec dui fringilla tempor. Proin ac erat vel arcu tempus \r\nullamcorper. Praesent porttitor, risus nec efficitur aliquam, arcu metus\r\n hendrerit nunc, at porttitor nisl lacus eu odio. Nulla eu tellus vitae \r\naugue laoreet volutpat. Suspendisse accumsan mi felis, nec lobortis nunc\r\n mollis ac. Ut viverra nulla eget scelerisque semper. Donec sem sapien, \r\nporttitor nec neque ut, dictum mollis tortor.\r\n</p>\r\n<p>\r\nDonec rhoncus vel purus nec lobortis. Vestibulum eget tempor dolor. \r\nAenean vestibulum eget odio at rutrum. Fusce ac accumsan lacus. Nulla \r\nfacilisi. Praesent lacinia ipsum purus, ornare vehicula lectus congue \r\nsit amet. Sed efficitur velit vitae nibh condimentum, sit amet ornare \r\nnulla interdum. Ut dictum augue id quam malesuada iaculis. Nam nec risus\r\n vel dolor pellentesque egestas non ac felis. Duis congue nunc libero, a\r\n congue quam varius sed.\r\n</p></div>','2015-06-11','2015-06-14','VT','/resources/img/userpart/userpart_214343040988152.gif',1,0,0,1),(3,1,14,'User part br. 3','User part br. 3','Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit...',NULL,'<div id=\"lipsum\">\r\n<p>\r\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum \r\nvarius ante vestibulum nibh varius, ultrices iaculis libero suscipit. \r\nNam eget sem fermentum, posuere dolor ac, semper magna. Donec in gravida\r\n lorem. Mauris hendrerit molestie lorem a tincidunt. Pellentesque \r\nlaoreet, nulla a vehicula sollicitudin, augue mauris sollicitudin lacus,\r\n eu interdum ipsum nisl a nunc. Nulla sapien quam, condimentum non purus\r\n ut, interdum laoreet lacus. Nulla mollis ut felis nec vulputate. Mauris\r\n ut lacinia lacus, vel ultricies lorem. Donec nec orci lacinia, blandit \r\nleo nec, molestie quam. Sed luctus nulla id elementum consectetur. \r\nAliquam et diam scelerisque, consectetur neque a, rhoncus massa. Quisque\r\n lobortis dolor eget rutrum tristique. Nunc quis vestibulum magna. \r\nSuspendisse potenti. Vivamus dictum nulla non laoreet fermentum.\r\n</p>\r\n<p>\r\nCras placerat scelerisque urna sit amet rhoncus. Suspendisse maximus \r\nipsum neque, sit amet dapibus risus venenatis in. Fusce venenatis mauris\r\n vitae erat euismod, non blandit sapien placerat. Nullam ipsum turpis, \r\nvolutpat ut pellentesque a, cursus quis velit. Sed sit amet sollicitudin\r\n tellus. Ut porta ligula interdum dolor dapibus, ut maximus eros \r\naliquet. Nam sed magna vehicula, finibus quam id, dictum quam. Nullam \r\ndapibus enim nec dui fringilla tempor. Proin ac erat vel arcu tempus \r\nullamcorper. Praesent porttitor, risus nec efficitur aliquam, arcu metus\r\n hendrerit nunc, at porttitor nisl lacus eu odio. Nulla eu tellus vitae \r\naugue laoreet volutpat. Suspendisse accumsan mi felis, nec lobortis nunc\r\n mollis ac. Ut viverra nulla eget scelerisque semper. Donec sem sapien, \r\nporttitor nec neque ut, dictum mollis tortor.\r\n</p>\r\n<p>\r\nDonec rhoncus vel purus nec lobortis. Vestibulum eget tempor dolor. \r\nAenean vestibulum eget odio at rutrum. Fusce ac accumsan lacus. Nulla \r\nfacilisi. Praesent lacinia ipsum purus, ornare vehicula lectus congue \r\nsit amet. Sed efficitur velit vitae nibh condimentum, sit amet ornare \r\nnulla interdum. Ut dictum augue id quam malesuada iaculis. Nam nec risus\r\n vel dolor pellentesque egestas non ac felis. Duis congue nunc libero, a\r\n congue quam varius sed.\r\n</p></div>','2015-06-12','2015-06-14','VT',NULL,1,3,1,1),(4,2,14,'User part br. 4','User part br. 4','Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit...',NULL,'<div id=\"lipsum\">\r\n<p>\r\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum \r\nvarius ante vestibulum nibh varius, ultrices iaculis libero suscipit. \r\nNam eget sem fermentum, posuere dolor ac, semper magna. Donec in gravida\r\n lorem. Mauris hendrerit molestie lorem a tincidunt. Pellentesque \r\nlaoreet, nulla a vehicula sollicitudin, augue mauris sollicitudin lacus,\r\n eu interdum ipsum nisl a nunc. Nulla sapien quam, condimentum non purus\r\n ut, interdum laoreet lacus. Nulla mollis ut felis nec vulputate. Mauris\r\n ut lacinia lacus, vel ultricies lorem. Donec nec orci lacinia, blandit \r\nleo nec, molestie quam. Sed luctus nulla id elementum consectetur. \r\nAliquam et diam scelerisque, consectetur neque a, rhoncus massa. Quisque\r\n lobortis dolor eget rutrum tristique. Nunc quis vestibulum magna. \r\nSuspendisse potenti. Vivamus dictum nulla non laoreet fermentum.\r\n</p>\r\n<p>\r\nCras placerat scelerisque urna sit amet rhoncus. Suspendisse maximus \r\nipsum neque, sit amet dapibus risus venenatis in. Fusce venenatis mauris\r\n vitae erat euismod, non blandit sapien placerat. Nullam ipsum turpis, \r\nvolutpat ut pellentesque a, cursus quis velit. Sed sit amet sollicitudin\r\n tellus. Ut porta ligula interdum dolor dapibus, ut maximus eros \r\naliquet. Nam sed magna vehicula, finibus quam id, dictum quam. Nullam \r\ndapibus enim nec dui fringilla tempor. Proin ac erat vel arcu tempus \r\nullamcorper. Praesent porttitor, risus nec efficitur aliquam, arcu metus\r\n hendrerit nunc, at porttitor nisl lacus eu odio. Nulla eu tellus vitae \r\naugue laoreet volutpat. Suspendisse accumsan mi felis, nec lobortis nunc\r\n mollis ac. Ut viverra nulla eget scelerisque semper. Donec sem sapien, \r\nporttitor nec neque ut, dictum mollis tortor.\r\n</p>\r\n<p>\r\nDonec rhoncus vel purus nec lobortis. Vestibulum eget tempor dolor. \r\nAenean vestibulum eget odio at rutrum. Fusce ac accumsan lacus. Nulla \r\nfacilisi. Praesent lacinia ipsum purus, ornare vehicula lectus congue \r\nsit amet. Sed efficitur velit vitae nibh condimentum, sit amet ornare \r\nnulla interdum. Ut dictum augue id quam malesuada iaculis. Nam nec risus\r\n vel dolor pellentesque egestas non ac felis. Duis congue nunc libero, a\r\n congue quam varius sed.\r\n</p></div>','2015-06-13','2015-06-14','VT','/resources/img/userpart/userpart_214343040988152.gif',1,1,0,1),(5,1,14,'User part br. 5','User part br. 5','Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit...',NULL,'<div id=\"lipsum\">\r\n<p>\r\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum \r\nvarius ante vestibulum nibh varius, ultrices iaculis libero suscipit. \r\nNam eget sem fermentum, posuere dolor ac, semper magna. Donec in gravida\r\n lorem. Mauris hendrerit molestie lorem a tincidunt. Pellentesque \r\nlaoreet, nulla a vehicula sollicitudin, augue mauris sollicitudin lacus,\r\n eu interdum ipsum nisl a nunc. Nulla sapien quam, condimentum non purus\r\n ut, interdum laoreet lacus. Nulla mollis ut felis nec vulputate. Mauris\r\n ut lacinia lacus, vel ultricies lorem. Donec nec orci lacinia, blandit \r\nleo nec, molestie quam. Sed luctus nulla id elementum consectetur. \r\nAliquam et diam scelerisque, consectetur neque a, rhoncus massa. Quisque\r\n lobortis dolor eget rutrum tristique. Nunc quis vestibulum magna. \r\nSuspendisse potenti. Vivamus dictum nulla non laoreet fermentum.\r\n</p>\r\n<p>\r\nCras placerat scelerisque urna sit amet rhoncus. Suspendisse maximus \r\nipsum neque, sit amet dapibus risus venenatis in. Fusce venenatis mauris\r\n vitae erat euismod, non blandit sapien placerat. Nullam ipsum turpis, \r\nvolutpat ut pellentesque a, cursus quis velit. Sed sit amet sollicitudin\r\n tellus. Ut porta ligula interdum dolor dapibus, ut maximus eros \r\naliquet. Nam sed magna vehicula, finibus quam id, dictum quam. Nullam \r\ndapibus enim nec dui fringilla tempor. Proin ac erat vel arcu tempus \r\nullamcorper. Praesent porttitor, risus nec efficitur aliquam, arcu metus\r\n hendrerit nunc, at porttitor nisl lacus eu odio. Nulla eu tellus vitae \r\naugue laoreet volutpat. Suspendisse accumsan mi felis, nec lobortis nunc\r\n mollis ac. Ut viverra nulla eget scelerisque semper. Donec sem sapien, \r\nporttitor nec neque ut, dictum mollis tortor.\r\n</p>\r\n<p>\r\nDonec rhoncus vel purus nec lobortis. Vestibulum eget tempor dolor. \r\nAenean vestibulum eget odio at rutrum. Fusce ac accumsan lacus. Nulla \r\nfacilisi. Praesent lacinia ipsum purus, ornare vehicula lectus congue \r\nsit amet. Sed efficitur velit vitae nibh condimentum, sit amet ornare \r\nnulla interdum. Ut dictum augue id quam malesuada iaculis. Nam nec risus\r\n vel dolor pellentesque egestas non ac felis. Duis congue nunc libero, a\r\n congue quam varius sed.\r\n</p></div>','2015-06-14','2015-06-14','VT',NULL,2,0,0,1),(6,2,14,'User part br. 6','User part br. 6','Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit...',NULL,'<div id=\"lipsum\">\r\n<p>\r\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum \r\nvarius ante vestibulum nibh varius, ultrices iaculis libero suscipit. \r\nNam eget sem fermentum, posuere dolor ac, semper magna. Donec in gravida\r\n lorem. Mauris hendrerit molestie lorem a tincidunt. Pellentesque \r\nlaoreet, nulla a vehicula sollicitudin, augue mauris sollicitudin lacus,\r\n eu interdum ipsum nisl a nunc. Nulla sapien quam, condimentum non purus\r\n ut, interdum laoreet lacus. Nulla mollis ut felis nec vulputate. Mauris\r\n ut lacinia lacus, vel ultricies lorem. Donec nec orci lacinia, blandit \r\nleo nec, molestie quam. Sed luctus nulla id elementum consectetur. \r\nAliquam et diam scelerisque, consectetur neque a, rhoncus massa. Quisque\r\n lobortis dolor eget rutrum tristique. Nunc quis vestibulum magna. \r\nSuspendisse potenti. Vivamus dictum nulla non laoreet fermentum.\r\n</p>\r\n<p>\r\nCras placerat scelerisque urna sit amet rhoncus. Suspendisse maximus \r\nipsum neque, sit amet dapibus risus venenatis in. Fusce venenatis mauris\r\n vitae erat euismod, non blandit sapien placerat. Nullam ipsum turpis, \r\nvolutpat ut pellentesque a, cursus quis velit. Sed sit amet sollicitudin\r\n tellus. Ut porta ligula interdum dolor dapibus, ut maximus eros \r\naliquet. Nam sed magna vehicula, finibus quam id, dictum quam. Nullam \r\ndapibus enim nec dui fringilla tempor. Proin ac erat vel arcu tempus \r\nullamcorper. Praesent porttitor, risus nec efficitur aliquam, arcu metus\r\n hendrerit nunc, at porttitor nisl lacus eu odio. Nulla eu tellus vitae \r\naugue laoreet volutpat. Suspendisse accumsan mi felis, nec lobortis nunc\r\n mollis ac. Ut viverra nulla eget scelerisque semper. Donec sem sapien, \r\nporttitor nec neque ut, dictum mollis tortor.\r\n</p>\r\n<p>\r\nDonec rhoncus vel purus nec lobortis. Vestibulum eget tempor dolor. \r\nAenean vestibulum eget odio at rutrum. Fusce ac accumsan lacus. Nulla \r\nfacilisi. Praesent lacinia ipsum purus, ornare vehicula lectus congue \r\nsit amet. Sed efficitur velit vitae nibh condimentum, sit amet ornare \r\nnulla interdum. Ut dictum augue id quam malesuada iaculis. Nam nec risus\r\n vel dolor pellentesque egestas non ac felis. Duis congue nunc libero, a\r\n congue quam varius sed.\r\n</p></div>','2015-06-15','2015-06-15','VT','/resources/img/userpart/userpart_214343040988152.gif',2,0,0,1),(7,1,14,'User part br. 7','User part br. 7','Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit...',NULL,'<div id=\"lipsum\">\r\n<p>\r\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum \r\nvarius ante vestibulum nibh varius, ultrices iaculis libero suscipit. \r\nNam eget sem fermentum, posuere dolor ac, semper magna. Donec in gravida\r\n lorem. Mauris hendrerit molestie lorem a tincidunt. Pellentesque \r\nlaoreet, nulla a vehicula sollicitudin, augue mauris sollicitudin lacus,\r\n eu interdum ipsum nisl a nunc. Nulla sapien quam, condimentum non purus\r\n ut, interdum laoreet lacus. Nulla mollis ut felis nec vulputate. Mauris\r\n ut lacinia lacus, vel ultricies lorem. Donec nec orci lacinia, blandit \r\nleo nec, molestie quam. Sed luctus nulla id elementum consectetur. \r\nAliquam et diam scelerisque, consectetur neque a, rhoncus massa. Quisque\r\n lobortis dolor eget rutrum tristique. Nunc quis vestibulum magna. \r\nSuspendisse potenti. Vivamus dictum nulla non laoreet fermentum.\r\n</p>\r\n<p>\r\nCras placerat scelerisque urna sit amet rhoncus. Suspendisse maximus \r\nipsum neque, sit amet dapibus risus venenatis in. Fusce venenatis mauris\r\n vitae erat euismod, non blandit sapien placerat. Nullam ipsum turpis, \r\nvolutpat ut pellentesque a, cursus quis velit. Sed sit amet sollicitudin\r\n tellus. Ut porta ligula interdum dolor dapibus, ut maximus eros \r\naliquet. Nam sed magna vehicula, finibus quam id, dictum quam. Nullam \r\ndapibus enim nec dui fringilla tempor. Proin ac erat vel arcu tempus \r\nullamcorper. Praesent porttitor, risus nec efficitur aliquam, arcu metus\r\n hendrerit nunc, at porttitor nisl lacus eu odio. Nulla eu tellus vitae \r\naugue laoreet volutpat. Suspendisse accumsan mi felis, nec lobortis nunc\r\n mollis ac. Ut viverra nulla eget scelerisque semper. Donec sem sapien, \r\nporttitor nec neque ut, dictum mollis tortor.\r\n</p>\r\n<p>\r\nDonec rhoncus vel purus nec lobortis. Vestibulum eget tempor dolor. \r\nAenean vestibulum eget odio at rutrum. Fusce ac accumsan lacus. Nulla \r\nfacilisi. Praesent lacinia ipsum purus, ornare vehicula lectus congue \r\nsit amet. Sed efficitur velit vitae nibh condimentum, sit amet ornare \r\nnulla interdum. Ut dictum augue id quam malesuada iaculis. Nam nec risus\r\n vel dolor pellentesque egestas non ac felis. Duis congue nunc libero, a\r\n congue quam varius sed.\r\n</p></div>','2015-06-16','2015-06-16','VT',NULL,2,0,0,1),(8,2,14,'User part br. 8','User part br. 8','Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit...',NULL,'<div id=\"lipsum\">\r\n<p>\r\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum \r\nvarius ante vestibulum nibh varius, ultrices iaculis libero suscipit. \r\nNam eget sem fermentum, posuere dolor ac, semper magna. Donec in gravida\r\n lorem. Mauris hendrerit molestie lorem a tincidunt. Pellentesque \r\nlaoreet, nulla a vehicula sollicitudin, augue mauris sollicitudin lacus,\r\n eu interdum ipsum nisl a nunc. Nulla sapien quam, condimentum non purus\r\n ut, interdum laoreet lacus. Nulla mollis ut felis nec vulputate. Mauris\r\n ut lacinia lacus, vel ultricies lorem. Donec nec orci lacinia, blandit \r\nleo nec, molestie quam. Sed luctus nulla id elementum consectetur. \r\nAliquam et diam scelerisque, consectetur neque a, rhoncus massa. Quisque\r\n lobortis dolor eget rutrum tristique. Nunc quis vestibulum magna. \r\nSuspendisse potenti. Vivamus dictum nulla non laoreet fermentum.\r\n</p>\r\n<p>\r\nCras placerat scelerisque urna sit amet rhoncus. Suspendisse maximus \r\nipsum neque, sit amet dapibus risus venenatis in. Fusce venenatis mauris\r\n vitae erat euismod, non blandit sapien placerat. Nullam ipsum turpis, \r\nvolutpat ut pellentesque a, cursus quis velit. Sed sit amet sollicitudin\r\n tellus. Ut porta ligula interdum dolor dapibus, ut maximus eros \r\naliquet. Nam sed magna vehicula, finibus quam id, dictum quam. Nullam \r\ndapibus enim nec dui fringilla tempor. Proin ac erat vel arcu tempus \r\nullamcorper. Praesent porttitor, risus nec efficitur aliquam, arcu metus\r\n hendrerit nunc, at porttitor nisl lacus eu odio. Nulla eu tellus vitae \r\naugue laoreet volutpat. Suspendisse accumsan mi felis, nec lobortis nunc\r\n mollis ac. Ut viverra nulla eget scelerisque semper. Donec sem sapien, \r\nporttitor nec neque ut, dictum mollis tortor.\r\n</p>\r\n<p>\r\nDonec rhoncus vel purus nec lobortis. Vestibulum eget tempor dolor. \r\nAenean vestibulum eget odio at rutrum. Fusce ac accumsan lacus. Nulla \r\nfacilisi. Praesent lacinia ipsum purus, ornare vehicula lectus congue \r\nsit amet. Sed efficitur velit vitae nibh condimentum, sit amet ornare \r\nnulla interdum. Ut dictum augue id quam malesuada iaculis. Nam nec risus\r\n vel dolor pellentesque egestas non ac felis. Duis congue nunc libero, a\r\n congue quam varius sed.\r\n</p></div>','2015-06-17','2015-06-20','VT','/resources/img/userpart/userpart_214343040988152.gif',2,0,0,1),(9,1,14,'User part br. 9','User part br. 9','Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit...',NULL,'<div id=\"lipsum\">\r\n<p>\r\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum \r\nvarius ante vestibulum nibh varius, ultrices iaculis libero suscipit. \r\nNam eget sem fermentum, posuere dolor ac, semper magna. Donec in gravida\r\n lorem. Mauris hendrerit molestie lorem a tincidunt. Pellentesque \r\nlaoreet, nulla a vehicula sollicitudin, augue mauris sollicitudin lacus,\r\n eu interdum ipsum nisl a nunc. Nulla sapien quam, condimentum non purus\r\n ut, interdum laoreet lacus. Nulla mollis ut felis nec vulputate. Mauris\r\n ut lacinia lacus, vel ultricies lorem. Donec nec orci lacinia, blandit \r\nleo nec, molestie quam. Sed luctus nulla id elementum consectetur. \r\nAliquam et diam scelerisque, consectetur neque a, rhoncus massa. Quisque\r\n lobortis dolor eget rutrum tristique. Nunc quis vestibulum magna. \r\nSuspendisse potenti. Vivamus dictum nulla non laoreet fermentum.\r\n</p>\r\n<p>\r\nCras placerat scelerisque urna sit amet rhoncus. Suspendisse maximus \r\nipsum neque, sit amet dapibus risus venenatis in. Fusce venenatis mauris\r\n vitae erat euismod, non blandit sapien placerat. Nullam ipsum turpis, \r\nvolutpat ut pellentesque a, cursus quis velit. Sed sit amet sollicitudin\r\n tellus. Ut porta ligula interdum dolor dapibus, ut maximus eros \r\naliquet. Nam sed magna vehicula, finibus quam id, dictum quam. Nullam \r\ndapibus enim nec dui fringilla tempor. Proin ac erat vel arcu tempus \r\nullamcorper. Praesent porttitor, risus nec efficitur aliquam, arcu metus\r\n hendrerit nunc, at porttitor nisl lacus eu odio. Nulla eu tellus vitae \r\naugue laoreet volutpat. Suspendisse accumsan mi felis, nec lobortis nunc\r\n mollis ac. Ut viverra nulla eget scelerisque semper. Donec sem sapien, \r\nporttitor nec neque ut, dictum mollis tortor.\r\n</p>\r\n<p>\r\nDonec rhoncus vel purus nec lobortis. Vestibulum eget tempor dolor. \r\nAenean vestibulum eget odio at rutrum. Fusce ac accumsan lacus. Nulla \r\nfacilisi. Praesent lacinia ipsum purus, ornare vehicula lectus congue \r\nsit amet. Sed efficitur velit vitae nibh condimentum, sit amet ornare \r\nnulla interdum. Ut dictum augue id quam malesuada iaculis. Nam nec risus\r\n vel dolor pellentesque egestas non ac felis. Duis congue nunc libero, a\r\n congue quam varius sed.\r\n</p></div>','2015-06-18','2015-06-20','VT',NULL,0,0,0,1),(10,2,14,'User part br. 10','User part br. 10','Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit...',NULL,'<div id=\"lipsum\">\r\n<p>\r\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum \r\nvarius ante vestibulum nibh varius, ultrices iaculis libero suscipit. \r\nNam eget sem fermentum, posuere dolor ac, semper magna. Donec in gravida\r\n lorem. Mauris hendrerit molestie lorem a tincidunt. Pellentesque \r\nlaoreet, nulla a vehicula sollicitudin, augue mauris sollicitudin lacus,\r\n eu interdum ipsum nisl a nunc. Nulla sapien quam, condimentum non purus\r\n ut, interdum laoreet lacus. Nulla mollis ut felis nec vulputate. Mauris\r\n ut lacinia lacus, vel ultricies lorem. Donec nec orci lacinia, blandit \r\nleo nec, molestie quam. Sed luctus nulla id elementum consectetur. \r\nAliquam et diam scelerisque, consectetur neque a, rhoncus massa. Quisque\r\n lobortis dolor eget rutrum tristique. Nunc quis vestibulum magna. \r\nSuspendisse potenti. Vivamus dictum nulla non laoreet fermentum.\r\n</p>\r\n<p>\r\nCras placerat scelerisque urna sit amet rhoncus. Suspendisse maximus \r\nipsum neque, sit amet dapibus risus venenatis in. Fusce venenatis mauris\r\n vitae erat euismod, non blandit sapien placerat. Nullam ipsum turpis, \r\nvolutpat ut pellentesque a, cursus quis velit. Sed sit amet sollicitudin\r\n tellus. Ut porta ligula interdum dolor dapibus, ut maximus eros \r\naliquet. Nam sed magna vehicula, finibus quam id, dictum quam. Nullam \r\ndapibus enim nec dui fringilla tempor. Proin ac erat vel arcu tempus \r\nullamcorper. Praesent porttitor, risus nec efficitur aliquam, arcu metus\r\n hendrerit nunc, at porttitor nisl lacus eu odio. Nulla eu tellus vitae \r\naugue laoreet volutpat. Suspendisse accumsan mi felis, nec lobortis nunc\r\n mollis ac. Ut viverra nulla eget scelerisque semper. Donec sem sapien, \r\nporttitor nec neque ut, dictum mollis tortor.\r\n</p>\r\n<p>\r\nDonec rhoncus vel purus nec lobortis. Vestibulum eget tempor dolor. \r\nAenean vestibulum eget odio at rutrum. Fusce ac accumsan lacus. Nulla \r\nfacilisi. Praesent lacinia ipsum purus, ornare vehicula lectus congue \r\nsit amet. Sed efficitur velit vitae nibh condimentum, sit amet ornare \r\nnulla interdum. Ut dictum augue id quam malesuada iaculis. Nam nec risus\r\n vel dolor pellentesque egestas non ac felis. Duis congue nunc libero, a\r\n congue quam varius sed.\r\n</p></div>','2015-06-19','2015-06-20','VT','/resources/img/userpart/userpart_214343040988152.gif',0,0,0,1),(11,1,0,'Test komponenta',NULL,NULL,NULL,NULL,'2015-06-27','2015-06-27',NULL,NULL,0,0,0,0);
/*!40000 ALTER TABLE `user_part` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_part_config`
--

DROP TABLE IF EXISTS `user_part_config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_part_config` (
  `id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `title` tinyint(1) unsigned DEFAULT NULL,
  `subtitle` tinyint(1) unsigned DEFAULT NULL,
  `lead` tinyint(1) unsigned DEFAULT NULL,
  `body` tinyint(1) unsigned DEFAULT NULL,
  `date_created` tinyint(1) unsigned DEFAULT NULL,
  `date_modified` tinyint(1) unsigned DEFAULT NULL,
  `author` tinyint(1) unsigned DEFAULT NULL,
  `image` tinyint(1) unsigned DEFAULT NULL,
  `gallery` tinyint(1) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_part_config`
--

LOCK TABLES `user_part_config` WRITE;
/*!40000 ALTER TABLE `user_part_config` DISABLE KEYS */;
INSERT INTO `user_part_config` VALUES (1,'Korisnička konfiguracija 1',1,1,0,1,0,0,1,0,0),(2,'Korisnička konfiguracija 2',1,0,0,1,0,0,0,1,0);
/*!40000 ALTER TABLE `user_part_config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_registration`
--

DROP TABLE IF EXISTS `user_registration`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_registration` (
  `id` int(10) unsigned NOT NULL DEFAULT '0',
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `email` varchar(100) NOT NULL,
  `first_name` varchar(50) DEFAULT NULL,
  `last_name` varchar(50) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  `city` varchar(100) DEFAULT NULL,
  `phone` varchar(30) DEFAULT NULL,
  `date_of_birth` date DEFAULT NULL,
  `approved` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_registration`
--

LOCK TABLES `user_registration` WRITE;
/*!40000 ALTER TABLE `user_registration` DISABLE KEYS */;
INSERT INTO `user_registration` VALUES (1,'user','0d8d5cd06832b29560745fe4e1b941cf','user@tcms.com','User','User','User Street 1','Userville','012 3456789','1985-07-04',1),(2,'mika','07af613eea059030daaed3bde1fd1ce7','mika@dzimejl.kom','Mika','Mikic','Mikina 1','Ub','012 345567678','2015-06-09',1),(3,'zika','300aabd4e3e0f7db7c76ae50e370d96f','zika@dzimejl.kom','Žika','Žikić','Žikina 1','Popučke','012 345567679','2015-06-16',1),(4,'test','098f6bcd4621d373cade4e832627b4f6','test@gmail.com','Dražen','Drašković','','','',NULL,1),(5,'novi','832f72b7a13b2cedcfb108603a10e2a6','novi@gmail.com','','','','','',NULL,1),(6,'stari','fa142c51c31272a57870457cf4d4632c','stari@gmail.com','','','','','',NULL,1),(7,'korisnik1','affc2dc1a3f9fb05392d3cb0a784ff61','korisnik1@gmail.com','Korisnik','Prvi','','','',NULL,0),(8,'korisnik2','1018c6339573355427c0ecd5b3a9574b','korisnik2@gmail.com','Korisnik','Drugi','','','',NULL,0);
/*!40000 ALTER TABLE `user_registration` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_type`
--

DROP TABLE IF EXISTS `user_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_type` (
  `id` int(3) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_type`
--

LOCK TABLES `user_type` WRITE;
/*!40000 ALTER TABLE `user_type` DISABLE KEYS */;
INSERT INTO `user_type` VALUES (1,'Administrator'),(3,'User');
/*!40000 ALTER TABLE `user_type` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-08-23 13:12:32
