-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 19, 2024 at 12:36 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `airlineticketing`
--

-- --------------------------------------------------------

--
-- Table structure for table `ticketdata`
--

CREATE TABLE `ticketdata` (
  `id` int(5) NOT NULL,
  `fullName` varchar(70) NOT NULL,
  `contactNumber` varchar(70) NOT NULL,
  `gender` varchar(70) NOT NULL,
  `destination` varchar(70) NOT NULL,
  `passenger_type` varchar(70) NOT NULL,
  `seat_type` varchar(70) NOT NULL,
  `bookingFee` int(10) NOT NULL,
  `total_amount` double(10,2) NOT NULL,
  `amount_paid` double(10,2) NOT NULL,
  `bookChange` double(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `ticketdata`
--

INSERT INTO `ticketdata` (`id`, `fullName`, `contactNumber`, `gender`, `destination`, `passenger_type`, `seat_type`, `bookingFee`, `total_amount`, `amount_paid`, `bookChange`) VALUES
(1, 'Jc', '0987364238', 'Male', 'Dumaguete to Dipolog', 'Regular', 'Business Class', 0, 4500.00, 5000.00, 500.00),
(2, 'Rose', '096662621', 'Female', 'Dumaguete to Siargao', 'Regular', 'Business Class', 1, 5550.00, 7000.00, 1450.00),
(3, 'Charles', '0971276262', 'Male', 'Dumaguete to Cebu', 'Person with Disability', 'Premium Class', 0, 1250.00, 5680.00, 4430.00),
(11, 'Keanna', '0961767161', 'Female', 'Dumaguete to Dipolog', 'Student', 'Premium Class', 1, 3050.00, 5000.00, 1950.00),
(13, 'testing', '93285863', 'Male', 'Dumaguete to Palawan', 'Student', 'Premium Class', 1, 3550.00, 4000.00, 450.00);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `ticketdata`
--
ALTER TABLE `ticketdata`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `ticketdata`
--
ALTER TABLE `ticketdata`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
