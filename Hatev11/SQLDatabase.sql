/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Andreas
 * Created: 04.07.2016
 */

-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Erstellungszeit: 04. Jul 2016 um 16:57
-- Server-Version: 10.1.13-MariaDB
-- PHP-Version: 5.6.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Datenbank: `hate`
--

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `wpid` int(11) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `email` varchar(30) NOT NULL,
  `posx` int(11) NOT NULL,
  `posy` int(11) NOT NULL,
  `isevil` int(11) NOT NULL,
  `race` varchar(20) NOT NULL,
  `gold` int(11) NOT NULL,
  `fame` int(11) NOT NULL,
  `strength` int(11) NOT NULL,
  `defense` int(11) NOT NULL,
  `level` int(11) NOT NULL,
  `wins` int(11) NOT NULL,
  `losses` int(11) NOT NULL,
  `points` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Daten für Tabelle `user`
--

INSERT INTO `user` (`id`, `wpid`, `username`, `password`, `email`, `posx`, `posy`, `isevil`, `race`, `gold`, `fame`, `strength`, `defense`, `level`, `wins`, `losses`, `points`) VALUES
(15, 1, 'Grom', 'XXXXXX', '', 4, 27, 1, 'human', 10000, 5, 25, 20, 1, 0, 0, 0),
(16, 4, 'Death', 'XXXXXX', '', 7, 27, 1, 'devil', 10000, 0, 0, 0, 0, 0, 0, 0);

--
-- Indizes der exportierten Tabellen
--

--
-- Indizes für die Tabelle `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
