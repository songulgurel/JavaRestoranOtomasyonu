-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 01 Oca 2025, 12:59:19
-- Sunucu sürümü: 10.4.32-MariaDB
-- PHP Sürümü: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `restoran`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `kullanicilar`
--

CREATE TABLE `kullanicilar` (
  `id` int(100) NOT NULL,
  `ad` varchar(50) NOT NULL,
  `soyad` varchar(30) NOT NULL,
  `mail` varchar(100) NOT NULL,
  `telNo` varchar(11) DEFAULT 'Yok',
  `adres` varchar(255) DEFAULT 'Bilgi Tanımlanmadı',
  `sifre` varchar(300) NOT NULL,
  `kartNo` varchar(16) DEFAULT 'Yok',
  `cvv` varchar(3) DEFAULT 'Yok',
  `skt` varchar(5) DEFAULT 'Yok'
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `kullanicilar`
--

INSERT INTO `kullanicilar` (`id`, `ad`, `soyad`, `mail`, `telNo`, `adres`, `sifre`, `kartNo`, `cvv`, `skt`) VALUES
(1, 'Muhammet Volkan', 'Aktaş', 'vlk.aktas34@gmail.com', '05418433412', 'Sultangazi/İstanbul', 'deneme123', '0123456789012345', '012', '0212'),
(2, 'Cem Turan', 'Kızgır', 'deneme2@gmail.com', '05053526154', 'Beşiktaş', 'deneme1234', '1245142535263256', '125', '1229'),
(3, 'Songül', 'Gürel', 'deneme3@gmail.com', '05346547584', 'Başakşehir', 'deneme12345', '1245142535652653', '123', '1235'),
(4, 'Nil', 'Hastaoğlu', 'deneme4@gmail.com', '05325415245', 'Esenyurt', 'deneme123456', '', '', ''),
(5, 'Hivdanur', 'Yatbaz', 'deneme5@gmail.com', '05534251458', 'Tuzla', 'deneme1234567', '', '', ''),
(6, 'Yönetici', '', 'CEVHERS', '', '', 'Admin123', '', '', ''),
(7, 'ali', 'veli', 'a@gmail.com', '05441548758', '', 'aliveli123', '', '', '');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `menu`
--

CREATE TABLE `menu` (
  `urunId` int(100) NOT NULL,
  `urun` varchar(200) NOT NULL,
  `fiyat` int(10) NOT NULL,
  `kategori` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `menu`
--

INSERT INTO `menu` (`urunId`, `urun`, `fiyat`, `kategori`) VALUES
(1, 'Kahvaltı Tabağı', 300, 'Kahvaltı'),
(2, 'Serpme Kahvaltı', 500, 'Kahvaltı'),
(3, 'Sahanda Yumurta', 100, 'Kahvaltı'),
(4, 'Sucuklu Yumurta', 150, 'Kahvaltı'),
(5, 'Pankek Tabağı', 200, 'Kahvaltı'),
(6, 'Pişi Tabağı', 300, 'Kahvaltı'),
(7, 'Menemen', 300, 'Kahvaltı'),
(8, 'Omlet', 120, 'Kahvaltı'),
(9, 'Adana Kebap', 310, 'Kebaplar'),
(10, 'Urfa Kebap', 310, 'Kebaplar'),
(11, 'Kuzu Şiş', 330, 'Kebaplar'),
(12, 'Çöp Şiş', 330, 'Kebaplar'),
(13, 'Patlıcan Kebabı', 400, 'Kebaplar'),
(14, 'Tavuk Şiş', 145, 'Kebaplar'),
(15, 'Tavuk Kanat', 250, 'Kebaplar'),
(16, 'Sac Tava', 310, 'Kebaplar'),
(17, 'Mercimek Çorbası', 70, 'Çorbalar'),
(18, 'Domates Çorbası', 75, 'Çorbalar'),
(19, 'Tavuk Suyu Çorbası', 75, 'Çorbalar'),
(20, 'Kelle Paça Çorbası', 100, 'Çorbalar'),
(21, 'Beyran', 65, 'Çorbalar'),
(22, 'Mantar Çorbası', 65, 'Çorbalar'),
(23, 'Yayla Çorbası', 75, 'Çorbalar'),
(24, 'Yüksük Çorbası', 80, 'Çorbalar'),
(25, 'Acılı Ezme', 40, 'Mezeler'),
(26, 'Cacık', 150, 'Mezeler'),
(27, 'Girit  Ezmesi', 230, 'Mezeler'),
(28, 'Humus', 60, 'Mezeler'),
(29, 'Haydari', 55, 'Mezeler'),
(30, 'Zeytin Piyazı', 75, 'Mezeler'),
(31, 'Patlıcan Salatası', 75, 'Mezeler'),
(32, 'Çiğ Köfte', 80, 'Mezeler'),
(33, 'Mevsim Salata', 60, 'Salatalar'),
(34, 'Nurdağı Salata', 80, 'Salatalar'),
(35, 'Çoban Salatası', 50, 'Salatalar'),
(36, 'Yeşil Salata', 50, 'Salatalar'),
(37, 'Gavurdağı Salatası', 110, 'Salatalar'),
(38, 'Kaşık Salata', 75, 'Salatalar'),
(39, 'Sezar Salata', 75, 'Salatalar'),
(40, 'Rus Salatası', 120, 'Salatalar'),
(41, 'Kuru Patlıcan Dolması', 70, 'Ara Sıcaklar'),
(42, 'Kızartma İçli Köfte', 90, 'Ara Sıcaklar'),
(43, 'Haşlama İçli Köfte', 95, 'Ara Sıcaklar'),
(44, 'Patates Köftesi', 60, 'Ara Sıcaklar'),
(45, 'Mücver', 170, 'Ara Sıcaklar'),
(46, 'Sigara Böreği', 35, 'Ara Sıcaklar'),
(47, 'Paçanga Böreği', 55, 'Ara Sıcaklar'),
(48, 'Fındık Lahmacun', 70, 'Ara Sıcaklar'),
(49, 'Sıcak Burma Kadayıf', 300, 'Tatlılar'),
(50, 'Gaziantep Katmeri', 290, 'Tatlılar'),
(51, 'Fıstıklı Baklava', 295, 'Tatlılar'),
(52, 'Fıstıklı Sarma', 300, 'Tatlılar'),
(53, 'Midye Baklava', 240, 'Tatlılar'),
(54, 'Cevizli Baklava', 235, 'Tatlılar'),
(55, 'Dondurmalı Havuç Dilimi', 240, 'Tatlılar'),
(56, 'Şöbiyet', 200, 'Tatlılar'),
(57, 'Coca Cola', 80, 'İçecekler'),
(58, 'Ice Tea', 50, 'İçecekler'),
(59, 'Sprite', 70, 'İçecekler'),
(60, 'Soda', 35, 'İçecekler'),
(61, 'Limonata', 75, 'İçecekler'),
(62, 'Ayran', 55, 'İçecekler'),
(63, 'Şalgam', 40, 'İçecekler'),
(64, 'Meyve Suyu', 35, 'İçecekler');

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `kullanicilar`
--
ALTER TABLE `kullanicilar`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `e-posta` (`mail`),
  ADD UNIQUE KEY `telNo` (`telNo`);

--
-- Tablo için indeksler `menu`
--
ALTER TABLE `menu`
  ADD PRIMARY KEY (`urunId`),
  ADD UNIQUE KEY `urun` (`urun`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `kullanicilar`
--
ALTER TABLE `kullanicilar`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- Tablo için AUTO_INCREMENT değeri `menu`
--
ALTER TABLE `menu`
  MODIFY `urunId` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=70;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
