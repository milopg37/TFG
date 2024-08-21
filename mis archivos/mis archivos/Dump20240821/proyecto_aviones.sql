-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: proyecto
-- ------------------------------------------------------
-- Server version	8.3.0

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `aviones`
--

DROP TABLE IF EXISTS `aviones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `aviones` (
  `id_avion` int NOT NULL AUTO_INCREMENT,
  `matricula` varchar(45) NOT NULL,
  `fabricante` varchar(45) NOT NULL,
  `modelo` varchar(45) NOT NULL,
  `numero_serie` varchar(45) NOT NULL,
  `ano_fabricacion` int NOT NULL,
  `tipo` varchar(45) DEFAULT NULL,
  `combustible` varchar(45) NOT NULL,
  `mtow` int NOT NULL,
  `tipo_motor` varchar(45) NOT NULL,
  `velocidad_crucero` int NOT NULL,
  `velocidad_maxima` int DEFAULT NULL,
  PRIMARY KEY (`id_avion`),
  UNIQUE KEY `matricula_UNIQUE` (`matricula`)
) ENGINE=InnoDB AUTO_INCREMENT=96 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='Tabla que será mapeada con mi modelo Avion siendo este un microservicio en Spring Java JPA';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `aviones`
--

LOCK TABLES `aviones` WRITE;
/*!40000 ALTER TABLE `aviones` DISABLE KEYS */;
INSERT INTO `aviones` VALUES (1,'BOE1234','Boeing','737','SN737001',2015,'Comercial','Jet-A',79015,'Turbofan',840,876),(2,'AIR5678','Airbus','A320','SN320567',2018,'Comercial','Jet-A1',73500,'Turbofan',828,871),(3,'TUP0217','Tupolev','Tu-160','SN1600217',2010,'Bombardero','JP-8',275000,'Turbofan',960,2220),(4,'LOC8901','Lockheed Martin','F-22','SNF22001',2016,'Fghter','JP-8',38000,'Turbofan',950,2410),(5,'BOE4321','Boeing','747','SN747432',2013,'Comercial','Jet-A',447700,'Turbofan',907,933),(6,'AIR8765','Airbus','A380','SN380876',2020,'Comercial','Jet-A1',560000,'Turbofan',945,1020),(7,'SUK1543','Sukhoi','Su-35','SNSU3515',2017,'Fighter','TS-1',34500,'Turbofan',1400,2500),(8,'DAS1235','Dassault','Rafale','SNRF1235',2019,'Fighter','JP-8',24500,'Turbofan',1389,1912),(9,'MIG1410','Mikoyan','MiG-29','SNMIG29010',2011,'Fighter','TS-1',18500,'Turbofan',2400,2445),(10,'BOE5555','Boeing','777','SN777555',2014,'Comercial','Jet-A',351534,'Turbofan',905,950),(11,'BOE7890','Boeing','767','SN767789',2012,'Comercial','Jet-A',204120,'Turbofan',850,880),(12,'AIR3456','Airbus','A330','SN330345',2017,'Comercial','Jet-A1',242000,'Turbofan',870,913),(13,'ANT4567','Antonov','An-225','SN225456',2010,'Cargo','TS-1',640000,'Turbofan',800,850),(14,'LOC2345','Lockheed Martin','C-130','SNC130234',2015,'Cargo','JP-8',70308,'Turboprop',643,671),(15,'BOE6789','Boeing','787','SN787678',2018,'Comercial','Jet-A',254011,'Turbofan',903,954),(16,'AIR9012','Airbus','A350','SN350901',2021,'Comercial','Jet-A1',280000,'Turbofan',911,945),(17,'SUK6789','Sukhoi','Su-57','SNSU5767',2020,'Unknown','TS-1',35000,'Turbofan',1300,2600),(18,'MIG5678','Mikoyan','MiG-35','SNMIG3556',2018,'Fighter','TS-1',23500,'Turbofan',1400,2400),(19,'BOE3456','Boeing','707','SN707345',1978,'Comercial','Jet-A',151320,'Turbojet',977,1008),(20,'DAS7890','Dassault','Falcon 2000','SNF200078',2015,'Comercial','Jet-A1',19105,'Turbofan',851,876),(21,'LOC3456','Lockheed Martin','F-35','SNF350345',2017,'Stealth','JP-8',31750,'Turbofan',1040,1930),(22,'SUK4567','Sukhoi','Su-27','SNSU270456',1985,'Fighter','TS-1',30000,'Turbofan',1400,2500),(23,'DAS5678','Dassault','Mirage 2000','SNM2000567',2000,'Fighter','JP-8',17000,'Turbofan',1300,2336),(24,'EUR6789','Eurofighter','Typhoon','SNTYP6789',2015,'Fighter','JP-8',23500,'Turbofan',1400,2495),(25,'CHA7890','Chengdu','J-20','SNJ200789',2018,'Stealth','TS-1',37000,'Turbofan',1300,2100),(47,'BOE9012','Boeing','737 MAX','SN737MAX901',2019,'Comercial','Jet-A',82000,'Turbofan',834,876),(48,'AIR1234','Airbus','A220','SNA220123',2016,'Comercial','Jet-A1',60000,'Turbofan',829,870),(49,'LOC3444','Lockheed Martin','F-117 Nighthawk','SNF117234',1990,'Unknown','JP-8',23300,'Turbofan',993,1040),(51,'DAS4567','Dassault','Neuron','SNNEU4567',2012,'Experimental','JP-8',6500,'Turbofan',980,1050),(52,'BOE5678','Boeing','787-10 Dreamliner','SN78710B567',2020,'Comercial','Jet-A',254011,'Turbofan',903,954),(53,'AIR6789','Airbus','A400M Atlas','SNA4006789',2014,'Cargo','Jet-A1',141000,'Turboprop',781,780),(54,'SUK7890','Sukhoi','Su-30','SNSU300789',1996,'Fighter','TS-1',38800,'Turbofan',1350,2120),(55,'DAS8901','Dassault','Falcon 7X','SNF7X8901',2007,'Comercial','Jet-A1',31500,'Turbofan',953,953),(56,'EUR9012','Eurofighter','Taranis','SNTAR9012',2013,'Experimental','JP-8',15000,'Turbofan',1000,1800),(58,'VUL3456','Avro','Vulcan','SNVUL3456',1956,'Bombardero','AvGas',84000,'Turbojet',1010,1175),(59,'CON4567','Aérospatiale/BAC','Concorde','SNCON4567',1976,'Comercial','Jet-A',185070,'Turbojet',2180,2350),(60,'STR5678','Boeing','KC-135 Stratotanker','SNKC1355678',1960,'Cargo','Jet-A',146000,'Turbofan',965,965),(61,'B13456','Rockwell','B-1 Lancer','SNB113456',1986,'Bombardero','JP-8',216363,'Turbofan',830,1370),(62,'B25678','Northrop Grumman','B-2 Spirit','SNB225678',1997,'Stealth','JP-8',181437,'Turbofan',900,1030),(68,'SR71234','Lockheed','SR-71 Blackbird','SNSR71234',1966,'Stealth','JP-7',78000,'Ramjet',3300,3529),(69,'XB70123','Bell Aircraft','X-1','SNX1123',1946,'Experimental','AvGas',5443,'Rocket',1050,1050),(70,'XB70234','North American Aviation','X-15','SNX2234',1959,'Experimental','Liquid Oxygen',15500,'Rocket',6096,7274),(71,'XV70123','Lockheed Martin Skunk Works','XV-1','SNXV1123',2000,'Experimental','JP-8',28000,'Turbofan',1100,1500),(72,'XB70226','Boeing','X-32','SNX3234',2000,'Experimental','Jet-A',54000,'Turbofan',1070,1500),(73,'VAL5678','North American Aviation','XB-70 Valkyrie','SNXB705678',1964,'Experimental','JP-4',249000,'Turbojet',3000,3200),(74,'GRI6789','Saab','JAS 39 Gripen','SNGRI6789',1997,'Fighter','JP-5',16000,'Turbofan',1470,2440),(75,'F22A567','Lockheed Martin','F-22 Raptor','SNF22567',2005,'Stealth','JP-8',38300,'Turborreactor',2410,2410),(76,'F35A890','Lockheed Martin','F-35 Lightning II','SNF35890',2016,'Fighter','JP-8',31800,'Turbofan',1930,1930),(77,'MIG29345','Mikoyan','MiG-29','SNMIG29345',1983,'Fighter','TS-1',18400,'Turbofan',1500,2445),(78,'U200123','Lockheed Corporation','U-2 Dragon Lady','SNU200123',1955,'Unknown','JP-4',12700,'Turbojet',805,900),(79,'U200124','Boeing','777-300ER','SNU200124',2004,'Comercial','Jet-A',352460,'Turbofan',905,950),(80,'U200125','Airbus','A350-1000','SNU200125',2017,'Comercial','Jet-A1',316000,'Turbofan',930,950),(85,'U200130','Boeing','787-9','SNU200130',2014,'Comercial','Jet-A',254011,'Turbofan',903,956),(86,'U200131','Airbus','A321neo','SNU200131',2016,'Comercial','Jet-A1',93000,'Turbofan',890,950),(89,'F16001','General Dynamics','F-16 Fighting Falcon','SNF16001',1978,'Fighter','JP-8',19187,'Turbofan',915,2414),(90,'M29001','Mikoyan-Gurevich','MiG-29 Fulcrum','SNM29001',1982,'Fighter','JP-8',18400,'Turbofan',1500,2445),(91,'T31001','Panavia','Tornado','SNT31001',1979,'Fighter','JP-8',27700,'Turbofan',1350,2370),(92,'NASAX43','Nasa','X-43','X431337',1990,'Experimental','Hydrogen',22000,'Scramjet',5300,7300),(93,'BOEX51','Boeing','X-51 Waverider','WVR5151',2010,'Experimental','JP-7',2000,'Scramjet',6200,6200),(94,'BOE052','Boeing','B-52 Stratofortress','STRF0522',1952,'Cargo','JP-8',480000,'Turboreactor',850,1050),(95,'AN124','Antonov','AN-124','ANT00241',1986,'Cargo','Jet-A1',405000,'Turbofan',750,800);
/*!40000 ALTER TABLE `aviones` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-08-21 11:04:18
