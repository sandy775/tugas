-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 27 Bulan Mei 2021 pada 05.46
-- Versi server: 10.4.18-MariaDB
-- Versi PHP: 7.4.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `java_database`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `username` varchar(25) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `user`
--

INSERT INTO `user` (`id`, `username`, `password`) VALUES
(1, 'sandy', '1234');

-- --------------------------------------------------------

--
-- Struktur dari tabel `warga`
--

CREATE TABLE `warga` (
  `nik` int(11) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `pekerjaan` varchar(25) NOT NULL,
  `pendidikan` varchar(5) NOT NULL,
  `rt` varchar(3) NOT NULL,
  `no_rumah` varchar(5) NOT NULL,
  `no_telp` varchar(13) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `warga`
--

INSERT INTO `warga` (`nik`, `nama`, `pekerjaan`, `pendidikan`, `rt`, `no_rumah`, `no_telp`) VALUES
(32099412, 'Entep', 'Petani', 'SD', '02', '008', '08132049822'),
(320119209, 'Ilham', 'Karyawan Swata', 'SMP', '03', '010', '089329832'),
(320312009, 'Rianto', 'Peternak', 'SMP', '03', '009', '089398291'),
(320321001, 'Intan', 'Mahasiswa', 'S1', '03', '002', '08932198211'),
(320321111, 'Atep', 'Siswa', 'SMA', '01', '01', '0815321042'),
(320321112, 'Ameng', 'Karyawan Swata', 'D3', '01', '01', '0823210992'),
(320321211, 'Ujang Herman', 'Petani', 'SMA', '02', '003', '08132115011'),
(320321411, 'Sandy A. Dwi', 'Mahasiswa', 'S1', '03', '001', '081321355150'),
(320321992, 'Acep', 'Karyawan Swata', 'D2', '02', '004', '089874882'),
(320345009, 'Isep', 'PNS', 'D3', '01', '011', '089329882'),
(320441001, 'Asep', 'Karyawan Swata', 'SMA', '02', '013', '087328822'),
(320984221, 'Ateng', 'Peternak', 'SD', '01', '019', '0883287882');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `warga`
--
ALTER TABLE `warga`
  ADD PRIMARY KEY (`nik`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
