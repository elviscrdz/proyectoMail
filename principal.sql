-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 16-03-2019 a las 18:11:28
-- Versión del servidor: 5.5.24-log
-- Versión de PHP: 5.4.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `banco1`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `principal`
--

CREATE TABLE IF NOT EXISTS `principal` (
  `ARB` varchar(250) COLLATE utf8_spanish_ci NOT NULL,
  `CPH` varchar(250) COLLATE utf8_spanish_ci NOT NULL,
  `CPS` varchar(250) COLLATE utf8_spanish_ci NOT NULL,
  `DES` varchar(250) COLLATE utf8_spanish_ci NOT NULL,
  `CRB` varchar(250) COLLATE utf8_spanish_ci NOT NULL,
  `NUMERO` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`NUMERO`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=2 ;

--
-- Volcado de datos para la tabla `principal`
--

INSERT INTO `principal` (`ARB`, `CPH`, `CPS`, `DES`, `CRB`, `NUMERO`) VALUES
('Hola mundo!', 'CPH', 'CPS', 'DES', 'CRB', 1);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
