-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 24 Agu 2021 pada 05.57
-- Versi server: 10.1.38-MariaDB
-- Versi PHP: 7.3.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_stempel`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `databarang`
--

CREATE TABLE `databarang` (
  `kd_barang` varchar(20) NOT NULL,
  `harga_satuan` int(11) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `tanggal_input` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `databarang`
--

INSERT INTO `databarang` (`kd_barang`, `harga_satuan`, `jumlah`, `tanggal_input`) VALUES
('1340', 5500, 10, '2020-06-14'),
('1355', 6000, 55, '2020-06-17');

-- --------------------------------------------------------

--
-- Struktur dari tabel `karyawan`
--

CREATE TABLE `karyawan` (
  `id` varchar(8) NOT NULL,
  `nama` varchar(200) NOT NULL,
  `nik` varchar(50) NOT NULL,
  `alamat` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `karyawan`
--

INSERT INTO `karyawan` (`id`, `nama`, `nik`, `alamat`) VALUES
('P0001', 'Andhi Mahardhika', '200193728382883', 'Jl.Merpati 2 no 18 citayam'),
('P0002', 'Rendi', '291834384738423', 'Jl.Merpati 2 No. 18 Perumahan Lembah\nGriya Indah Citayam');

-- --------------------------------------------------------

--
-- Struktur dari tabel `konsumen`
--

CREATE TABLE `konsumen` (
  `id_konsumen` varchar(8) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `toko` varchar(255) NOT NULL,
  `alamat` text NOT NULL,
  `no_tlp` varchar(13) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `konsumen`
--

INSERT INTO `konsumen` (`id_konsumen`, `nama`, `toko`, `alamat`, `no_tlp`) VALUES
('M0001', 'Kang Ata', 'Faster Stamp', 'Jl.Sukahati, Cibinong Bogor', '087821934732'),
('M0002', 'Kang Herna', 'ABC Stamp', 'Jl. Gedong Sawah, Kota Bogor', '081320918212');

-- --------------------------------------------------------

--
-- Struktur dari tabel `list`
--

CREATE TABLE `list` (
  `no_list` int(11) NOT NULL,
  `id_konsumen` varchar(8) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `kd_barang` varchar(20) NOT NULL,
  `satuan` int(11) NOT NULL,
  `jml_beli` int(11) NOT NULL,
  `harga` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `list_brng`
--

CREATE TABLE `list_brng` (
  `no` int(11) NOT NULL,
  `kd_barang` varchar(20) NOT NULL,
  `jumlah` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `login`
--

CREATE TABLE `login` (
  `user` varchar(225) NOT NULL,
  `password` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `login`
--

INSERT INTO `login` (`user`, `password`) VALUES
('admin', 'admin');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pengiriman`
--

