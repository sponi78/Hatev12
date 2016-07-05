-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Erstellungszeit: 05. Jul 2016 um 21:05
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
-- Tabellenstruktur für Tabelle `hero`
--

CREATE TABLE `hero` (
  `id` bigint(20) NOT NULL,
  `userid` bigint(20) NOT NULL,
  `heroname` varchar(20) NOT NULL,
  `herotype` varchar(20) NOT NULL,
  `isevil` int(11) NOT NULL,
  `posx` int(11) NOT NULL,
  `posy` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Daten für Tabelle `hero`
--

INSERT INTO `hero` (`id`, `userid`, `heroname`, `herotype`, `isevil`, `posx`, `posy`) VALUES
(1, 1, 'Goodzilla', 'Gnom', 0, 4, 2),
(2, 2, 'Murdzilla', 'Clon', 1, 1, 9);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `log`
--

CREATE TABLE `log` (
  `logtext` text NOT NULL,
  `time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `public` tinyint(1) NOT NULL,
  `wpid` int(11) NOT NULL,
  `username` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Daten für Tabelle `log`
--

INSERT INTO `log` (`logtext`, `time`, `public`, `wpid`, `username`) VALUES
('0:0:0:0:0:0:0:1 0:0:0:0:0:0:0:1', '2016-06-09 20:26:08', 1, 1, 'none'),
('0:0:0:0:0:0:0:1 0:0:0:0:0:0:0:1', '2016-06-09 20:34:45', 1, 1, 'none'),
('Grom logged in', '2016-06-09 20:34:55', 1, 1, 'Grom'),
('Grom logged in', '2016-06-19 19:56:07', 1, 1, 'Grom'),
('gGTrom logged in', '2016-06-19 19:58:49', 1, 0, 'gGTrom'),
('Grom logged in', '2016-06-19 19:58:57', 1, 0, 'Grom'),
('Grom logged in', '2016-06-19 19:59:06', 1, 1, 'Grom'),
('Grom logged in', '2016-06-20 12:26:05', 1, 1, 'Grom'),
('Grom logged in', '2016-06-20 12:27:09', 1, 0, 'Grom'),
('Grom logged in', '2016-06-20 12:28:24', 1, 0, 'Grom'),
('Grom logged in', '2016-06-20 15:14:26', 1, 0, 'Grom'),
('Grom logged in', '2016-06-20 15:14:34', 1, 1, 'Grom'),
('Grom logged in', '2016-06-24 18:18:01', 1, 1, 'Grom'),
('Grom  logged in', '2016-06-24 18:19:19', 1, 0, 'Grom '),
('Grom logged in', '2016-06-24 18:19:27', 1, 1, 'Grom'),
('Go logged in', '2016-06-24 18:21:11', 1, 0, 'Go'),
('Grom logged in', '2016-06-24 18:21:16', 1, 1, 'Grom'),
('0:0:0:0:0:0:0:1 0:0:0:0:0:0:0:1', '2016-06-24 18:22:10', 1, 1, 'none'),
('Grom logged in', '2016-06-24 18:23:21', 1, 1, 'Grom'),
('Grom logged in', '2016-06-24 18:25:05', 1, 1, 'Grom'),
('Grom logged in', '2016-06-24 18:25:36', 1, 1, 'Grom'),
('Grom logged in', '2016-06-24 18:26:34', 1, 1, 'Grom'),
('Grom logged in', '2016-06-24 18:28:08', 1, 1, 'Grom'),
('Grom logged in', '2016-06-24 18:32:19', 1, 1, 'Grom'),
('Grom logged in', '2016-06-24 18:34:51', 1, 1, 'Grom'),
('Grom logged in', '2016-06-24 18:40:42', 1, 1, 'Grom'),
('Grom logged in', '2016-06-24 18:45:58', 1, 1, 'Grom'),
('Grom logged in', '2016-06-24 18:46:33', 1, 1, 'Grom'),
('Grom logged in', '2016-06-24 18:47:00', 1, 1, 'Grom'),
('Grom logged in', '2016-06-24 18:49:58', 1, 1, 'Grom'),
('Grom logged in', '2016-06-24 18:51:05', 1, 1, 'Grom'),
('Grom logged in', '2016-06-24 18:53:05', 1, 1, 'Grom'),
('Grom logged in', '2016-06-24 18:54:25', 1, 1, 'Grom'),
('Grom logged in', '2016-06-24 18:55:12', 1, 1, 'Grom'),
('Grom logged in', '2016-06-24 18:57:07', 1, 1, 'Grom'),
('Grom logged in', '2016-06-24 18:57:44', 1, 1, 'Grom'),
('Grom logged in', '2016-06-24 19:03:23', 1, 1, 'Grom'),
('Grom logged in', '2016-06-24 19:04:57', 1, 1, 'Grom'),
('Grom logged in', '2016-06-24 19:08:24', 1, 1, 'Grom'),
('Grom logged in', '2016-06-24 19:09:06', 1, 1, 'Grom'),
('Grom logged in', '2016-06-24 19:15:48', 1, 1, 'Grom'),
('Grom logged in', '2016-06-24 19:22:19', 1, 1, 'Grom'),
('Grom logged in', '2016-06-24 19:25:50', 1, 1, 'Grom'),
('sh logged in', '2016-06-24 19:29:33', 1, 0, 'sh'),
('Grom logged in', '2016-06-24 19:29:40', 1, 1, 'Grom'),
('Grom logged in', '2016-06-24 19:31:13', 1, 1, 'Grom'),
('Grom logged in', '2016-06-24 19:43:59', 1, 1, 'Grom'),
('Grom logged in', '2016-06-24 19:46:24', 1, 1, 'Grom'),
('Grom logged in', '2016-06-24 19:54:23', 1, 1, 'Grom'),
('Grom logged in', '2016-06-24 20:04:49', 1, 1, 'Grom'),
('Grom logged in', '2016-07-02 19:16:19', 1, 1, 'Grom'),
('Grom logged in', '2016-07-02 19:38:27', 1, 1, 'Grom'),
('Grom logged in', '2016-07-02 19:48:50', 1, 1, 'Grom'),
('Grom logged in', '2016-07-02 19:53:29', 1, 1, 'Grom'),
('Grom logged in', '2016-07-02 19:56:56', 1, 1, 'Grom'),
('Grom logged in', '2016-07-02 19:58:47', 1, 1, 'Grom'),
('Grom logged in', '2016-07-02 20:09:57', 1, 1, 'Grom'),
('Grom logged in', '2016-07-02 20:10:45', 1, 1, 'Grom'),
('Grom logged in', '2016-07-02 20:12:47', 1, 1, 'Grom'),
('Grom logged in', '2016-07-02 20:14:03', 1, 1, 'Grom'),
('Grom logged in', '2016-07-02 20:18:33', 1, 1, 'Grom');

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `message`
--

CREATE TABLE `message` (
  `id` bigint(20) NOT NULL,
  `userid` int(11) NOT NULL,
  `message` text NOT NULL,
  `red` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Daten für Tabelle `message`
--

INSERT INTO `message` (`id`, `userid`, `message`, `red`) VALUES
(1, 15, 'Hello this is a welcome message special for you, Grom!', 1);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `monster`
--

CREATE TABLE `monster` (
  `id` bigint(20) NOT NULL,
  `monstername` varchar(20) NOT NULL,
  `monsterrace` varchar(20) NOT NULL,
  `monster_description` text NOT NULL,
  `posx` int(11) NOT NULL,
  `posy` int(11) NOT NULL,
  `strength` int(11) NOT NULL,
  `defense` int(11) NOT NULL,
  `gold` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Daten für Tabelle `monster`
--

INSERT INTO `monster` (`id`, `monstername`, `monsterrace`, `monster_description`, `posx`, `posy`, `strength`, `defense`, `gold`) VALUES
(1, 'Romban', 'Sysifux', 'The monster in front of you is a sysifux. Sysifox are known for there low defense and that they have no special power. The monster could be very strong but it seems to be very slow.\r\nThe sysifux is sleeping...So you may want to flee...', 4, 27, 120, 15, 143);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `monster_description`
--

CREATE TABLE `monster_description` (
  `id` bigint(20) NOT NULL,
  `monsterid` int(11) NOT NULL,
  `monster_description` text NOT NULL,
  `reserved` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `mud_news`
--

CREATE TABLE `mud_news` (
  `id` bigint(20) NOT NULL,
  `news` text NOT NULL,
  `date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `published` tinyint(3) NOT NULL,
  `mtext` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Daten für Tabelle `mud_news`
--

INSERT INTO `mud_news` (`id`, `news`, `date`, `published`, `mtext`) VALUES
(4, 'This MUD is in beta-stadium and you may be will get disconnectet sometimes. Features and functions will improve with time.\r\n\r\nPlease enjoy H.A.T.E.!', '2016-06-07 18:31:46', 2, 'afterlogin'),
(5, '###########################################\r\n\r\nThis is the help text.\r\nYou can go in any direction by typing\r\n\r\ngo north for north\r\n...\r\n\r\nshow map for showing the map\r\n###########################################', '2016-06-07 18:45:07', 3, 'help'),
(6, '.##.....##........###........########.....########\r\n.##.....##.......##.##..........##........##......\r\n.##.....##......##...##.........##........##......\r\n.#########.....##.....##........##........######..\r\n.##.....##.....#########........##........##......\r\n.##.....##.###.##.....##.###....##....###.##......\r\n.##.....##.###.##.....##.###....##....###.########\r\n..HEROES.........AND...........THE.........EVIL...\r\n     \r\n(C) in 2016 by http://heroesandtheevil.com\r\n\r\nIf you don''t have an account then please register at\r\nhttp://heroesandtheevil.com', '2016-06-10 20:15:47', 1, 'logo');

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
(15, 1, 'Grom', 'XXXXX', '', 4, 27, 1, 'human', 10000, 5, 25, 20, 1, 0, 0, 0),
(16, 4, 'Death', 'XXXXX', '', 7, 27, 1, 'devil', 10000, 0, 0, 0, 0, 0, 0, 0);

--
-- Indizes der exportierten Tabellen
--

--
-- Indizes für die Tabelle `hero`
--
ALTER TABLE `hero`
  ADD PRIMARY KEY (`id`);

--
-- Indizes für die Tabelle `message`
--
ALTER TABLE `message`
  ADD PRIMARY KEY (`id`);

--
-- Indizes für die Tabelle `monster`
--
ALTER TABLE `monster`
  ADD PRIMARY KEY (`id`);

--
-- Indizes für die Tabelle `monster_description`
--
ALTER TABLE `monster_description`
  ADD PRIMARY KEY (`id`);

--
-- Indizes für die Tabelle `mud_news`
--
ALTER TABLE `mud_news`
  ADD PRIMARY KEY (`id`);

--
-- Indizes für die Tabelle `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT für exportierte Tabellen
--

--
-- AUTO_INCREMENT für Tabelle `message`
--
ALTER TABLE `message`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT für Tabelle `monster`
--
ALTER TABLE `monster`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT für Tabelle `monster_description`
--
ALTER TABLE `monster_description`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
