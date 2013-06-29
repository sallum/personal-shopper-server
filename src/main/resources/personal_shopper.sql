-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jun 29, 2013 at 02:25 PM
-- Server version: 5.5.24-log
-- PHP Version: 5.4.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `personal_shopper`
--

-- --------------------------------------------------------

--
-- Table structure for table `article`
--

CREATE TABLE IF NOT EXISTS `article` (
  `article_id` bigint(11) NOT NULL AUTO_INCREMENT,
  `type` enum('shoe','dress','shirt') NOT NULL,
  `model` text NOT NULL,
  `brand` text NOT NULL,
  `size` tinytext NOT NULL,
  `colour` text NOT NULL,
  `price` float NOT NULL,
  `picture` text,
  `date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`article_id`),
  UNIQUE KEY `article_id` (`article_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=15 ;

-- --------------------------------------------------------

--
-- Table structure for table `article_shop`
--

CREATE TABLE IF NOT EXISTS `article_shop` (
  `article_id` bigint(11) NOT NULL,
  `shop_id` bigint(11) NOT NULL,
  PRIMARY KEY (`article_id`),
  KEY `shop_id` (`shop_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `shop`
--

CREATE TABLE IF NOT EXISTS `shop` (
  `shop_id` bigint(11) NOT NULL AUTO_INCREMENT,
  `name` text NOT NULL,
  `address` text NOT NULL,
  `latitud` float NOT NULL,
  `longitud` float NOT NULL,
  `schedule` text NOT NULL,
  `email` text NOT NULL,
  PRIMARY KEY (`shop_id`),
  UNIQUE KEY `shop_id` (`shop_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `user_id` bigint(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(30) NOT NULL,
  `user_email` int(45) DEFAULT NULL,
  `user_birthday` date DEFAULT NULL,
  `user_gender` enum('male','female') DEFAULT NULL,
  `user_size_shirt` varchar(5) DEFAULT NULL,
  `user_size_pants` varchar(5) DEFAULT NULL,
  `user_size_shoes` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `user_article`
--

CREATE TABLE IF NOT EXISTS `user_article` (
  `user_id` bigint(11) NOT NULL,
  `article_id` bigint(11) NOT NULL,
  KEY `user_id` (`user_id`,`article_id`),
  KEY `article_id` (`article_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `article_shop`
--
ALTER TABLE `article_shop`
  ADD CONSTRAINT `article_shop_ibfk_1` FOREIGN KEY (`article_id`) REFERENCES `article` (`article_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `article_shop_ibfk_2` FOREIGN KEY (`shop_id`) REFERENCES `shop` (`shop_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `user_article`
--
ALTER TABLE `user_article`
  ADD CONSTRAINT `user_article_ibfk_2` FOREIGN KEY (`article_id`) REFERENCES `article` (`article_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `user_article_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