CREATE TABLE `pengiriman` (
  `no` int(11) NOT NULL,
  `noresi` varchar(10) NOT NULL,
  `idkaryawan` varchar(20) NOT NULL,
  `namakaryawan` varchar(50) NOT NULL,
  `idkonsumen` varchar(20) NOT NULL,
  `namakonsumen` varchar(50) NOT NULL,
  `alamat` text NOT NULL,
  `kodepesan` varchar(10) NOT NULL,
  `totalharga` varchar(20) NOT NULL,
  `ongkir` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `pengiriman`
--

INSERT INTO `pengiriman` (`no`, `noresi`, `idkaryawan`, `namakaryawan`, `idkonsumen`, `namakonsumen`, `alamat`, `kodepesan`, `totalharga`, `ongkir`) VALUES
(1, 'R0001', 'P0001', 'Andhi Mahardhika', 'M0001', 'Kang Ata', '', 'T0018', '30000', ''),
(2, 'R0002', 'P0001', 'Andhi Mahardhika', 'M0001', 'Kang Ata', '', 'T0018', '30000', ''),
(3, 'R0003', 'P0001', 'Andhi Mahardhika', 'Kang Ata', 'Jl.Sukahati, Cibinong Bogor', '', 'T0016', '110000', '5000'),
(4, 'R0004', 'P0001', 'Andhi Mahardhika', 'M0001', 'Kang Ata', 'Jl.Sukahati, Cibinong Bogor', 'T0016', '110000', '10000'),
(5, 'R0005', 'P0001', 'Andhi Mahardhika', 'M0001', 'Kang Ata', 'Jl.Sukahati, Cibinong Bogor', 'T0019', '27500', '5000');

-- --------------------------------------------------------

--
-- Struktur dari tabel `restock`
--

CREATE TABLE `restock` (
  `kd_barang` varchar(20) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `kd_suplier` varchar(8) NOT NULL,
  `nama_suplier` varchar(255) NOT NULL,
  `no_tlp` varchar(13) NOT NULL,
  `id` varchar(8) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `tanggal` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `restock`
--

INSERT INTO `restock` (`kd_barang`, `jumlah`, `kd_suplier`, `nama_suplier`, `no_tlp`, `id`, `nama`, `tanggal`) VALUES
('1335', 200, 'S0001', 'H.Sariman', '088834712819', 'P0001', 'Andhi Mahardhika', '2020-06-17'),
('1340', 200, 'S0001', 'H.Sariman', '088834712819', 'P0001', 'Andhi Mahardhika', '2020-06-17'),
('1340', 200, 'S0001', 'H.Sariman', '088834712819', 'P0001', 'Andhi Mahardhika', '2020-06-17'),
('1355', 200, 'S0001', 'H.Sariman', '088834712819', 'P0001', 'Andhi Mahardhika', '2020-06-17'),
('1340', 20, 'S0001', 'H.Sariman', '088834712819', 'P0002', 'Rendi', '2021-08-15'),
('1355', 200, 'S0001', 'H.Sariman', '088834712819', 'P0001', 'Andhi Mahardhika', '2021-08-19'),
('1340', 100, 'S0001', 'H.Sariman', '088834712819', 'P0001', 'Andhi Mahardhika', '2021-08-23'),
('1340', 200, 'S0001', 'H.Sariman', '088834712819', 'P0001', 'Andhi Mahardhika', '2021-08-24');

-- --------------------------------------------------------

--
-- Struktur dari tabel `suplier`
--

CREATE TABLE `suplier` (
  `kd_suplier` varchar(8) NOT NULL,
  `nama_suplier` varchar(255) NOT NULL,
  `alamat` text NOT NULL,
  `no_tlp` varchar(13) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `suplier`
--

INSERT INTO `suplier` (`kd_suplier`, `nama_suplier`, `alamat`, `no_tlp`) VALUES
('S0001', 'H.Sariman', 'Jl.Bekasi Raya', '088834712819');

-- --------------------------------------------------------

--
-- Struktur dari tabel `transaksi`
--

CREATE TABLE `transaksi` (
  `kd_pesan` varchar(8) NOT NULL,
  `id_konsumen` varchar(8) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `kd_barang` varchar(20) NOT NULL,
  `satuan` int(11) NOT NULL,
  `jml_beli` int(11) NOT NULL,
  `harga` int(11) NOT NULL,
  `Total` int(11) NOT NULL,
  `bayar` int(11) NOT NULL,
  `kembalian` int(11) NOT NULL,
  `tanggal` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `transaksi`
--

INSERT INTO `transaksi` (`kd_pesan`, `id_konsumen`, `nama`, `kd_barang`, `satuan`, `jml_beli`, `harga`, `Total`, `bayar`, `kembalian`, `tanggal`) VALUES
('T0003', 'KM0001', 'Rizky', '1335', 5000, 20, 100000, 0, 150000, 22500, '2020-06-16'),
('T0003', 'KM0001', 'Rizky', '1340', 5500, 5, 27500, 0, 150000, 22500, '2020-06-16'),
('T0004', 'KM0001', 'Rizky', '1335', 5000, 10, 50000, 0, 110000, 5000, '2020-06-16'),
('T0004', 'KM0001', 'Rizky', '1340', 5500, 10, 55000, 0, 110000, 5000, '2020-06-16'),
('T0005', 'KM0001', 'Rizky', '1335', 5000, 20, 100000, 0, 100000, 0, '2020-06-16'),
('T0006', 'KM0001', 'Rizky', '1335', 5000, 5, 25000, 0, 300000, 45000, '2020-06-17'),
('T0006', 'M0001', 'Kang Ata', '1340', 5500, 20, 110000, 0, 300000, 45000, '2020-06-17'),
('T0006', 'M0001', 'Kang Ata', '1355', 6000, 20, 120000, 0, 300000, 45000, '2020-06-17'),
('T0007', 'M0001', 'Kang Ata', '1340', 5500, 10, 55000, 0, 60000, 5000, '2020-06-17'),
('T0008', 'M0001', 'Kang Ata', '1340', 5500, 10, 55000, 0, 120000, 5000, '2021-02-28'),
('T0008', 'M0001', 'Kang Ata', '1355', 6000, 10, 60000, 0, 120000, 5000, '2021-02-28'),
('T0009', 'M0001', 'Kang Ata', '1340', 5500, 10, 55000, 0, 120000, 5000, '2021-02-28'),
('T0009', 'M0001', 'Kang Ata', '1355', 6000, 10, 60000, 0, 120000, 5000, '2021-02-28'),
('T0010', 'M0001', 'Kang Ata', '1340', 5500, 50, 275000, 0, 300000, 25000, '2021-06-15'),
('T0011', 'M0001', 'Kang Ata', '1340', 5500, 10, 55000, 0, 400000, 45000, '2021-06-15'),
('T0011', 'M0001', 'Kang Ata', '1355', 6000, 50, 300000, 0, 400000, 45000, '2021-06-15'),
('T0012', 'M0001', 'Kang Ata', '1355', 6000, 50, 300000, 0, 2000000, 270000, '2021-08-11'),
('T0012', 'M0001', 'Kang Ata', '1355', 6000, 50, 300000, 0, 2000000, 270000, '2021-08-11'),
('T0012', 'M0001', 'Kang Ata', '1355', 6000, 80, 480000, 0, 2000000, 270000, '2021-08-11'),
('T0012', 'M0001', 'Kang Ata', '1355', 6000, 50, 300000, 0, 2000000, 270000, '2021-08-11'),
('T0012', 'M0001', 'Kang Ata', '1355', 6000, 10, 60000, 0, 2000000, 270000, '2021-08-11'),
('T0012', 'M0001', 'Kang Ata', '1355', 6000, 10, 60000, 0, 2000000, 270000, '2021-08-11'),
('T0012', 'M0001', 'Kang Ata', '1340', 5500, 10, 55000, 0, 2000000, 270000, '2021-08-11'),
('T0012', 'M0001', 'Kang Ata', '1340', 5500, 10, 55000, 0, 2000000, 270000, '2021-08-11'),
('T0012', 'M0002', 'Kang Herna', '1355', 6000, 20, 120000, 0, 2000000, 270000, '2021-08-11'),
('T0013', 'M0001', 'Kang Ata', '1340', 5500, 20, 110000, 170000, 200000, 30000, '2021-08-13'),
('T0013', 'M0001', 'Kang Ata', '1355', 6000, 10, 60000, 170000, 200000, 30000, '2021-08-13'),
('T0014', 'M0002', 'Kang Herna', '1340', 5500, 10, 55000, 85000, 100000, 15000, '2021-08-13'),
('T0014', 'M0002', 'Kang Herna', '1355', 6000, 5, 30000, 85000, 100000, 15000, '2021-08-13'),
('T0015', 'M0001', 'Kang Ata', '1340', 5500, 10, 55000, 85000, 85000, 0, '2021-08-13'),
('T0015', 'M0001', 'Kang Ata', '1355', 6000, 5, 30000, 85000, 85000, 0, '2021-08-13'),
('T0016', 'M0001', 'Kang Ata', '1340', 5500, 20, 110000, 110000, 120000, 10000, '2021-08-17'),
('T0017', 'M0001', 'Kang Ata', '1340', 5500, 5, 27500, 27500, 30000, 2500, '2021-08-19'),
('T0018', 'M0001', 'Kang Ata', '1355', 6000, 5, 30000, 30000, 35000, 5000, '2021-08-23'),
('T0019', 'M0001', 'Kang Ata', '1340', 5500, 5, 27500, 27500, 30000, 2500, '2021-08-24');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `databarang`
--
ALTER TABLE `databarang`
  ADD PRIMARY KEY (`kd_barang`);

--
-- Indeks untuk tabel `karyawan`
--
ALTER TABLE `karyawan`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `konsumen`
--
ALTER TABLE `konsumen`
  ADD PRIMARY KEY (`id_konsumen`);

--
-- Indeks untuk tabel `list`
--
ALTER TABLE `list`
  ADD PRIMARY KEY (`no_list`),
  ADD KEY `id_konsumen` (`id_konsumen`),
  ADD KEY `kd_barang` (`kd_barang`);

--
-- Indeks untuk tabel `list_brng`
--
ALTER TABLE `list_brng`
  ADD PRIMARY KEY (`no`),
  ADD KEY `kd_barang` (`kd_barang`);

--
-- Indeks untuk tabel `pengiriman`
--
ALTER TABLE `pengiriman`
  ADD PRIMARY KEY (`no`);

--
-- Indeks untuk tabel `restock`
--
ALTER TABLE `restock`
  ADD KEY `kd_barang` (`kd_barang`),
  ADD KEY `kd_suplier` (`kd_suplier`),
  ADD KEY `id` (`id`);

--
-- Indeks untuk tabel `suplier`
--
ALTER TABLE `suplier`
  ADD PRIMARY KEY (`kd_suplier`);

--
-- Indeks untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
  ADD KEY `id_konsumen` (`id_konsumen`),
  ADD KEY `kd_barang` (`kd_barang`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `list`
--
ALTER TABLE `list`
  MODIFY `no_list` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT untuk tabel `list_brng`
--
ALTER TABLE `list_brng`
  MODIFY `no` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT untuk tabel `pengiriman`
--
ALTER TABLE `pengiriman`
  MODIFY `no` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `list`
--
ALTER TABLE `list`
  ADD CONSTRAINT `list_ibfk_1` FOREIGN KEY (`id_konsumen`) REFERENCES `konsumen` (`id_konsumen`),
  ADD CONSTRAINT `list_ibfk_2` FOREIGN KEY (`kd_barang`) REFERENCES `databarang` (`kd_barang`);

--
-- Ketidakleluasaan untuk tabel `list_brng`
--
ALTER TABLE `list_brng`
  ADD CONSTRAINT `list_brng_ibfk_1` FOREIGN KEY (`kd_barang`) REFERENCES `databarang` (`kd_barang`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
