package com.kutuphaneotomasyonu.kutuphane_otomasyonu.repository;

import com.kutuphaneotomasyonu.kutuphane_otomasyonu.model.Kategori;
import com.kutuphaneotomasyonu.kutuphane_otomasyonu.model.Kitap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KategoriRepository extends JpaRepository<Kategori, Long>{

}