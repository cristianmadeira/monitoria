-- MariaDB dump 10.17  Distrib 10.5.4-MariaDB, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: locadora
-- ------------------------------------------------------
-- Server version       10.5.4-MariaDB-1:10.5.4+maria~focal

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

CREATE DATABASE IF NOT EXISTS Locadora;
use Locadora;

--
-- Table structure for table `Ator`
--

DROP TABLE IF EXISTS `Ator`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Ator` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) DEFAULT NULL,
  `nacionalidade` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Ator`
--

LOCK TABLES `Ator` WRITE;
/*!40000 ALTER TABLE `Ator` DISABLE KEYS */;
/*!40000 ALTER TABLE `Ator` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Ator_Filme`
--

DROP TABLE IF EXISTS `Ator_Filme`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Ator_Filme` (
  `AtorId` int(11) NOT NULL,
  `FilmeId` int(11) NOT NULL,
  PRIMARY KEY (`AtorId`,`FilmeId`),
  KEY `fk_Ator_has_Filme_Filme1_idx` (`FilmeId`),
  KEY `fk_Ator_has_Filme_Ator1_idx` (`AtorIdAtor`),
  CONSTRAINT `fk_Ator_has_Filme_Ator1` FOREIGN KEY (`AtorIdAtor`) REFERENCES `Ator` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Ator_has_Filme_Filme1` FOREIGN KEY (`FilmeId`) REFERENCES `Filme` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Ator_Filme`
--

LOCK TABLES `Ator_Filme` WRITE;
/*!40000 ALTER TABLE `Ator_Filme` DISABLE KEYS */;
/*!40000 ALTER TABLE `Ator_Filme` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Cliente`
--

DROP TABLE IF EXISTS `Cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Cliente` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `cpf` char(11) NOT NULL,
  `email` varchar(45) NOT NULL,
  `endereco` varchar(45) NOT NULL,
  `dataNascimento` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Cliente`
--

LOCK TABLES `Cliente` WRITE;
/*!40000 ALTER TABLE `Cliente` DISABLE KEYS */;
/*!40000 ALTER TABLE `Cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Cliente_Filme`
--

DROP TABLE IF EXISTS `Cliente_Filme`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Cliente_Filme` (
  `ClienteId` int(11) NOT NULL,
  `FilmeId` int(11) NOT NULL,
  `tipo` varchar(45) NOT NULL,
  `dataLocacao` date NOT NULL,
  `dataDevolucao` date NOT NULL,
  PRIMARY KEY (`ClienteId`,`FilmeId`),
  KEY `fk_Cliente_has_Filme_Filme1_idx` (`FilmeId`),
  KEY `fk_Cliente_has_Filme_ClienteIdx` (`ClienteId`),
  CONSTRAINT `fk_Cliente_has_Filme_Cliente` FOREIGN KEY (`ClienteId`) REFERENCES `Cliente` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Cliente_has_Filme_Filme1` FOREIGN KEY (`FilmeId`) REFERENCES `Filme` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Cliente_Filme`
--

LOCK TABLES `Cliente_Filme` WRITE;
/*!40000 ALTER TABLE `Cliente_Filme` DISABLE KEYS */;
/*!40000 ALTER TABLE `Cliente_Filme` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Filme`
--

DROP TABLE IF EXISTS `Filme`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Filme` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `titulo` varchar(45) DEFAULT NULL,
  `duracao` varchar(4) DEFAULT NULL,
  `sinopse` varchar(45) DEFAULT NULL,
  `genero` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Filme`
--

LOCK TABLES `Filme` WRITE;
/*!40000 ALTER TABLE `Filme` DISABLE KEYS */;
INSERT INTO `Filme` VALUES (2,'teste do cristian','220','teste321','teste123'),(3,'novo título','120','nova sinopose','novo genero'),(4,'novo título','120','nova sinopose','novo genero'),(5,'novo título','120','nova sinopose','novo genero'),(6,'novo título','120','nova sinopose','novo genero'),(7,'novo título','120','nova sinopose','novo genero'),(8,'new title','120','new sinopose','new genero'),(9,'test_titulo','120','test_sinopose','test_genero'),(10,'test_titulo','120','test_sinopose','test_genero'),(11,'test_titulo','120','test_sinopose','test_genero'),(12,'test_titulo','120','test_sinopose','test_genero');
/*!40000 ALTER TABLE `Filme` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-10-15 16:11:47
