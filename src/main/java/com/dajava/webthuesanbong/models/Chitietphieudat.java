package com.dajava.webthuesanbong.models;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "chitietphieudat")
public class Chitietphieudat {
    @EmbeddedId
    private ChitietphieudatId id;

    @MapsId("maSanBong")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "MaSanBong", nullable = false)
    private SanBong maSanBong;

    @MapsId("maPhieuDat")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "MaPhieuDat", nullable = false)
    private Phieudatsan maPhieuDat;

    @Column(name = "GioBatDau", nullable = false)
    private Instant gioBatDau;

    @Column(name = "GioKetThuc")
    private Instant gioKetThuc;

    public ChitietphieudatId getId() {
        return id;
    }

    public void setId(ChitietphieudatId id) {
        this.id = id;
    }

    public SanBong getMaSanBong() {
        return maSanBong;
    }

    public void setMaSanBong(SanBong maSanBong) {
        this.maSanBong = maSanBong;
    }

    public Phieudatsan getMaPhieuDat() {
        return maPhieuDat;
    }

    public void setMaPhieuDat(Phieudatsan maPhieuDat) {
        this.maPhieuDat = maPhieuDat;
    }

    public Instant getGioBatDau() {
        return gioBatDau;
    }

    public void setGioBatDau(Instant gioBatDau) {
        this.gioBatDau = gioBatDau;
    }

    public Instant getGioKetThuc() {
        return gioKetThuc;
    }

    public void setGioKetThuc(Instant gioKetThuc) {
        this.gioKetThuc = gioKetThuc;
    }
}
