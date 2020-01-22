-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le :  mer. 22 jan. 2020 à 10:58
-- Version du serveur :  10.4.6-MariaDB
-- Version de PHP :  7.3.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `partiel`
--
CREATE DATABASE IF NOT EXISTS `partiel` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_bin;
USE `partiel`;

-- --------------------------------------------------------

--
-- Structure de la table `cours`
--

CREATE TABLE `cours` (
  `cours_theme` varchar(500) COLLATE utf8mb4_bin NOT NULL,
  `cours_nbheures` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- --------------------------------------------------------

--
-- Structure de la table `ecoles`
--

CREATE TABLE `ecoles` (
  `ecole_nom` varchar(60) COLLATE utf8mb4_bin NOT NULL,
  `ecole_mail` varchar(250) COLLATE utf8mb4_bin NOT NULL,
  `ecole_adresse` varchar(250) COLLATE utf8mb4_bin NOT NULL,
  `ecole_tel` varchar(12) COLLATE utf8mb4_bin NOT NULL,
  `ecole_directeur` varchar(100) COLLATE utf8mb4_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- --------------------------------------------------------

--
-- Structure de la table `enseignants`
--

CREATE TABLE `enseignants` (
  `enseignant_id` int(11) NOT NULL,
  `enseignant_nom` varchar(25) COLLATE utf8mb4_bin NOT NULL,
  `enseignant_prenom` varchar(25) COLLATE utf8mb4_bin NOT NULL,
  `enseignant_mail` varchar(250) COLLATE utf8mb4_bin NOT NULL,
  `enseignant_adresse` varchar(250) COLLATE utf8mb4_bin NOT NULL,
  `enseignant_tel` varchar(13) COLLATE utf8mb4_bin NOT NULL,
  `enseignant_matiere` varchar(40) COLLATE utf8mb4_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- --------------------------------------------------------

--
-- Structure de la table `etudiants`
--

CREATE TABLE `etudiants` (
  `etudiant_id` int(11) NOT NULL,
  `etudiant_nom` varchar(25) COLLATE utf8mb4_bin NOT NULL,
  `etudiant_prenom` varchar(25) COLLATE utf8mb4_bin NOT NULL,
  `etudiant_mail` varchar(250) COLLATE utf8mb4_bin NOT NULL,
  `etudiant_adresse` varchar(250) COLLATE utf8mb4_bin NOT NULL,
  `etudiant_tel` varchar(13) COLLATE utf8mb4_bin NOT NULL,
  `etudiant_naissance` varchar(30) COLLATE utf8mb4_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `enseignants`
--
ALTER TABLE `enseignants`
  ADD PRIMARY KEY (`enseignant_id`);

--
-- Index pour la table `etudiants`
--
ALTER TABLE `etudiants`
  ADD PRIMARY KEY (`etudiant_id`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `enseignants`
--
ALTER TABLE `enseignants`
  MODIFY `enseignant_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `etudiants`
--
ALTER TABLE `etudiants`
  MODIFY `etudiant_id` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
