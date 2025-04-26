package com.hospital.doctor.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "doctors")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nama_dokter;
    private String alamat;
    private String spesialis;

    // Constructor tanpa parameter
    public Doctor() {}

    // Constructor dengan parameter
    public Doctor(String nama_dokter, String alamat, String spesialis) {
        this.nama_dokter = nama_dokter;
        this.alamat = alamat;
        this.spesialis = spesialis;
    }

    // Getters dan Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamaDokter() {
        return nama_dokter;
    }

    public void setNamaDokter(String namaDokter) {
        this.nama_dokter = namaDokter;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getSpesialis() {
        return spesialis;
    }

    public void setSpesialis(String spesialis) {
        this.spesialis = spesialis;
    }
}
