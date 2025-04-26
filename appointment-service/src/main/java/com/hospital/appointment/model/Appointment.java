package com.hospital.appointment.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "appointments")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String hari;
    private LocalDate tanggal;
    private Integer antrian;

    // Constructor tanpa parameter
    public Appointment() {}

    // Constructor dengan parameter
    public Appointment(String hari, LocalDate tanggal, Integer antrian) {
        this.hari = hari;
        this.tanggal = tanggal;
        this.antrian = antrian;
    }

    // Getters dan Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHari() {
        return hari;
    }

    public void setHari(String hari) {
        this.hari = hari;
    }

    public LocalDate getTanggal() {
        return tanggal;
    }

    public void setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
    }

    public Integer getAntrian() {
        return antrian;
    }

    public void setAntrian(Integer antrian) {
        this.antrian = antrian;
    }
}

