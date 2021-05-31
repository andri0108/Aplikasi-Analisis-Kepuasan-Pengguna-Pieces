-- phpMyAdmin SQL Dump
-- version 4.9.5
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Waktu pembuatan: 31 Bulan Mei 2021 pada 11.18
-- Versi server: 10.3.16-MariaDB
-- Versi PHP: 7.3.23

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `id13818931_analisis`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `admin`
--

CREATE TABLE `admin` (
  `id` int(11) NOT NULL,
  `nama` varchar(25) COLLATE utf8_unicode_ci NOT NULL,
  `username` text COLLATE utf8_unicode_ci NOT NULL,
  `password` text COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data untuk tabel `admin`
--

INSERT INTO `admin` (`id`, `nama`, `username`, `password`) VALUES
(1, 'Andri Tri Saputra', 'admin', 'admin');

-- --------------------------------------------------------

--
-- Struktur dari tabel `k_control`
--

CREATE TABLE `k_control` (
  `id_kuisioner` int(11) NOT NULL,
  `kuisioner` text COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data untuk tabel `k_control`
--

INSERT INTO `k_control` (`id_kuisioner`, `kuisioner`) VALUES
(1, '.Bentuk pengamanan yang terdapat pada sistem sudah dapat menjaga data dan informasi dari berbagai bentuk kecurangan dan kejahatan'),
(2, '.Sistem pengamanan pada sistem sudah baik'),
(3, '.Media penyimpanan data dapat mengorganisasikan data dengan baik'),
(4, '.Terdapat pengontrolan terpusat terhadap pengguna data'),
(5, '.Media penyimpanan aman dari kerusakan dan kecelakaan data');

-- --------------------------------------------------------

--
-- Struktur dari tabel `k_efisien`
--

CREATE TABLE `k_efisien` (
  `id_kuisioner` int(11) NOT NULL,
  `kuisioner` text COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data untuk tabel `k_efisien`
--

INSERT INTO `k_efisien` (`id_kuisioner`, `kuisioner`) VALUES
(1, '.Sistem yang digunakan sekarang lebih meringankan waktu dan biaya'),
(2, '.Pengguna sistem informasi paling berperan dalam peningkatan informasi universitas'),
(3, '.Dalam mengoprasikan sistem pada kegiatan pengguna sehari-hari,apakah sistem menghasilkan output sesuai dengan inputan pengguna'),
(4, '.Sistem mempunyai nama yang unik dan dapat mudah di akses pengguna'),
(5, '.pengguna mudah mempelajari dan mengoprasikan website');

-- --------------------------------------------------------

--
-- Struktur dari tabel `k_ekonomi`
--

CREATE TABLE `k_ekonomi` (
  `id_kuisioner` int(11) NOT NULL,
  `kuisioner` text COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data untuk tabel `k_ekonomi`
--

INSERT INTO `k_ekonomi` (`id_kuisioner`, `kuisioner`) VALUES
(1, '.Dengan pengguna sistem informasi ini dapat meminimilasir pengeluaran biaya'),
(2, '.Adanya sistem ini apakah sudah efektif antara sumber daya waktu dan sumber daya manusia atau karyawan yang ada'),
(3, '.Dalam pemeliharaan sistem ini,tidak mengalami kesulitan dari segi biaya dan pelaksanaan nya'),
(4, '.Dalam mengakses sistem informasi ini dilakukan secara gratis'),
(5, '.Sumber daya  yang digunakan sedikit');

-- --------------------------------------------------------

--
-- Struktur dari tabel `k_informasi`
--

CREATE TABLE `k_informasi` (
  `id_kuisioner` int(11) NOT NULL,
  `kuisioner` text COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data untuk tabel `k_informasi`
--

INSERT INTO `k_informasi` (`id_kuisioner`, `kuisioner`) VALUES
(1, '.Informasi yang di hasilkan oleh sistem tepat pada waktunya'),
(2, '.Format Informasi yang dihasilkan oleh sistem informasi ini bermanfaat dan dapat berguna bagi pengguna'),
(3, '.Data yang diakses/digunakan sesuai'),
(4, '.Informasi yang dihasilkan oleh sistem dapat diandalkan dan di percaya'),
(5, '.Proses website sangat teliti');

-- --------------------------------------------------------

--
-- Struktur dari tabel `k_performa`
--

CREATE TABLE `k_performa` (
  `id_kuisioner` int(11) NOT NULL,
  `kuisioner` text COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data untuk tabel `k_performa`
--

INSERT INTO `k_performa` (`id_kuisioner`, `kuisioner`) VALUES
(1, '.Sistem Informasi ini dapat mengoprasikan perintah dalam waktu yang relatif singkat tanpa mengalami hambatan'),
(2, '.Sistem informasi ini sangat mudah di akses oleh pengguna'),
(3, '.Interface (antar muka) website mudah dipahami'),
(4, '.Total waktu yang di lakukan dlam pengolahan data hingga menghasilkan informasi sudah dilakukan dengan cepat'),
(5, '.Fungsi kerja yang dilakukan website lengkap\r\n');

-- --------------------------------------------------------

--
-- Struktur dari tabel `k_servis`
--

CREATE TABLE `k_servis` (
  `id_kuisioner` int(11) NOT NULL,
  `kuisioner` text COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data untuk tabel `k_servis`
--

INSERT INTO `k_servis` (`id_kuisioner`, `kuisioner`) VALUES
(1, '.Website dapat di percaya'),
(2, '.Adanya update pada sistem informasi ini'),
(3, '.Sistem memiliki fitur yang lengkap'),
(4, '.Sistem mempunyai rasa aman dengan data pribadi pengguna'),
(5, '.Sistem memiliki respon yang cepat terhadap pengguna');

-- --------------------------------------------------------

--
-- Struktur dari tabel `penganalisis`
--

CREATE TABLE `penganalisis` (
  `id` int(11) NOT NULL,
  `nama` varchar(25) COLLATE utf8_unicode_ci NOT NULL,
  `password` text COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data untuk tabel `penganalisis`
--

INSERT INTO `penganalisis` (`id`, `nama`, `password`) VALUES
(10, 'indri', '10'),
(108, 'Budi', '0108'),
(1081, 'indri', '01081'),
(11062020, 'Hrd', '11062020'),
(21642085, 'sindy', '21642085'),
(119027301, 'Imelda Sri Dumayanti', '0119027301'),
(216220254, 'Defri Halasan', '216220254'),
(216310085, 'Andrianus Sahputra', '216310085'),
(216310102, 'Hans Kinkel', '216310102'),
(216310107, 'Hendri Suranta', '216310107'),
(216310114, 'Krisman Fernando', '216310114'),
(216310118, 'Joy andrean', '216310118'),
(216310122, 'Dwi KS Ginting', '216310122'),
(216310137, 'Yogi Wadana', '216310137'),
(216310142, 'Desmon Jaya', '216310142'),
(216320031, 'Yogi Sanjaya', '216320031'),
(216320033, 'Alex Sandra', '216320033'),
(216320034, 'Melisa ', '216320034'),
(216320035, 'Ricky Sinaga', '216320035'),
(216320036, 'Mia Ginting', '216320036'),
(216320037, 'Dakka Purba', '216320037'),
(216320039, 'Indra Naibaho', '216320039'),
(216320040, 'Aron Daniel', '216320040'),
(216320041, 'Dewi Yunisara', '216320041'),
(216320044, 'Riswahyuni', '216320044'),
(216320048, 'Mangatur Prawira', '216320048'),
(216320050, 'Feber Togi', '216320050'),
(216420052, 'Rivai', '216420052'),
(216420090, 'Fedro', '216420090'),
(216420130, 'Vivo S', '216420130'),
(216420138, 'Loreni Indriani', '216420138'),
(216420192, 'Rahmat', '216420192'),
(216420200, 'Dian', '216420200'),
(216420258, 'Putri', '216420258'),
(216420278, 'Melisa', '216420278'),
(216428003, 'Agusman', '216428003'),
(216428008, 'Agi', '216428008'),
(216510041, 'Andri Tri Saputra', '216510041'),
(216510045, 'Grace Lady', '216510045'),
(216510051, 'Rut Veranita Nababan', '216510051'),
(216510052, 'Bakti Wiratama Saragih', '216510052'),
(216510067, 'Setia Budiman Harefa', '216510067'),
(216510070, 'Alfonso P Sitorus', '216510070'),
(216510079, 'Erwin E Sihombing', '216510079'),
(216510084, 'Sahala Panggabean ', '216510084'),
(216510089, 'Winda Sinaga', '216510089'),
(216510090, 'Elsantri Butar-butar', '216510090'),
(216510101, 'Tantina Devega ', '216510101'),
(216510102, 'Winda Sari Damanik', '216510102'),
(216520013, 'Jaysrelea', '216520013'),
(216520024, 'Risda Rebeka', '216520024'),
(216520039, 'Gresa Natha Simarmata', '216520039'),
(216520049, 'Ivan Nainggolan', '216520049'),
(216520054, 'Okta', '216520054'),
(217110006, 'Nishari manosmita', '217110006'),
(217110021, 'Murni Alexia', '217110021'),
(217110050, 'Natasya Sihombing', '217110050'),
(217110052, 'Cindy C Pardede', '217110052'),
(217110061, 'Maria Roulina', '217110061'),
(217110077, 'Ria Tiurma', '217110077'),
(217310045, 'Okta trio ', '217310045'),
(217410100, 'Risa septina sembiring', '217410100'),
(217410113, 'rince', '217410113'),
(217410122, 'Togi Pasaribu', '217410122'),
(217410130, 'Evander l simanullang', '217410130'),
(217410133, 'tiurma siagian', '217410133'),
(217410134, 'Jhon Hendrik Saragih', '217410134'),
(217410139, 'Jowel fernando sembiring', '217410139'),
(217410149, 'Yessy Anggun N', '217410149'),
(217420063, 'Sonya Purba', '217420063'),
(217510111, 'Rinto Alfandi', '217510111'),
(217520009, 'Theo Li Abroni Zebua', '217520009'),
(217520011, 'Putra palipi Sinaga', '217520011'),
(217520016, 'Gorbyno Sitepu', '217520016'),
(217520020, 'Sahat Mangatur S', '217520020'),
(217520025, 'Prawita Simarmata', '217520025'),
(217520032, 'Mario Stevanu', '217520032'),
(217520035, 'Elsen Hulu', '217520035'),
(218110085, 'Juliati Bakara', '218110085'),
(218410219, 'Wahyu Sandani', '218410219'),
(218440001, 'Winda Sinaga', '218440001'),
(218440002, 'Putri Sinaga', '218440002'),
(218440003, 'Jonathan Saragih', '218440003'),
(218440004, 'Rio Maritua', '218440004'),
(218440005, 'Grace Sihombing', '218440005'),
(218440006, 'Naris Siadari', '218440006'),
(218440007, 'Reynaldi Sianturi', '218440007'),
(218440012, 'Lestari Sihombing', '218440012'),
(218440013, 'Febri', '218440013'),
(218440014, 'Wahyu Surbakti', '218440014'),
(219110017, 'Kasih lidiys Br.Nadeak', '219110017'),
(219110027, 'Efraim pascal Simorangkir', '219110027'),
(219110030, 'Dharma rio Purba', '219110030'),
(219210002, 'Lidia Henni', '219210002'),
(219210003, 'Titus Imanuel', '219210003'),
(219210008, 'Leonardo Tarigan', '219210008'),
(219210023, 'Putri Andini', '219210023'),
(219210024, 'Theresia Novalina', '219210024'),
(219210027, 'Zhulfahkri Yusuf', '219210027'),
(219210030, 'Mikha Sidabalok', '219210030'),
(219210035, 'Grace Tabita', '219210035'),
(219210040, 'Panahian Marsahala', '219210040'),
(219210042, 'Yuda Rajagukguk', '219210042'),
(219318001, 'Dini Widiya', '219318001'),
(219430001, 'Paiman Nababan', '219430001'),
(219430005, 'Sion Sela Simorangkir', '219430005'),
(219430008, 'Edward Keliat', '219430008'),
(219430013, 'Edwin Xavenius', '219430013'),
(219430015, 'Enina Br Tarigan', '219430015'),
(219430016, 'Ari Fernando', '219430016'),
(219430017, 'Andrew S.P', '219430017'),
(219430019, 'Thomson januari', '219430019'),
(219430022, 'Saliti Simangunsong', '219430022'),
(219430023, 'Arsito Gavn', '219430023'),
(219430025, 'Alex  Leo', '219430025'),
(219430026, 'GIska Yufani', '219430026'),
(219430033, 'Tresna Wira Lubis', '219430033'),
(219430034, 'Arsy Tessalonika', '219430034'),
(219430035, 'Gerhat Alif', '219430035');

-- --------------------------------------------------------

--
-- Struktur dari tabel `r_control`
--

CREATE TABLE `r_control` (
  `id` int(11) NOT NULL,
  `allskor` double NOT NULL,
  `penganalisa` int(11) NOT NULL,
  `jstp` double NOT NULL,
  `jtp` double NOT NULL,
  `jrg` double NOT NULL,
  `jp` double NOT NULL,
  `jsp` double NOT NULL,
  `hasil` double NOT NULL,
  `status` varchar(25) COLLATE utf8_unicode_ci NOT NULL,
  `tanggal` text COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data untuk tabel `r_control`
--

INSERT INTO `r_control` (`id`, `allskor`, `penganalisa`, `jstp`, `jtp`, `jrg`, `jp`, `jsp`, `hasil`, `status`, `tanggal`) VALUES
(9, 401.39999999999986, 105, 0, 13, 29, 28, 35, 3.8228571428571416, 'PUAS', '2020-03-10'),
(10, 403.1999999999999, 106, 1, 13, 29, 28, 35, 3.803773584905659, 'PUAS', '2020-03-18'),
(11, 403.1999999999999, 106, 1, 13, 29, 28, 35, 3.803773584905659, 'PUAS', '2020-03-18');

-- --------------------------------------------------------

--
-- Struktur dari tabel `r_efisien`
--

CREATE TABLE `r_efisien` (
  `id` int(11) NOT NULL,
  `allskor` double NOT NULL,
  `penganalisa` int(11) NOT NULL,
  `jstp` double NOT NULL,
  `jtp` double NOT NULL,
  `jrg` double NOT NULL,
  `jp` double NOT NULL,
  `jsp` double NOT NULL,
  `hasil` double NOT NULL,
  `status` varchar(25) COLLATE utf8_unicode_ci NOT NULL,
  `tanggal` text COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data untuk tabel `r_efisien`
--

INSERT INTO `r_efisien` (`id`, `allskor`, `penganalisa`, `jstp`, `jtp`, `jrg`, `jp`, `jsp`, `hasil`, `status`, `tanggal`) VALUES
(9, 393.7999999999999, 106, 1, 14, 32, 27, 32, 3.7150943396226404, 'PUAS', '2020-03-10');

-- --------------------------------------------------------

--
-- Struktur dari tabel `r_ekonomi`
--

CREATE TABLE `r_ekonomi` (
  `id` int(11) NOT NULL,
  `allskor` double NOT NULL,
  `penganalisa` int(11) NOT NULL,
  `jstp` double NOT NULL,
  `jtp` double NOT NULL,
  `jrg` double NOT NULL,
  `jp` double NOT NULL,
  `jsp` double NOT NULL,
  `hasil` double NOT NULL,
  `status` varchar(25) COLLATE utf8_unicode_ci NOT NULL,
  `tanggal` text COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data untuk tabel `r_ekonomi`
--

INSERT INTO `r_ekonomi` (`id`, `allskor`, `penganalisa`, `jstp`, `jtp`, `jrg`, `jp`, `jsp`, `hasil`, `status`, `tanggal`) VALUES
(6, 425.60000000000014, 106, 1, 2, 18, 43, 42, 4.015094339622642, 'PUAS', '2020-03-10');

-- --------------------------------------------------------

--
-- Struktur dari tabel `r_informasi`
--

CREATE TABLE `r_informasi` (
  `id` int(11) NOT NULL,
  `allskor` double NOT NULL,
  `penganalisa` int(11) NOT NULL,
  `jstp` double NOT NULL,
  `jtp` double NOT NULL,
  `jrg` double NOT NULL,
  `jp` double NOT NULL,
  `jsp` double NOT NULL,
  `hasil` double NOT NULL,
  `status` varchar(26) COLLATE utf8_unicode_ci NOT NULL,
  `tanggal` text COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data untuk tabel `r_informasi`
--

INSERT INTO `r_informasi` (`id`, `allskor`, `penganalisa`, `jstp`, `jtp`, `jrg`, `jp`, `jsp`, `hasil`, `status`, `tanggal`) VALUES
(9, 396.59999999999985, 106, 0, 13, 34, 28, 31, 3.7415094339622628, 'PUAS', '2020-03-10');

-- --------------------------------------------------------

--
-- Struktur dari tabel `r_performa`
--

CREATE TABLE `r_performa` (
  `id` int(11) NOT NULL,
  `allskor` double DEFAULT NULL,
  `penganalisa` int(11) NOT NULL,
  `jstp` double DEFAULT NULL,
  `jtp` double DEFAULT NULL,
  `jrg` double DEFAULT NULL,
  `jp` double DEFAULT NULL,
  `jsp` double DEFAULT NULL,
  `hasil` double DEFAULT NULL,
  `status` varchar(25) COLLATE utf8_unicode_ci NOT NULL,
  `tanggal` text COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data untuk tabel `r_performa`
--

INSERT INTO `r_performa` (`id`, `allskor`, `penganalisa`, `jstp`, `jtp`, `jrg`, `jp`, `jsp`, `hasil`, `status`, `tanggal`) VALUES
(12, 349.99999999999994, 106, 16, 17, 24, 26, 23, 3.3018867924528297, 'RAGU-RAGU', '2020-03-10');

-- --------------------------------------------------------

--
-- Struktur dari tabel `r_servis`
--

CREATE TABLE `r_servis` (
  `id` int(11) NOT NULL,
  `allskor` double NOT NULL,
  `penganalisa` int(11) NOT NULL,
  `jstp` double NOT NULL,
  `jtp` double NOT NULL,
  `jrg` double NOT NULL,
  `jp` double NOT NULL,
  `jsp` double NOT NULL,
  `hasil` double NOT NULL,
  `status` varchar(25) COLLATE utf8_unicode_ci NOT NULL,
  `tanggal` text COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data untuk tabel `r_servis`
--

INSERT INTO `r_servis` (`id`, `allskor`, `penganalisa`, `jstp`, `jtp`, `jrg`, `jp`, `jsp`, `hasil`, `status`, `tanggal`) VALUES
(6, 337.8, 106, 20, 23, 22, 19, 22, 3.186792452830189, 'RAGU-RAGU', '2020-03-10');

-- --------------------------------------------------------

--
-- Struktur dari tabel `s_control`
--

CREATE TABLE `s_control` (
  `id` int(11) NOT NULL,
  `c` double DEFAULT NULL,
  `status` varchar(20) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data untuk tabel `s_control`
--

INSERT INTO `s_control` (`id`, `c`, `status`) VALUES
(108, 3.6, 'PUAS'),
(1081, 2.8, 'RAGU-RAGU'),
(119027301, 1.8, 'SANGAT TIDAK PUAS'),
(216220254, 2.2, 'TIDAK PUAS'),
(216310085, 2.4, 'TIDAK PUAS'),
(216310102, 4.4, 'SANGAT PUAS'),
(216310107, 3.4, 'RAGU-RAGU'),
(216310114, 4.6, 'SANGAT PUAS'),
(216310122, 5, 'SANGAT PUAS'),
(216310137, 4, 'PUAS'),
(216310142, 3.4, 'RAGU-RAGU'),
(216320031, 2.8, 'RAGU-RAGU'),
(216320033, 2.6, 'TIDAK PUAS'),
(216320034, 3.2, 'RAGU-RAGU'),
(216320035, 5, 'SANGAT PUAS'),
(216320036, 2.8, 'RAGU-RAGU'),
(216320037, 4, 'PUAS'),
(216320039, 3, 'RAGU-RAGU'),
(216320040, 2.8, 'RAGU-RAGU'),
(216320041, 3.4, 'RAGU-RAGU'),
(216320044, 3, 'RAGU-RAGU'),
(216320050, 3.6, 'PUAS'),
(216420052, 3.4, 'RAGU-RAGU'),
(216420130, 2.8, 'RAGU-RAGU'),
(216420138, 4.2, 'PUAS'),
(216420192, 3, 'RAGU-RAGU'),
(216420200, 4, 'PUAS'),
(216420258, 2.6, 'TIDAK PUAS'),
(216420278, 3.4, 'RAGU-RAGU'),
(216428003, 4.2, 'PUAS'),
(216510041, 5, 'SANGAT PUAS'),
(216510045, 3.8, 'PUAS'),
(216510051, 3.8, 'PUAS'),
(216510052, 3, 'RAGU-RAGU'),
(216510067, 4.6, 'SANGAT PUAS'),
(216510070, 5, 'SANGAT PUAS'),
(216510079, 3.2, 'RAGU-RAGU'),
(216510084, 4.4, 'SANGAT PUAS'),
(216510089, 4.2, 'PUAS'),
(216510090, 3.8, 'PUAS'),
(216510101, 3.2, 'RAGU-RAGU'),
(216510102, 3.6, 'PUAS'),
(216520013, 5, 'SANGAT PUAS'),
(216520024, 4.2, 'PUAS'),
(216520039, 4.2, 'PUAS'),
(216520049, 4.2, 'PUAS'),
(216520054, 2.6, 'TIDAK PUAS'),
(217110006, 2.2, 'TIDAK PUAS'),
(217110021, 2.2, 'TIDAK PUAS'),
(217110050, 3.6, 'PUAS'),
(217110052, 2.2, 'TIDAK PUAS'),
(217110061, 2, 'TIDAK PUAS'),
(217110077, 2.4, 'TIDAK PUAS'),
(217310045, 4.6, 'SANGAT PUAS'),
(217410100, 4, 'PUAS'),
(217410113, 5, 'SANGAT PUAS'),
(217410122, 2.6, 'TIDAK PUAS'),
(217410130, 5, 'SANGAT PUAS'),
(217410133, 3.2, 'RAGU-RAGU'),
(217410134, 4.6, 'SANGAT PUAS'),
(217410139, 5, 'SANGAT PUAS'),
(217410149, 3.4, 'RAGU-RAGU'),
(217420063, 4, 'PUAS'),
(217510111, 5, 'SANGAT PUAS'),
(217520009, 4.2, 'PUAS'),
(217520011, 4.4, 'SANGAT PUAS'),
(217520016, 3.6, 'PUAS'),
(217520020, 5, 'SANGAT PUAS'),
(217520032, 4, 'PUAS'),
(217520035, 4.4, 'SANGAT PUAS'),
(218110085, 2.8, 'RAGU-RAGU'),
(218410219, 3.6, 'PUAS'),
(218440001, 3.2, 'RAGU-RAGU'),
(218440002, 4, 'PUAS'),
(218440003, 4.4, 'SANGAT PUAS'),
(218440004, 4, 'PUAS'),
(218440005, 5, 'SANGAT PUAS'),
(218440006, 5, 'SANGAT PUAS'),
(218440007, 5, 'SANGAT PUAS'),
(218440012, 5, 'SANGAT PUAS'),
(218440013, 4.8, 'SANGAT PUAS'),
(218440014, 4.2, 'PUAS'),
(219110017, 3.6, 'PUAS'),
(219110027, 4.8, 'SANGAT PUAS'),
(219110030, 2.8, 'RAGU-RAGU'),
(219210002, 2, 'TIDAK PUAS'),
(219210003, 3.2, 'RAGU-RAGU'),
(219210008, 2.8, 'RAGU-RAGU'),
(219210023, 2.8, 'RAGU-RAGU'),
(219210024, 3.8, 'PUAS'),
(219210027, 3.4, 'RAGU-RAGU'),
(219210030, 3, 'RAGU-RAGU'),
(219210035, 3.2, 'RAGU-RAGU'),
(219210040, 5, 'SANGAT PUAS'),
(219210042, 3.4, 'RAGU-RAGU'),
(219318001, 2.6, 'TIDAK PUAS'),
(219430001, 5, 'SANGAT PUAS'),
(219430005, 5, 'SANGAT PUAS'),
(219430013, 5, 'SANGAT PUAS'),
(219430015, 3.4, 'RAGU-RAGU'),
(219430016, 3.8, 'PUAS'),
(219430017, 5, 'SANGAT PUAS'),
(219430019, 5, 'SANGAT PUAS'),
(219430022, 5, 'SANGAT PUAS'),
(219430023, 5, 'SANGAT PUAS'),
(219430026, 5, 'SANGAT PUAS'),
(219430033, 4.2, 'PUAS'),
(219430035, 5, 'SANGAT PUAS');

-- --------------------------------------------------------

--
-- Struktur dari tabel `s_efisien`
--

CREATE TABLE `s_efisien` (
  `id` int(11) NOT NULL,
  `e` double DEFAULT NULL,
  `status` varchar(20) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data untuk tabel `s_efisien`
--

INSERT INTO `s_efisien` (`id`, `e`, `status`) VALUES
(108, 4.2, 'PUAS'),
(1081, 3.4, 'RAGU-RAGU'),
(119027301, 3.4, 'RAGU-RAGU'),
(216220254, 2.4, 'TIDAK PUAS'),
(216310085, 2.4, 'TIDAK PUAS'),
(216310102, 2.8, 'RAGU-RAGU'),
(216310107, 2.8, 'RAGU-RAGU'),
(216310114, 4.4, 'SANGAT PUAS'),
(216310122, 5, 'SANGAT PUAS'),
(216310137, 4, 'PUAS'),
(216310142, 3.6, 'PUAS'),
(216320031, 2.6, 'TIDAK PUAS'),
(216320033, 2.6, 'TIDAK PUAS'),
(216320034, 2.4, 'TIDAK PUAS'),
(216320035, 3, 'RAGU-RAGU'),
(216320036, 3.6, 'PUAS'),
(216320037, 3.4, 'RAGU-RAGU'),
(216320039, 4, 'PUAS'),
(216320040, 2.2, 'TIDAK PUAS'),
(216320041, 2.8, 'RAGU-RAGU'),
(216320044, 3, 'RAGU-RAGU'),
(216320048, 2.6, 'TIDAK PUAS'),
(216320050, 4, 'PUAS'),
(216420052, 4, 'PUAS'),
(216420130, 3.4, 'RAGU-RAGU'),
(216420138, 4.4, 'SANGAT PUAS'),
(216420192, 2, 'TIDAK PUAS'),
(216420200, 4, 'PUAS'),
(216420258, 2.6, 'TIDAK PUAS'),
(216420278, 3.6, 'PUAS'),
(216428003, 3, 'RAGU-RAGU'),
(216510041, 5, 'SANGAT PUAS'),
(216510045, 2.8, 'RAGU-RAGU'),
(216510051, 4.2, 'PUAS'),
(216510052, 3.8, 'PUAS'),
(216510067, 4.8, 'SANGAT PUAS'),
(216510070, 2.6, 'TIDAK PUAS'),
(216510079, 3.6, 'PUAS'),
(216510084, 4.4, 'SANGAT PUAS'),
(216510089, 4, 'PUAS'),
(216510090, 4, 'PUAS'),
(216510101, 3.4, 'RAGU-RAGU'),
(216510102, 4, 'PUAS'),
(216520013, 2.8, 'RAGU-RAGU'),
(216520024, 3.4, 'RAGU-RAGU'),
(216520039, 4.6, 'SANGAT PUAS'),
(216520049, 3.4, 'RAGU-RAGU'),
(216520054, 3.4, 'RAGU-RAGU'),
(217110006, 3.4, 'RAGU-RAGU'),
(217110021, 4.2, 'PUAS'),
(217110050, 4.4, 'SANGAT PUAS'),
(217110052, 3.6, 'PUAS'),
(217110061, 3.6, 'PUAS'),
(217110077, 4.4, 'SANGAT PUAS'),
(217310045, 2, 'TIDAK PUAS'),
(217410100, 3.2, 'RAGU-RAGU'),
(217410113, 4.8, 'SANGAT PUAS'),
(217410122, 2.6, 'TIDAK PUAS'),
(217410130, 5, 'SANGAT PUAS'),
(217410133, 2.4, 'TIDAK PUAS'),
(217410134, 4.8, 'SANGAT PUAS'),
(217410139, 5, 'SANGAT PUAS'),
(217410149, 3.6, 'PUAS'),
(217420063, 3, 'RAGU-RAGU'),
(217510111, 3.4, 'RAGU-RAGU'),
(217520009, 3.4, 'RAGU-RAGU'),
(217520011, 3.4, 'RAGU-RAGU'),
(217520016, 3.8, 'PUAS'),
(217520020, 5, 'SANGAT PUAS'),
(217520032, 4.4, 'SANGAT PUAS'),
(217520035, 3, 'RAGU-RAGU'),
(218110085, 4.4, 'SANGAT PUAS'),
(218410219, 3.2, 'RAGU-RAGU'),
(218440001, 4, 'PUAS'),
(218440002, 4, 'PUAS'),
(218440003, 4.6, 'SANGAT PUAS'),
(218440004, 4.4, 'SANGAT PUAS'),
(218440005, 4.2, 'PUAS'),
(218440006, 4, 'PUAS'),
(218440007, 4.4, 'SANGAT PUAS'),
(218440012, 4.2, 'PUAS'),
(218440013, 4.6, 'SANGAT PUAS'),
(218440014, 4.4, 'SANGAT PUAS'),
(219110017, 3.4, 'RAGU-RAGU'),
(219110027, 4.4, 'SANGAT PUAS'),
(219110030, 3, 'RAGU-RAGU'),
(219210002, 3, 'RAGU-RAGU'),
(219210003, 3.8, 'PUAS'),
(219210008, 1.8, 'SANGAT TIDAK PUAS'),
(219210023, 3, 'RAGU-RAGU'),
(219210024, 3.4, 'RAGU-RAGU'),
(219210027, 3.4, 'RAGU-RAGU'),
(219210030, 4.2, 'PUAS'),
(219210035, 4.4, 'SANGAT PUAS'),
(219210040, 2.8, 'RAGU-RAGU'),
(219210042, 3.2, 'RAGU-RAGU'),
(219318001, 2.6, 'TIDAK PUAS'),
(219430001, 5, 'SANGAT PUAS'),
(219430005, 5, 'SANGAT PUAS'),
(219430013, 5, 'SANGAT PUAS'),
(219430015, 4.2, 'PUAS'),
(219430016, 3.2, 'RAGU-RAGU'),
(219430017, 5, 'SANGAT PUAS'),
(219430019, 5, 'SANGAT PUAS'),
(219430022, 5, 'SANGAT PUAS'),
(219430023, 5, 'SANGAT PUAS'),
(219430026, 5, 'SANGAT PUAS'),
(219430033, 3.4, 'RAGU-RAGU'),
(219430035, 5, 'SANGAT PUAS');

-- --------------------------------------------------------

--
-- Struktur dari tabel `s_ekonomi`
--

CREATE TABLE `s_ekonomi` (
  `id` int(11) NOT NULL,
  `ek` double DEFAULT NULL,
  `status` varchar(20) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data untuk tabel `s_ekonomi`
--

INSERT INTO `s_ekonomi` (`id`, `ek`, `status`) VALUES
(108, 2.6, 'TIDAK PUAS'),
(1081, 3, 'RAGU-RAGU'),
(119027301, 3.8, 'PUAS'),
(216220254, 2.2, 'TIDAK PUAS'),
(216310085, 2.6, 'TIDAK PUAS'),
(216310102, 3.6, 'PUAS'),
(216310107, 3.6, 'PUAS'),
(216310114, 4.8, 'SANGAT PUAS'),
(216310122, 3.8, 'PUAS'),
(216310137, 3.6, 'PUAS'),
(216310142, 2.8, 'RAGU-RAGU'),
(216320031, 2.8, 'RAGU-RAGU'),
(216320033, 3, 'RAGU-RAGU'),
(216320034, 3, 'RAGU-RAGU'),
(216320035, 3.8, 'PUAS'),
(216320036, 2.8, 'RAGU-RAGU'),
(216320037, 3.2, 'RAGU-RAGU'),
(216320039, 3.2, 'RAGU-RAGU'),
(216320040, 3.6, 'PUAS'),
(216320041, 3.4, 'RAGU-RAGU'),
(216320044, 3.2, 'RAGU-RAGU'),
(216320048, 3.4, 'RAGU-RAGU'),
(216320050, 5, 'SANGAT PUAS'),
(216420052, 3.6, 'PUAS'),
(216420130, 4.2, 'PUAS'),
(216420138, 3.6, 'PUAS'),
(216420192, 3, 'RAGU-RAGU'),
(216420200, 3.8, 'PUAS'),
(216420258, 3.6, 'PUAS'),
(216420278, 3.6, 'PUAS'),
(216428003, 5, 'SANGAT PUAS'),
(216510041, 4.2, 'PUAS'),
(216510045, 3, 'RAGU-RAGU'),
(216510051, 3.4, 'RAGU-RAGU'),
(216510052, 3.8, 'PUAS'),
(216510067, 4.2, 'PUAS'),
(216510070, 5, 'SANGAT PUAS'),
(216510079, 1, 'SANGAT TIDAK PUAS'),
(216510084, 4, 'PUAS'),
(216510089, 3.6, 'PUAS'),
(216510090, 4, 'PUAS'),
(216510101, 3.8, 'PUAS'),
(216510102, 4.4, 'SANGAT PUAS'),
(216520013, 5, 'SANGAT PUAS'),
(216520024, 4.4, 'SANGAT PUAS'),
(216520039, 5, 'SANGAT PUAS'),
(216520049, 4.6, 'SANGAT PUAS'),
(216520054, 5, 'SANGAT PUAS'),
(217110006, 3.8, 'PUAS'),
(217110021, 4, 'PUAS'),
(217110050, 4.8, 'SANGAT PUAS'),
(217110052, 4, 'PUAS'),
(217110061, 4, 'PUAS'),
(217110077, 4, 'PUAS'),
(217310045, 4.4, 'SANGAT PUAS'),
(217410100, 3, 'RAGU-RAGU'),
(217410113, 5, 'SANGAT PUAS'),
(217410122, 3.2, 'RAGU-RAGU'),
(217410130, 5, 'SANGAT PUAS'),
(217410133, 3, 'RAGU-RAGU'),
(217410134, 3.8, 'PUAS'),
(217410139, 5, 'SANGAT PUAS'),
(217410149, 4, 'PUAS'),
(217420063, 3.8, 'PUAS'),
(217510111, 3.8, 'PUAS'),
(217520009, 4.6, 'SANGAT PUAS'),
(217520011, 5, 'SANGAT PUAS'),
(217520016, 4.4, 'SANGAT PUAS'),
(217520020, 5, 'SANGAT PUAS'),
(217520032, 4.6, 'SANGAT PUAS'),
(217520035, 4.6, 'SANGAT PUAS'),
(218110085, 4.4, 'SANGAT PUAS'),
(218410219, 4, 'PUAS'),
(218440001, 3.6, 'PUAS'),
(218440002, 3.8, 'PUAS'),
(218440003, 4.4, 'SANGAT PUAS'),
(218440004, 4.4, 'SANGAT PUAS'),
(218440005, 4.2, 'PUAS'),
(218440006, 4.4, 'SANGAT PUAS'),
(218440007, 4, 'PUAS'),
(218440012, 4.2, 'PUAS'),
(218440013, 4.4, 'SANGAT PUAS'),
(218440014, 4.4, 'SANGAT PUAS'),
(219110017, 4.4, 'SANGAT PUAS'),
(219110027, 4.8, 'SANGAT PUAS'),
(219110030, 3, 'RAGU-RAGU'),
(219210002, 3.8, 'PUAS'),
(219210003, 3.6, 'PUAS'),
(219210008, 4.6, 'SANGAT PUAS'),
(219210023, 4.8, 'SANGAT PUAS'),
(219210024, 3.8, 'PUAS'),
(219210027, 3.6, 'PUAS'),
(219210030, 3, 'RAGU-RAGU'),
(219210035, 3.6, 'PUAS'),
(219210040, 3.8, 'PUAS'),
(219210042, 3.6, 'PUAS'),
(219318001, 4, 'PUAS'),
(219430001, 5, 'SANGAT PUAS'),
(219430005, 5, 'SANGAT PUAS'),
(219430013, 5, 'SANGAT PUAS'),
(219430015, 4, 'PUAS'),
(219430016, 4.4, 'SANGAT PUAS'),
(219430017, 5, 'SANGAT PUAS'),
(219430019, 5, 'SANGAT PUAS'),
(219430022, 5, 'SANGAT PUAS'),
(219430023, 5, 'SANGAT PUAS'),
(219430026, 5, 'SANGAT PUAS'),
(219430033, 4.6, 'SANGAT PUAS'),
(219430035, 5, 'SANGAT PUAS');

-- --------------------------------------------------------

--
-- Struktur dari tabel `s_informasi`
--

CREATE TABLE `s_informasi` (
  `id` int(11) NOT NULL,
  `i` double NOT NULL,
  `status` varchar(20) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data untuk tabel `s_informasi`
--

INSERT INTO `s_informasi` (`id`, `i`, `status`) VALUES
(108, 2.6, 'TIDAK PUAS'),
(1081, 2.4, 'TIDAK PUAS'),
(119027301, 3.2, 'RAGU-RAGU'),
(216220254, 2.6, 'TIDAK PUAS'),
(216310085, 2, 'TIDAK PUAS'),
(216310102, 3.6, 'PUAS'),
(216310107, 4.2, 'PUAS'),
(216310114, 2.6, 'TIDAK PUAS'),
(216310122, 3.6, 'PUAS'),
(216310137, 3.4, 'RAGU-RAGU'),
(216310142, 3.6, 'PUAS'),
(216320031, 2.8, 'RAGU-RAGU'),
(216320033, 2.8, 'RAGU-RAGU'),
(216320034, 3.6, 'PUAS'),
(216320035, 3.6, 'PUAS'),
(216320036, 3.6, 'PUAS'),
(216320037, 2.6, 'TIDAK PUAS'),
(216320039, 3, 'RAGU-RAGU'),
(216320040, 3, 'RAGU-RAGU'),
(216320041, 2.6, 'TIDAK PUAS'),
(216320044, 3.2, 'RAGU-RAGU'),
(216320048, 5, 'SANGAT PUAS'),
(216320050, 3.4, 'RAGU-RAGU'),
(216420052, 3.6, 'PUAS'),
(216420130, 3.4, 'RAGU-RAGU'),
(216420138, 4.2, 'PUAS'),
(216420192, 3, 'RAGU-RAGU'),
(216420200, 3, 'RAGU-RAGU'),
(216420258, 2, 'TIDAK PUAS'),
(216420278, 3.8, 'PUAS'),
(216428003, 3.4, 'RAGU-RAGU'),
(216510041, 5, 'SANGAT PUAS'),
(216510045, 3.6, 'PUAS'),
(216510051, 3.8, 'PUAS'),
(216510052, 3.2, 'RAGU-RAGU'),
(216510067, 4.4, 'SANGAT PUAS'),
(216510070, 3.6, 'PUAS'),
(216510079, 5, 'SANGAT PUAS'),
(216510084, 4, 'PUAS'),
(216510089, 3.8, 'PUAS'),
(216510090, 3.4, 'RAGU-RAGU'),
(216510101, 2.6, 'TIDAK PUAS'),
(216510102, 4.2, 'PUAS'),
(216520013, 3.4, 'RAGU-RAGU'),
(216520024, 2.8, 'RAGU-RAGU'),
(216520039, 4.2, 'PUAS'),
(216520049, 3, 'RAGU-RAGU'),
(216520054, 3.4, 'RAGU-RAGU'),
(217110006, 3, 'RAGU-RAGU'),
(217110021, 4.4, 'SANGAT PUAS'),
(217110050, 3.8, 'PUAS'),
(217110052, 3.4, 'RAGU-RAGU'),
(217110061, 4.2, 'PUAS'),
(217110077, 5, 'SANGAT PUAS'),
(217310045, 3.4, 'RAGU-RAGU'),
(217410100, 2.8, 'RAGU-RAGU'),
(217410113, 4.8, 'SANGAT PUAS'),
(217410122, 2.2, 'TIDAK PUAS'),
(217410130, 5, 'SANGAT PUAS'),
(217410133, 2.6, 'TIDAK PUAS'),
(217410134, 4.8, 'SANGAT PUAS'),
(217410139, 5, 'SANGAT PUAS'),
(217410149, 3.8, 'PUAS'),
(217420063, 3, 'RAGU-RAGU'),
(217510111, 4.4, 'SANGAT PUAS'),
(217520009, 3.4, 'RAGU-RAGU'),
(217520011, 3.8, 'PUAS'),
(217520016, 3.8, 'PUAS'),
(217520020, 5, 'SANGAT PUAS'),
(217520032, 4.6, 'SANGAT PUAS'),
(217520035, 3.4, 'RAGU-RAGU'),
(218110085, 4.2, 'PUAS'),
(218410219, 3.4, 'RAGU-RAGU'),
(218440001, 3.4, 'RAGU-RAGU'),
(218440002, 3.8, 'PUAS'),
(218440003, 4.2, 'PUAS'),
(218440004, 4.2, 'PUAS'),
(218440005, 4.4, 'SANGAT PUAS'),
(218440006, 5, 'SANGAT PUAS'),
(218440007, 4.4, 'SANGAT PUAS'),
(218440012, 4.6, 'SANGAT PUAS'),
(218440013, 5, 'SANGAT PUAS'),
(218440014, 4.6, 'SANGAT PUAS'),
(219110017, 3.4, 'RAGU-RAGU'),
(219110027, 4.4, 'SANGAT PUAS'),
(219110030, 2.2, 'TIDAK PUAS'),
(219210002, 2.2, 'TIDAK PUAS'),
(219210003, 3.2, 'RAGU-RAGU'),
(219210008, 2.4, 'TIDAK PUAS'),
(219210023, 2.2, 'TIDAK PUAS'),
(219210024, 3.2, 'RAGU-RAGU'),
(219210027, 3.4, 'RAGU-RAGU'),
(219210030, 4.4, 'SANGAT PUAS'),
(219210035, 3.8, 'PUAS'),
(219210040, 3.2, 'RAGU-RAGU'),
(219210042, 2.8, 'RAGU-RAGU'),
(219318001, 5, 'SANGAT PUAS'),
(219430001, 5, 'SANGAT PUAS'),
(219430005, 5, 'SANGAT PUAS'),
(219430013, 5, 'SANGAT PUAS'),
(219430015, 3.4, 'RAGU-RAGU'),
(219430016, 3.4, 'RAGU-RAGU'),
(219430017, 5, 'SANGAT PUAS'),
(219430019, 5, 'SANGAT PUAS'),
(219430022, 5, 'SANGAT PUAS'),
(219430023, 5, 'SANGAT PUAS'),
(219430026, 5, 'SANGAT PUAS'),
(219430033, 3.6, 'PUAS'),
(219430035, 5, 'SANGAT PUAS');

-- --------------------------------------------------------

--
-- Struktur dari tabel `s_performance`
--

CREATE TABLE `s_performance` (
  `id` int(11) NOT NULL,
  `p` double DEFAULT NULL,
  `status` varchar(20) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data untuk tabel `s_performance`
--

INSERT INTO `s_performance` (`id`, `p`, `status`) VALUES
(108, 3.2, 'RAGU-RAGU'),
(1081, 4.2, 'PUAS'),
(119027301, 4, 'PUAS'),
(216220254, 2.6, 'TIDAK PUAS'),
(216310085, 2.4, 'TIDAK PUAS'),
(216310102, 2.2, 'TIDAK PUAS'),
(216310107, 1, 'SANGAT TIDAK PUAS'),
(216310114, 4.6, 'SANGAT PUAS'),
(216310122, 3, 'RAGU-RAGU'),
(216310137, 1.2, 'SANGAT TIDAK PUAS'),
(216310142, 1.8, 'SANGAT TIDAK PUAS'),
(216320031, 2.2, 'TIDAK PUAS'),
(216320033, 2.8, 'RAGU-RAGU'),
(216320034, 2.8, 'RAGU-RAGU'),
(216320035, 3, 'RAGU-RAGU'),
(216320036, 3.2, 'RAGU-RAGU'),
(216320037, 3, 'RAGU-RAGU'),
(216320039, 3.4, 'RAGU-RAGU'),
(216320040, 3.2, 'RAGU-RAGU'),
(216320041, 3, 'RAGU-RAGU'),
(216320044, 3.2, 'RAGU-RAGU'),
(216320048, 1, 'SANGAT TIDAK PUAS'),
(216320050, 2.4, 'TIDAK PUAS'),
(216420052, 3.4, 'RAGU-RAGU'),
(216420130, 2, 'TIDAK PUAS'),
(216420138, 4, 'PUAS'),
(216420192, 3, 'RAGU-RAGU'),
(216420200, 3.2, 'RAGU-RAGU'),
(216420258, 2.8, 'RAGU-RAGU'),
(216420278, 3.8, 'PUAS'),
(216428003, 1.6, 'SANGAT TIDAK PUAS'),
(216510041, 5, 'SANGAT PUAS'),
(216510045, 2.4, 'TIDAK PUAS'),
(216510051, 1.8, 'SANGAT TIDAK PUAS'),
(216510052, 2.4, 'TIDAK PUAS'),
(216510067, 4, 'PUAS'),
(216510070, 2, 'TIDAK PUAS'),
(216510079, 3.4, 'RAGU-RAGU'),
(216510084, 4.6, 'SANGAT PUAS'),
(216510089, 3.8, 'PUAS'),
(216510090, 3.6, 'PUAS'),
(216510101, 2.8, 'RAGU-RAGU'),
(216510102, 4.2, 'PUAS'),
(216520013, 1.4, 'SANGAT TIDAK PUAS'),
(216520024, 3.6, 'PUAS'),
(216520039, 4.2, 'PUAS'),
(216520049, 1.2, 'SANGAT TIDAK PUAS'),
(216520054, 2, 'TIDAK PUAS'),
(217110006, 3.6, 'PUAS'),
(217110021, 3.6, 'PUAS'),
(217110050, 4.2, 'PUAS'),
(217110052, 4.2, 'PUAS'),
(217110061, 3.4, 'RAGU-RAGU'),
(217110077, 4, 'PUAS'),
(217310045, 2.2, 'TIDAK PUAS'),
(217410100, 2, 'TIDAK PUAS'),
(217410113, 4.2, 'PUAS'),
(217410122, 3.2, 'RAGU-RAGU'),
(217410130, 5, 'SANGAT PUAS'),
(217410133, 2.8, 'RAGU-RAGU'),
(217410134, 4.6, 'SANGAT PUAS'),
(217410139, 5, 'SANGAT PUAS'),
(217410149, 3.4, 'RAGU-RAGU'),
(217420063, 2.6, 'TIDAK PUAS'),
(217510111, 4.8, 'SANGAT PUAS'),
(217520009, 1.2, 'SANGAT TIDAK PUAS'),
(217520011, 1.4, 'SANGAT TIDAK PUAS'),
(217520016, 4.4, 'SANGAT PUAS'),
(217520020, 5, 'SANGAT PUAS'),
(217520032, 4.8, 'SANGAT PUAS'),
(217520035, 2.8, 'RAGU-RAGU'),
(218110085, 3.2, 'RAGU-RAGU'),
(218410219, 4.4, 'SANGAT PUAS'),
(218440001, 3.8, 'PUAS'),
(218440002, 3.8, 'PUAS'),
(218440003, 3.8, 'PUAS'),
(218440004, 4.2, 'PUAS'),
(218440005, 4.2, 'PUAS'),
(218440006, 4.8, 'SANGAT PUAS'),
(218440007, 4.6, 'SANGAT PUAS'),
(218440012, 5, 'SANGAT PUAS'),
(218440013, 4.2, 'PUAS'),
(218440014, 4.2, 'PUAS'),
(219110017, 4.2, 'PUAS'),
(219110027, 4, 'PUAS'),
(219110030, 3, 'RAGU-RAGU'),
(219210002, 1.8, 'SANGAT TIDAK PUAS'),
(219210003, 1.4, 'SANGAT TIDAK PUAS'),
(219210008, 4, 'PUAS'),
(219210023, 2, 'TIDAK PUAS'),
(219210024, 2, 'TIDAK PUAS'),
(219210027, 2.6, 'TIDAK PUAS'),
(219210030, 3.4, 'RAGU-RAGU'),
(219210035, 2.2, 'TIDAK PUAS'),
(219210040, 3.8, 'PUAS'),
(219210042, 1.4, 'SANGAT TIDAK PUAS'),
(219318001, 1.2, 'SANGAT TIDAK PUAS'),
(219430001, 5, 'SANGAT PUAS'),
(219430005, 5, 'SANGAT PUAS'),
(219430013, 5, 'SANGAT PUAS'),
(219430015, 1.8, 'SANGAT TIDAK PUAS'),
(219430016, 1.8, 'SANGAT TIDAK PUAS'),
(219430017, 5, 'SANGAT PUAS'),
(219430019, 5, 'SANGAT PUAS'),
(219430022, 5, 'SANGAT PUAS'),
(219430023, 5, 'SANGAT PUAS'),
(219430026, 5, 'SANGAT PUAS'),
(219430033, 3.6, 'PUAS'),
(219430035, 5, 'SANGAT PUAS');

-- --------------------------------------------------------

--
-- Struktur dari tabel `s_servis`
--

CREATE TABLE `s_servis` (
  `id` int(11) NOT NULL,
  `s` double DEFAULT NULL,
  `status` varchar(20) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data untuk tabel `s_servis`
--

INSERT INTO `s_servis` (`id`, `s`, `status`) VALUES
(108, 3, 'RAGU-RAGU'),
(119027301, 3.4, 'RAGU-RAGU'),
(216220254, 2.8, 'RAGU-RAGU'),
(216310085, 2.2, 'TIDAK PUAS'),
(216310102, 1.8, 'SANGAT TIDAK PUAS'),
(216310107, 3, 'RAGU-RAGU'),
(216310114, 4.4, 'SANGAT PUAS'),
(216310122, 1, 'SANGAT TIDAK PUAS'),
(216310137, 1.8, 'SANGAT TIDAK PUAS'),
(216310142, 1.8, 'SANGAT TIDAK PUAS'),
(216320031, 2.4, 'TIDAK PUAS'),
(216320033, 2.8, 'RAGU-RAGU'),
(216320034, 3.8, 'PUAS'),
(216320035, 3, 'RAGU-RAGU'),
(216320036, 3, 'RAGU-RAGU'),
(216320037, 2.6, 'TIDAK PUAS'),
(216320039, 3, 'RAGU-RAGU'),
(216320040, 2.4, 'TIDAK PUAS'),
(216320041, 2.6, 'TIDAK PUAS'),
(216320044, 2.4, 'TIDAK PUAS'),
(216320048, 1.6, 'SANGAT TIDAK PUAS'),
(216320050, 1.8, 'SANGAT TIDAK PUAS'),
(216420052, 4, 'PUAS'),
(216420130, 3.4, 'RAGU-RAGU'),
(216420138, 4.2, 'PUAS'),
(216420192, 2.4, 'TIDAK PUAS'),
(216420200, 5, 'SANGAT PUAS'),
(216420258, 3, 'RAGU-RAGU'),
(216420278, 4, 'PUAS'),
(216428003, 2.6, 'TIDAK PUAS'),
(216510041, 2, 'TIDAK PUAS'),
(216510045, 2.8, 'RAGU-RAGU'),
(216510051, 1, 'SANGAT TIDAK PUAS'),
(216510052, 2.8, 'RAGU-RAGU'),
(216510067, 3.6, 'PUAS'),
(216510070, 2.6, 'TIDAK PUAS'),
(216510079, 1, 'SANGAT TIDAK PUAS'),
(216510084, 4.8, 'SANGAT PUAS'),
(216510089, 4, 'PUAS'),
(216510090, 3.4, 'RAGU-RAGU'),
(216510101, 3, 'RAGU-RAGU'),
(216510102, 3.8, 'PUAS'),
(216520013, 2.6, 'TIDAK PUAS'),
(216520024, 2.6, 'TIDAK PUAS'),
(216520039, 4.2, 'PUAS'),
(216520049, 2.6, 'TIDAK PUAS'),
(216520054, 1.8, 'SANGAT TIDAK PUAS'),
(217110006, 3.8, 'PUAS'),
(217110021, 1.6, 'SANGAT TIDAK PUAS'),
(217110050, 4.4, 'SANGAT PUAS'),
(217110052, 4, 'PUAS'),
(217110061, 3, 'RAGU-RAGU'),
(217110077, 3.8, 'PUAS'),
(217310045, 3.4, 'RAGU-RAGU'),
(217410100, 2.8, 'RAGU-RAGU'),
(217410113, 5, 'SANGAT PUAS'),
(217410122, 2.6, 'TIDAK PUAS'),
(217410130, 5, 'SANGAT PUAS'),
(217410133, 2.4, 'TIDAK PUAS'),
(217410134, 4.4, 'SANGAT PUAS'),
(217410139, 5, 'SANGAT PUAS'),
(217410149, 3.4, 'RAGU-RAGU'),
(217420063, 2.6, 'TIDAK PUAS'),
(217510111, 2.6, 'TIDAK PUAS'),
(217520009, 2.6, 'TIDAK PUAS'),
(217520011, 1.8, 'SANGAT TIDAK PUAS'),
(217520016, 3.4, 'RAGU-RAGU'),
(217520020, 5, 'SANGAT PUAS'),
(217520032, 4.2, 'PUAS'),
(217520035, 2.6, 'TIDAK PUAS'),
(218110085, 3.2, 'RAGU-RAGU'),
(218410219, 5, 'SANGAT PUAS'),
(218440001, 1.8, 'SANGAT TIDAK PUAS'),
(218440002, 4.2, 'PUAS'),
(218440003, 4.4, 'SANGAT PUAS'),
(218440004, 4.2, 'PUAS'),
(218440005, 4.6, 'SANGAT PUAS'),
(218440006, 4.2, 'PUAS'),
(218440007, 4.4, 'SANGAT PUAS'),
(218440012, 4.2, 'PUAS'),
(218440013, 4.2, 'PUAS'),
(218440014, 4.2, 'PUAS'),
(219110017, 2.6, 'TIDAK PUAS'),
(219110027, 4.8, 'SANGAT PUAS'),
(219110030, 2, 'TIDAK PUAS'),
(219210002, 1.4, 'SANGAT TIDAK PUAS'),
(219210003, 2.8, 'RAGU-RAGU'),
(219210008, 1.8, 'SANGAT TIDAK PUAS'),
(219210023, 2.6, 'TIDAK PUAS'),
(219210024, 1, 'SANGAT TIDAK PUAS'),
(219210027, 1.8, 'SANGAT TIDAK PUAS'),
(219210030, 3.6, 'PUAS'),
(219210035, 1.8, 'SANGAT TIDAK PUAS'),
(219210040, 3, 'RAGU-RAGU'),
(219210042, 2, 'TIDAK PUAS'),
(219318001, 1.8, 'SANGAT TIDAK PUAS'),
(219430001, 5, 'SANGAT PUAS'),
(219430005, 5, 'SANGAT PUAS'),
(219430013, 5, 'SANGAT PUAS'),
(219430015, 1.8, 'SANGAT TIDAK PUAS'),
(219430016, 3.2, 'RAGU-RAGU'),
(219430017, 5, 'SANGAT PUAS'),
(219430019, 5, 'SANGAT PUAS'),
(219430022, 1, 'SANGAT TIDAK PUAS'),
(219430023, 5, 'SANGAT PUAS'),
(219430026, 5, 'SANGAT PUAS'),
(219430033, 3.4, 'RAGU-RAGU'),
(219430035, 5, 'SANGAT PUAS');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `k_control`
--
ALTER TABLE `k_control`
  ADD PRIMARY KEY (`id_kuisioner`);

--
-- Indeks untuk tabel `k_efisien`
--
ALTER TABLE `k_efisien`
  ADD PRIMARY KEY (`id_kuisioner`);

--
-- Indeks untuk tabel `k_ekonomi`
--
ALTER TABLE `k_ekonomi`
  ADD PRIMARY KEY (`id_kuisioner`);

--
-- Indeks untuk tabel `k_informasi`
--
ALTER TABLE `k_informasi`
  ADD PRIMARY KEY (`id_kuisioner`);

--
-- Indeks untuk tabel `k_performa`
--
ALTER TABLE `k_performa`
  ADD PRIMARY KEY (`id_kuisioner`);

--
-- Indeks untuk tabel `k_servis`
--
ALTER TABLE `k_servis`
  ADD PRIMARY KEY (`id_kuisioner`);

--
-- Indeks untuk tabel `penganalisis`
--
ALTER TABLE `penganalisis`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `r_control`
--
ALTER TABLE `r_control`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `r_efisien`
--
ALTER TABLE `r_efisien`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `r_ekonomi`
--
ALTER TABLE `r_ekonomi`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `r_informasi`
--
ALTER TABLE `r_informasi`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `r_performa`
--
ALTER TABLE `r_performa`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `r_servis`
--
ALTER TABLE `r_servis`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `s_control`
--
ALTER TABLE `s_control`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `s_efisien`
--
ALTER TABLE `s_efisien`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `s_ekonomi`
--
ALTER TABLE `s_ekonomi`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `s_informasi`
--
ALTER TABLE `s_informasi`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `s_performance`
--
ALTER TABLE `s_performance`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `s_servis`
--
ALTER TABLE `s_servis`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `admin`
--
ALTER TABLE `admin`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT untuk tabel `k_control`
--
ALTER TABLE `k_control`
  MODIFY `id_kuisioner` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT untuk tabel `k_efisien`
--
ALTER TABLE `k_efisien`
  MODIFY `id_kuisioner` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT untuk tabel `k_ekonomi`
--
ALTER TABLE `k_ekonomi`
  MODIFY `id_kuisioner` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT untuk tabel `k_informasi`
--
ALTER TABLE `k_informasi`
  MODIFY `id_kuisioner` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT untuk tabel `k_performa`
--
ALTER TABLE `k_performa`
  MODIFY `id_kuisioner` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT untuk tabel `k_servis`
--
ALTER TABLE `k_servis`
  MODIFY `id_kuisioner` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT untuk tabel `r_control`
--
ALTER TABLE `r_control`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT untuk tabel `r_efisien`
--
ALTER TABLE `r_efisien`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT untuk tabel `r_ekonomi`
--
ALTER TABLE `r_ekonomi`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT untuk tabel `r_informasi`
--
ALTER TABLE `r_informasi`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT untuk tabel `r_performa`
--
ALTER TABLE `r_performa`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT untuk tabel `r_servis`
--
ALTER TABLE `r_servis`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
