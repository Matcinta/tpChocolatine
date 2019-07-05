-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  ven. 05 juil. 2019 à 16:01
-- Version du serveur :  5.7.26
-- Version de PHP :  7.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `tpchoco`
--

-- --------------------------------------------------------

--
-- Structure de la table `chocolatine`
--

DROP TABLE IF EXISTS `chocolatine`;
CREATE TABLE IF NOT EXISTS `chocolatine` (
  `idChocolatine` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(50) NOT NULL,
  `prix` float(4,2) NOT NULL,
  `temperature` float(4,2) NOT NULL,
  `poids` float(5,2) NOT NULL,
  PRIMARY KEY (`idChocolatine`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `chocolatine`
--

INSERT INTO `chocolatine` (`idChocolatine`, `nom`, `prix`, `temperature`, `poids`) VALUES
(1, 'la choco fraise', 4.80, 42.80, 124.70),
(2, 'la choco banane', 2.40, 42.50, 124.80),
(3, 'la choco citron', 2.70, 42.40, 127.80),
(4, 'la Choco Canelle', 1.89, 42.70, 127.60),
(5, 'la choco poire', 2.10, 43.80, 135.20),
(6, 'la choco cerise', 3.50, 42.10, 145.60),
(7, 'la choco caramel', 2.40, 41.20, 145.20);

-- --------------------------------------------------------

--
-- Structure de la table `commande`
--

DROP TABLE IF EXISTS `commande`;
CREATE TABLE IF NOT EXISTS `commande` (
  `idCommande` int(11) NOT NULL AUTO_INCREMENT,
  `statut` enum('CREER','EN_LIVRAISON','LIVREE') NOT NULL,
  `dateHeure` datetime NOT NULL,
  UNIQUE KEY `id` (`idCommande`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `commande`
--

INSERT INTO `commande` (`idCommande`, `statut`, `dateHeure`) VALUES
(1, 'CREER', '2019-07-05 15:51:28'),
(2, 'CREER', '2019-07-05 15:58:52');

-- --------------------------------------------------------

--
-- Structure de la table `commande_choco`
--

DROP TABLE IF EXISTS `commande_choco`;
CREATE TABLE IF NOT EXISTS `commande_choco` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `idChocolatine` int(11) NOT NULL,
  `idCommande` int(11) NOT NULL,
  `quantite` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `commande_choco`
--

INSERT INTO `commande_choco` (`id`, `idChocolatine`, `idCommande`, `quantite`) VALUES
(1, 2, 1, 4),
(2, 3, 2, 1);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
