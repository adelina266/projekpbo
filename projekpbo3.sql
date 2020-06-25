-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 16, 2020 at 03:34 PM
-- Server version: 10.1.37-MariaDB
-- PHP Version: 5.6.39

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `belajar_ta_apotik`
--

-- --------------------------------------------------------

--
-- Table structure for table `medicine`
--

CREATE TABLE `medicine` (
  `id_obat` int(11) NOT NULL,
  `kode_obat` varchar(20) NOT NULL,
  `nama_obat` varchar(100) NOT NULL,
  `kategori_obat` varchar(15) NOT NULL,
  `jenis_obat` varchar(20) NOT NULL,
  `merek_obat` varchar(100) NOT NULL,
  `harga_beli_obat` decimal(10,0) NOT NULL,
  `harga_jual_obat` decimal(10,0) NOT NULL,
  `jumlah_obat` int(3) NOT NULL,
  `tanggal_masuk` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `expired` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `medicine`
--

INSERT INTO `medicine` (`id_obat`, `kode_obat`, `nama_obat`, `kategori_obat`, `jenis_obat`, `merek_obat`, `harga_beli_obat`, `harga_jual_obat`, `jumlah_obat`, `tanggal_masuk`, `expired`) VALUES
(1, 'SF01', 'Amoxcilin 100gr Generik', 'Obat Dalam', 'Tablet', 'Amoxcilin 100gr', '8000', '10000', 7, '2014-01-25 14:48:09', '2014-01-25'),
(2, 'SF02', 'Farsien 50 gr', 'Obat Luar', 'Kapsul', 'Farsien 50 gr', '6000', '8000', 80, '2014-01-25 14:52:11', '2014-01-25'),
(3, 'SF03', 'Broadamx 500 mg', 'Obat Dalam', 'Kaplet', 'Amoksisilina Trihidrat 500mg', '12500', '15000', 90, '2014-01-25 17:40:19', '2016-01-21'),
(4, 'SF04', 'Flutamol', 'Obat Dalam', 'Kaplet', 'Paraxetamol PCG', '5000', '6500', 12, '2014-01-25 17:40:48', '2016-01-21'),
(5, 'SF05', 'Sana Flu', 'Obat Dalam', 'Kaplet', 'Paracetamol P HCI', '5000', '6500', 48, '2014-01-25 17:40:32', '2015-01-08'),
(6, 'SF06', 'Pi Kang Shuang 10gr', 'Obat Luar', 'Salep', 'Pi Kang Shuang', '5000', '9000', 97, '2014-01-25 15:14:35', '2016-01-21'),
(8, 'SF08', 'Sana Flu10gr', 'Obat Dalam', 'Kaplet', 'Sana Flu', '15000', '20000', 60, '2014-01-25 17:29:00', '2015-01-20'),
(21, 'SF10', 'Flutamol 110gr', 'Obat Dalam', 'Kaplet', 'Flutamol ', '5000', '7000', 12, '2014-01-31 13:27:48', '2014-01-31'),
(24, 'SF12', 'Flutamol 100gr', 'Obat Dalam', 'Kaplet', 'Flutamol ', '5000', '7000', 12, '2014-01-31 13:43:23', '2014-01-31'),
(25, 'SF13', 'Amoxlin 200gr', 'Obat Dalam', 'Pil', 'Amoxilin', '20000', '25000', 25, '2014-01-31 13:59:15', '2014-01-31');

-- --------------------------------------------------------

--
-- Table structure for table `penjualan`
--

CREATE TABLE `penjualan` (
  `id_jual` int(5) NOT NULL,
  `kode_transaksi` int(10) NOT NULL,
  `kode_obat` varchar(10) NOT NULL,
  `nama_obat` varchar(100) NOT NULL,
  `merek_obat` varchar(100) NOT NULL,
  `harga_jual` int(11) NOT NULL,
  `jumlah_beli` int(11) NOT NULL,
  `total_harga` int(11) NOT NULL,
  `tanggal_transaksi` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `penjualan`
--

INSERT INTO `penjualan` (`id_jual`, `kode_transaksi`, `kode_obat`, `nama_obat`, `merek_obat`, `harga_jual`, `jumlah_beli`, `total_harga`, `tanggal_transaksi`) VALUES
(142, 34313, 'SF05', 'aa', 'r', 6500, 2, 13000, '2014-01-29 18:43:36'),
(143, 32532535, 'SF05', 'aa', 'r', 6500, 2, 13000, '2014-01-29 18:45:41'),
(144, 42525, 'SF01', 'Amoxcilin 100gr Generik', 'Amoxcilin 100gr', 10000, 2, 20000, '2014-01-29 18:49:25'),
(145, 1324636, 'SF03', 'ggq', 'we', 15000, 1, 15000, '2014-01-29 18:56:13'),
(146, 3144, '1', 'SF01', 'Tablet', 8000, 3, 24000, '2014-01-30 13:01:00'),
(147, 3144, '2', 'SF02', 'Kapsul', 6000, 2, 12000, '2014-01-30 13:01:21'),
(148, 123, 'SF01', 'Amoxcilin 100gr Generik', 'Amoxcilin 100gr', 10000, 1, 10000, '2014-01-30 13:03:34'),
(149, 12424, 'SF01', 'Amoxcilin 100gr Generik', 'Amoxcilin 100gr', 10000, 1, 10000, '2014-01-30 23:24:08'),
(151, 144, 'SF01', 'Amoxcilin 100gr Generik', 'Amoxcilin 100gr', 10000, 1, 10000, '2014-01-31 06:57:50'),
(154, 15, 'SF01', 'Amoxcilin 100gr Generik', 'Amoxcilin 100gr', 10000, 3, 30000, '2014-01-31 08:29:16'),
(157, 555550, 'SF01', 'Amoxcilin 100gr Generik', 'Amoxcilin 100gr', 10000, 2, 20000, '2014-01-31 09:09:35'),
(158, 555550, 'SF02', 'Farsien 50 gr', 'Farsien 50 gr', 8000, 2, 16000, '2014-01-31 09:09:47'),
(159, 1221, 'SF05', 'Sana Flu', 'Paracetamol P HCI', 6500, 11, 71500, '2014-01-31 09:29:08'),
(160, 1221, 'SF02', 'Farsien 50 gr', 'Farsien 50 gr', 8000, 1, 8000, '2014-01-31 09:29:15'),
(166, 12133, 'SF01', 'Amoxcilin 100gr Generik', 'Amoxcilin 100gr', 10000, 1, 10000, '2014-01-31 12:22:23'),
(172, 3, 'SF06', 'Pi Kang Shuang 10gr', 'Pi Kang Shuang', 9000, 2, 18000, '2014-01-31 12:50:35'),
(174, 10, 'SF02', 'Farsien 50 gr', 'Farsien 50 gr', 8000, 2, 16000, '2014-01-31 12:50:52'),
(175, 1234567, 'SF01', 'Amoxcilin 100gr Generik', 'Amoxcilin 100gr', 10000, 2, 20000, '2014-01-31 13:28:46'),
(176, 1234567, 'SF03', 'Broadamx 500 mg', 'Amoksisilina Trihidrat 500mg', 15000, 2, 30000, '2014-01-31 13:28:58'),
(177, 122, 'SF04', 'Flutamol', 'Paraxetamol PCG', 6500, 2, 13000, '2014-01-31 13:30:57'),
(178, 1112, 'SF01', 'Amoxcilin 100gr Generik', 'Amoxcilin 100gr', 10000, 3, 30000, '2014-01-31 13:44:15'),
(179, 1112, 'SF04', 'Flutamol', 'Paraxetamol PCG', 6500, 1, 6500, '2014-01-31 13:44:26'),
(180, 221, 'SF02', 'Farsien 50 gr', 'Farsien 50 gr', 8000, 2, 16000, '2014-01-31 13:46:11'),
(181, 21212, 'SF01', 'Amoxcilin 100gr Generik', 'Amoxcilin 100gr', 10000, 2, 20000, '2014-01-31 14:00:56'),
(182, 21212, 'SF02', 'Farsien 50 gr', 'Farsien 50 gr', 8000, 2, 16000, '2014-01-31 14:01:10'),
(183, 13131, 'SF01', 'Amoxcilin 100gr Generik', 'Amoxcilin 100gr', 10000, 4, 40000, '2014-01-31 14:03:14'),
(185, 4531, 'SF01', 'Amoxcilin 100gr Generik', 'Amoxcilin 100gr', 10000, 3, 30000, '2014-01-31 14:35:50'),
(186, 4531, 'SF03', 'Broadamx 500 mg', 'Amoksisilina Trihidrat 500mg', 15000, 2, 30000, '2014-01-31 14:35:57'),
(187, 4531, '8', 'SF08', 'Kaplet', 15000, 2, 30000, '2014-01-31 14:37:51'),
(188, 1412, 'SF02', 'Farsien 50 gr', 'Farsien 50 gr', 8000, 3, 24000, '2014-01-31 14:46:33'),
(189, 1412, 'SF02', 'Farsien 50 gr', 'Farsien 50 gr', 8000, 3, 24000, '2014-01-31 14:46:37'),
(191, 2, 'SF01', 'Amoxcilin 100gr Generik', 'Amoxcilin 100gr', 10000, 1, 10000, '2020-06-06 15:56:03'),
(192, 2, 'SF01', 'Amoxcilin 100gr Generik', 'Amoxcilin 100gr', 10000, 1, 10000, '2020-06-06 15:56:04'),
(193, 1, 'SF01', 'Amoxcilin 100gr Generik', 'Amoxcilin 100gr', 10000, 1, 10000, '2020-06-06 15:56:44'),
(194, 1, 'SF02', 'Farsien 50 gr', 'Farsien 50 gr', 8000, 2, 16000, '2020-06-06 15:57:18'),
(195, 123, 'SF01', 'Amoxcilin 100gr Generik', 'Amoxcilin 100gr', 10000, 3, 30000, '2020-06-16 13:07:36');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id_user` int(11) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `jenis_kelamin` varchar(15) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `akses` varchar(15) NOT NULL,
  `alamat` text NOT NULL,
  `email` varchar(50) NOT NULL,
  `no_hp` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id_user`, `nama`, `jenis_kelamin`, `username`, `password`, `akses`, `alamat`, `email`, `no_hp`) VALUES
(20, 'admin', 'Laki-Laki', 'admin', 'admin', 'Admin', '', '', ''),
(21, 'kasir', 'Perempuan', 'kasir', 'kasir', 'Kasir', 'padang', '', '');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `medicine`
--
ALTER TABLE `medicine`
  ADD PRIMARY KEY (`id_obat`),
  ADD UNIQUE KEY `kode_obat` (`kode_obat`),
  ADD UNIQUE KEY `kode_obat_2` (`kode_obat`),
  ADD UNIQUE KEY `kode_obat_3` (`kode_obat`),
  ADD UNIQUE KEY `kode_obat_4` (`kode_obat`),
  ADD UNIQUE KEY `kode_obat_5` (`kode_obat`),
  ADD UNIQUE KEY `kode_obat_7` (`kode_obat`),
  ADD UNIQUE KEY `id_obat` (`id_obat`),
  ADD UNIQUE KEY `kode_obat_8` (`kode_obat`),
  ADD KEY `kode_obat_6` (`kode_obat`);

--
-- Indexes for table `penjualan`
--
ALTER TABLE `penjualan`
  ADD PRIMARY KEY (`id_jual`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id_user`),
  ADD UNIQUE KEY `username` (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `medicine`
--
ALTER TABLE `medicine`
  MODIFY `id_obat` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT for table `penjualan`
--
ALTER TABLE `penjualan`
  MODIFY `id_jual` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=196;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
