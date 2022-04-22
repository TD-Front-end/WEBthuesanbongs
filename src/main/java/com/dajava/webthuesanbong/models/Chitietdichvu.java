package com.dajava.webthuesanbong.models;

import javax.persistence.*;

@Entity
@Table(name = "chitietdichvu")
public class Chitietdichvu {
    @EmbeddedId
    private ChitietdichvuId id;

    @MapsId("maNuoc")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "MaNuoc", nullable = false)
    private Nuocgiaikhat maNuoc;

    @MapsId("maPhieuDat")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "MaPhieuDat", nullable = false)
    private Phieudatsan maPhieuDat;

    @Column(name = "SoLuong")
    private Integer soLuong;

    public ChitietdichvuId getId() {
        return id;
    }

    public void setId(ChitietdichvuId id) {
        this.id = id;
    }

    public Nuocgiaikhat getMaNuoc() {
        return maNuoc;
    }

    public void setMaNuoc(Nuocgiaikhat maNuoc) {
        this.maNuoc = maNuoc;
    }

    public Phieudatsan getMaPhieuDat() {
        return maPhieuDat;
    }

    public void setMaPhieuDat(Phieudatsan maPhieuDat) {
        this.maPhieuDat = maPhieuDat;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }
}
