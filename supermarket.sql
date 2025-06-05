-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 12, 2024 at 11:27 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `supermarket`
--

-- --------------------------------------------------------

--
-- Table structure for table `t_customer`
--

CREATE TABLE `t_customer` (
  `CUSTOMER_ID` int(11) NOT NULL,
  `CUSTOMER_NAME` varchar(255) DEFAULT NULL,
  `MOBILE_NUMBER` int(11) DEFAULT NULL,
  `ADDRESS` varchar(255) DEFAULT NULL,
  `GENDER` varchar(11) DEFAULT NULL,
  `STATUS` varchar(11) DEFAULT NULL,
  `CUSTOMER_CATEGORY_ID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `t_customer`
--

INSERT INTO `t_customer` (`CUSTOMER_ID`, `CUSTOMER_NAME`, `MOBILE_NUMBER`, `ADDRESS`, `GENDER`, `STATUS`, `CUSTOMER_CATEGORY_ID`) VALUES
(1, 'Shanaka Bandara', 712345678, 'No:10, 1st lane, kurunegala', 'Male', 'ACT', 2),
(2, 'Kasun Perera', 723456786, 'No: 12, 2nd Lane,Katunayaka', 'Male', 'ACT', 1),
(3, 'Dasun Chamara', 128866387, 'No.23, Queen\'s road, Mathara', 'Male', 'ACT', 3),
(4, 'Kasun Kumara', 128530933, 'No.101, Nugegoda', 'Male', 'ACT', 2),
(5, 'Kumara Pathirana', 123325355, 'N0.66, Vauniya road, Mathale', 'Male', 'ACT', 5),
(6, 'Kumara Pathirana', 123325355, 'N0.66, Vauniya road, Mathale', 'Male', 'ACT', 7),
(7, 'Sadun Chamara', 133880183, 'N0.12, Peradeniya road, Kandy', 'Male', 'ACT', 11),
(11, 'Sadun Chamara', 133880183, 'N0.12, Peradeniya road, Kandy', 'Male', 'ACT', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `t_customer_category`
--

CREATE TABLE `t_customer_category` (
  `CUSTOMER_CATEGORY_ID` int(11) NOT NULL,
  `CUSTOMER_CATEGORY_NAME` varchar(255) DEFAULT NULL,
  `STATUS` varchar(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `t_customer_category`
--

INSERT INTO `t_customer_category` (`CUSTOMER_CATEGORY_ID`, `CUSTOMER_CATEGORY_NAME`, `STATUS`) VALUES
(1, 'Loyal Customers', 'ACT'),
(2, 'Referral Customers', 'ACT'),
(3, 'Lapsed Customers', 'ACT'),
(4, 'Discount Customers', 'ACT'),
(5, 'Normal Customers', 'ACT'),
(7, 'Normal Customers', 'ACT'),
(9, 'Neutral Customers', 'ACT'),
(10, 'Bad Customers', 'ACT'),
(11, 'Local Customers', 'ACT');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `t_customer`
--
ALTER TABLE `t_customer`
  ADD PRIMARY KEY (`CUSTOMER_ID`),
  ADD KEY `FK_CUS_CAT_ID` (`CUSTOMER_CATEGORY_ID`);

--
-- Indexes for table `t_customer_category`
--
ALTER TABLE `t_customer_category`
  ADD PRIMARY KEY (`CUSTOMER_CATEGORY_ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `t_customer`
--
ALTER TABLE `t_customer`
  MODIFY `CUSTOMER_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `t_customer_category`
--
ALTER TABLE `t_customer_category`
  MODIFY `CUSTOMER_CATEGORY_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `t_customer`
--
ALTER TABLE `t_customer`
  ADD CONSTRAINT `FK_CUS_CAT_ID` FOREIGN KEY (`CUSTOMER_CATEGORY_ID`) REFERENCES `t_customer_category` (`CUSTOMER_CATEGORY_ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
